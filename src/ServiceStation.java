public class ServiceStation implements Service {
    @Override
    public void check(Car[] cars){
        for (int i=0; i< cars.length; i++){
            System.out.println("Обслуживаем " + cars[i].getModelName());
            for (int j = 0; j < cars[i].getWheelsCount(); j++) {
                cars[i].updateTyre();
            }
            cars[i].checkEngine();
        }
    }

    @Override
    public void check(Truck[] trucks){
        for (int i=0;i< trucks.length;i++){
            System.out.println("Обслуживаем " + trucks[i].getModelName());
            for (int j = 0; j < trucks[i].getWheelsCount(); j++) {
                trucks[i].updateTyre();
            }
            trucks[i].checkEngine();
            trucks[i].checkTrailer();
        }
    }

    @Override
    public void check(Bicycle[] bicycles){
        for (int i=0;i< bicycles.length;i++){
            System.out.println("Обслуживаем " + bicycles[i].getModelName());
            for (int j = 0; j < bicycles[i].getWheelsCount(); j++) {
                bicycles[i].updateTyre();
            }
        }
    }
}
