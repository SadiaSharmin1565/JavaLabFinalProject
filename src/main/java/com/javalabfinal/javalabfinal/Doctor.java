package com.javalabfinal.javalabfinal;

import java.util.List;
import java.util.*;

class Doctor {
    private String name;
    private String department;
    private String type;
    private List<String> schedule;

    public Doctor(String name,String department, String type, List<String> schedule) {
        this.name = name;
        this.department = department;
        this.type = type;
        this.schedule = new ArrayList<>(schedule);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department=department;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }
    public List<String> getSchedule() {
        return schedule;
    }
    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }
    public void displaySchedule() {
        System.out.println("Schedule: " + schedule);
    }
}