public class Car extends ServiceCar {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service () {
        super.serviceName(getModelName());
        super.updateTyre(getWheelsCount());
        super.checkEngine();

    }
}
