package com.baidu;

public class Main {

    public static void main(String[] args) {



    }


}

interface Animal{
    public void show();
}

class Horse implements Animal{
    public Horse() { }

    @Override
    public void show() {

    }
}
class Cat implements Animal{
    public Cat() { }

    @Override
    public void show() {

    }
}

interface Plant{
    public void show();
}

class Furit implements Plant {

    @Override
    public void show() {

    }
}

class Vegetable implements Plant{

    @Override
    public void show() {

    }
}

interface Farm{
    public Animal newAnimal();

    public Plant newPlant();
}

class Guangzhou implements Farm{
    public Animal newAnimal() {
        System.out.println("牛出生");
        return new Cat();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜");
        return new Vegetable();
    }

}

class Beijing implements Farm{
    public Animal newAnimal() {
        System.out.println("马出生");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果");
        return new Furit();
    }
}