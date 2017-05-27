# ProcessmakerApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClient**](ProcessmakerApi.md#addClient) | **POST** /users/{user_id}/clients | 
[**addEvent**](ProcessmakerApi.md#addEvent) | **POST** /processes/{process_id}/events | 
[**addFlow**](ProcessmakerApi.md#addFlow) | **POST** /processes/{process_id}/flows | 
[**addGateway**](ProcessmakerApi.md#addGateway) | **POST** /processes/{process_id}/gateways | 
[**addGroup**](ProcessmakerApi.md#addGroup) | **POST** /groups | 
[**addGroupsToTask**](ProcessmakerApi.md#addGroupsToTask) | **PUT** /processes/{process_id}/tasks/{task_id}/groups | 
[**addInputOutput**](ProcessmakerApi.md#addInputOutput) | **POST** /processes/{process_id}/tasks/{task_id}/inputoutput | 
[**addInstance**](ProcessmakerApi.md#addInstance) | **POST** /processes/{process_id}/instances | 
[**addProcess**](ProcessmakerApi.md#addProcess) | **POST** /processes | 
[**addTask**](ProcessmakerApi.md#addTask) | **POST** /processes/{process_id}/tasks | 
[**addUser**](ProcessmakerApi.md#addUser) | **POST** /users | 
[**addUsersToGroup**](ProcessmakerApi.md#addUsersToGroup) | **PUT** /groups/{id}/users | 
[**deleteClient**](ProcessmakerApi.md#deleteClient) | **DELETE** /users/{user_id}/clients/{client_id} | 
[**deleteEvent**](ProcessmakerApi.md#deleteEvent) | **DELETE** /processes/{process_id}/events/{event_id} | 
[**deleteFlow**](ProcessmakerApi.md#deleteFlow) | **DELETE** /processes/{process_id}/flows/{flow_id} | 
[**deleteGateway**](ProcessmakerApi.md#deleteGateway) | **DELETE** /processes/{process_id}/gateways/{gateway_id} | 
[**deleteGroup**](ProcessmakerApi.md#deleteGroup) | **DELETE** /groups/{id} | 
[**deleteInputOutput**](ProcessmakerApi.md#deleteInputOutput) | **DELETE** /processes/{process_id}/tasks/{task_id}/inputoutput/{inputoutput_uid} | 
[**deleteInstance**](ProcessmakerApi.md#deleteInstance) | **DELETE** /processes/{process_id}/instances/{instance_id} | 
[**deleteProcess**](ProcessmakerApi.md#deleteProcess) | **DELETE** /processes/{id} | 
[**deleteTask**](ProcessmakerApi.md#deleteTask) | **DELETE** /processes/{process_id}/tasks/{task_id} | 
[**deleteUser**](ProcessmakerApi.md#deleteUser) | **DELETE** /users/{id} | 
[**eventTrigger**](ProcessmakerApi.md#eventTrigger) | **POST** /processes/{process_id}/events/{event_id}/trigger | 
[**findClientById**](ProcessmakerApi.md#findClientById) | **GET** /users/{user_id}/clients/{client_id} | 
[**findClients**](ProcessmakerApi.md#findClients) | **GET** /users/{user_id}/clients | 
[**findDataModel**](ProcessmakerApi.md#findDataModel) | **GET** /processes/{process_id}/instances/{instance_id}/datamodel | 
[**findEventById**](ProcessmakerApi.md#findEventById) | **GET** /processes/{process_id}/events/{event_id} | 
[**findEvents**](ProcessmakerApi.md#findEvents) | **GET** /processes/{process_id}/events | 
[**findFlowById**](ProcessmakerApi.md#findFlowById) | **GET** /processes/{process_id}/flows/{flow_id} | 
[**findFlows**](ProcessmakerApi.md#findFlows) | **GET** /processes/{process_id}/flows | 
[**findGatewayById**](ProcessmakerApi.md#findGatewayById) | **GET** /processes/{process_id}/gateways/{gateway_id} | 
[**findGateways**](ProcessmakerApi.md#findGateways) | **GET** /processes/{process_id}/gateways | 
[**findGroupById**](ProcessmakerApi.md#findGroupById) | **GET** /groups/{id} | 
[**findGroups**](ProcessmakerApi.md#findGroups) | **GET** /groups | 
[**findInputOutputById**](ProcessmakerApi.md#findInputOutputById) | **GET** /processes/{process_id}/tasks/{task_id}/inputoutput/{inputoutput_uid} | 
[**findInputOutputs**](ProcessmakerApi.md#findInputOutputs) | **GET** /processes/{process_id}/tasks/{task_id}/inputoutput | 
[**findInstanceById**](ProcessmakerApi.md#findInstanceById) | **GET** /processes/{process_id}/instances/{instance_id} | 
[**findInstances**](ProcessmakerApi.md#findInstances) | **GET** /processes/{process_id}/instances | 
[**findProcessById**](ProcessmakerApi.md#findProcessById) | **GET** /processes/{id} | 
[**findProcesses**](ProcessmakerApi.md#findProcesses) | **GET** /processes | 
[**findTaskById**](ProcessmakerApi.md#findTaskById) | **GET** /processes/{process_id}/tasks/{task_id} | 
[**findTaskInstanceById**](ProcessmakerApi.md#findTaskInstanceById) | **GET** /task_instances/{task_instance_id} | 
[**findTaskInstances**](ProcessmakerApi.md#findTaskInstances) | **GET** /task_instances | 
[**findTasks**](ProcessmakerApi.md#findTasks) | **GET** /processes/{process_id}/tasks | 
[**findUserById**](ProcessmakerApi.md#findUserById) | **GET** /users/{id} | 
[**findUsers**](ProcessmakerApi.md#findUsers) | **GET** /users | 
[**importBpmnFile**](ProcessmakerApi.md#importBpmnFile) | **POST** /processes/import | 
[**myselfUser**](ProcessmakerApi.md#myselfUser) | **GET** /users/myself | 
[**removeGroupsFromTask**](ProcessmakerApi.md#removeGroupsFromTask) | **DELETE** /processes/{process_id}/tasks/{task_id}/groups | 
[**removeUsersFromGroup**](ProcessmakerApi.md#removeUsersFromGroup) | **DELETE** /groups/{id}/users | 
[**syncGroupsToTask**](ProcessmakerApi.md#syncGroupsToTask) | **POST** /processes/{process_id}/tasks/{task_id}/groups | 
[**syncUsersToGroup**](ProcessmakerApi.md#syncUsersToGroup) | **POST** /groups/{id}/users | 
[**updateClient**](ProcessmakerApi.md#updateClient) | **PUT** /users/{user_id}/clients/{client_id} | 
[**updateEvent**](ProcessmakerApi.md#updateEvent) | **PUT** /processes/{process_id}/events/{event_id} | 
[**updateFlow**](ProcessmakerApi.md#updateFlow) | **PUT** /processes/{process_id}/flows/{flow_id} | 
[**updateGateway**](ProcessmakerApi.md#updateGateway) | **PUT** /processes/{process_id}/gateways/{gateway_id} | 
[**updateGroup**](ProcessmakerApi.md#updateGroup) | **PUT** /groups/{id} | 
[**updateInputOutput**](ProcessmakerApi.md#updateInputOutput) | **PUT** /processes/{process_id}/tasks/{task_id}/inputoutput/{inputoutput_uid} | 
[**updateInstance**](ProcessmakerApi.md#updateInstance) | **PUT** /processes/{process_id}/instances/{instance_id} | 
[**updateProcess**](ProcessmakerApi.md#updateProcess) | **PUT** /processes/{id} | 
[**updateTask**](ProcessmakerApi.md#updateTask) | **PUT** /processes/{process_id}/tasks/{task_id} | 
[**updateTaskInstance**](ProcessmakerApi.md#updateTaskInstance) | **PATCH** /task_instances/{task_instance_id} | 
[**updateUser**](ProcessmakerApi.md#updateUser) | **PUT** /users/{id} | 


<a name="addClient"></a>
# **addClient**
> ClientItem addClient(userId, clientCreateItem)



This method is intended for creating a new Client for User

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String userId = "userId_example"; // String | ID of User relative to client
ClientCreateItem clientCreateItem = new ClientCreateItem(); // ClientCreateItem | JsonApi with the Client object to add
try {
    ClientItem result = apiInstance.addClient(userId, clientCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of User relative to client |
 **clientCreateItem** | [**ClientCreateItem**](ClientCreateItem.md)| JsonApi with the Client object to add |

### Return type

[**ClientItem**](ClientItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addEvent"></a>
# **addEvent**
> EventItem addEvent(processId, eventCreateItem)



This method is intended for creating a new event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to task
EventCreateItem eventCreateItem = new EventCreateItem(); // EventCreateItem | JsonApi with the Event object to add
try {
    EventItem result = apiInstance.addEvent(processId, eventCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to task |
 **eventCreateItem** | [**EventCreateItem**](EventCreateItem.md)| JsonApi with the Event object to add |

### Return type

[**EventItem**](EventItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addFlow"></a>
# **addFlow**
> FlowItem addFlow(processId, flowCreateItem)



This method is intended for creating a new Sequence flow

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to flow
FlowCreateItem flowCreateItem = new FlowCreateItem(); // FlowCreateItem | JsonApi with the Flow object to add
try {
    FlowItem result = apiInstance.addFlow(processId, flowCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to flow |
 **flowCreateItem** | [**FlowCreateItem**](FlowCreateItem.md)| JsonApi with the Flow object to add |

### Return type

[**FlowItem**](FlowItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addGateway"></a>
# **addGateway**
> GatewayItem addGateway(processId, gatewayCreateItem)



This method is intended for creating a new gateway.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to gateway
GatewayCreateItem gatewayCreateItem = new GatewayCreateItem(); // GatewayCreateItem | JsonApi with the Gateway object to add
try {
    GatewayItem result = apiInstance.addGateway(processId, gatewayCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to gateway |
 **gatewayCreateItem** | [**GatewayCreateItem**](GatewayCreateItem.md)| JsonApi with the Gateway object to add |

### Return type

[**GatewayItem**](GatewayItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addGroup"></a>
# **addGroup**
> GroupItem addGroup(groupCreateItem)



This method is intended for creating a new group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
GroupCreateItem groupCreateItem = new GroupCreateItem(); // GroupCreateItem | JsonApi with the Group object to add
try {
    GroupItem result = apiInstance.addGroup(groupCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupCreateItem** | [**GroupCreateItem**](GroupCreateItem.md)| JsonApi with the Group object to add |

### Return type

[**GroupItem**](GroupItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addGroupsToTask"></a>
# **addGroupsToTask**
> ResultSuccess addGroupsToTask(processId, taskId, taskAddGroupsItem)



This method is intended for assignment group(s) to the choosen task

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process
String taskId = "taskId_example"; // String | ID of Task to modify
TaskAddGroupsItem taskAddGroupsItem = new TaskAddGroupsItem(); // TaskAddGroupsItem | JsonApi with Groups ids to add
try {
    ResultSuccess result = apiInstance.addGroupsToTask(processId, taskId, taskAddGroupsItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addGroupsToTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process |
 **taskId** | **String**| ID of Task to modify |
 **taskAddGroupsItem** | [**TaskAddGroupsItem**](TaskAddGroupsItem.md)| JsonApi with Groups ids to add |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addInputOutput"></a>
# **addInputOutput**
> InputOutputItem addInputOutput(processId, taskId, inputOutputCreateItem)



This method is intended for creating a new InputOutput

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | Process ID related to InputOutput object
String taskId = "taskId_example"; // String | Task instance ID related to InputOutput object
InputOutputCreateItem inputOutputCreateItem = new InputOutputCreateItem(); // InputOutputCreateItem | Create and add a new InputOutput object with JSON API
try {
    InputOutputItem result = apiInstance.addInputOutput(processId, taskId, inputOutputCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addInputOutput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| Process ID related to InputOutput object |
 **taskId** | **String**| Task instance ID related to InputOutput object |
 **inputOutputCreateItem** | [**InputOutputCreateItem**](InputOutputCreateItem.md)| Create and add a new InputOutput object with JSON API |

### Return type

[**InputOutputItem**](InputOutputItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addInstance"></a>
# **addInstance**
> InstanceItem addInstance(processId, instanceCreateItem)



This method is intended for creating a new instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | Process ID relative to instance
InstanceCreateItem instanceCreateItem = new InstanceCreateItem(); // InstanceCreateItem | JsonApi with the Instance object to add
try {
    InstanceItem result = apiInstance.addInstance(processId, instanceCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| Process ID relative to instance |
 **instanceCreateItem** | [**InstanceCreateItem**](InstanceCreateItem.md)| JsonApi with the Instance object to add |

### Return type

[**InstanceItem**](InstanceItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addProcess"></a>
# **addProcess**
> ProcessItem addProcess(processCreateItem)



This method is responsible for creating a new process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
ProcessCreateItem processCreateItem = new ProcessCreateItem(); // ProcessCreateItem | JsonApi with the Process object to add
try {
    ProcessItem result = apiInstance.addProcess(processCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processCreateItem** | [**ProcessCreateItem**](ProcessCreateItem.md)| JsonApi with the Process object to add |

### Return type

[**ProcessItem**](ProcessItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addTask"></a>
# **addTask**
> TaskItem addTask(processId, taskCreateItem)



This method is intended for creating a new task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to task
TaskCreateItem taskCreateItem = new TaskCreateItem(); // TaskCreateItem | JsonApi with the Task object to add
try {
    TaskItem result = apiInstance.addTask(processId, taskCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to task |
 **taskCreateItem** | [**TaskCreateItem**](TaskCreateItem.md)| JsonApi with the Task object to add |

### Return type

[**TaskItem**](TaskItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addUser"></a>
# **addUser**
> UserItem addUser(userCreateItem)



This method is intended for creating a new user in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
UserCreateItem userCreateItem = new UserCreateItem(); // UserCreateItem | JsonApi with the User object to add
try {
    UserItem result = apiInstance.addUser(userCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCreateItem** | [**UserCreateItem**](UserCreateItem.md)| JsonApi with the User object to add |

### Return type

[**UserItem**](UserItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addUsersToGroup"></a>
# **addUsersToGroup**
> ResultSuccess addUsersToGroup(id, groupAddUsersItem)



This method is intended for adding one, or more new users to a group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of Group to modify
GroupAddUsersItem groupAddUsersItem = new GroupAddUsersItem(); // GroupAddUsersItem | JsonApi with Users ids to add
try {
    ResultSuccess result = apiInstance.addUsersToGroup(id, groupAddUsersItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#addUsersToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Group to modify |
 **groupAddUsersItem** | [**GroupAddUsersItem**](GroupAddUsersItem.md)| JsonApi with Users ids to add |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteClient"></a>
# **deleteClient**
> ResultSuccess deleteClient(userId, clientId)



This method is intended for deleting a single item based on the Client and User IDs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String userId = "userId_example"; // String | ID of of User item
String clientId = "clientId_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteClient(userId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of of User item |
 **clientId** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteEvent"></a>
# **deleteEvent**
> ResultSuccess deleteEvent(processId, eventId)



This method is intended for deleting a single item based on event_id and Process ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of of Process item
String eventId = "eventId_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteEvent(processId, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of of Process item |
 **eventId** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteFlow"></a>
# **deleteFlow**
> ResultSuccess deleteFlow(processId, flowId)



This method is intended for deleting a single item based on the flow_id and Process ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of of Process item
String flowId = "flowId_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteFlow(processId, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of of Process item |
 **flowId** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteGateway"></a>
# **deleteGateway**
> ResultSuccess deleteGateway(processId, gatewayId)



This method is intended for deleting a single item based on the gateway_id and Process ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of of Process item
String gatewayId = "gatewayId_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteGateway(processId, gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of of Process item |
 **gatewayId** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteGroup"></a>
# **deleteGroup**
> ResultSuccess deleteGroup(id)



This method is intended for deleting a single item based on the itemâ€™s ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteInputOutput"></a>
# **deleteInputOutput**
> ResultSuccess deleteInputOutput(processId, taskId, inputoutputUid)



This method is intended for deleting a single item based on the InputOutput ID, Process ID and Task ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | Process ID related to InputOutput object
String taskId = "taskId_example"; // String | Task instance ID related to InputOutput object
String inputoutputUid = "inputoutputUid_example"; // String | ID of InputOutput to fetch
try {
    ResultSuccess result = apiInstance.deleteInputOutput(processId, taskId, inputoutputUid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteInputOutput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| Process ID related to InputOutput object |
 **taskId** | **String**| Task instance ID related to InputOutput object |
 **inputoutputUid** | **String**| ID of InputOutput to fetch |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteInstance"></a>
# **deleteInstance**
> ResultSuccess deleteInstance(processId, instanceId)



This method is intended for deleting a single item based on the instance ID and Process ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of of Process item
String instanceId = "instanceId_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteInstance(processId, instanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of of Process item |
 **instanceId** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteProcess"></a>
# **deleteProcess**
> ResultSuccess deleteProcess(id)



This method is intended for deleting a single item based on the itemâ€™s ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteProcess(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteTask"></a>
# **deleteTask**
> ResultSuccess deleteTask(processId, taskId)



This method is intended for deleting a single item based on task_id and Process ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of of Process item
String taskId = "taskId_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteTask(processId, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of of Process item |
 **taskId** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deleteUser"></a>
# **deleteUser**
> ResultSuccess deleteUser(id)



This method deletes User from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of item to delete
try {
    ResultSuccess result = apiInstance.deleteUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of item to delete |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="eventTrigger"></a>
# **eventTrigger**
> DataModelItem1 eventTrigger(processId, eventId, triggerEventCreateItem)



This method is intended for creating an event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to event
String eventId = "eventId_example"; // String | ID of Event to trigger
TriggerEventCreateItem triggerEventCreateItem = new TriggerEventCreateItem(); // TriggerEventCreateItem | Json with some parameters
try {
    DataModelItem1 result = apiInstance.eventTrigger(processId, eventId, triggerEventCreateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#eventTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to event |
 **eventId** | **String**| ID of Event to trigger |
 **triggerEventCreateItem** | [**TriggerEventCreateItem**](TriggerEventCreateItem.md)| Json with some parameters |

### Return type

[**DataModelItem1**](DataModelItem1.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findClientById"></a>
# **findClientById**
> ClientItem findClientById(userId, clientId)



This method is intended for retrieving a client based on ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String userId = "userId_example"; // String | ID of User to fetch
String clientId = "clientId_example"; // String | ID of Client to fetch
try {
    ClientItem result = apiInstance.findClientById(userId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findClientById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of User to fetch |
 **clientId** | **String**| ID of Client to fetch |

### Return type

[**ClientItem**](ClientItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findClients"></a>
# **findClients**
> ClientCollection findClients(userId, page, perPage)



This method is intended for retrieving all existing clients of user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String userId = "userId_example"; // String | ID of User relative to clients
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    ClientCollection result = apiInstance.findClients(userId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of User relative to clients |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**ClientCollection**](ClientCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findDataModel"></a>
# **findDataModel**
> DataModelItem1 findDataModel(processId, instanceId, page, perPage)



This method returns the instance DataModel and lets work with it directly

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String instanceId = "instanceId_example"; // String | ID of Instance to fetch
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    DataModelItem1 result = apiInstance.findDataModel(processId, instanceId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findDataModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **instanceId** | **String**| ID of Instance to fetch |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**DataModelItem1**](DataModelItem1.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findEventById"></a>
# **findEventById**
> EventItem findEventById(processId, eventId)



This method is intended for retrieving an event based on itâ€™s ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String eventId = "eventId_example"; // String | ID of Event to fetch
try {
    EventItem result = apiInstance.findEventById(processId, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findEventById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **eventId** | **String**| ID of Event to fetch |

### Return type

[**EventItem**](EventItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findEvents"></a>
# **findEvents**
> EventCollection findEvents(processId, page, perPage)



This method returns all events related to the runned process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to event
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    EventCollection result = apiInstance.findEvents(processId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to event |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**EventCollection**](EventCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findFlowById"></a>
# **findFlowById**
> FlowItem findFlowById(processId, flowId)



This method is intended for retrieving a flow based on itâ€™s ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String flowId = "flowId_example"; // String | ID of Flow to fetch
try {
    FlowItem result = apiInstance.findFlowById(processId, flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findFlowById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **flowId** | **String**| ID of Flow to fetch |

### Return type

[**FlowItem**](FlowItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findFlows"></a>
# **findFlows**
> FlowCollection findFlows(processId, page, perPage)



This method is intended for retrieving all existing flows.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to flow
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    FlowCollection result = apiInstance.findFlows(processId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findFlows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to flow |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**FlowCollection**](FlowCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findGatewayById"></a>
# **findGatewayById**
> GatewayItem findGatewayById(processId, gatewayId)



This method is intended for retrieving a gateway based on itâ€™s ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String gatewayId = "gatewayId_example"; // String | ID of Gateway to fetch
try {
    GatewayItem result = apiInstance.findGatewayById(processId, gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findGatewayById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **gatewayId** | **String**| ID of Gateway to fetch |

### Return type

[**GatewayItem**](GatewayItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findGateways"></a>
# **findGateways**
> GatewayCollection findGateways(processId, page, perPage)



This method is intending for retrieving all existing gateways.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to gateway
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    GatewayCollection result = apiInstance.findGateways(processId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to gateway |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**GatewayCollection**](GatewayCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findGroupById"></a>
# **findGroupById**
> GroupItem findGroupById(id)



This method is responsible for retrieving a group based on a single ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of Group to fetch
try {
    GroupItem result = apiInstance.findGroupById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Group to fetch |

### Return type

[**GroupItem**](GroupItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findGroups"></a>
# **findGroups**
> GroupCollection findGroups(page, perPage)



This method is responsible for retrieving all existing groups.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    GroupCollection result = apiInstance.findGroups(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**GroupCollection**](GroupCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findInputOutputById"></a>
# **findInputOutputById**
> InputOutputItem findInputOutputById(processId, taskId, inputoutputUid)



This method is intended for retrieving an InputOutput object based on ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | Process ID related to InputOutput object
String taskId = "taskId_example"; // String | Task instance ID related to InputOutput object
String inputoutputUid = "inputoutputUid_example"; // String | ID of InputOutput to fetch
try {
    InputOutputItem result = apiInstance.findInputOutputById(processId, taskId, inputoutputUid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findInputOutputById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| Process ID related to InputOutput object |
 **taskId** | **String**| Task instance ID related to InputOutput object |
 **inputoutputUid** | **String**| ID of InputOutput to fetch |

### Return type

[**InputOutputItem**](InputOutputItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findInputOutputs"></a>
# **findInputOutputs**
> InputOutputCollection findInputOutputs(processId, taskId, page, perPage)



This method is intended for retrieving all existing InputOutput objects for the related task instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | Process ID related to InputOutput object
String taskId = "taskId_example"; // String | Task instance ID related to InputOutput object
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    InputOutputCollection result = apiInstance.findInputOutputs(processId, taskId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findInputOutputs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| Process ID related to InputOutput object |
 **taskId** | **String**| Task instance ID related to InputOutput object |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**InputOutputCollection**](InputOutputCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findInstanceById"></a>
# **findInstanceById**
> InstanceItem findInstanceById(processId, instanceId)



This method is responsible for retrieving an instance based on itâ€™s ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String instanceId = "instanceId_example"; // String | ID of Instance to fetch
try {
    InstanceItem result = apiInstance.findInstanceById(processId, instanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findInstanceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **instanceId** | **String**| ID of Instance to fetch |

### Return type

[**InstanceItem**](InstanceItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findInstances"></a>
# **findInstances**
> InstanceCollection findInstances(processId, page, perPage)



This method is responsible for retrieving all Instances related to the Process via Process ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | Process ID relative to instance
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    InstanceCollection result = apiInstance.findInstances(processId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| Process ID relative to instance |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**InstanceCollection**](InstanceCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findProcessById"></a>
# **findProcessById**
> ProcessItem findProcessById(id)



Returns the process based on a single ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of Process to fetch
try {
    ProcessItem result = apiInstance.findProcessById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findProcessById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Process to fetch |

### Return type

[**ProcessItem**](ProcessItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findProcesses"></a>
# **findProcesses**
> ProcessCollection findProcesses(page, perPage)



This method is responsible for retrieving all existing processes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    ProcessCollection result = apiInstance.findProcesses(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findProcesses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**ProcessCollection**](ProcessCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findTaskById"></a>
# **findTaskById**
> TaskItem findTaskById(processId, taskId)



This method is responsible for retrieving a task based on itâ€™s ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String taskId = "taskId_example"; // String | ID of Task to fetch
try {
    TaskItem result = apiInstance.findTaskById(processId, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findTaskById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **taskId** | **String**| ID of Task to fetch |

### Return type

[**TaskItem**](TaskItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findTaskInstanceById"></a>
# **findTaskInstanceById**
> InlineResponse200 findTaskInstanceById(taskInstanceId, page, perPage)



This method is responsible for retrieving TaskInstance based on itâ€™s ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String taskInstanceId = "taskInstanceId_example"; // String | ID of TaskInstance to fetch
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    InlineResponse200 result = apiInstance.findTaskInstanceById(taskInstanceId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findTaskInstanceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskInstanceId** | **String**| ID of TaskInstance to fetch |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findTaskInstances"></a>
# **findTaskInstances**
> TaskInstanceCollection findTaskInstances(page, perPage)



This method is responsible for retrieving and finding tasks instances  related to the task

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    TaskInstanceCollection result = apiInstance.findTaskInstances(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findTaskInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**TaskInstanceCollection**](TaskInstanceCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findTasks"></a>
# **findTasks**
> TaskCollection findTasks(processId, page, perPage)



This method is intended for returning a list of all Tasks related to the process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process relative to task
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    TaskCollection result = apiInstance.findTasks(processId, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process relative to task |
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**TaskCollection**](TaskCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findUserById"></a>
# **findUserById**
> UserItem findUserById(id)



This method is responsible for returning a user based on their ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of User to fetch
try {
    UserItem result = apiInstance.findUserById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of User to fetch |

### Return type

[**UserItem**](UserItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="findUsers"></a>
# **findUsers**
> UserCollection findUsers(page, perPage)



This method is intended for returning all existing users in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    UserCollection result = apiInstance.findUsers(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#findUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**UserCollection**](UserCollection.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="importBpmnFile"></a>
# **importBpmnFile**
> ProcessCollection1 importBpmnFile(bpmnImportItem)



This method is intended for importing BPMN files. This import covers next BPMN 2.0 elements for modeling processes: Sequence Flows, Start event, End event, Message Start event, Message Intermediate event, Timer Boundary Interrupting Event, Timer Boundary Non-Interrupting Event, Script task, User task, Service task Exclusive Gateways, Inclusive Gateways, Parallel Gateways. A new process is created when import passed successful.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
BpmnImportItem bpmnImportItem = new BpmnImportItem(); // BpmnImportItem | JsonApi with the BPMN file to import
try {
    ProcessCollection1 result = apiInstance.importBpmnFile(bpmnImportItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#importBpmnFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bpmnImportItem** | [**BpmnImportItem**](BpmnImportItem.md)| JsonApi with the BPMN file to import |

### Return type

[**ProcessCollection1**](ProcessCollection1.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="myselfUser"></a>
# **myselfUser**
> UserItem myselfUser(page, perPage)



This method returns User information based on Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
Integer page = 1; // Integer | Page Nr to fetch
Integer perPage = 15; // Integer | Amount of Items per Page
try {
    UserItem result = apiInstance.myselfUser(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#myselfUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page Nr to fetch | [optional] [default to 1]
 **perPage** | **Integer**| Amount of Items per Page | [optional] [default to 15]

### Return type

[**UserItem**](UserItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeGroupsFromTask"></a>
# **removeGroupsFromTask**
> ResultSuccess removeGroupsFromTask(processId, taskId, taskRemoveGroupsItem)



This method is intended for removing groups from a task

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process
String taskId = "taskId_example"; // String | ID of Task
TaskRemoveGroupsItem taskRemoveGroupsItem = new TaskRemoveGroupsItem(); // TaskRemoveGroupsItem | JsonApi with Groups ids to remove
try {
    ResultSuccess result = apiInstance.removeGroupsFromTask(processId, taskId, taskRemoveGroupsItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#removeGroupsFromTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process |
 **taskId** | **String**| ID of Task |
 **taskRemoveGroupsItem** | [**TaskRemoveGroupsItem**](TaskRemoveGroupsItem.md)| JsonApi with Groups ids to remove |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeUsersFromGroup"></a>
# **removeUsersFromGroup**
> ResultSuccess removeUsersFromGroup(id, groupRemoveUsersItem)



This method is intended for removing one or more users from a group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of Group to modify
GroupRemoveUsersItem groupRemoveUsersItem = new GroupRemoveUsersItem(); // GroupRemoveUsersItem | JsonApi with Users ids to remove
try {
    ResultSuccess result = apiInstance.removeUsersFromGroup(id, groupRemoveUsersItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#removeUsersFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Group to modify |
 **groupRemoveUsersItem** | [**GroupRemoveUsersItem**](GroupRemoveUsersItem.md)| JsonApi with Users ids to remove |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="syncGroupsToTask"></a>
# **syncGroupsToTask**
> ResultSuccess syncGroupsToTask(processId, taskId, taskSyncGroupsItem)



This method is intended for synchronizing a one or more groups with a task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process
String taskId = "taskId_example"; // String | ID of Task to modify
TaskSyncGroupsItem taskSyncGroupsItem = new TaskSyncGroupsItem(); // TaskSyncGroupsItem | JsonApi with Groups ids to sync
try {
    ResultSuccess result = apiInstance.syncGroupsToTask(processId, taskId, taskSyncGroupsItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#syncGroupsToTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process |
 **taskId** | **String**| ID of Task to modify |
 **taskSyncGroupsItem** | [**TaskSyncGroupsItem**](TaskSyncGroupsItem.md)| JsonApi with Groups ids to sync |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="syncUsersToGroup"></a>
# **syncUsersToGroup**
> ResultSuccess syncUsersToGroup(id, groupSyncUsersItem)



This method is intended for synchronizing one or more users with a group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of Group to modify
GroupSyncUsersItem groupSyncUsersItem = new GroupSyncUsersItem(); // GroupSyncUsersItem | JsonApi with Users ids to sync
try {
    ResultSuccess result = apiInstance.syncUsersToGroup(id, groupSyncUsersItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#syncUsersToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Group to modify |
 **groupSyncUsersItem** | [**GroupSyncUsersItem**](GroupSyncUsersItem.md)| JsonApi with Users ids to sync |

### Return type

[**ResultSuccess**](ResultSuccess.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateClient"></a>
# **updateClient**
> ClientItem updateClient(userId, clientId, clientUpdateItem)



This method is intended for updating an existing client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String userId = "userId_example"; // String | ID of User to fetch
String clientId = "clientId_example"; // String | ID of Client to fetch
ClientUpdateItem clientUpdateItem = new ClientUpdateItem(); // ClientUpdateItem | Client object to edit
try {
    ClientItem result = apiInstance.updateClient(userId, clientId, clientUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of User to fetch |
 **clientId** | **String**| ID of Client to fetch |
 **clientUpdateItem** | [**ClientUpdateItem**](ClientUpdateItem.md)| Client object to edit |

### Return type

[**ClientItem**](ClientItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateEvent"></a>
# **updateEvent**
> EventItem updateEvent(processId, eventId, eventUpdateItem)



This method lets update the existing Process Event with new  data

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String eventId = "eventId_example"; // String | ID of Event to fetch
EventUpdateItem eventUpdateItem = new EventUpdateItem(); // EventUpdateItem | Event object to edit
try {
    EventItem result = apiInstance.updateEvent(processId, eventId, eventUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **eventId** | **String**| ID of Event to fetch |
 **eventUpdateItem** | [**EventUpdateItem**](EventUpdateItem.md)| Event object to edit |

### Return type

[**EventItem**](EventItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateFlow"></a>
# **updateFlow**
> FlowItem updateFlow(processId, flowId, flowUpdateItem)



This method is intended for updating an existing flow.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String flowId = "flowId_example"; // String | ID of Flow to fetch
FlowUpdateItem flowUpdateItem = new FlowUpdateItem(); // FlowUpdateItem | Flow object to edit
try {
    FlowItem result = apiInstance.updateFlow(processId, flowId, flowUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **flowId** | **String**| ID of Flow to fetch |
 **flowUpdateItem** | [**FlowUpdateItem**](FlowUpdateItem.md)| Flow object to edit |

### Return type

[**FlowItem**](FlowItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateGateway"></a>
# **updateGateway**
> GatewayItem updateGateway(processId, gatewayId, gatewayUpdateItem)



This method is intended for updating an existing gateway.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String gatewayId = "gatewayId_example"; // String | ID of Gateway to fetch
GatewayUpdateItem gatewayUpdateItem = new GatewayUpdateItem(); // GatewayUpdateItem | Gateway object to edit
try {
    GatewayItem result = apiInstance.updateGateway(processId, gatewayId, gatewayUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **gatewayId** | **String**| ID of Gateway to fetch |
 **gatewayUpdateItem** | [**GatewayUpdateItem**](GatewayUpdateItem.md)| Gateway object to edit |

### Return type

[**GatewayItem**](GatewayItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateGroup"></a>
# **updateGroup**
> GroupItem updateGroup(id, groupUpdateItem)



This method is intended for updating an existing group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of Group to fetch
GroupUpdateItem groupUpdateItem = new GroupUpdateItem(); // GroupUpdateItem | Group object to edit
try {
    GroupItem result = apiInstance.updateGroup(id, groupUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Group to fetch |
 **groupUpdateItem** | [**GroupUpdateItem**](GroupUpdateItem.md)| Group object to edit |

### Return type

[**GroupItem**](GroupItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateInputOutput"></a>
# **updateInputOutput**
> InputOutputItem updateInputOutput(processId, taskId, inputoutputUid, inputOutputUpdateItem)



This method is intended for updating an existing InputOutput.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | Process ID related to InputOutput object
String taskId = "taskId_example"; // String | Task instance ID related to InputOutput object
String inputoutputUid = "inputoutputUid_example"; // String | ID of InputOutput to fetch
InputOutputUpdateItem inputOutputUpdateItem = new InputOutputUpdateItem(); // InputOutputUpdateItem | InputOutput object to edit
try {
    InputOutputItem result = apiInstance.updateInputOutput(processId, taskId, inputoutputUid, inputOutputUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateInputOutput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| Process ID related to InputOutput object |
 **taskId** | **String**| Task instance ID related to InputOutput object |
 **inputoutputUid** | **String**| ID of InputOutput to fetch |
 **inputOutputUpdateItem** | [**InputOutputUpdateItem**](InputOutputUpdateItem.md)| InputOutput object to edit |

### Return type

[**InputOutputItem**](InputOutputItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateInstance"></a>
# **updateInstance**
> InstanceItem updateInstance(processId, instanceId, instanceUpdateItem)



This method is intended for updating an existing Instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String instanceId = "instanceId_example"; // String | ID of Instance to fetch
InstanceUpdateItem instanceUpdateItem = new InstanceUpdateItem(); // InstanceUpdateItem | Instance object to edit
try {
    InstanceItem result = apiInstance.updateInstance(processId, instanceId, instanceUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **instanceId** | **String**| ID of Instance to fetch |
 **instanceUpdateItem** | [**InstanceUpdateItem**](InstanceUpdateItem.md)| Instance object to edit |

### Return type

[**InstanceItem**](InstanceItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateProcess"></a>
# **updateProcess**
> ProcessItem updateProcess(id, processUpdateItem)



This method is intended for updating an existing process.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of Process to fetch
ProcessUpdateItem processUpdateItem = new ProcessUpdateItem(); // ProcessUpdateItem | Process object to edit
try {
    ProcessItem result = apiInstance.updateProcess(id, processUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Process to fetch |
 **processUpdateItem** | [**ProcessUpdateItem**](ProcessUpdateItem.md)| Process object to edit |

### Return type

[**ProcessItem**](ProcessItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateTask"></a>
# **updateTask**
> TaskItem updateTask(processId, taskId, taskUpdateItem)



This method is intended for updating an existing task.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String processId = "processId_example"; // String | ID of Process to fetch
String taskId = "taskId_example"; // String | ID of Task to fetch
TaskUpdateItem taskUpdateItem = new TaskUpdateItem(); // TaskUpdateItem | Task object to edit
try {
    TaskItem result = apiInstance.updateTask(processId, taskId, taskUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of Process to fetch |
 **taskId** | **String**| ID of Task to fetch |
 **taskUpdateItem** | [**TaskUpdateItem**](TaskUpdateItem.md)| Task object to edit |

### Return type

[**TaskItem**](TaskItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateTaskInstance"></a>
# **updateTaskInstance**
> InlineResponse200 updateTaskInstance(taskInstanceId, taskInstanceUpdateItem)



This method is intended for updating an existing TaskInstance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String taskInstanceId = "taskInstanceId_example"; // String | ID of TaskInstance to fetch
TaskInstanceUpdateItem taskInstanceUpdateItem = new TaskInstanceUpdateItem(); // TaskInstanceUpdateItem | TaskInstance object to update
try {
    InlineResponse200 result = apiInstance.updateTaskInstance(taskInstanceId, taskInstanceUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateTaskInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskInstanceId** | **String**| ID of TaskInstance to fetch |
 **taskInstanceUpdateItem** | [**TaskInstanceUpdateItem**](TaskInstanceUpdateItem.md)| TaskInstance object to update |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateUser"></a>
# **updateUser**
> UserItem updateUser(id, userUpdateItem)



This method is intended for updating parameters an existing user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessmakerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: PasswordGrant
OAuth PasswordGrant = (OAuth) defaultClient.getAuthentication("PasswordGrant");
PasswordGrant.setAccessToken("YOUR ACCESS TOKEN");

ProcessmakerApi apiInstance = new ProcessmakerApi();
String id = "id_example"; // String | ID of User to fetch
UserUpdateItem userUpdateItem = new UserUpdateItem(); // UserUpdateItem | User object for update
try {
    UserItem result = apiInstance.updateUser(id, userUpdateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessmakerApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of User to fetch |
 **userUpdateItem** | [**UserUpdateItem**](UserUpdateItem.md)| User object for update |

### Return type

[**UserItem**](UserItem.md)

### Authorization

[internalApiKey](../README.md#internalApiKey), [PasswordGrant](../README.md#PasswordGrant)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

