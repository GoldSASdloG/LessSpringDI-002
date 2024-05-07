package org.example;

public class Main {
    public static void main( String[] args ){
        VideoCard card = new CardVneshnya(6789, "electronika");
        Computer computer = new Computer(card);

        computer.getVideoCard().check();
    }


}
