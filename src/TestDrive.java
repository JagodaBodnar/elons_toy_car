public class TestDrive {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        drainBattery(car);
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }

    private static void drainBattery(ElonsToyCar car) {
        int carBattery = car.getBattery();
        for (int i = carBattery; i > 0; i--) {
            car.drive();
        }
    }
}
