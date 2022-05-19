package ru.belova.java;

public class Main {
    public static void main(String[] args) {
        Country[] countries = new Country[]{
                new Country("Russia", 17100000, 146700000, "Moscow", 12600000),
                new Country("Finland", 338000, 5500000, "Helsinki", 655000),
                new Country("France", 643800, 67800000, "Paris", 2100000),
                new Country("Andorra", 467, 85400, "Andorra la Vella", 22600),
                new Country("Singapore", 725, 5700000)};

        Country.printAll(countries);
    }

}


