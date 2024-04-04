package com.learningcore.day1session1;

interface MedicineInfo {
    void displayLabel();
}

// Class representing tablets
class Tablet implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Store Tablets in a cool dry place.");
    }
}

// Class representing syrup
class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on prescription.");
    }
}
class Ointment implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment is for external use only");
    }
}