package com.bezkoder.springjwt.dto;

import com.bezkoder.springjwt.models.BaseEntities;
import com.bezkoder.springjwt.models.File;
import com.bezkoder.springjwt.models.Images;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelDTO extends BaseEntities {
    private Long hotelId;
    private String hotelName;
    private String phone;
    private String address;
    private float rated;
    private int viewers;
    private String fromPrice;
    private String description;
    private String hotelType;
    private File image;
    private List<Images> images;


}
