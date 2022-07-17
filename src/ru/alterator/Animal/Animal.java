package ru.alterator.Animal;


public class Animal {
    private String name;
    private int countOfPow;
    //enum animalType {CAT, DOG}
    public Animal(String name, int countOfPow){
        this.name = name;
        this.countOfPow = countOfPow;
        //this.animalType() = animalType;
    }
    public Animal(){
        this.name = "Incognito";
        this.countOfPow = 4;
    }

    public void rename (String newName){
        this.name = newName;
    }

    public void recountPaws(int countOfPow){
        this.countOfPow = countOfPow;
    }

    public void animalInfo(){
        System.out.println("My name is: "+this.name);
        System.out.println("I have only "+this.countOfPow+" paws");
        System.out.println("Can we be friends?");
        System.out.println();
    }
}
