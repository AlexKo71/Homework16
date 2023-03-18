public abstract class Service extends Vehicle {

    public Service(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    abstract public void service();


}
