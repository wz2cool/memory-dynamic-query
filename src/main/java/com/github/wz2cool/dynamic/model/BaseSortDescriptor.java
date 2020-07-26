package com.github.wz2cool.dynamic.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author Frank
 */
@SuppressWarnings("squid:S1610")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = SortDescriptor.class, name = "SortDescriptor"),
        @JsonSubTypes.Type(value = CustomSortDescriptor.class, name = "CustomSortDescriptor")
})
public abstract class BaseSortDescriptor {
}