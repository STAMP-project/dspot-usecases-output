/**
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.observation;


import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.xwiki.component.descriptor.DefaultComponentDescriptor;
import org.xwiki.component.event.ComponentDescriptorAddedEvent;
import org.xwiki.observation.event.ActionExecutionEvent;
import org.xwiki.observation.event.AllEvent;
import org.xwiki.observation.event.Event;
import org.xwiki.observation.internal.DefaultObservationManager;
import org.xwiki.test.LogLevel;
import org.xwiki.test.junit5.LogCaptureExtension;
import org.xwiki.test.junit5.mockito.ComponentTest;
import org.xwiki.test.junit5.mockito.InjectMockComponents;
import org.xwiki.test.mockito.MockitoComponentManager;


/**
 * Unit tests for {@link DefaultObservationManager}.
 *
 * @version $Id: b9825aebaae9a70ab2e45c7833fbb790f2b62667 $
 */
@ComponentTest
public class AmplDefaultObservationManagerTest {
    @InjectMockComponents
    private DefaultObservationManager manager;

    @RegisterExtension
    LogCaptureExtension logCapture = new LogCaptureExtension(LogLevel.WARN);

    @Test
    public void addEvent_add14() throws Exception {
        EventListener listener = Mockito.mock(EventListener.class);
        Event initialEvent = Mockito.mock(Event.class, "initial");
        Event afterEvent = Mockito.mock(Event.class, "after");
        Event notifyEvent = Mockito.mock(Event.class, "notify");
        Mockito.when(listener.getName()).thenReturn("mylistener");
        Mockito.when(listener.getEvents()).thenReturn(Arrays.asList(initialEvent));
        // AssertionGenerator create local variable with return value of invocation
        boolean o_addEvent_add14__16 = initialEvent.matches(notifyEvent);
        // AssertionGenerator add assertion
        Assertions.assertFalse(o_addEvent_add14__16);
        // Since the observation returns the first matching event, return false from initialEvent so that
        // afterEvent is called.
        Mockito.when(initialEvent.matches(notifyEvent)).thenReturn(false);
        Mockito.when(afterEvent.matches(notifyEvent)).thenReturn(true);
        this.manager.addListener(listener);
        this.manager.addEvent("mylistener", afterEvent);
        this.manager.notify(notifyEvent, null);
        Mockito.verify(listener).onEvent(notifyEvent, null, null);
        // AssertionGenerator add assertion
        Assertions.assertFalse(o_addEvent_add14__16);
    }

    @Test
    public void addEventWithNoInitialEvent_add165_failAssert0() throws Exception {
        Assertions.assertThrows(UnfinishedVerificationException.class, () -> {
            EventListener listener = Mockito.mock(EventListener.class);
            Event afterEvent = Mockito.mock(Event.class, "after");
            Event notifyEvent = Mockito.mock(Event.class, "notify");
            Mockito.when(listener.getName()).thenReturn("mylistener");
            Mockito.when(listener.getEvents()).thenReturn(Collections.<Event>emptyList());
            Mockito.when(afterEvent.matches(notifyEvent)).thenReturn(true);
            this.manager.addListener(listener);
            this.manager.addEvent("mylistener", afterEvent);
            this.manager.notify(notifyEvent, null);
            Mockito.verify(listener);
            Mockito.verify(listener).onEvent(notifyEvent, null, null);
        });
    }

    @Test
    public void removeEvent() throws Exception {
        EventListener listener = Mockito.mock(EventListener.class);
        Event initialEvent = Mockito.mock(Event.class, "initial");
        Event afterEvent = Mockito.mock(Event.class, "after");
        Event notifyEvent = Mockito.mock(Event.class, "notify");
        Mockito.when(listener.getName()).thenReturn("mylistener");
        Mockito.when(listener.getEvents()).thenReturn(Arrays.asList(initialEvent));
        // Since the observation returns the first matching event, return false from initialEvent so that
        // the second event can be called (if there's a second event - in our case it'll be removed but
        // we still want the test to fail if that doesn't work).
        Mockito.when(initialEvent.matches(ArgumentMatchers.same(notifyEvent))).thenReturn(false);
        this.manager.addListener(listener);
        this.manager.addEvent("mylistener", afterEvent);
        this.manager.removeEvent("mylistener", afterEvent);
        this.manager.notify(notifyEvent, null);
        // AssertionGenerator create local variable with return value of invocation
        boolean o_removeEvent__27 = // Ensure that the afterEvent is never called since we're adding it and removing it
        Mockito.verify(afterEvent, Mockito.never()).matches(ArgumentMatchers.same(notifyEvent));
        // AssertionGenerator add assertion
        Assertions.assertFalse(o_removeEvent__27);
        Mockito.verify(listener, Mockito.never()).onEvent(afterEvent, null, null);
        // AssertionGenerator add assertion
        Assertions.assertFalse(o_removeEvent__27);
    }

