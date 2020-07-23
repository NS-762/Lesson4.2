public class Dog extends Animal { //задание 5

    public Dog(int distanceRun, int distanceJump, int distanceSwim, int maxDistanceRun,
               int maxDistanceJump, int maxDistanceSwim) {
        this.distanceRun = distanceRun;
        this.distanceJump = distanceJump;
        this.distanceSwim = distanceSwim;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceJump = maxDistanceJump;
        this.maxDistanceSwim = maxDistanceSwim;
    }

    @Override
    public void swim() {
        if (distanceSwim < maxDistanceSwim)
            System.out.println("run: true");
        else
            System.out.println("run: false");
    }

}
