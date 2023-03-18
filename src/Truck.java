public class Truck extends Service {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void service () {
        super.serviceName(getModelName());
        super.updateTyre(getWheelsCount());
        super.checkEngine();
        super.checkTrailer();
    }

}
