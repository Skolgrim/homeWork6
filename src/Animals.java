public class Animals {
    protected String type;
    protected String name;
    protected int maxRun;
    protected int maxSwimming;
    public static int numberAnimals = 0;

    Animals(String type, String name, int maxRun, int maxSwimming) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwimming = maxSwimming;
        ++numberAnimals;
    }

    String getType() {
        return this.type;
    }

    String getName() {
        return this.name;
    }

    int getMaxRun() {
        return this.maxRun;
    }

    int getMaxSwimming() {
        return this.maxSwimming;
    }

    public void toRun() {
        System.out.println(this.type + " " + this.name + " пробежал ");
    }

    public void failRun() {
        System.out.println(this.type + " " + this.name + " не смог пробежать ");
    }

    public void toSail() {
        System.out.println(this.type + " " + this.name + " проплыл ");
    }

    public void failSail() {
        System.out.println(this.type + " " + this.name + " не смог проплыть ");
    }

    protected boolean Run(int distance) {
        return distance <= this.maxRun;
    }

    boolean Swim(int distance) {
        return distance <= this.maxSwimming;
    }
}