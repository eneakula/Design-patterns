package com.sda.structural.decorator;

public class FirstPersonShooter implements FragStatistic{

    private int deathCount = 0;

    @Override
    public int incrementDeathCount() {
        deathCount++;
        return deathCount;
    }

    @Override
    public void reset() {

    }
}
