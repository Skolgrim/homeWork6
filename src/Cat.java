public class Cat extends Animals {
    public static int numberCat = 0;

    Cat(String type, String name, int maxRun, int maxSwimming) {
        super(type, name, maxRun, maxSwimming);
        ++numberCat;
    }

    boolean Swim(int distance) {
        return false;
    }

    public void failSail() {
        System.out.println(this.type + " " + this.name + " не умеет плавать ");
    }
}