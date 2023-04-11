package com.bezkoder.springjwt.serviceimpl;

import com.bezkoder.springjwt.converter.HotelConverter;
import com.bezkoder.springjwt.dto.HotelDTO;
import com.bezkoder.springjwt.dto.PageDTO;
import com.bezkoder.springjwt.models.Hotel;
import com.bezkoder.springjwt.repository.HotelRepository;
import com.bezkoder.springjwt.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HotelService implements IHotelService {

    @Autowired
    HotelConverter converter;
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public HotelDTO save(HotelDTO dto) {
        Hotel result = converter.toEntities(dto);
        if(dto.getId() != null){
            Optional<Hotel> optional = hotelRepository.findById(dto.getId());
            if(optional.isPresent()){
                throw new RuntimeException("Already exists");
            }
            result  = optional.get();
        }

        return converter.toDTO(hotelRepository.save(result));
    }

    @Override
    public PageDTO<HotelDTO> findAllWithPageable(int page, int size) {
        Pageable pageable = PageRequest.of(page - 1, size, Sort.by("id").descending());
        Page<Hotel> userList = hotelRepository.findAll(pageable);

        return PageDTO.of(userList, userList.stream().map(user -> converter.toDTO(user)).collect(Collectors.toList()));
    }

}
