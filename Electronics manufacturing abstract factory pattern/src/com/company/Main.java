package com.company;

public class Main {

    public static void main(String[] args) {
	    ElectronicsFactory electronicsFactory = new NormalElectronicsFactory();
        LaptopUnit laptopUnit = electronicsFactory.createLaptopUnit();
        PhoneUnit phoneUnit = electronicsFactory.createPhoneUnit();
        laptopUnit.useLaptop();
        phoneUnit.usePhone();

        electronicsFactory = new ExpensiveElectronicsFactory();
        laptopUnit = electronicsFactory.createLaptopUnit();
        phoneUnit = electronicsFactory.createPhoneUnit();
        laptopUnit.useLaptop();
        phoneUnit.usePhone();
    }
}
