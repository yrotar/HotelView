package com.evgen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.evgen.Guest;
import com.evgen.dao.HotelDaoImpl;

@Controller
public class HotelController {

  private final HotelDaoImpl hotelDao;

  @Autowired
  public HotelController(HotelDaoImpl hotelDao) {
    this.hotelDao = hotelDao;
  }

  @GetMapping("/")
  public String index(Model model) {

    Guest hotels = hotelDao.getGuestByName("sergei");
    System.out.println(hotels);

    model.addAttribute("message", "Hello World!");

    return "index";
  }

}