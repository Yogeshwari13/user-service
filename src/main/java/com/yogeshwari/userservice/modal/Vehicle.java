package com.yogeshwari.userservice.modal;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@Data
@Component
public class Vehicle {
    private enum vehicleType {
        Car,
        Bike
    };
    private String vehicleNum;
    private int manufacturedYear;

    public Vehicle(String vehicleNum, int manufacturedYear) {
        this.vehicleNum = vehicleNum;
        this.manufacturedYear = manufacturedYear;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }
}
