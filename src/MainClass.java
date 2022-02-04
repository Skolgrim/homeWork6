import java.util.Scanner;

public class MainClass {
   static Scanner scanner = new Scanner(System.in);

   static int distanceRun;
   static int distanceSwim;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog("Пёс", "Бобик", 500, 10);
        Dog dog1 = new Dog("Пёс", "Дик", 500, 10);
        Cat cat = new Cat("Кот", "Мурзик", 200, 0);
        Cat cat1 = new Cat("Кот", "Томас", 200, 0);

        Animals[] animals = new Animals[]{cat, cat1, dog, dog1};

    goRun();
        for (int i = 0; i < animals.length; ++i) {
            if (animals[i].Run()) {
                animals[i].toRun();
            } else {
                animals[i].failRun();
            }
        }

    goSwim();
        for (int i = 0; i < animals.length; ++i) {
            if (animals[i].Swim()) {
                animals[i].toSail();
            } else {
                animals[i].failSail();
            }
        }

        count();
    }

    public static void count() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Всего животных: " + Animals.numberAnimals);
        System.out.println("Котов: " + Cat.numberCat + " Собак: " + Dog.numberDog);
        System.out.println("-----------------------------------------------------");
    }
    public static void goRun() {
        System.out.println("Введите дистанцию забега: " );
        distanceRun = scanner.nextInt();
    }
    public static void goSwim() {
        System.out.println("Введите дистанцию заплыва: " );
        distanceSwim = scanner.nextInt();
    }

}