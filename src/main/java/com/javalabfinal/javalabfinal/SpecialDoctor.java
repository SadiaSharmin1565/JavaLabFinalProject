package com.javalabfinal.javalabfinal;

import java.util.List;


class SpecialDoctor extends Doctor {

    public SpecialDoctor(String name,String department, List<String> schedule) {
        super(name,department,"Special", schedule);
    }

    @Override
    public void displaySchedule() {
        System.out.println("Dr. " + getName() + "Avaiable Schedule: " + getSchedule());
    }
}