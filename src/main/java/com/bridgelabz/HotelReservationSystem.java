package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    /*
    Hotel Reservation System
     */
    //Map for storing details
    private static Map<String, Hotel> hotelMap;
    public HotelReservationSystem() {
        hotelMap = new HashMap<>();
    }
    /*
    Adding hotel details
    */
    public boolean addHotel(String name, int HotelRateRegularWeekdays) {
        Hotel hotelObject = new Hotel(name, HotelRateRegularWeekdays);
        hotelMap.put(name, hotelObject);
        return true;
    }

    /*
    Printing hotel details
     */
    public void printHotels() {
        for (Map.Entry<String, Hotel> entry : hotelMap.entrySet()) {
            System.out.println("Hotel Name : " + entry.getKey());
            System.out.println("Rate on weekdays for regular customers : " + entry.getValue().getHotelRateRegularWeekDay());
        }
    }
    /*
    Main starts
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System...");
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.printHotels();
    }
}
