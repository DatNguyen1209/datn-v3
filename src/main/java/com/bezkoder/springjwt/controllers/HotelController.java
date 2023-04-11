package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.dto.HotelDTO;
import com.bezkoder.springjwt.dto.PageDTO;
import com.bezkoder.springjwt.dto.UserDTO;
import com.bezkoder.springjwt.repository.HotelRepository;
import com.bezkoder.springjwt.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hotel")
public class HotelController {
    @Autowired
    IHotelService iHotelService;
    @Autowired
    HotelRepository hotelRepository;
    @PostMapping("/createhotel")
    public HotelDTO createHotel(@RequestBody HotelDTO dto){
        return iHotelService.save(dto);
    }
    @CrossOrigin
    @GetMapping("/getAllUser")
    public PageDTO<HotelDTO> getAllUser(
            @RequestParam("page") int page,
            @RequestParam("size") int size
    ){
        return iHotelService.findAllWithPageable(page,size);
    }
}
