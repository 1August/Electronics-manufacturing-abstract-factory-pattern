package com.company;

public class ExpensiveElectronicsFactory implements ElectronicsFactory{
    @Override
    public PhoneUnit createPhoneUnit() {
        return new Smartphone();
    }

    @Override
    public LaptopUnit createLaptopUnit() {
        return new GamingLaptop();
    }
}
