public class ServiceStation {

    public void service(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        updateTyre(bicycle.getWheelsCount());
    }

    public void service(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        updateTyre(car.getWheelsCount());
        System.out.println("Проверяем двигатель");
    }

    public void service(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        updateTyre(truck.getWheelsCount());
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }

    public void updateTyre(int wheelsCount) {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }

}


