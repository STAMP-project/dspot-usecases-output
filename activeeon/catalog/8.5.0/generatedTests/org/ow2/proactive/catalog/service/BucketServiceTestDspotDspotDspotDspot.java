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
public class BucketServiceTestDspotDspotDspotDspot {
    private static final java.lang.String DEFAULT_BUCKET_NAME = "BucketServiceTestDspotDspotDspotDspot";

    @org.mockito.InjectMocks
    private org.ow2.proactive.catalog.service.BucketService bucketService;

    @org.mockito.InjectMocks
    private org.ow2.proactive.catalog.service.CatalogObjectService catalogObjectService;

    @org.mockito.Mock
    private org.ow2.proactive.catalog.repository.BucketRepository bucketRepository;

    @org.mockito.Mock
    private org.ow2.proactive.catalog.util.name.validator.BucketNameValidator bucketNameValidator;

    @org.junit.Test(timeout = 10000)
    public void testCreateBucket_mg1_mg18() throws java.lang.Exception {
        org.ow2.proactive.catalog.repository.entity.CatalogObjectEntity __DSPOT_o_524 = new org.ow2.proactive.catalog.repository.entity.CatalogObjectEntity();
        org.ow2.proactive.catalog.repository.entity.CatalogObjectEntity __DSPOT_catalogObject_517 = new org.ow2.proactive.catalog.repository.entity.CatalogObjectEntity();
        org.ow2.proactive.catalog.repository.entity.BucketEntity mockedBucket = newMockedBucket(1L,
                                                                                                "bucket-name",
                                                                                                java.time.LocalDateTime.now());
        org.mockito.Mockito.when(bucketRepository.save(org.mockito.Matchers.any(org.ow2.proactive.catalog.repository.entity.BucketEntity.class)))
                           .thenReturn(mockedBucket);
        org.mockito.Mockito.when(bucketNameValidator.isValid(org.mockito.Matchers.anyString())).thenReturn(true);
        org.ow2.proactive.catalog.dto.BucketMetadata bucketMetadata = bucketService.createBucket("BUCKET-NAME-TEST",
                                                                                                 org.ow2.proactive.catalog.service.BucketServiceTestDspotDspotDspotDspot.DEFAULT_BUCKET_NAME);
        org.ow2.proactive.catalog.repository.entity.BucketEntity o_testCreateBucket_mg1__16 = org.mockito.Mockito.verify(bucketRepository,
                                                                                                                         org.mockito.Mockito.times(1))
                                                                                                                 .save(org.mockito.Matchers.any(org.ow2.proactive.catalog.repository.entity.BucketEntity.class));
        boolean o_testCreateBucket_mg1__20 = org.mockito.Mockito.verify(bucketNameValidator,
                                                                        org.mockito.Mockito.times(1))
                                                                .isValid(org.mockito.Matchers.anyString());
        mockedBucket.getBucketName();
        bucketMetadata.getName();
        mockedBucket.getOwner();
        bucketMetadata.getOwner();
        mockedBucket.addCatalogObject(__DSPOT_catalogObject_517);
        boolean o_testCreateBucket_mg1_mg18__35 = __DSPOT_catalogObject_517.equals(__DSPOT_o_524);
        org.junit.Assert.assertFalse(o_testCreateBucket_mg1_mg18__35);
    }

