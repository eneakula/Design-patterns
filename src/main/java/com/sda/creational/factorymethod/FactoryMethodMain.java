package com.sda.creational.factorymethod;

import java.util.Scanner;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        GameFactory gameFactory = null;
        switch (type) {
            case "monopoly":
                gameFactory = new MonopoyGameFactory();
                break;
            default:
                System.out.println("No game found this type");
                break;
        }
       Game createdGame = gameFactory.create();
        System.out.println("createdGame" + createdGame);
}
}
