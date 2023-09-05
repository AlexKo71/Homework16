public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.serviceName(getModelName());
        super.updateTyre(getWheelsCount());
        super.checkEngine();
        this.checkTrailer();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
