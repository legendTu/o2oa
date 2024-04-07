package com.x.message.core.entity;

import com.google.gson.JsonElement;
import com.x.base.core.entity.JsonProperties;
import com.x.base.core.project.annotation.FieldDescribe;

public class MessageProperties extends JsonProperties {
    private static final long serialVersionUID = -4943657103264120657L;
    @FieldDescribe("失败次数")
    private Integer failure;
    @FieldDescribe("错误信息")
    private String error;
    @FieldDescribe("consumer配置项")
    private JsonElement consumerJsonElement;

    public MessageProperties() {
    }

    public Integer getFailure() {
        return this.failure;
    }

    public void setFailure(Integer failure) {
        this.failure = failure;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public JsonElement getConsumerJsonElement() {
        return this.consumerJsonElement;
    }

    public void setConsumerJsonElement(JsonElement consumerJsonElement) {
        this.consumerJsonElement = consumerJsonElement;
    }
}
