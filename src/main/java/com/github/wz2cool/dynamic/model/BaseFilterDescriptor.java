package com.github.wz2cool.dynamic.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author Frank
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = FilterDescriptor.class, name = "filterDescriptor"),
        @JsonSubTypes.Type(value = FilterGroupDescriptor.class, name = "filterGroupDescriptor"),
        @JsonSubTypes.Type(value = CustomFilterDescriptor.class, name = "customFilterDescriptor")
})
public interface BaseFilterDescriptor {
    /**
     * get condition of and
     *
     * @return condition of and
     */
    FilterCondition getCondition();

    /**
     * set condition
     *
     * @param condition condition of and
     */
    void setCondition(FilterCondition condition);
}
