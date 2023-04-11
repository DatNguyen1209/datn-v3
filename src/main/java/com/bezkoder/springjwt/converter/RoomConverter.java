package com.bezkoder.springjwt.converter;

import com.bezkoder.springjwt.dto.RoomDTO;
import com.bezkoder.springjwt.models.Room;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RoomConverter {
    public Room toEntity(RoomDTO dto){
        Room room = new Room();
        room.setId(dto.getHotelId());
        room.setRoomName(dto.getRoomName());
        room.setCapacity(dto.getCapacity());
        room.setStatus(dto.isStatus());
        room.setPrice(dto.getPrice());
        room.setCreatedDate(new Date());
        room.setBedType(dto.getBedType());
//        room.setImages(dto.getImages());
        return room;
    }
    public RoomDTO toDTO(Room room){
        RoomDTO dto = new RoomDTO();
        if(room.getId() != null){
            dto.setId(room.getId());
        }
        dto.setRoomId(room.getId());
        dto.setRoomName(room.getRoomName());
        dto.setPrice(room.getPrice());
        dto.setCapacity(room.getCapacity());
        dto.setBedType(room.getBedType());
        return  dto;
    }
    public Room toEntities(RoomDTO dto, Room room){
        room.setRoomName(dto.getRoomName());
        room.setPrice(dto.getPrice());
        room.setBedType(dto.getBedType());
        room.setModifiedDate(new Date());
        room.setCapacity(dto.getCapacity());
        return room;
//        return new Room()
//                .setRoomName(dto.getRoomName())
//                .setPrice(dto.getPrice())
//                .setCapacity(dto.getCapacity())
//                .setBedType(dto.getBedType());
    }
}
