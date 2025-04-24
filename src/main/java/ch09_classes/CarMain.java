package ch09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.color = "빨강";
        c1.speed = 100;

        c2.color = "노랑";
        c2.speed = 200;

        c1.drive();
        c2.drive();

        System.out.println(c1.brake());
        System.out.println(c2.brake());

        c1.displayInfo();
        c2.displayInfo();


    }
}
