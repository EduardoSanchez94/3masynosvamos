package com.example.prelab3.Entity;

import com.sun.istack.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "countries")
public class countries {
    @Id
    @Column(name = "country_id")
    private String country_id;
    @Column(name = "country_name", nullable = false)
    private String country_name;

    @ManyToOne
    @JoinColumn(name = "region_id" )
    private region region;

    public com.example.prelab3.Entity.region getRegion() {
        return region;
    }

    public void setRegion(com.example.prelab3.Entity.region region) {
        this.region = region;
    }

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


}
