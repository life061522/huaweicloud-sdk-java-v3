package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.BatchCreateInstanceTagsOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * BatchCreateInstanceTagsRequestBody
 */
public class BatchCreateInstanceTagsRequestBody  {

    /**
     * 操作标识。取值： - create，表示添加标签。
     */
    public static class ActionEnum {

        
        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");

        
        /**
         * Enum DELETE for value: "delete"
         */
        public static final ActionEnum DELETE = new ActionEnum("delete");

        

        public static Map<String, ActionEnum> staticFields =
                new HashMap<String, ActionEnum>() {
                    { 
                        put("create", CREATE);
                        put("delete", DELETE);
                    }
                };

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ActionEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private ActionEnum action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<BatchCreateInstanceTagsOption> tags = new ArrayList<>();
    
    public BatchCreateInstanceTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识。取值： - create，表示添加标签。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public BatchCreateInstanceTagsRequestBody withTags(List<BatchCreateInstanceTagsOption> tags) {
        this.tags = tags;
        return this;
    }

    
    public BatchCreateInstanceTagsRequestBody addTagsItem(BatchCreateInstanceTagsOption tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateInstanceTagsRequestBody withTags(Consumer<List<BatchCreateInstanceTagsOption>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<BatchCreateInstanceTagsOption> getTags() {
        return tags;
    }

    public void setTags(List<BatchCreateInstanceTagsOption> tags) {
        this.tags = tags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateInstanceTagsRequestBody batchCreateInstanceTagsRequestBody = (BatchCreateInstanceTagsRequestBody) o;
        return Objects.equals(this.action, batchCreateInstanceTagsRequestBody.action) &&
            Objects.equals(this.tags, batchCreateInstanceTagsRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateInstanceTagsRequestBody {\n");
            sb.append("    action: ").append(toIndentedString(action)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