    @org.junit.Test(timeout = 10000)
    public void testCreateBucket_mg3_mg20_mg85() throws java.lang.Exception {
        org.ow2.proactive.catalog.repository.entity.BucketEntity __DSPOT_o_543 = new org.ow2.proactive.catalog.repository.entity.BucketEntity(">t$9[7L1G=%Cl1t^iP.v",
                                                                                                                                              "=JJv#]Or;=b$]&*jK4]w");
        org.ow2.proactive.catalog.repository.entity.BucketEntity __DSPOT_o_526 = new org.ow2.proactive.catalog.repository.entity.BucketEntity(";8Q[Wm4{}}1)E.EL``)1",
                                                                                                                                              "[S@0Kr-c{b_{git%Dk#2");
        org.ow2.proactive.catalog.dto.BucketMetadata __DSPOT_o_519 = new org.ow2.proactive.catalog.dto.BucketMetadata(";R?&,0.F%Q%Rh<DFMF%&",
                                                                                                                      "a%r^,B-LGF}>oXfZQ)#l");
        org.ow2.proactive.catalog.repository.entity.BucketEntity mockedBucket = newMockedBucket(1L,
                                                                                                "bucket-name",
                                                                                                java.time.LocalDateTime.now());
        org.mockito.Mockito.when(bucketRepository.save(org.mockito.Matchers.any(org.ow2.proactive.catalog.repository.entity.BucketEntity.class)))
                           .thenReturn(mockedBucket);
        org.mockito.Mockito.when(bucketNameValidator.isValid(org.mockito.Matchers.anyString())).thenReturn(true);
        org.ow2.proactive.catalog.dto.BucketMetadata bucketMetadata = bucketService.createBucket("BUCKET-NAME-TEST",
                                                                                                 org.ow2.proactive.catalog.service.BucketServiceTestDspotDspotDspotDspot.DEFAULT_BUCKET_NAME);
        org.ow2.proactive.catalog.repository.entity.BucketEntity o_testCreateBucket_mg3__16 = org.mockito.Mockito.verify(bucketRepository,
                                                                                                                         org.mockito.Mockito.times(1))
                                                                                                                 .save(org.mockito.Matchers.any(org.ow2.proactive.catalog.repository.entity.BucketEntity.class));
        boolean o_testCreateBucket_mg3__20 = org.mockito.Mockito.verify(bucketNameValidator,
                                                                        org.mockito.Mockito.times(1))
                                                                .isValid(org.mockito.Matchers.anyString());
        mockedBucket.getBucketName();
        bucketMetadata.getName();
        mockedBucket.getOwner();
        bucketMetadata.getOwner();
        boolean o_testCreateBucket_mg3__28 = bucketMetadata.equals(__DSPOT_o_519);
        boolean o_testCreateBucket_mg3_mg20__37 = mockedBucket.equals(__DSPOT_o_526);
        boolean o_testCreateBucket_mg3_mg20_mg85__42 = __DSPOT_o_526.equals(__DSPOT_o_543);
        org.junit.Assert.assertFalse(o_testCreateBucket_mg3_mg20_mg85__42);
    }

    private void listBucket(java.lang.String owner, java.util.Optional<java.lang.String> kind,
            java.util.Optional<java.lang.String> contentType) {
        org.mockito.Mockito.when(bucketRepository.findAll()).thenReturn(java.util.Collections.emptyList());
        bucketService.listBuckets(owner, kind, contentType);
        if (!(org.apache.commons.lang3.StringUtils.isEmpty(owner))) {
            org.mockito.Mockito.verify(bucketRepository, org.mockito.Mockito.times(1))
                               .findByOwnerIn(org.mockito.Matchers.anyList());
        } else {
            if (kind.isPresent()) {
                org.mockito.Mockito.verify(bucketRepository, org.mockito.Mockito.times(1))
                                   .findContainingKind(org.mockito.Matchers.anyString());
            } else {
                org.mockito.Mockito.verify(bucketRepository, org.mockito.Mockito.times(1)).findAll();
            }
        }
    }

    private org.ow2.proactive.catalog.repository.entity.BucketEntity newMockedBucket(java.lang.Long id,
            java.lang.String name, java.time.LocalDateTime createdAt) {
        org.ow2.proactive.catalog.repository.entity.BucketEntity mockedBucket = org.mockito.Mockito.mock(org.ow2.proactive.catalog.repository.entity.BucketEntity.class);
        org.mockito.Mockito.when(mockedBucket.getId()).thenReturn(id);
        org.mockito.Mockito.when(mockedBucket.getBucketName()).thenReturn(name);
        return mockedBucket;
    }
}
