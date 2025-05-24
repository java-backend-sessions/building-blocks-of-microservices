package com.example.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
public class EmployeeController {
    @GetMapping("/employee")
    public Employee getEmployee() {
        Location loc1 = new Location("New York", "NY", true);
        Location loc2 = new Location("San Francisco", "CA", false);
        Location loc3 = new Location("Austin", "TX", false);
        return new Employee(
            1L,
            "John Doe",
            List.of(loc1, loc2, loc3),
            loc1 // primary location
        );
    }

    @Data
    @AllArgsConstructor
    static class Employee {
        private Long id;
        private String name;
        private List<Location> locations;
        private Location primaryLocation;
    }

    @Data
    @AllArgsConstructor
    static class Location {
        private String city;
        private String state;
        private boolean isPrimary;
    }
} 