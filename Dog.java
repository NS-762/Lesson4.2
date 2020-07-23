public class Dog extends Animal { //задание 5

    public Dog(int distanceRun, double distanceJump, int distanceSwim, int maxDistanceRun,
               double maxDistanceJump, int maxDistanceSwim) {
        super(distanceRun, distanceJump, maxDistanceRun, maxDistanceJump);

        this.distanceSwim = distanceSwim;
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