    /**
     * Verify that a warning is logged is we try to register a listener with the same name.
     */
    @Test
    public void registerSameListenerSeveralTimes() throws Exception {
        EventListener listener = Mockito.mock(EventListener.class);
        Mockito.when(listener.getName()).thenReturn("mylistener");
        Mockito.when(listener.getEvents()).thenReturn(Arrays.asList(AllEvent.ALLEVENT));
        // The check is performed here, we verify that a warning is correctly logged
        this.manager.addListener(listener);
        // Will raise log warning on the next line
        this.manager.addListener(listener);
        // AssertionGenerator create local variable with return value of invocation
        boolean o_registerSameListenerSeveralTimes__14 = this.logCapture.getMessage(0).matches(("The \\[.*\\] listener is overwriting a previously registered " + ("listener \\[.*\\] since they both are registered under the same id \\[mylistener\\]\\. In the future " + "consider removing a Listener first if you really want to register it again\\.")));
        // AssertionGenerator add assertion
        Assertions.assertTrue(o_registerSameListenerSeveralTimes__14);
        // Verify that no log is logged if we remove the listener before re-registering it
        this.manager.removeListener("mylistener");
        // Next line will not log any warning
        this.manager.addListener(listener);
        // AssertionGenerator add assertion
        Assertions.assertTrue(o_registerSameListenerSeveralTimes__14);
    }

    /**
     * Verify that we can register a listener with two events of the same type but with not matching the same thing and
     * it will receive both events.
     */
    @Test
    public void registerListenerForTwoEventsOfSameType() throws Exception {
        EventListener listener = Mockito.mock(EventListener.class);
        Event eventMatcher1 = new ActionExecutionEvent("action1");
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1161803589, ((int) (((ActionExecutionEvent) (eventMatcher1)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("action1", ((ActionExecutionEvent) (eventMatcher1)).getActionName());
        Event eventMatcher2 = new ActionExecutionEvent("action2");
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1161803588, ((int) (((ActionExecutionEvent) (eventMatcher2)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("action2", ((ActionExecutionEvent) (eventMatcher2)).getActionName());
        Mockito.when(listener.getName()).thenReturn("mylistener");
        Mockito.when(listener.getEvents()).thenReturn(Arrays.asList(eventMatcher1, eventMatcher2));
        this.manager.addListener(listener);
        this.manager.notify(eventMatcher1, "some source", "some data");
        this.manager.notify(eventMatcher2, "some source", "some data");
        Mockito.verify(listener).onEvent(eventMatcher1, "some source", "some data");
        Mockito.verify(listener).onEvent(eventMatcher2, "some source", "some data");
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1161803589, ((int) (((ActionExecutionEvent) (eventMatcher1)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("action1", ((ActionExecutionEvent) (eventMatcher1)).getActionName());
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1161803588, ((int) (((ActionExecutionEvent) (eventMatcher2)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("action2", ((ActionExecutionEvent) (eventMatcher2)).getActionName());
    }

    @Test
    public void onComponentEventWhenRuntimeExceptionInListenerGetName(MockitoComponentManager componentManager) throws Exception {
        ComponentDescriptorAddedEvent cdae = new ComponentDescriptorAddedEvent(EventListener.class, "onComponentEventWhenRuntimeExceptionInListener");
        // Important: initialize listener cache first so that we can reach the call to onComponentEvent().
        this.manager.notify(( Object) -> false, componentManager, null);
        EventListener eventListener = componentManager.registerMockComponent(EventListener.class, "onComponentEventWhenRuntimeExceptionInListener");
        Mockito.when(eventListener.getName()).thenThrow(new RuntimeException("error"));
        DefaultComponentDescriptor<EventListener> cd = new DefaultComponentDescriptor<>();
        cd.setImplementation(EventListener.class);
        cd.setRoleType(EventListener.class);
        this.manager.notify(cdae, componentManager, cd);
        Assertions.assertEquals(("Failed to notify some event listeners about component [role = " + (("[interface org.xwiki.observation.EventListener], hint = [default]], implementation = " + "[org.xwiki.observation.EventListener], instantiation = [SINGLETON]] being added or removed. Root cause: ") + "[RuntimeException: error]")), logCapture.getMessage(0));
    }

    @Test
    public void addListenerWhenRuntimeExceptionInListenerGetName(MockitoComponentManager componentManager) throws Exception {
        EventListener eventListener = componentManager.registerMockComponent(EventListener.class, "onComponentEventWhenRuntimeExceptionInListener");
        Mockito.when(eventListener.getName()).thenThrow(new RuntimeException("error"));
        this.manager.notify(( Object) -> false, componentManager, null);
        Assertions.assertEquals("Failed to add listener. Root cause: [RuntimeException: error]", logCapture.getMessage(0));
    }
}

