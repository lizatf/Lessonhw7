package amimals;

import java.util.Random;
import java.util.Scanner;

/// Написать вроде написала, а вот как сделать
/// читаемым и уменьшить не уверена что знаю

public class QA_27_7_3_Tuflina {
    public static void main(String[] args) {
        Cats cats = new Cats(1, "Cat Boris", 9);
        Crows crows = new Crows(1, "Black Raven", "Black");
        Dogs dogs = new Dogs(1, "Dog Muhtar", 5);
        Fish fish = new Fish(1, "Fish Dora", "Salmon");
        Rabbits rabbits = new Rabbits(1, "Rabbit Snow", "white");
        Tigers tigers = new Tigers(1, "Tiger Rik", "caspian");

        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();
            if (size <= 0)
                System.out.println("Incorrect size of array! Try again!");
        } while (size < 0);
        String[] animalsArray = {"Cat ", "Raven ", "Dog ", "Fish ", "Rabbit ", "Tiger "};
        String[] animals = new String[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomAnimal = random.nextInt(animalsArray.length);
            animals[i] = animalsArray[randomAnimal];
        }
        for (int i = animals.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = animals[i];
            animals[i] = animals[index];
            animals[index] = temp;
        }
        System.out.print("Массив животных: ");
        for (String animal : animals) {
            System.out.print(animal + " ");
        }

        System.out.println("\n");

        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("Choose 1 to feed, 2 to say something, 3 to fly, 4 to walk, 5 to swim, 6 to play, 7 to hunt or another positive numver to exit: ");
            int enterNumber = scanner2.nextInt();
            if (enterNumber <= 0) {
                System.out.println("Your choise is incorrect! Try again!");
                continue;
            }
            switch (enterNumber) {
                case 1: {
                    cats.animalEat("meat");
                    crows.animalEat("meat");
                    dogs.animalEat("chicken");
                    fish.animalEat("fry");
                    rabbits.animalEat("straw");
                    tigers.animalEat("meat");
                    break;
                }
                case 2: {
                    cats.animalSay("Meow");
                    crows.animalSay("Carr");
                    dogs.animalSay("Bark");
                    tigers.animalSay("Rrrr");
                    break;
                }
                case 3:
                    crows.fly();
                    break;
                case 4:
                    dogs.walk();
                    break;
                case 5:
                    fish.swim();
                    break;
                case 6: {
                    cats.play();
                    dogs.play();
                    rabbits.play();
                    break;
                }
                case 7: {
                    cats.hunting();
                    tigers.hunting();
                    break;
                }
                default:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}
