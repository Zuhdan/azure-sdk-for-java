// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.security.keyvault.administration.implementation.models.KeyVaultErrorException;
import com.azure.security.keyvault.administration.implementation.models.RoleAssignment;
import com.azure.security.keyvault.administration.implementation.models.RoleAssignmentCreateParameters;
import com.azure.security.keyvault.administration.implementation.models.RoleAssignmentListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * RoleAssignments.
 */
public final class RoleAssignmentsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private RoleAssignmentsService service;

    /**
     * The service client containing this operation class.
     */
    private AccessControlRestClientImpl client;

    /**
     * Initializes an instance of RoleAssignmentsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public RoleAssignmentsImpl(AccessControlRestClientImpl client) {
        this.service = RestProxy.create(RoleAssignmentsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * AccessControlRestClientRoleAssignments to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{vaultBaseUrl}")
    @ServiceInterface(name = "AccessControlRestClientRoleAssignments")
    private interface RoleAssignmentsService {
        @Delete("{scope}/providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<SimpleResponse<RoleAssignment>> delete(@PathParam("scope") String scope, @PathParam("roleAssignmentName") String roleAssignmentName, @HostParam("vaultBaseUrl") String vaultBaseUrl, @QueryParam("api-version") String apiVersion, Context context);

        @Put("{scope}/providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<SimpleResponse<RoleAssignment>> create(@PathParam("scope") String scope, @PathParam("roleAssignmentName") String roleAssignmentName, @HostParam("vaultBaseUrl") String vaultBaseUrl, @BodyParam("application/json; charset=utf-8") RoleAssignmentCreateParameters parameters, @QueryParam("api-version") String apiVersion, Context context);

        @Get("{scope}/providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<SimpleResponse<RoleAssignment>> get(@PathParam("scope") String scope, @PathParam("roleAssignmentName") String roleAssignmentName, @HostParam("vaultBaseUrl") String vaultBaseUrl, @QueryParam("api-version") String apiVersion, Context context);

        @Get("{scope}/providers/Microsoft.Authorization/roleAssignments")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<SimpleResponse<RoleAssignmentListResult>> listForScope(@PathParam("scope") String scope, @HostParam("vaultBaseUrl") String vaultBaseUrl, @QueryParam("$filter") String filter, @QueryParam("api-version") String apiVersion, Context context);
    }

    /**
     * Deletes a role assignment.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role assignment to delete.
     * @param roleAssignmentName The name of the role assignment to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleAssignment>> deleteWithRestResponseAsync(String vaultBaseUrl, String scope, String roleAssignmentName, Context context) {
        return service.delete(scope, roleAssignmentName, vaultBaseUrl, this.client.getApiVersion(), context);
    }

    /**
     * Creates a role assignment.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role assignment to create.
     * @param roleAssignmentName The name of the role assignment to create. It can be any valid GUID.
     * @param parameters Parameters for the role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleAssignment>> createWithRestResponseAsync(String vaultBaseUrl, String scope, String roleAssignmentName, RoleAssignmentCreateParameters parameters, Context context) {
        return service.create(scope, roleAssignmentName, vaultBaseUrl, parameters, this.client.getApiVersion(), context);
    }

    /**
     * Get the specified role assignment.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role assignment.
     * @param roleAssignmentName The name of the role assignment to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleAssignment>> getWithRestResponseAsync(String vaultBaseUrl, String scope, String roleAssignmentName, Context context) {
        return service.get(scope, roleAssignmentName, vaultBaseUrl, this.client.getApiVersion(), context);
    }

    /**
     * Gets role assignments for a scope.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role assignments.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleAssignmentListResult>> listForScopeWithRestResponseAsync(String vaultBaseUrl, String scope, Context context) {
        final String filter = null;
        return service.listForScope(scope, vaultBaseUrl, filter, this.client.getApiVersion(), context);
    }

    /**
     * Gets role assignments for a scope.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role assignments.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignments at or above the scope. Use $filter=principalId eq {id} to return all role assignments at, above or below the scope for the specified principal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleAssignmentListResult>> listForScopeWithRestResponseAsync(String vaultBaseUrl, String scope, String filter, Context context) {
        return service.listForScope(scope, vaultBaseUrl, filter, this.client.getApiVersion(), context);
    }
}
