package org.example;

public class CardVneshnya implements VideoCard{

    private int series;
    private String name;


    public CardVneshnya() {
        System.out.println("видяха создана");
    }

    public CardVneshnya(int series, String name) {
        System.out.println("видяха создана");
        this.series = series;
        this.name = name;
    }

    @Override
    public void check() {
        System.out.println("Raysen Card Super 9080");
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
