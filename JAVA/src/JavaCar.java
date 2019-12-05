public class JavaCar extends Acceleratable implements Brakeble, PlayMusic, Coolable {
    public void brake() {
        System.out.println("Break");
    }

    @Override
    public void play() {
        System.out.println("Play Music");
    }

    @Override
    public void cool() {
        System.out.println("Cool");
    }

    public static void main(String[] args) {
        JavaCar car = new JavaCar();
        car.accelerate();
        car.brake();
        car.play();
    }


}
