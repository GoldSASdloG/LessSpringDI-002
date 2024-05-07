package org.example;

public class CardVneshnya implements VideoCard{

    public CardVneshnya() {
        System.out.println("видяха создана");
    }

    @Override
    public void check() {
        System.out.println("Raysen Card Super 9080");
    }
}
