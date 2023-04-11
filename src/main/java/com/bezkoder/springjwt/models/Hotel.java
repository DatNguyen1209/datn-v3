package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "hotel")
@Getter
@Setter
public class Hotel extends BaseEntities{

    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "rated")
    private float rated;
    @Column(name = "viewers")
    private int viewers;
    @Column(name = "from_price")
    private String fromPrice;
    @Column(name = "description")
    private String description;
    @Column(name = "hotel_type")
    private String hotelType;
    @Column(name = "status")
    private boolean status = true;
    @Column(name = "image")
    private String image;

    @JsonManagedReference
    @OneToMany(mappedBy = "hotel")
    private List<Images> images;
    @JsonManagedReference
    @OneToMany(mappedBy = "hotelId")
    private List<Room> rooms;
    @JsonManagedReference
    @OneToMany(mappedBy = "hotel")
    private List<Service> services;


}
