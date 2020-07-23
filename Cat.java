public class Cat extends Animal { //задание 5

    public Cat(int distanceRun, double distanceJump, int maxDistanceRun, double maxDistanceJump) {
        super(distanceRun, distanceJump, maxDistanceRun, maxDistanceJump);
    }

    @Override
    public void swim() {
            System.out.println("Коты не умеют плавать");
    }
}
