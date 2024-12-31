package com.sda.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        FragStatistic statistic = new FirstPersonShooter();
        statistic.incrementDeathCount();

        FragStatistic decoratedStatistic = new DisplayCountInfoDecorator(new DeathCountInfoDecorator(statistic));
        decoratedStatistic.incrementDeathCount();

    }
}
