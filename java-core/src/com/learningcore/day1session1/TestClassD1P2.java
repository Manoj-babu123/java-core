package com.learningcore.day1session1;

public class TestClassD1P2 {
    public static void main(String[] args) {
        // Declare Medicine instances
        MedicineInfo tablet = new Tablet();
        MedicineInfo syrup = new Syrup();
        MedicineInfo ointment = new Ointment();

        // Check the polymorphic behavior of the displayLabel() method
        tablet.displayLabel();
        syrup.displayLabel();
        ointment.displayLabel();
    }
}