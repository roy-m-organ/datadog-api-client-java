package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.AWSAccount;
import com.datadog.api.v1.client.model.AWSAccountCreateResponse;
import com.datadog.api.v1.client.model.AWSAccountListResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AwsIntegrationApi {
  private ApiClient apiClient;

  public AwsIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AwsIntegrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<AWSAccountCreateResponse> createAWSAccountWithHttpInfo(AWSAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createAWSAccount");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<AWSAccountCreateResponse> localVarReturnType = new GenericType<AWSAccountCreateResponse>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.createAWSAccount", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateAWSAccountRequest {
    private AWSAccount body;

    private APIcreateAWSAccountRequest() {
    }
    

    /**
     * Set body
     * @param body AWS Request Object (required)
     * @return APIcreateAWSAccountRequest
     */
    public APIcreateAWSAccountRequest body(AWSAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createAWSAccount request
     * @return AWSAccountCreateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSAccountCreateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAWSAccount request with HTTP info returned
     * @return ApiResponse&lt;AWSAccountCreateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AWSAccountCreateResponse> executeWithHttpInfo() throws ApiException {
      return createAWSAccountWithHttpInfo(body);
    }
  }

  /**
   * Create an AWS Integration
   * Create a Datadog-Amazon Web Services integration. Using the &#x60;POST&#x60; method updates your integration configuration by adding your new configuration to the existing one in your Datadog organization.
   * @return createAWSAccountRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateAWSAccountRequest createAWSAccount() throws ApiException {
    return new APIcreateAWSAccountRequest();
  }

private ApiResponse<Object> deleteAWSAccountWithHttpInfo(AWSAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteAWSAccount");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.deleteAWSAccount", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteAWSAccountRequest {
    private AWSAccount body;

    private APIdeleteAWSAccountRequest() {
    }
    

    /**
     * Set body
     * @param body AWS request object (required)
     * @return APIdeleteAWSAccountRequest
     */
    public APIdeleteAWSAccountRequest body(AWSAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute deleteAWSAccount request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteAWSAccount request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAWSAccountWithHttpInfo(body);
    }
  }

  /**
   * Delete an AWS Integration
   * Delete a Datadog-AWS integration matching the specified account_id and role_name parameters.
   * @return deleteAWSAccountRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteAWSAccountRequest deleteAWSAccount() throws ApiException {
    return new APIdeleteAWSAccountRequest();
  }

private ApiResponse<AWSAccountCreateResponse> generateNewAWSExternalIDWithHttpInfo(AWSAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling generateNewAWSExternalID");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/generate_new_external_id";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<AWSAccountCreateResponse> localVarReturnType = new GenericType<AWSAccountCreateResponse>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.generateNewAWSExternalID", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgenerateNewAWSExternalIDRequest {
    private AWSAccount body;

    private APIgenerateNewAWSExternalIDRequest() {
    }
    

    /**
     * Set body
     * @param body Your Datadog role delegation name. For more information about your AWS account Role name, see the [Datadog AWS integration configuration info](https://github.com/DataDog/documentation/blob/master/integrations/amazon_web_services/#installation). (required)
     * @return APIgenerateNewAWSExternalIDRequest
     */
    public APIgenerateNewAWSExternalIDRequest body(AWSAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute generateNewAWSExternalID request
     * @return AWSAccountCreateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSAccountCreateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute generateNewAWSExternalID request with HTTP info returned
     * @return ApiResponse&lt;AWSAccountCreateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AWSAccountCreateResponse> executeWithHttpInfo() throws ApiException {
      return generateNewAWSExternalIDWithHttpInfo(body);
    }
  }

  /**
   * Generate New External ID
   * Generate a new AWS external ID for a given AWS account ID and role name pair.
   * @return generateNewAWSExternalIDRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgenerateNewAWSExternalIDRequest generateNewAWSExternalID() throws ApiException {
    return new APIgenerateNewAWSExternalIDRequest();
  }

private ApiResponse<AWSAccountListResponse> getAllAWSAccountsWithHttpInfo(String accountId, String roleName, String accessKeyId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<AWSAccountListResponse> localVarReturnType = new GenericType<AWSAccountListResponse>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.getAllAWSAccounts", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllAWSAccountsRequest {
    private String accountId;
    private String roleName;
    private String accessKeyId;

    private APIgetAllAWSAccountsRequest() {
    }
    

    /**
     * Set accountId
     * @param accountId Only return AWS accounts that matches this account_id. (optional)
     * @return APIgetAllAWSAccountsRequest
     */
    public APIgetAllAWSAccountsRequest accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
    

    /**
     * Set roleName
     * @param roleName Only return AWS accounts that matches this role_name. (optional)
     * @return APIgetAllAWSAccountsRequest
     */
    public APIgetAllAWSAccountsRequest roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }
    

    /**
     * Set accessKeyId
     * @param accessKeyId Only return AWS accounts that matches this access_key_id. (optional)
     * @return APIgetAllAWSAccountsRequest
     */
    public APIgetAllAWSAccountsRequest accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }
    

    /**
     * Execute getAllAWSAccounts request
     * @return AWSAccountListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSAccountListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllAWSAccounts request with HTTP info returned
     * @return ApiResponse&lt;AWSAccountListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AWSAccountListResponse> executeWithHttpInfo() throws ApiException {
      return getAllAWSAccountsWithHttpInfo(accountId, roleName, accessKeyId);
    }
  }

  /**
   * Get Installed AWS Accounts
   * List all Datadog-AWS integrations available in your Datadog organization.
   * @return getAllAWSAccountsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllAWSAccountsRequest getAllAWSAccounts() throws ApiException {
    return new APIgetAllAWSAccountsRequest();
  }

private ApiResponse<List<String>> listAvailableAWSNamespacesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/available_namespace_rules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.listAvailableAWSNamespaces", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistAvailableAWSNamespacesRequest {

    private APIlistAvailableAWSNamespacesRequest() {
    }
    

    /**
     * Execute listAvailableAWSNamespaces request
     * @return List&lt;String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAvailableAWSNamespaces request with HTTP info returned
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<List<String>> executeWithHttpInfo() throws ApiException {
      return listAvailableAWSNamespacesWithHttpInfo();
    }
  }

  /**
   * List Available Namespaces
   * List all namespace rules for a given Datadog-AWS integration. This endpoint takes no arguments.
   * @return listAvailableAWSNamespacesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistAvailableAWSNamespacesRequest listAvailableAWSNamespaces() throws ApiException {
    return new APIlistAvailableAWSNamespacesRequest();
  }

private ApiResponse<Object> updateAWSAccountWithHttpInfo(AWSAccount body, String accountId, String roleName, String accessKeyId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAWSAccount");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.updateAWSAccount", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateAWSAccountRequest {
    private AWSAccount body;
    private String accountId;
    private String roleName;
    private String accessKeyId;

    private APIupdateAWSAccountRequest() {
    }
    

    /**
     * Set body
     * @param body AWS request object (required)
     * @return APIupdateAWSAccountRequest
     */
    public APIupdateAWSAccountRequest body(AWSAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Set accountId
     * @param accountId Only return AWS accounts that matches this account_id. (optional)
     * @return APIupdateAWSAccountRequest
     */
    public APIupdateAWSAccountRequest accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
    

    /**
     * Set roleName
     * @param roleName Only return AWS accounts that matches this role_name. *It is required if account_id is specified.* (optional)
     * @return APIupdateAWSAccountRequest
     */
    public APIupdateAWSAccountRequest roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }
    

    /**
     * Set accessKeyId
     * @param accessKeyId Only return AWS accounts that matches this access_key_id. *It is required if none of the other two options are specified.* (optional)
     * @return APIupdateAWSAccountRequest
     */
    public APIupdateAWSAccountRequest accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }
    

    /**
     * Execute updateAWSAccount request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAWSAccount request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication Error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return updateAWSAccountWithHttpInfo(body, accountId, roleName, accessKeyId);
    }
  }

  /**
   * Update an AWS Account
   * Update a Datadog-Amazon Web Services integration.
   * @return updateAWSAccountRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateAWSAccountRequest updateAWSAccount() throws ApiException {
    return new APIupdateAWSAccountRequest();
  }
}
