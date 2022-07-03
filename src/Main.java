import animal.Animal;
import animal.birds.Duck;
import animal.pets.Cat;
import animal.pets.Dog;
import data.Command;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду (add/list/exit): ");
            Command command;
            try {
                command = Command.valueOf(scanner.nextLine().trim().toUpperCase());
            } catch (Exception e) {
                System.out.println("Неизвестная команда");
                continue;
            }
            if (command == Command.ADD) {
                Animal animal = null;
                while (animal == null) {
                    System.out.print("Какое животное? (cat/dog/duck): ");
                    String animalType = scanner.nextLine().trim().toLowerCase();
                    if (animalType.equals("cat")) {
                        animal = new Cat();
                    } else if (animalType.equals("dog")) {
                        animal = new Dog();
                    } else if (animalType.equals("duck")) {
                        animal = new Duck();
                    } else {
                        System.out.println("Неизвестное животное");
                    }
                }

                System.out.print("Имя ");
                animal.setName(scanner.nextLine());

                while (animal.getAge() == 0) {
                    System.out.print("Возраст ");
                    try {
                        int age = Integer.parseInt(scanner.nextLine());
                        if (age <= 0 || age > 100) {
                            System.out.println("Некорректный возраст");
                            continue;
                        }
                        animal.setAge(age);
                    } catch (Exception e) {
                        System.out.println("Некорректный возраст");
                    }
                }

                while (animal.getWeight() == 0) {
                    System.out.print("Вес ");
                    try {
                        double weight = Double.parseDouble(scanner.nextLine());
                        if (weight <= 0 || weight > 100) {
                            System.out.println("Некорректный вec");
                            continue;
                        }
                        animal.setWeight(weight);
                    } catch (Exception e) {
                        System.out.println("Некорректный вес");
                    }
                }

                System.out.print("Цвет ");
                animal.setColor(scanner.nextLine());

                animals.add(animal);
                animal.say();


            } else if (command == Command.LIST) {
                for (Animal animal : animals) {
                    System.out.println(animal.toString());
                }

            } else if (command == Command.EXIT) {
                System.exit(0);

            }
        }
    }

}
