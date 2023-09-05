public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service () {
        super.serviceName(getModelName());
        super.updateTyre(getWheelsCount());
        this.checkEngine();

    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
