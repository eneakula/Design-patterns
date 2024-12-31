package com.sda.creational.factorymethod;

public class MonopoyGameFactory implements GameFactory {
    @Override
    public Game create() {
        return new BoardGame("Monopoly", "Family Game");
    }
}
