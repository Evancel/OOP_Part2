public class Main {
    public static void main(String[] args) {

        Car [] cars = {new Car(),new Car()};
        cars[0].setModelName("car1");
        cars[1].setModelName("car2");
        cars[0].setWheelsCount(4);
        cars[1].setWheelsCount(4);

        Truck [] trucks = {new Truck(),new Truck()};
        trucks[0].setModelName("truck1");
        trucks[1].setModelName("truck2");
        trucks[0].setWheelsCount(6);
        trucks[1].setWheelsCount(8);

        Bicycle[] bicycles = {new Bicycle(),new Bicycle()};
        bicycles[0].setModelName("bicycle1");
        bicycles[1].setModelName("bicycle2");
        bicycles[0].setWheelsCount(2);
        bicycles[1].setWheelsCount(2);

        ServiceStation serviceStation = new ServiceStation();

        serviceStation.check(cars);
        serviceStation.check(trucks);
        serviceStation.check(bicycles);
    }
}