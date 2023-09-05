
public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.serviceName(getModelName());
        super.updateTyre(getWheelsCount());
    }
}
