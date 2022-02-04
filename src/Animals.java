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

    public void toRun() {
        System.out.println(this.type + " " + this.name + " пробежал " + MainClass.distanceRun + " м.");
    }

    public void failRun() {
        System.out.println(this.type + " " + this.name + " не смог пробежать " + MainClass.distanceRun + " м.");
    }

    public void toSail() {
        System.out.println(this.type + " " + this.name + " проплыл " + MainClass.distanceSwim + " м.");
    }

    public void failSail() {
        System.out.println(this.type + " " + this.name + " не смог проплыть " + MainClass.distanceSwim + " м.");
    }

    protected boolean Run() {
        return MainClass.distanceRun <= this.maxRun;
    }

    boolean Swim() {
        return MainClass.distanceSwim <= this.maxSwimming;
    }
}