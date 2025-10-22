package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String formatted= NameFormatter.format(null,"Mel",null,"Johnson",null);
        System.out.println(formatted);

        String firstAndLastName= NameFormatter.format("Nauman","Saqib");
        System.out.println(firstAndLastName);

        System.out.println(NameFormatter.format("Mel Johnson"));
        System.out.println(NameFormatter.format("Mel B Johnson, PHD"));
        System.out.println("Dr. Mel B Johnson , PHD");
    }
}
