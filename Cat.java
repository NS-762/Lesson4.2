public class Cat extends Animal { //задание 5

    public Cat(int distanceRun, int distanceJump, int maxDistanceRun, int maxDistanceJump) {
        this.distanceRun = distanceRun;
        this.distanceJump = distanceJump;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceJump = maxDistanceJump;
    }

    @Override
    public void swim() {
            System.out.println("Коты не умеют плавать");
    }
}
