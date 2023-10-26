package com.user.service.HotelService.services;

import com.user.service.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {
    //create
    Hotel create(Hotel hotel);

    //getAll
    List<Hotel> getAll();

    //getById
    Hotel getById(String hotelId);
}
