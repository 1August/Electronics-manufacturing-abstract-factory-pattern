package com.company;

public class NormalElectronicsFactory implements ElectronicsFactory{
    @Override
    public PhoneUnit createPhoneUnit() {
        return new NormalPhone();
    }

    @Override
    public LaptopUnit createLaptopUnit() {
        return new NormalLaptop();
    }
}
