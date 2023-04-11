package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.dto.HotelDTO;
import com.bezkoder.springjwt.dto.PageDTO;

public interface IHotelService {
    HotelDTO save(HotelDTO dto);
    PageDTO<HotelDTO> findAllWithPageable(int page, int size);


}
