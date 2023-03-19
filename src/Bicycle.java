
public class Bicycle extends Service {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.serviceName(getModelName());
        super.updateTyre(getWheelsCount());
    }
}
