
package com.javalabfinal.javalabfinal;
import java.util.List;
class GeneralDoctor extends Doctor {

    public GeneralDoctor(String name,String department, List<String> availability) {
        super(name,department,"General", availability);
    }

    @Override
    public void displaySchedule() {
        System.out.println("Dr. " + getName() + " Available Schedule: " + getSchedule());
    }
}