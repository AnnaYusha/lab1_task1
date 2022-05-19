package ru.belova.java;

public class Country {
    // переменные для Стран
    private String name;
    private int area;
    private String capitalName;
    private int capitalPopulation;
    private int population;

    public Country(String name, int area, int population, String capitalName, int capitalPopulation) {
        //конструктор принимающий значения всех атрибутов
        this.name = name;
        this.area = area;
        this.population = population;
        this.capitalName = capitalName;
        this.capitalPopulation = capitalPopulation;
    }

    public Country(String name, int area, int population) {
        // конструктор для городов-государств
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException(" не заполнено name");
        }
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0) {
            throw new IllegalArgumentException("population дожно быть больше 0");
        }
        this.population = population;
    }

    public String getCapital() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {

        if (capitalName == null || capitalName.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.capitalName = capitalName;
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapitalPopulation(int capitalPopulation) {
        if (capitalPopulation <= 0) {
            throw new IllegalArgumentException("Значение должно быть больше 0");
        }
        this.capitalPopulation = capitalPopulation;
    }

    public double getCountryPopulationDensity()
    //get-метод, возвращающий значение плотности населения страны
    {
        return population / area;
    }

    @Override
    public String toString() {
        return
                "название = " + name +
                        ", площадь  = " + area + " кв. км " +
                        ", население = " + population +
                        (capitalName != null ? (", столица = " + capitalName) : " ") +
                        (capitalPopulation != 0 ? (", население столицы = " + capitalPopulation) : " ");
    }

    public void print()
    //печать данные о стране (название, площадь, население) и о столице,если она есть;
    {
        System.out.println(this);
    }

    public static void printAll(Country[] countries)
    //статический метод printAll, печатающий данные о странах в заданном массиве
    {
        for (Country country : countries) {
            country.print();
        }
    }

}




