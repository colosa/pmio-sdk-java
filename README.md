# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ProcessmakerApi;

import java.io.File;
import java.util.*;

public class ProcessmakerApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProcessmakerApi* | [**addEvent**](docs/ProcessmakerApi.md#addEvent) | **POST** /processes/{process_id}/events | 
*ProcessmakerApi* | [**addFlow**](docs/ProcessmakerApi.md#addFlow) | **POST** /processes/{process_id}/flows | 
*ProcessmakerApi* | [**addGateway**](docs/ProcessmakerApi.md#addGateway) | **POST** /processes/{process_id}/gateways | 
*ProcessmakerApi* | [**addGroup**](docs/ProcessmakerApi.md#addGroup) | **POST** /groups | 
*ProcessmakerApi* | [**addGroupsToTask**](docs/ProcessmakerApi.md#addGroupsToTask) | **PUT** /processes/{process_id}/tasks/{task_id}/groups | 
*ProcessmakerApi* | [**addInputOutput**](docs/ProcessmakerApi.md#addInputOutput) | **POST** /processes/{process_id}/tasks/{task_id}/inputoutput | 
*ProcessmakerApi* | [**addInstance**](docs/ProcessmakerApi.md#addInstance) | **POST** /processes/{process_id}/instances | 
*ProcessmakerApi* | [**addProcess**](docs/ProcessmakerApi.md#addProcess) | **POST** /processes | 
*ProcessmakerApi* | [**addTask**](docs/ProcessmakerApi.md#addTask) | **POST** /processes/{process_id}/tasks | 
*ProcessmakerApi* | [**addUser**](docs/ProcessmakerApi.md#addUser) | **POST** /users | 
*ProcessmakerApi* | [**addUsersToGroup**](docs/ProcessmakerApi.md#addUsersToGroup) | **PUT** /groups/{id}/users | 
*ProcessmakerApi* | [**deleteEvent**](docs/ProcessmakerApi.md#deleteEvent) | **DELETE** /processes/{process_id}/events/{event_id} | 
*ProcessmakerApi* | [**deleteFlow**](docs/ProcessmakerApi.md#deleteFlow) | **DELETE** /processes/{process_id}/flows/{flow_id} | 
*ProcessmakerApi* | [**deleteGateway**](docs/ProcessmakerApi.md#deleteGateway) | **DELETE** /processes/{process_id}/gateways/{gateway_id} | 
*ProcessmakerApi* | [**deleteGroup**](docs/ProcessmakerApi.md#deleteGroup) | **DELETE** /groups/{id} | 
*ProcessmakerApi* | [**deleteInputOutput**](docs/ProcessmakerApi.md#deleteInputOutput) | **DELETE** /processes/{process_id}/tasks/{task_id}/inputoutput/{inputoutput_uid} | 
*ProcessmakerApi* | [**deleteInstance**](docs/ProcessmakerApi.md#deleteInstance) | **DELETE** /processes/{process_id}/instances/{instance_id} | 
*ProcessmakerApi* | [**deleteProcess**](docs/ProcessmakerApi.md#deleteProcess) | **DELETE** /processes/{id} | 
*ProcessmakerApi* | [**deleteTask**](docs/ProcessmakerApi.md#deleteTask) | **DELETE** /processes/{process_id}/tasks/{task_id} | 
*ProcessmakerApi* | [**deleteUser**](docs/ProcessmakerApi.md#deleteUser) | **DELETE** /users/{id} | 
*ProcessmakerApi* | [**eventTrigger**](docs/ProcessmakerApi.md#eventTrigger) | **POST** /processes/{process_id}/events/{event_id}/trigger | 
*ProcessmakerApi* | [**findDataModel**](docs/ProcessmakerApi.md#findDataModel) | **GET** /processes/{process_id}/instances/{instance_id}/datamodel | 
*ProcessmakerApi* | [**findEventById**](docs/ProcessmakerApi.md#findEventById) | **GET** /processes/{process_id}/events/{event_id} | 
*ProcessmakerApi* | [**findEvents**](docs/ProcessmakerApi.md#findEvents) | **GET** /processes/{process_id}/events | 
*ProcessmakerApi* | [**findFlowById**](docs/ProcessmakerApi.md#findFlowById) | **GET** /processes/{process_id}/flows/{flow_id} | 
*ProcessmakerApi* | [**findFlows**](docs/ProcessmakerApi.md#findFlows) | **GET** /processes/{process_id}/flows | 
*ProcessmakerApi* | [**findGatewayById**](docs/ProcessmakerApi.md#findGatewayById) | **GET** /processes/{process_id}/gateways/{gateway_id} | 
*ProcessmakerApi* | [**findGateways**](docs/ProcessmakerApi.md#findGateways) | **GET** /processes/{process_id}/gateways | 
*ProcessmakerApi* | [**findGroupById**](docs/ProcessmakerApi.md#findGroupById) | **GET** /groups/{id} | 
*ProcessmakerApi* | [**findGroups**](docs/ProcessmakerApi.md#findGroups) | **GET** /groups | 
*ProcessmakerApi* | [**findInputOutputById**](docs/ProcessmakerApi.md#findInputOutputById) | **GET** /processes/{process_id}/tasks/{task_id}/inputoutput/{inputoutput_uid} | 
*ProcessmakerApi* | [**findInputOutputs**](docs/ProcessmakerApi.md#findInputOutputs) | **GET** /processes/{process_id}/tasks/{task_id}/inputoutput | 
*ProcessmakerApi* | [**findInstanceById**](docs/ProcessmakerApi.md#findInstanceById) | **GET** /processes/{process_id}/instances/{instance_id} | 
*ProcessmakerApi* | [**findInstances**](docs/ProcessmakerApi.md#findInstances) | **GET** /processes/{process_id}/instances | 
*ProcessmakerApi* | [**findProcessById**](docs/ProcessmakerApi.md#findProcessById) | **GET** /processes/{id} | 
*ProcessmakerApi* | [**findProcesses**](docs/ProcessmakerApi.md#findProcesses) | **GET** /processes | 
*ProcessmakerApi* | [**findTaskById**](docs/ProcessmakerApi.md#findTaskById) | **GET** /processes/{process_id}/tasks/{task_id} | 
*ProcessmakerApi* | [**findTaskInstanceById**](docs/ProcessmakerApi.md#findTaskInstanceById) | **GET** /task_instances/{task_instance_id} | 
*ProcessmakerApi* | [**findTaskInstances**](docs/ProcessmakerApi.md#findTaskInstances) | **GET** /task_instances | 
*ProcessmakerApi* | [**findTasks**](docs/ProcessmakerApi.md#findTasks) | **GET** /processes/{process_id}/tasks | 
*ProcessmakerApi* | [**findUserById**](docs/ProcessmakerApi.md#findUserById) | **GET** /users/{id} | 
*ProcessmakerApi* | [**findUsers**](docs/ProcessmakerApi.md#findUsers) | **GET** /users | 
*ProcessmakerApi* | [**importBpmnFile**](docs/ProcessmakerApi.md#importBpmnFile) | **POST** /processes/import | 
*ProcessmakerApi* | [**myselfUser**](docs/ProcessmakerApi.md#myselfUser) | **GET** /users/myself | 
*ProcessmakerApi* | [**removeGroupsFromTask**](docs/ProcessmakerApi.md#removeGroupsFromTask) | **DELETE** /processes/{process_id}/tasks/{task_id}/groups | 
*ProcessmakerApi* | [**removeUsersFromGroup**](docs/ProcessmakerApi.md#removeUsersFromGroup) | **DELETE** /groups/{id}/users | 
*ProcessmakerApi* | [**syncGroupsToTask**](docs/ProcessmakerApi.md#syncGroupsToTask) | **POST** /processes/{process_id}/tasks/{task_id}/groups | 
*ProcessmakerApi* | [**syncUsersToGroup**](docs/ProcessmakerApi.md#syncUsersToGroup) | **POST** /groups/{id}/users | 
*ProcessmakerApi* | [**updateEvent**](docs/ProcessmakerApi.md#updateEvent) | **PUT** /processes/{process_id}/events/{event_id} | 
*ProcessmakerApi* | [**updateFlow**](docs/ProcessmakerApi.md#updateFlow) | **PUT** /processes/{process_id}/flows/{flow_id} | 
*ProcessmakerApi* | [**updateGateway**](docs/ProcessmakerApi.md#updateGateway) | **PUT** /processes/{process_id}/gateways/{gateway_id} | 
*ProcessmakerApi* | [**updateGroup**](docs/ProcessmakerApi.md#updateGroup) | **PUT** /groups/{id} | 
*ProcessmakerApi* | [**updateInputOutput**](docs/ProcessmakerApi.md#updateInputOutput) | **PUT** /processes/{process_id}/tasks/{task_id}/inputoutput/{inputoutput_uid} | 
*ProcessmakerApi* | [**updateInstance**](docs/ProcessmakerApi.md#updateInstance) | **PUT** /processes/{process_id}/instances/{instance_id} | 
*ProcessmakerApi* | [**updateProcess**](docs/ProcessmakerApi.md#updateProcess) | **PUT** /processes/{id} | 
*ProcessmakerApi* | [**updateTask**](docs/ProcessmakerApi.md#updateTask) | **PUT** /processes/{process_id}/tasks/{task_id} | 
*ProcessmakerApi* | [**updateTaskInstance**](docs/ProcessmakerApi.md#updateTaskInstance) | **PATCH** /task_instances/{task_instance_id} | 
*ProcessmakerApi* | [**updateUser**](docs/ProcessmakerApi.md#updateUser) | **PUT** /users/{id} | 


## Documentation for Models

 - [BpmnFile](docs/BpmnFile.md)
 - [BpmnFileAttributes](docs/BpmnFileAttributes.md)
 - [BpmnImportItem](docs/BpmnImportItem.md)
 - [DataModel](docs/DataModel.md)
 - [DataModelAttributes](docs/DataModelAttributes.md)
 - [DataModelItem](docs/DataModelItem.md)
 - [DataModelItem1](docs/DataModelItem1.md)
 - [DataModelItemAttributes](docs/DataModelItemAttributes.md)
 - [DateTime](docs/DateTime.md)
 - [Error](docs/Error.md)
 - [ErrorArray](docs/ErrorArray.md)
 - [Event](docs/Event.md)
 - [EventAttributes](docs/EventAttributes.md)
 - [EventCollection](docs/EventCollection.md)
 - [EventCreateItem](docs/EventCreateItem.md)
 - [EventItem](docs/EventItem.md)
 - [EventUpdateItem](docs/EventUpdateItem.md)
 - [Flow](docs/Flow.md)
 - [FlowAttributes](docs/FlowAttributes.md)
 - [FlowCollection](docs/FlowCollection.md)
 - [FlowCreateItem](docs/FlowCreateItem.md)
 - [FlowItem](docs/FlowItem.md)
 - [FlowUpdateItem](docs/FlowUpdateItem.md)
 - [Gateway](docs/Gateway.md)
 - [GatewayAttributes](docs/GatewayAttributes.md)
 - [GatewayCollection](docs/GatewayCollection.md)
 - [GatewayCreateItem](docs/GatewayCreateItem.md)
 - [GatewayItem](docs/GatewayItem.md)
 - [GatewayUpdateItem](docs/GatewayUpdateItem.md)
 - [Group](docs/Group.md)
 - [GroupAddUsersItem](docs/GroupAddUsersItem.md)
 - [GroupAttributes](docs/GroupAttributes.md)
 - [GroupCollection](docs/GroupCollection.md)
 - [GroupCreateItem](docs/GroupCreateItem.md)
 - [GroupIds](docs/GroupIds.md)
 - [GroupItem](docs/GroupItem.md)
 - [GroupRemoveUsersItem](docs/GroupRemoveUsersItem.md)
 - [GroupSyncUsersItem](docs/GroupSyncUsersItem.md)
 - [GroupUpdateItem](docs/GroupUpdateItem.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InputOutput](docs/InputOutput.md)
 - [InputOutputAttributes](docs/InputOutputAttributes.md)
 - [InputOutputCollection](docs/InputOutputCollection.md)
 - [InputOutputCreateItem](docs/InputOutputCreateItem.md)
 - [InputOutputItem](docs/InputOutputItem.md)
 - [InputOutputUpdateItem](docs/InputOutputUpdateItem.md)
 - [Instance](docs/Instance.md)
 - [InstanceAttributes](docs/InstanceAttributes.md)
 - [InstanceCollection](docs/InstanceCollection.md)
 - [InstanceCreateItem](docs/InstanceCreateItem.md)
 - [InstanceItem](docs/InstanceItem.md)
 - [InstanceUpdateItem](docs/InstanceUpdateItem.md)
 - [Meta](docs/Meta.md)
 - [MetaLog](docs/MetaLog.md)
 - [Pagination](docs/Pagination.md)
 - [PaginationLinks](docs/PaginationLinks.md)
 - [Process](docs/Process.md)
 - [ProcessAttributes](docs/ProcessAttributes.md)
 - [ProcessCollection](docs/ProcessCollection.md)
 - [ProcessCollection1](docs/ProcessCollection1.md)
 - [ProcessCreateItem](docs/ProcessCreateItem.md)
 - [ProcessItem](docs/ProcessItem.md)
 - [ProcessUpdateItem](docs/ProcessUpdateItem.md)
 - [ResultSuccess](docs/ResultSuccess.md)
 - [ResultSuccessMeta](docs/ResultSuccessMeta.md)
 - [Task](docs/Task.md)
 - [TaskAddGroupsItem](docs/TaskAddGroupsItem.md)
 - [TaskAttributes](docs/TaskAttributes.md)
 - [TaskCollection](docs/TaskCollection.md)
 - [TaskCreateItem](docs/TaskCreateItem.md)
 - [TaskInstance](docs/TaskInstance.md)
 - [TaskInstanceAttributes](docs/TaskInstanceAttributes.md)
 - [TaskInstanceCollection](docs/TaskInstanceCollection.md)
 - [TaskInstanceUpdateItem](docs/TaskInstanceUpdateItem.md)
 - [TaskItem](docs/TaskItem.md)
 - [TaskRemoveGroupsItem](docs/TaskRemoveGroupsItem.md)
 - [TaskSyncGroupsItem](docs/TaskSyncGroupsItem.md)
 - [TaskUpdateItem](docs/TaskUpdateItem.md)
 - [TriggerEventCreateItem](docs/TriggerEventCreateItem.md)
 - [User](docs/User.md)
 - [UserAttributes](docs/UserAttributes.md)
 - [UserCollection](docs/UserCollection.md)
 - [UserCreateItem](docs/UserCreateItem.md)
 - [UserIds](docs/UserIds.md)
 - [UserItem](docs/UserItem.md)
 - [UserUpdateItem](docs/UserUpdateItem.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### internalApiKey

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: URL query string

### PasswordGrant

- **Type**: OAuth
- **Flow**: password
- **Authorizatoin URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

alpha-program@processmaker.com

