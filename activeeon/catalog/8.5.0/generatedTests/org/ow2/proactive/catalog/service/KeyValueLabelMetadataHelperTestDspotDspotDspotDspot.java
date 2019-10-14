/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package org.ow2.proactive.catalog.service;

@org.junit.runner.RunWith(org.mockito.runners.MockitoJUnitRunner.class)
public class KeyValueLabelMetadataHelperTestDspotDspotDspotDspot {
    @org.mockito.InjectMocks
    private org.ow2.proactive.catalog.service.KeyValueLabelMetadataHelper keyValueLabelMetadataHelper;

    @org.mockito.Mock
    private org.ow2.proactive.catalog.service.OwnerGroupStringHelper ownerGroupStringHelper;

    @org.junit.Test(timeout = 10000)
    public void testThatGetOnlyGenericInformationIsOnlyReturningGenericInformation_mg2() throws java.lang.Exception {
        org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity __DSPOT_o_5822 = new org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity("O?ibS/CD[_A-{sef|0|>",
                                                                                                                                                                             "KajcA7wJB#<|Heo|OEtT",
                                                                                                                                                                             "0J*v8H#g*#na-9|te@B4");
        org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity keyValueLabelMetadataEntityGenericInfo = new org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity("key",
                                                                                                                                                                                                     "valye",
                                                                                                                                                                                                     org.ow2.proactive.catalog.util.parser.WorkflowParser.ATTRIBUTE_GENERIC_INFORMATION_LABEL);
        org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity keyValueLabelMetadataEntityAnythingElse = new org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity("key",
                                                                                                                                                                                                      "valye",
                                                                                                                                                                                                      "chat");
        java.util.List<org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity> onlyGenericInformation = keyValueLabelMetadataHelper.getOnlyGenericInformation(java.util.Arrays.asList(keyValueLabelMetadataEntityGenericInfo,
                                                                                                                                                                                                       keyValueLabelMetadataEntityAnythingElse));
        boolean o_testThatGetOnlyGenericInformationIsOnlyReturningGenericInformation_mg2__10 = keyValueLabelMetadataEntityAnythingElse.equals(__DSPOT_o_5822);
        com.google.common.truth.Truth.assertThat(o_testThatGetOnlyGenericInformationIsOnlyReturningGenericInformation_mg2__10)
                                     .isFalse();
    }

    private void KeyValueLabelMetadataEntityListHasEntry(
            java.util.List<org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity> keyValueMetadataEntities,
            java.lang.String key, java.lang.String value) {
        for (org.ow2.proactive.catalog.repository.entity.KeyValueLabelMetadataEntity KeyValueLabelMetadataEntity : keyValueMetadataEntities) {
            if ((KeyValueLabelMetadataEntity.getKey().equals(key)) &&
                (KeyValueLabelMetadataEntity.getValue().equals(value))) {
                return;
            }
        }
        com.google.common.truth.Truth.assertWithMessage(((((("Expected key: \"" + key) + "\" and value: \"") + value) +
                                                          "\" inside keyValueMetadataEntities: ") +
                                                         (keyValueMetadataEntities.toString())))
                                     .that(false)
                                     .isTrue();
    }
}
