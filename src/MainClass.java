public class MainClass {

    public static void main(String[] args) {
        Dog dog = new Dog("Пёс", "Бобик", 500, 10);
        Dog dog1 = new Dog("Пёс", "Дик", 500, 10);
        Cat cat = new Cat("Кот", "Мурзик", 200, 0);
        Cat cat1 = new Cat("Кот", "Томас", 200, 0);
        Animals[] animals = new Animals[]{cat, cat1, dog, dog1};

        for(int i = 0; i < animals.length; ++i) {
            if (animals[i].Run(300)) {
                animals[i].toRun();
            } else {
                animals[i].failRun();
            }

            if (animals[i].Swim(0)) {
                animals[i].toSail();
            } else {
                animals[i].failSail();
            }
        }

        count();
    }

    static void count() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Всего животных: " + Animals.numberAnimals);
        System.out.println("Котов: " + Cat.numberCat + " Собак: " + Dog.numberDog);
        System.out.println("-----------------------------------------------------");
    }
}