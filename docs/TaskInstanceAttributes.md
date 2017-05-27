
# TaskInstanceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **String** |  | 
**instanceId** | **String** |  | 
**groupId** | **String** |  |  [optional]
**userId** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**priority** | [**PriorityEnum**](#PriorityEnum) |  | 
**delegateDate** | [**DateTime**](DateTime.md) |  |  [optional]
**startDate** | [**DateTime**](DateTime.md) |  |  [optional]
**finishDate** | [**DateTime**](DateTime.md) |  |  [optional]
**taskDueDate** | [**DateTime**](DateTime.md) |  |  [optional]
**riskDate** | [**DateTime**](DateTime.md) |  |  [optional]
**duration** | **Integer** |  |  [optional]
**instanceOverduePercentage** | **Double** |  |  [optional]
**data** | **String** |  |  [optional]
**content** | **String** |  |  [optional]
**createdAt** | [**DateTime**](DateTime.md) |  |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INITIAL | &quot;INITIAL&quot;
DELEGATED | &quot;DELEGATED&quot;
STARTED | &quot;STARTED&quot;
CANCELLED | &quot;CANCELLED&quot;
FINISHED | &quot;FINISHED&quot;
COMPLETE | &quot;COMPLETE&quot;
PAUSED | &quot;PAUSED&quot;


<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_5 | &quot;5&quot;



