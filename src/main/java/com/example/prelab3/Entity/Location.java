package com.example.prelab3.Entity;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private int locationid;

    @Column(name = "street_address")
    private String streetaddress;

    
    private String postalcode;
    private String city;
    private String stateprovince;
}
