package com.sda.creational.bilder;

public class BuilderMain {
    public static void main(String[] args) {
        Weapon weaponExample = new Weapon.Builder()
                .withName("Weapon")
                .withType("ak47")
                .withDamage(50)
                .withDurability(10L)
                .build();
                System.out.println(weaponExample);
    }
}
