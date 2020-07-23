public abstract class Animal {

    protected int distanceRun;
    protected int distanceJump;
    protected int distanceSwim;
    protected int maxDistanceRun;
    protected double maxDistanceJump;
    protected int maxDistanceSwim;

    public Animal() {
    }

    public void run() {
        if (distanceRun < maxDistanceRun)
            System.out.println("run: true");
        else
            System.out.println("run: false");
    }

    public void jump() {
        if (distanceJump < maxDistanceJump)
            System.out.println("jump: true");
        else
            System.out.println("jump: false");
    }

    public abstract void swim();
}
