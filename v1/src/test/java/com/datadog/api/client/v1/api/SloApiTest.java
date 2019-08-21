/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.api;

import com.datadog.api.client.v1.ApiException;
import com.datadog.api.client.v1.model.Error400;
import com.datadog.api.client.v1.model.Error401;
import com.datadog.api.client.v1.model.Error403;
import com.datadog.api.client.v1.model.Error404;
import com.datadog.api.client.v1.model.ServiceLevelObjective;
import com.datadog.api.client.v1.model.ServiceLevelObjectiveDeleted;
import com.datadog.api.client.v1.model.ServiceLevelObjectiveResponse;
import com.datadog.api.client.v1.model.ServiceLevelObjectivesBulkDeleted;
import com.datadog.api.client.v1.model.SloTimeframe;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SloApi
 */
@Ignore
public class SloApiTest {

    private final SloApi api = new SloApi();

    
    /**
     * Delete (or partially delete) multiple service level objective objects.
     *
     * ### Overview Delete (or partially delete) multiple service level objective objects. This endpoint facilitates deletion of one or more thresholds for one or more service level objective objects. If all thresholds are deleted, the service level objective object is deleted as well.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkPartialDeleteSloTest() throws ApiException {
        Map<String, List<SloTimeframe>> requestBody = null;
        ServiceLevelObjectivesBulkDeleted response = api.bulkPartialDeleteSlo(requestBody);

        // TODO: test validations
    }
    
    /**
     * Create a service level objective object.
     *
     * ### Overview Create a service level objective object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSloTest() throws ApiException {
        ServiceLevelObjective serviceLevelObjective = null;
        ServiceLevelObjectiveResponse response = api.createSlo(serviceLevelObjective);

        // TODO: test validations
    }
    
    /**
     * Delete the specified service level objective object.
     *
     * ### Overview Delete the specified service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSloTest() throws ApiException {
        Long sloId = null;
        ServiceLevelObjectiveDeleted response = api.deleteSlo(sloId);

        // TODO: test validations
    }
    
    /**
     * Edit the specified service level objective
     *
     * ### Overview Edit the specified service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editSloTest() throws ApiException {
        Long sloId = null;
        ServiceLevelObjective serviceLevelObjective = null;
        ServiceLevelObjectiveResponse response = api.editSlo(sloId, serviceLevelObjective);

        // TODO: test validations
    }
    
    /**
     * Get a service level objective object
     *
     * ### Overview Get a service level objective object. ### Arguments * **&#x60;slo_id&#x60;** [*required*]: The ID of the service level objective object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSloTest() throws ApiException {
        String sloId = null;
        ServiceLevelObjectiveResponse response = api.getSlo(sloId);

        // TODO: test validations
    }
    
    /**
     * Get multiple service level objective objects by their IDs.
     *
     * ### Overview Get multiple service level objective objects by their IDs. ### Arguments * **&#x60;ids&#x60;** [*required*]: A comma separated list of the IDs of the service level   objectives objects (e.g. \&quot;id1,id2,id3\&quot;).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlosTest() throws ApiException {
        String ids = null;
        ServiceLevelObjectiveResponse response = api.getSlos(ids);

        // TODO: test validations
    }
    
}
