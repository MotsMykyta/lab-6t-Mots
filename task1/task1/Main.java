package task1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Marta");
        Cat cat1 = new Cat("Elf");
        System.out.println(dog1.makeSound());
        System.out.println(cat1.makeSound());
    }
}


abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound(){
        return "Гав гав гав";
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return "Мяу мяу";
    }
}