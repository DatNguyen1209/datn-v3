package com.bezkoder.springjwt.dto;

import com.bezkoder.springjwt.models.BaseEntities;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO extends BaseEntities {
    private Long roomId;
    private String roomName;
    private String price;
    private int capacity;
    private String bedType;
    private String images;
    private boolean isStatus = true;
    private Long hotelId;

}
