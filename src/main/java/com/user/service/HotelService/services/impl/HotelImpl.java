package com.user.service.HotelService.services.impl;

import com.user.service.HotelService.entities.Hotel;
import com.user.service.HotelService.exceptions.ResourceNotfoundException;
import com.user.service.HotelService.repositories.HotelRepo;
import com.user.service.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId= UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getById(String hotelId) {
        return hotelRepo.findById(hotelId).orElseThrow(()-> new ResourceNotfoundException("Hotel with given id not found !!"));
    }
}
