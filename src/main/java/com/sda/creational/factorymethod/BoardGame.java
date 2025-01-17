package com.sda.creational.factorymethod;

public class BoardGame implements Game {
    private final String name;
    private final String type;

    public BoardGame(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getGameName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}
