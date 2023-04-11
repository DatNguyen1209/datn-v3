package com.bezkoder.springjwt.converter;

import com.bezkoder.springjwt.dto.HotelDTO;
import com.bezkoder.springjwt.models.Hotel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HotelConverter {
    public Hotel toEntities(HotelDTO dto){
        Hotel entity = new Hotel();
        if(dto.getImage() != null){
            if(dto.getImage().getId() != null){
                entity.setImage(dto.getImage().getId());
            }
        }
        entity.setHotelName(dto.getHotelName());
        entity.setPhone(dto.getPhone());
        entity.setAddress(dto.getAddress());
        entity.setRated(dto.getRated());
        entity.setCreatedDate(new Date());
        entity.setFromPrice(dto.getFromPrice());
        entity.setDescription(dto.getDescription());
        entity.setHotelType(dto.getHotelType());
        entity.setViewers(dto.getViewers());
//        entity.setImages(dto.getImages());
        return entity;
    }
    public HotelDTO toDTO(Hotel hotel){
        HotelDTO dto = new HotelDTO();
        if(hotel.getId() != null){
            dto.setId(hotel.getId());
        }
        dto.setHotelId(hotel.getId());
        dto.setHotelName( hotel.getHotelName());
        dto.setHotelType(hotel.getHotelType());
        dto.setPhone(hotel.getPhone());
        dto.setAddress(hotel.getAddress());
        dto.setRated(hotel.getRated());
        dto.setDescription(hotel.getDescription());
        dto.setFromPrice(hotel.getFromPrice());
        dto.setViewers(hotel.getViewers());
        return dto;
    }
    public Hotel toEntities(HotelDTO dto, Hotel hotel){
        hotel.setHotelName(dto.getHotelName());
        hotel.setPhone(dto.getPhone());
        hotel.setModifiedDate(new Date());
        hotel.setAddress(dto.getAddress());
        hotel.setFromPrice(dto.getFromPrice());
        hotel.setRated(dto.getRated());
        hotel.setDescription(dto.getDescription());
        hotel.setHotelType(dto.getHotelType());
        hotel.setViewers(dto.getViewers());
        return hotel;
    }
}
