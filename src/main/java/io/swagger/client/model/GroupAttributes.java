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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * GroupAttributes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-14T14:31:37.499+02:00")
public class GroupAttributes   {
  @SerializedName("code")
  private String code = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),
    
    @SerializedName("INACTIVE")
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = StatusEnum.ACTIVE;

  @SerializedName("users")
  private List<String> users = new ArrayList<String>();

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public GroupAttributes code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "GROUP_ADMIN", required = true, value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GroupAttributes title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Group_Title", required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GroupAttributes description(String description) {
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

  public GroupAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "ACTIVE", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GroupAttributes users(List<String> users) {
    this.users = users;
    return this;
  }

  public GroupAttributes addUsersItem(String usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * User Ids array
   * @return users
  **/
  @ApiModelProperty(example = "null", value = "User Ids array")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public GroupAttributes createdAt(DateTime createdAt) {
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

  public GroupAttributes updatedAt(DateTime updatedAt) {
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
    GroupAttributes groupAttributes = (GroupAttributes) o;
    return Objects.equals(this.code, groupAttributes.code) &&
        Objects.equals(this.title, groupAttributes.title) &&
        Objects.equals(this.description, groupAttributes.description) &&
        Objects.equals(this.status, groupAttributes.status) &&
        Objects.equals(this.users, groupAttributes.users) &&
        Objects.equals(this.createdAt, groupAttributes.createdAt) &&
        Objects.equals(this.updatedAt, groupAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, description, status, users, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAttributes {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

