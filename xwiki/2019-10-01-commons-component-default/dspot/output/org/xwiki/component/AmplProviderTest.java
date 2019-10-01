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
package org.xwiki.component;


import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import org.junit.Assert;
import org.junit.Test;
import org.xwiki.component.annotation.Component;
import org.xwiki.component.annotation.ComponentRole;
import org.xwiki.component.descriptor.DefaultComponentDescriptor;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.embed.EmbeddableComponentManagerTest;
import org.xwiki.component.manager.ComponentLookupException;
import org.xwiki.component.manager.ComponentRepositoryException;
import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;


/**
 * Validate loading and injection of Providers in a real use case.
 *
 * @version $Id: 683593067e19c75185fdb6191dd1cdd96ea36387 $
 */
public class AmplProviderTest {
    @ComponentRole
    public static interface TestComponentRole {}

    @Component
    @Singleton
    public static class TestComponentWithProviders implements AmplProviderTest.TestComponentRole {
        @Inject
        public Provider<String> provider1;

        @Inject
        @Named("another")
        public Provider<String> provider12;

        @Inject
        public Provider<Integer> provider2;

        @Inject
        public Provider<List<EmbeddableComponentManagerTest.Role>> providerList;

        @Inject
        public Provider<Map<String, EmbeddableComponentManagerTest.Role>> providerMap;
    }

    public static class TestProvider1 implements Provider<String> {
        @Override
        public String get() {
            return "value";
        }
    }

    @Named("another")
    public static class TestProvider12 implements Provider<String> {
        @Override
        public String get() {
            return "another value";
        }
    }

    public static class TestProvider2 implements Provider<Integer> {
        @Override
        public Integer get() {
            return 1;
        }
    }

    @Component
    @Named("exception")
    @Singleton
    public static class TestComponentWithProviderInException implements AmplProviderTest.TestComponentRole {
        @Inject
        @Named("exception")
        public Provider<String> providerWithExceptionInInitialize;
    }

    @Named("exception")
    public static class TestProviderWithExceptionInInitialize implements Provider<String> , Initializable {
        @Override
        public void initialize() throws InitializationException {
            throw new InitializationException("Some error in init");
        }

        @Override
        public String get() {
            throw new RuntimeException("should not be called!");
        }
    }

    @Test(timeout = 10000)
    public void loadAndInjectProviders_remove98_failAssert0() throws ComponentLookupException, ComponentRepositoryException {
        // AssertionGenerator generate try/catch block with fail statement
        try {
            EmbeddableComponentManager cm = new EmbeddableComponentManager();
            // Register components for the list and map
            DefaultComponentDescriptor<EmbeddableComponentManagerTest.Role> cd1 = new DefaultComponentDescriptor<EmbeddableComponentManagerTest.Role>();
            cd1.setRoleType(EmbeddableComponentManagerTest.Role.class);
            cd1.setRoleHint("hint1");
            cd1.setImplementation(EmbeddableComponentManagerTest.RoleImpl.class);
            cm.registerComponent(cd1);
            DefaultComponentDescriptor<EmbeddableComponentManagerTest.Role> cd2 = new DefaultComponentDescriptor<EmbeddableComponentManagerTest.Role>();
            cd2.setRoleType(EmbeddableComponentManagerTest.Role.class);
            cd2.setRoleHint("hint2");
            cm.registerComponent(cd2);
            // Initialize
            cm.initialize(getClass().getClassLoader());
            AmplProviderTest.TestComponentWithProviders component = cm.getInstance(AmplProviderTest.TestComponentRole.class);
            component.provider1.get();
            component.provider12.get();
            Integer.valueOf(1);
            component.provider2.get();
            component.providerList.get().size();
            component.providerMap.get().size();
            Assert.fail("loadAndInjectProviders_remove98 should have thrown RuntimeException");
        } catch (RuntimeException expected) {
            Assert.assertEquals("Failed to get [role = [java.util.List<org.xwiki.component.embed.EmbeddableComponentManagerTest$Role>] hint = [default]]", expected.getMessage());
        }
    }

    /**
     * Verify that an exception is raised when a Provider implementing {@link Initializable} fails to initialize.
     */
    @Test(timeout = 10000)
    public void loadAndInjectProviderWhenExceptionInInitialize_failAssert0() throws Exception {
        // AssertionGenerator generate try/catch block with fail statement
        try {
            EmbeddableComponentManager cm = new EmbeddableComponentManager();
            cm.initialize(getClass().getClassLoader());
            {
                cm.getInstance(AmplProviderTest.TestComponentRole.class, "exception");
            }
            Assert.fail("loadAndInjectProviderWhenExceptionInInitialize should have thrown ComponentLookupException");
        } catch (ComponentLookupException expected) {
            Assert.assertEquals("Failed to lookup component [org.xwiki.component.AmplProviderTest$TestComponentWithProviderInException] identified by type [interface org.xwiki.component.AmplProviderTest$TestComponentRole] and hint [exception]", expected.getMessage());
        }
    }

    /**
     * Verify that an exception is raised when a Provider implementing {@link Initializable} fails to initialize.
     */
    @Test(timeout = 10000)
    public void loadAndInjectProviderWhenExceptionInInitializenull24() throws Exception {
        EmbeddableComponentManager cm = new EmbeddableComponentManager();
        // AssertionGenerator add assertion
        Assert.assertNull(((EmbeddableComponentManager) (cm)).getParent());
        // AssertionGenerator add assertion
        Assert.assertNull(((EmbeddableComponentManager) (cm)).getNamespace());
        // AssertionGenerator add assertion
        Assert.assertNull(((EmbeddableComponentManager) (cm)).getComponentEventManager());
        cm.initialize(getClass().getClassLoader());
        {
            cm.getInstance(AmplProviderTest.TestComponentRole.class, null);
        }
        // AssertionGenerator add assertion
        Assert.assertNull(((EmbeddableComponentManager) (cm)).getParent());
        // AssertionGenerator add assertion
        Assert.assertNull(((EmbeddableComponentManager) (cm)).getNamespace());
        // AssertionGenerator add assertion
        Assert.assertNull(((EmbeddableComponentManager) (cm)).getComponentEventManager());
    }
}

