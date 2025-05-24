package com.example.demo_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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

    static class Employee {
        private Long id;
        private String name;
        private List<Location> locations;
        private Location primaryLocation;

        public Employee(Long id, String name, List<Location> locations, Location primaryLocation) {
            this.id = id;
            this.name = name;
            this.locations = locations;
            this.primaryLocation = primaryLocation;
        }

        public Long getId() { return id; }
        public String getName() { return name; }
        public List<Location> getLocations() { return locations; }
        public Location getPrimaryLocation() { return primaryLocation; }
    }

    static class Location {
        private String city;
        private String state;
        private boolean isPrimary;

        public Location(String city, String state, boolean isPrimary) {
            this.city = city;
            this.state = state;
            this.isPrimary = isPrimary;
        }

        public String getCity() { return city; }
        public String getState() { return state; }
        public boolean isPrimary() { return isPrimary; }
    }
} 