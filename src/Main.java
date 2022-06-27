import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main  (String[] args) {
        ArrayList<Animal> Animal  = new ArrayList<>();
        Scanner Scaner = new Scanner(System.in);
        while (true) {
            System.out.print( "Введите команду: ");
            Command Command1 = Command.valueOf(Scaner.nextLine().trim().toLowerCase());
            if (Command1 == Command.add) {
                Animal a = null;
                System.out.print("Какое животное? ");
                String b = Scaner.nextLine().trim().toLowerCase();
                if (b.equals("cat")) {
                    a = new Cat();
                }
                if (b.equals("dog")) {
                    a = new Dog();
                }
                if (b.equals("duck")) {
                    a = new Duck();
                }

                System.out.print("Имя ");
                a.setName(Scaner.nextLine());

                System.out.print("Возраст ");
                a.setAge(Integer.parseInt(Scaner.nextLine()));

                System.out.print("Вес ");
                a.setWeight(Double.parseDouble(Scaner.nextLine()));

                System.out.print("Цвет ");
                a.setColor(Scaner.nextLine());

                Animal.add(a);
                a.Say();


            } else if (Command1 == Command.list) {
                for (Animal a : Animal) {
                    System.out.println(a.toString());
                }

            } else if (Command1 == Command.exit) {
                System.exit(0);

            }
        }
    }

}
