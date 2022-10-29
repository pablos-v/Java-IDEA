package Homework;

import Homework.Heroes.Archer;
import Homework.Heroes.Knight;

public class Program {
    public static void main(String[] args) {
        Archer shooterOne = new Archer(1);
        Knight warriorOne = new Knight(2);

        System.out.println(shooterOne.armour.getName() + ", " + shooterOne.weapon.getName());
        System.out.println(warriorOne.armour.getName() + ", " + warriorOne.weapon.getName());
    }
}
