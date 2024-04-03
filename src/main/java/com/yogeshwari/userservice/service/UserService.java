package com.yogeshwari.userservice.service;

import com.yogeshwari.userservice.modal.User;
import com.yogeshwari.userservice.modal.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class UserService {
    @Autowired
    private Vehicle vehicle;
    private static Map<Long, User> userMap = new HashMap<>();
   // private static Map<Long, Appointment> appointmentMap = new HashMap<>();
    private static long userIdCounter = 1;
    private static long appointmentIdCounter = 1;

    public User createUser(String username, String password, String email, String name, String phoneNumber, String role) {
        User user = new User(userIdCounter++, username, password, email, name, phoneNumber, role, vehicle);
        userMap.put(user.getId(), user);
        return user;
    }

//    public Appointment createAppointment(User user, String serviceType, LocalDateTime scheduledDate, String status) {
//        Appointment appointment = new Appointment(appointmentIdCounter++, user, serviceType, scheduledDate, status, LocalDateTime.now(), LocalDateTime.now());
//        appointmentMap.put(appointment.getId(), appointment);
//        return appointment;
//    }
//
//    public List<Appointment> getAppointmentsForUser(User user) {
//        List<Appointment> appointments = new ArrayList<>();
//        for (Appointment appointment : appointmentMap.values()) {
//            if (appointment.getUser().equals(user)) {
//                appointments.add(appointment);
//            }
//        }
//        return appointments;
//    }
}
