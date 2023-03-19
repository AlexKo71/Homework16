public class ServiceCar extends Service {
    public ServiceCar(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.serviceName(getModelName());
        super.updateTyre(getWheelsCount());
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
