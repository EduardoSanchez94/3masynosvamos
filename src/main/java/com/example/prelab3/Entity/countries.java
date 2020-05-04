package com.example.prelab3.Entity;

import com.sun.istack.Nullable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class countries {
    @Id
    private String country_id;
    @Column(name = "country_name", nullable = false)
    private String country_name;
    @Column(name = "region_id", nullable = false)
    private float region_id;

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public float getRegion_id() {
        return region_id;
    }

    public void setRegion_id(float region_id) {
        this.region_id = region_id;
    }
}
