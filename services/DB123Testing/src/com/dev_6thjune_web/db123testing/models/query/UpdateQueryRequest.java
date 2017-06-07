/*Copyright (c) 2017-2018 offline.com All Rights Reserved.
 This software is the confidential and proprietary information of offline.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with offline.com*/
package com.dev_6thjune_web.db123testing.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateQueryRequest implements Serializable {

    @NotNull
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Icon")
    private byte[] icon;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getIcon() {
        return this.icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UpdateQueryRequest)) return false;
        final UpdateQueryRequest updateQueryRequest = (UpdateQueryRequest) o;
        return Objects.equals(getName(), updateQueryRequest.getName()) &&
                Objects.equals(getIcon(), updateQueryRequest.getIcon());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                getIcon());
    }
}
