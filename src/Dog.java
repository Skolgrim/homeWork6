public class Dog extends Animals {
    public static int numberDog = 0;

    Dog(String type, String name, int maxRun, int maxSwimming) {
        super(type, name, maxRun, maxSwimming);
        ++numberDog;
    }
}