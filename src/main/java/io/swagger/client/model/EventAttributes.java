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
 * EventAttributes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-14T14:31:37.499+02:00")
public class EventAttributes   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("process_id")
  private String processId = null;

  @SerializedName("message_id")
  private Integer messageId = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    @SerializedName("START")
    START("START"),
    
    @SerializedName("END")
    END("END"),
    
    @SerializedName("INTERMEDIATE_CATCH")
    INTERMEDIATE_CATCH("INTERMEDIATE_CATCH"),
    
    @SerializedName("INTERMEDIATE_THROW")
    INTERMEDIATE_THROW("INTERMEDIATE_THROW"),
    
    @SerializedName("BOUNDARY")
    BOUNDARY("BOUNDARY"),
    
    @SerializedName("IMPLICIT_THROW")
    IMPLICIT_THROW("IMPLICIT_THROW");

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
  private TypeEnum type = null;

  /**
   * Gets or Sets definition
   */
  public enum DefinitionEnum {
    @SerializedName("NONE")
    NONE("NONE"),
    
    @SerializedName("CANCEL")
    CANCEL("CANCEL"),
    
    @SerializedName("COMPENSATION")
    COMPENSATION("COMPENSATION"),
    
    @SerializedName("ERROR")
    ERROR("ERROR"),
    
    @SerializedName("ESCALATION")
    ESCALATION("ESCALATION"),
    
    @SerializedName("MESSAGE")
    MESSAGE("MESSAGE"),
    
    @SerializedName("LINK")
    LINK("LINK"),
    
    @SerializedName("SIGNAL")
    SIGNAL("SIGNAL"),
    
    @SerializedName("TERMINATE")
    TERMINATE("TERMINATE"),
    
    @SerializedName("TIMER")
    TIMER("TIMER");

    private String value;

    DefinitionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("definition")
  private DefinitionEnum definition = null;

  @SerializedName("interrupting")
  private Boolean interrupting = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("cycle")
  private String cycle = null;

  @SerializedName("attached_to_task_id")
  private Integer attachedToTaskId = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public EventAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Event_Title", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventAttributes description(String description) {
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

  public EventAttributes processId(String processId) {
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

  public EventAttributes messageId(Integer messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMessageId() {
    return messageId;
  }

  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }

  public EventAttributes type(TypeEnum type) {
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

  public EventAttributes definition(DefinitionEnum definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DefinitionEnum getDefinition() {
    return definition;
  }

  public void setDefinition(DefinitionEnum definition) {
    this.definition = definition;
  }

  public EventAttributes interrupting(Boolean interrupting) {
    this.interrupting = interrupting;
    return this;
  }

   /**
   * Get interrupting
   * @return interrupting
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInterrupting() {
    return interrupting;
  }

  public void setInterrupting(Boolean interrupting) {
    this.interrupting = interrupting;
  }

  public EventAttributes condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public EventAttributes time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public EventAttributes duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public EventAttributes cycle(String cycle) {
    this.cycle = cycle;
    return this;
  }

   /**
   * Get cycle
   * @return cycle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCycle() {
    return cycle;
  }

  public void setCycle(String cycle) {
    this.cycle = cycle;
  }

  public EventAttributes attachedToTaskId(Integer attachedToTaskId) {
    this.attachedToTaskId = attachedToTaskId;
    return this;
  }

   /**
   * Get attachedToTaskId
   * @return attachedToTaskId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAttachedToTaskId() {
    return attachedToTaskId;
  }

  public void setAttachedToTaskId(Integer attachedToTaskId) {
    this.attachedToTaskId = attachedToTaskId;
  }

  public EventAttributes createdAt(DateTime createdAt) {
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

  public EventAttributes updatedAt(DateTime updatedAt) {
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
    EventAttributes eventAttributes = (EventAttributes) o;
    return Objects.equals(this.name, eventAttributes.name) &&
        Objects.equals(this.description, eventAttributes.description) &&
        Objects.equals(this.processId, eventAttributes.processId) &&
        Objects.equals(this.messageId, eventAttributes.messageId) &&
        Objects.equals(this.type, eventAttributes.type) &&
        Objects.equals(this.definition, eventAttributes.definition) &&
        Objects.equals(this.interrupting, eventAttributes.interrupting) &&
        Objects.equals(this.condition, eventAttributes.condition) &&
        Objects.equals(this.time, eventAttributes.time) &&
        Objects.equals(this.duration, eventAttributes.duration) &&
        Objects.equals(this.cycle, eventAttributes.cycle) &&
        Objects.equals(this.attachedToTaskId, eventAttributes.attachedToTaskId) &&
        Objects.equals(this.createdAt, eventAttributes.createdAt) &&
        Objects.equals(this.updatedAt, eventAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, processId, messageId, type, definition, interrupting, condition, time, duration, cycle, attachedToTaskId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    interrupting: ").append(toIndentedString(interrupting)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
    sb.append("    attachedToTaskId: ").append(toIndentedString(attachedToTaskId)).append("\n");
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

