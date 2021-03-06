/**
 * ProcessMaker API
 * This ProcessMaker Core API provide access to the new generation engine with BPMN 2.0 support. The current Alpha 1.0 version supports  the part of BPM system functionality like process import, process execution, task assignment
 *
 * OpenAPI spec version: 1.0.0
 * Contact: alpha-program@processmaker.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * TaskAttributes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-14T14:31:37.499+02:00")
public class TaskAttributes   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("process_id")
  private String processId = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("NORMAL")
    NORMAL("NORMAL"),
    
    @SerializedName("ADHOC")
    ADHOC("ADHOC"),
    
    @SerializedName("SUBPROCESS")
    SUBPROCESS("SUBPROCESS"),
    
    @SerializedName("HIDDEN")
    HIDDEN("HIDDEN"),
    
    @SerializedName("GATEWAYTOGATEWAY")
    GATEWAYTOGATEWAY("GATEWAYTOGATEWAY"),
    
    @SerializedName("WEBENTRYEVENT")
    WEBENTRYEVENT("WEBENTRYEVENT"),
    
    @SerializedName("END-MESSAGE-EVENT")
    END_MESSAGE_EVENT("END-MESSAGE-EVENT"),
    
    @SerializedName("START-MESSAGE-EVENT")
    START_MESSAGE_EVENT("START-MESSAGE-EVENT"),
    
    @SerializedName("INTERMEDIATE-THROW-MESSAGE-EVENT")
    INTERMEDIATE_THROW_MESSAGE_EVENT("INTERMEDIATE-THROW-MESSAGE-EVENT"),
    
    @SerializedName("INTERMEDIATE-CATCH-MESSAGE-EVENT")
    INTERMEDIATE_CATCH_MESSAGE_EVENT("INTERMEDIATE-CATCH-MESSAGE-EVENT"),
    
    @SerializedName("SCRIPT-TASK")
    SCRIPT_TASK("SCRIPT-TASK"),
    
    @SerializedName("USER-TASK")
    USER_TASK("USER-TASK"),
    
    @SerializedName("START-TIMER-EVENT")
    START_TIMER_EVENT("START-TIMER-EVENT"),
    
    @SerializedName("INTERMEDIATE-CATCH-TIMER-EVENT")
    INTERMEDIATE_CATCH_TIMER_EVENT("INTERMEDIATE-CATCH-TIMER-EVENT"),
    
    @SerializedName("END-EMAIL-EVENT")
    END_EMAIL_EVENT("END-EMAIL-EVENT"),
    
    @SerializedName("INTERMEDIATE-THROW-EMAIL-EVENT")
    INTERMEDIATE_THROW_EMAIL_EVENT("INTERMEDIATE-THROW-EMAIL-EVENT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = TypeEnum.NORMAL;

  /**
   * Gets or Sets assignType
   */
  public enum AssignTypeEnum {
    @SerializedName("CYCLIC")
    CYCLIC("CYCLIC"),
    
    @SerializedName("MANUAL")
    MANUAL("MANUAL"),
    
    @SerializedName("EVALUATE")
    EVALUATE("EVALUATE"),
    
    @SerializedName("REPORT_TO")
    REPORT_TO("REPORT_TO"),
    
    @SerializedName("SELF_SERVICE")
    SELF_SERVICE("SELF_SERVICE"),
    
    @SerializedName("STATIC_MI")
    STATIC_MI("STATIC_MI"),
    
    @SerializedName("CANCEL_MI")
    CANCEL_MI("CANCEL_MI"),
    
    @SerializedName("MULTIPLE_INSTANCE")
    MULTIPLE_INSTANCE("MULTIPLE_INSTANCE"),
    
    @SerializedName("MULTIPLE_INSTANCE_VALUE_BASED")
    MULTIPLE_INSTANCE_VALUE_BASED("MULTIPLE_INSTANCE_VALUE_BASED");

    private String value;

    AssignTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("assign_type")
  private AssignTypeEnum assignType = AssignTypeEnum.CYCLIC;

  @SerializedName("priority_variable")
  private String priorityVariable = null;

  @SerializedName("assign_variable")
  private String assignVariable = null;

  @SerializedName("group_variable")
  private String groupVariable = null;

  @SerializedName("mi_instance_variable")
  private String miInstanceVariable = null;

  @SerializedName("mi_complete_variable")
  private String miCompleteVariable = null;

  @SerializedName("transfer_fly")
  private Boolean transferFly = false;

  @SerializedName("can_upload")
  private Boolean canUpload = false;

  @SerializedName("view_upload")
  private Boolean viewUpload = false;

  @SerializedName("view_additional_documentation")
  private Boolean viewAdditionalDocumentation = false;

  @SerializedName("start")
  private Boolean start = false;

  @SerializedName("send_last_email")
  private Boolean sendLastEmail = true;

  @SerializedName("derivation_screen_tpl")
  private String derivationScreenTpl = null;

  @SerializedName("selfservice_timeout")
  private Integer selfserviceTimeout = null;

  @SerializedName("selfservice_time")
  private String selfserviceTime = null;

  @SerializedName("selfservice_time_unit")
  private String selfserviceTimeUnit = null;

  @SerializedName("selfservice_execution")
  private String selfserviceExecution = null;

  @SerializedName("last_assigned_user_id")
  private String lastAssignedUserId = null;

  @SerializedName("script")
  private String script = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public TaskAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Task_Title", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Some description", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskAttributes processId(String processId) {
    this.processId = processId;
    return this;
  }

   /**
   * Get processId
   * @return processId
  **/
  @ApiModelProperty(example = "9d705617-cc29-482a-85ff-7f7292f72b11", required = true, value = "")
  public String getProcessId() {
    return processId;
  }

  public void setProcessId(String processId) {
    this.processId = processId;
  }

  public TaskAttributes type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TaskAttributes assignType(AssignTypeEnum assignType) {
    this.assignType = assignType;
    return this;
  }

   /**
   * Get assignType
   * @return assignType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AssignTypeEnum getAssignType() {
    return assignType;
  }

  public void setAssignType(AssignTypeEnum assignType) {
    this.assignType = assignType;
  }

  public TaskAttributes priorityVariable(String priorityVariable) {
    this.priorityVariable = priorityVariable;
    return this;
  }

   /**
   * Get priorityVariable
   * @return priorityVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPriorityVariable() {
    return priorityVariable;
  }

  public void setPriorityVariable(String priorityVariable) {
    this.priorityVariable = priorityVariable;
  }

  public TaskAttributes assignVariable(String assignVariable) {
    this.assignVariable = assignVariable;
    return this;
  }

   /**
   * Get assignVariable
   * @return assignVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssignVariable() {
    return assignVariable;
  }

  public void setAssignVariable(String assignVariable) {
    this.assignVariable = assignVariable;
  }

  public TaskAttributes groupVariable(String groupVariable) {
    this.groupVariable = groupVariable;
    return this;
  }

   /**
   * Get groupVariable
   * @return groupVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupVariable() {
    return groupVariable;
  }

  public void setGroupVariable(String groupVariable) {
    this.groupVariable = groupVariable;
  }

  public TaskAttributes miInstanceVariable(String miInstanceVariable) {
    this.miInstanceVariable = miInstanceVariable;
    return this;
  }

   /**
   * Get miInstanceVariable
   * @return miInstanceVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMiInstanceVariable() {
    return miInstanceVariable;
  }

  public void setMiInstanceVariable(String miInstanceVariable) {
    this.miInstanceVariable = miInstanceVariable;
  }

  public TaskAttributes miCompleteVariable(String miCompleteVariable) {
    this.miCompleteVariable = miCompleteVariable;
    return this;
  }

   /**
   * Get miCompleteVariable
   * @return miCompleteVariable
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMiCompleteVariable() {
    return miCompleteVariable;
  }

  public void setMiCompleteVariable(String miCompleteVariable) {
    this.miCompleteVariable = miCompleteVariable;
  }

  public TaskAttributes transferFly(Boolean transferFly) {
    this.transferFly = transferFly;
    return this;
  }

   /**
   * Get transferFly
   * @return transferFly
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getTransferFly() {
    return transferFly;
  }

  public void setTransferFly(Boolean transferFly) {
    this.transferFly = transferFly;
  }

  public TaskAttributes canUpload(Boolean canUpload) {
    this.canUpload = canUpload;
    return this;
  }

   /**
   * Get canUpload
   * @return canUpload
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getCanUpload() {
    return canUpload;
  }

  public void setCanUpload(Boolean canUpload) {
    this.canUpload = canUpload;
  }

  public TaskAttributes viewUpload(Boolean viewUpload) {
    this.viewUpload = viewUpload;
    return this;
  }

   /**
   * Get viewUpload
   * @return viewUpload
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getViewUpload() {
    return viewUpload;
  }

  public void setViewUpload(Boolean viewUpload) {
    this.viewUpload = viewUpload;
  }

  public TaskAttributes viewAdditionalDocumentation(Boolean viewAdditionalDocumentation) {
    this.viewAdditionalDocumentation = viewAdditionalDocumentation;
    return this;
  }

   /**
   * Get viewAdditionalDocumentation
   * @return viewAdditionalDocumentation
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getViewAdditionalDocumentation() {
    return viewAdditionalDocumentation;
  }

  public void setViewAdditionalDocumentation(Boolean viewAdditionalDocumentation) {
    this.viewAdditionalDocumentation = viewAdditionalDocumentation;
  }

  public TaskAttributes start(Boolean start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getStart() {
    return start;
  }

  public void setStart(Boolean start) {
    this.start = start;
  }

  public TaskAttributes sendLastEmail(Boolean sendLastEmail) {
    this.sendLastEmail = sendLastEmail;
    return this;
  }

   /**
   * Get sendLastEmail
   * @return sendLastEmail
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getSendLastEmail() {
    return sendLastEmail;
  }

  public void setSendLastEmail(Boolean sendLastEmail) {
    this.sendLastEmail = sendLastEmail;
  }

  public TaskAttributes derivationScreenTpl(String derivationScreenTpl) {
    this.derivationScreenTpl = derivationScreenTpl;
    return this;
  }

   /**
   * Get derivationScreenTpl
   * @return derivationScreenTpl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDerivationScreenTpl() {
    return derivationScreenTpl;
  }

  public void setDerivationScreenTpl(String derivationScreenTpl) {
    this.derivationScreenTpl = derivationScreenTpl;
  }

  public TaskAttributes selfserviceTimeout(Integer selfserviceTimeout) {
    this.selfserviceTimeout = selfserviceTimeout;
    return this;
  }

   /**
   * Get selfserviceTimeout
   * @return selfserviceTimeout
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getSelfserviceTimeout() {
    return selfserviceTimeout;
  }

  public void setSelfserviceTimeout(Integer selfserviceTimeout) {
    this.selfserviceTimeout = selfserviceTimeout;
  }

  public TaskAttributes selfserviceTime(String selfserviceTime) {
    this.selfserviceTime = selfserviceTime;
    return this;
  }

   /**
   * Get selfserviceTime
   * @return selfserviceTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSelfserviceTime() {
    return selfserviceTime;
  }

  public void setSelfserviceTime(String selfserviceTime) {
    this.selfserviceTime = selfserviceTime;
  }

  public TaskAttributes selfserviceTimeUnit(String selfserviceTimeUnit) {
    this.selfserviceTimeUnit = selfserviceTimeUnit;
    return this;
  }

   /**
   * Get selfserviceTimeUnit
   * @return selfserviceTimeUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSelfserviceTimeUnit() {
    return selfserviceTimeUnit;
  }

  public void setSelfserviceTimeUnit(String selfserviceTimeUnit) {
    this.selfserviceTimeUnit = selfserviceTimeUnit;
  }

  public TaskAttributes selfserviceExecution(String selfserviceExecution) {
    this.selfserviceExecution = selfserviceExecution;
    return this;
  }

   /**
   * Get selfserviceExecution
   * @return selfserviceExecution
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSelfserviceExecution() {
    return selfserviceExecution;
  }

  public void setSelfserviceExecution(String selfserviceExecution) {
    this.selfserviceExecution = selfserviceExecution;
  }

  public TaskAttributes lastAssignedUserId(String lastAssignedUserId) {
    this.lastAssignedUserId = lastAssignedUserId;
    return this;
  }

   /**
   * Get lastAssignedUserId
   * @return lastAssignedUserId
  **/
  @ApiModelProperty(example = "9d705617-cc29-482a-85ff-7f7292f72b11", value = "")
  public String getLastAssignedUserId() {
    return lastAssignedUserId;
  }

  public void setLastAssignedUserId(String lastAssignedUserId) {
    this.lastAssignedUserId = lastAssignedUserId;
  }

  public TaskAttributes script(String script) {
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }

  public TaskAttributes createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public TaskAttributes updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskAttributes taskAttributes = (TaskAttributes) o;
    return Objects.equals(this.name, taskAttributes.name) &&
        Objects.equals(this.description, taskAttributes.description) &&
        Objects.equals(this.processId, taskAttributes.processId) &&
        Objects.equals(this.type, taskAttributes.type) &&
        Objects.equals(this.assignType, taskAttributes.assignType) &&
        Objects.equals(this.priorityVariable, taskAttributes.priorityVariable) &&
        Objects.equals(this.assignVariable, taskAttributes.assignVariable) &&
        Objects.equals(this.groupVariable, taskAttributes.groupVariable) &&
        Objects.equals(this.miInstanceVariable, taskAttributes.miInstanceVariable) &&
        Objects.equals(this.miCompleteVariable, taskAttributes.miCompleteVariable) &&
        Objects.equals(this.transferFly, taskAttributes.transferFly) &&
        Objects.equals(this.canUpload, taskAttributes.canUpload) &&
        Objects.equals(this.viewUpload, taskAttributes.viewUpload) &&
        Objects.equals(this.viewAdditionalDocumentation, taskAttributes.viewAdditionalDocumentation) &&
        Objects.equals(this.start, taskAttributes.start) &&
        Objects.equals(this.sendLastEmail, taskAttributes.sendLastEmail) &&
        Objects.equals(this.derivationScreenTpl, taskAttributes.derivationScreenTpl) &&
        Objects.equals(this.selfserviceTimeout, taskAttributes.selfserviceTimeout) &&
        Objects.equals(this.selfserviceTime, taskAttributes.selfserviceTime) &&
        Objects.equals(this.selfserviceTimeUnit, taskAttributes.selfserviceTimeUnit) &&
        Objects.equals(this.selfserviceExecution, taskAttributes.selfserviceExecution) &&
        Objects.equals(this.lastAssignedUserId, taskAttributes.lastAssignedUserId) &&
        Objects.equals(this.script, taskAttributes.script) &&
        Objects.equals(this.createdAt, taskAttributes.createdAt) &&
        Objects.equals(this.updatedAt, taskAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, processId, type, assignType, priorityVariable, assignVariable, groupVariable, miInstanceVariable, miCompleteVariable, transferFly, canUpload, viewUpload, viewAdditionalDocumentation, start, sendLastEmail, derivationScreenTpl, selfserviceTimeout, selfserviceTime, selfserviceTimeUnit, selfserviceExecution, lastAssignedUserId, script, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assignType: ").append(toIndentedString(assignType)).append("\n");
    sb.append("    priorityVariable: ").append(toIndentedString(priorityVariable)).append("\n");
    sb.append("    assignVariable: ").append(toIndentedString(assignVariable)).append("\n");
    sb.append("    groupVariable: ").append(toIndentedString(groupVariable)).append("\n");
    sb.append("    miInstanceVariable: ").append(toIndentedString(miInstanceVariable)).append("\n");
    sb.append("    miCompleteVariable: ").append(toIndentedString(miCompleteVariable)).append("\n");
    sb.append("    transferFly: ").append(toIndentedString(transferFly)).append("\n");
    sb.append("    canUpload: ").append(toIndentedString(canUpload)).append("\n");
    sb.append("    viewUpload: ").append(toIndentedString(viewUpload)).append("\n");
    sb.append("    viewAdditionalDocumentation: ").append(toIndentedString(viewAdditionalDocumentation)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    sendLastEmail: ").append(toIndentedString(sendLastEmail)).append("\n");
    sb.append("    derivationScreenTpl: ").append(toIndentedString(derivationScreenTpl)).append("\n");
    sb.append("    selfserviceTimeout: ").append(toIndentedString(selfserviceTimeout)).append("\n");
    sb.append("    selfserviceTime: ").append(toIndentedString(selfserviceTime)).append("\n");
    sb.append("    selfserviceTimeUnit: ").append(toIndentedString(selfserviceTimeUnit)).append("\n");
    sb.append("    selfserviceExecution: ").append(toIndentedString(selfserviceExecution)).append("\n");
    sb.append("    lastAssignedUserId: ").append(toIndentedString(lastAssignedUserId)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

