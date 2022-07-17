package ru.alterator.javaFirst;

import ru.alterator.Animal.Animal;

public class main {
    public static void main(String[] args){
        System.out.println("Hello World with Java!!!");
        int[] myArray; // объявление массива
        myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int
        for (var i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
            System.out.print(myArray[i] + " ");
            if (i == myArray.length - 1)
                System.out.println();
        }
        System.out.println("А теперь в обратном порядке:");
        for (var i = myArray.length - 1; i >= 0 ; i--){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        Animal an1, an2;
        an1 = new Animal("Bred", 4);
        an2 = new Animal();
        an1.animalInfo();
        an2.animalInfo();
    }
}
