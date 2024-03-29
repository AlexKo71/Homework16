public abstract class Vehicle  {
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void serviceName(String modelName) {
       System.out.println("Обслуживаем " + modelName);
    }
    public void updateTyre(int wheelsCount) {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
    abstract public void service();
}
