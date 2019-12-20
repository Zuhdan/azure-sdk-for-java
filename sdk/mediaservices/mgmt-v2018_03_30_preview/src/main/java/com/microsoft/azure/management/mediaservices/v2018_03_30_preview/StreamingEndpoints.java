/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.StreamingEndpointsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing StreamingEndpoints.
 */
public interface StreamingEndpoints extends SupportsCreating<StreamingEndpoint.DefinitionStages.Blank>, HasInner<StreamingEndpointsInner> {
    /**
     * Start StreamingEndpoint.
     * Starts an existing StreamingEndpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the StreamingEndpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable startAsync(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Stop StreamingEndpoint.
     * Stops an existing StreamingEndpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the StreamingEndpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Scale StreamingEndpoint.
     * Scales an existing StreamingEndpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the StreamingEndpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable scaleAsync(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * Get StreamingEndpoint.
     * Gets a StreamingEndpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the StreamingEndpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StreamingEndpoint> getAsync(String resourceGroupName, String accountName, String streamingEndpointName);

    /**
     * List StreamingEndpoints.
     * Lists the StreamingEndpoints in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StreamingEndpoint> listAsync(final String resourceGroupName, final String accountName);

    /**
     * Delete StreamingEndpoint.
     * Deletes a StreamingEndpoint.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingEndpointName The name of the StreamingEndpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String streamingEndpointName);

}