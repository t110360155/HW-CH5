public class hw10 {
    public static void main(String[] args) throws CarException {
        Car10 car1;
        car1 = new Car10();
        car1.setCar(1234, -10.0);
        car1.show();
    }
}

class CarException extends Exception {

}

class Car10 {
    private int num;
    private double gas;

    public Car10() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) throws CarException {
        if (g < 0) {
            CarException e = new CarException();
            throw e;
        } else {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + ",汽油量設為" + gas);
        }
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar extends Car10 {
    private int course;

    public RacingCar() {
        course = 0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c) {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }
}
