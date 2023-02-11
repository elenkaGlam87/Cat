package com.company.professions;

public class Driver {
    private String fullName;
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public void setFullName (String fullName) {
        this.fullName=fullName;
    }

    public void setDrivingExperience (int drivingExperience) {
        this.drivingExperience=drivingExperience;
    }
    public String getFullName () {
        return fullName;
    }
    public int getDrivingExperience () {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return "ФИО водителя: " + fullName + "\n стаж вождения: " + drivingExperience;
    }
}
