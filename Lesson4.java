public class Lesson4 {

    public static void main(String args[]) { // задание 4
        Employee[] humansArr = new Employee[3];

        humansArr[0] = new Employee("Иванов Иван Иванович", "менеджер", "3A@yandex.ru",
                "75-19-40", 2500, 34);
        humansArr[1] = new Employee("Петров Петр Петрович", "уборщик", "3P@yandex.ru",
                "70-09-34", 500, 46);
        humansArr[2] = new Employee("Сергеев Сергей Сергеевич", "директор", "3S@yandex.ru",
                "73-28-12", 3800, 49);

        for (int i = 0; i < 3; i++) { // сотрудники старше 40 лет
            if (humansArr[i].getAge() > 40)
                humansArr[i].show();
        }

        System.out.println("Собака: ");
        Dog an1 = new Dog(500, 1, 9, 600, 2, 4);
        an1.run();
        an1.jump();
        an1.swim();

        System.out.println("\nКот: ");
        Animal an2 = new Cat(50, 1, 10, 2);
        an2.run();
        an2.jump();
        an2.swim();
    }
}
