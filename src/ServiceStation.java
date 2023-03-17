
public class ServiceStation {

    public void service(Bicycle bicycle) {
        bicycle.serviceName();
        bicycle.updateTyre(bicycle.getWheelsCount());
    }

    public void service(Car car) {
        car.serviceName();
        car.updateTyre(car.getWheelsCount());
        car.checkEngine();
    }

    public void service(Truck truck) {
        truck.serviceName();
        truck.updateTyre(truck.getWheelsCount());
        truck.checkEngine();
        truck.checkTrailer();
    }


}


