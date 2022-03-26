package test_package;

import java.util.Locale;

public class Car extends Vehicle {
    //get method from vehicle and override it.
    @Override
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate.toLowerCase();
    }

    //call the Superclass method
//    public void setLicensePlate(String license) {
//        super.setLicensePlate(license);
//    }
}

