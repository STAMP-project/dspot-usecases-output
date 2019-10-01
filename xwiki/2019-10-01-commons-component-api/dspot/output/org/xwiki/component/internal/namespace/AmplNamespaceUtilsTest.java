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
package org.xwiki.component.internal.namespace;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xwiki.component.namespace.Namespace;


/**
 * Validate {@link NamespaceUtils}.
 *
 * @version $Id: 5280e881de5524246b02965dabe2564d1b59a013 $
 */
public class AmplNamespaceUtilsTest {
    @Test
    public void testEquals() throws Exception {
        Namespace ns1 = new Namespace("type1", "value1");
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1:value1", ((Namespace) (ns1)).toString());
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1017530436, ((int) (((Namespace) (ns1)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("value1", ((Namespace) (ns1)).getValue());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1", ((Namespace) (ns1)).getType());
        Namespace ns2 = new Namespace("type2", "value1");
        // AssertionGenerator add assertion
        Assertions.assertEquals("type2:value1", ((Namespace) (ns2)).toString());
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1017530399, ((int) (((Namespace) (ns2)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("value1", ((Namespace) (ns2)).getValue());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type2", ((Namespace) (ns2)).getType());
        Namespace ns3 = new Namespace("type1", "value2");
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1:value2", ((Namespace) (ns3)).toString());
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1017530435, ((int) (((Namespace) (ns3)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("value2", ((Namespace) (ns3)).getValue());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1", ((Namespace) (ns3)).getType());
        Namespace ns4 = new Namespace("type1", "value1");
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1:value1", ((Namespace) (ns4)).toString());
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1017530436, ((int) (((Namespace) (ns4)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("value1", ((Namespace) (ns4)).getValue());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1", ((Namespace) (ns4)).getType());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1:value1", ((Namespace) (ns1)).toString());
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1017530436, ((int) (((Namespace) (ns1)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("value1", ((Namespace) (ns1)).getValue());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1", ((Namespace) (ns1)).getType());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type2:value1", ((Namespace) (ns2)).toString());
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1017530399, ((int) (((Namespace) (ns2)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("value1", ((Namespace) (ns2)).getValue());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type2", ((Namespace) (ns2)).getType());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1:value2", ((Namespace) (ns3)).toString());
        // AssertionGenerator add assertion
        Assertions.assertEquals(-1017530435, ((int) (((Namespace) (ns3)).hashCode())));
        // AssertionGenerator add assertion
        Assertions.assertEquals("value2", ((Namespace) (ns3)).getValue());
        // AssertionGenerator add assertion
        Assertions.assertEquals("type1", ((Namespace) (ns3)).getType());
    }
}

