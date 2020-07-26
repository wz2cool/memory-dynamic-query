package com.github.wz2cool.dynamic.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author Frank
 **/
@SuppressWarnings("squid:S1172")
@JsonTypeName("filterGroupDescriptor")
public class FilterGroupDescriptor<T>
        extends BaseFilterGroup<T, FilterGroupDescriptor<T>>
        implements BaseFilterDescriptor {

    private FilterCondition condition = FilterCondition.AND;

    @Override
    public FilterCondition getCondition() {
        return condition;
    }

    @Override
    public void setCondition(FilterCondition condition) {
        this.condition = condition;
    }
}
