public class ServiceStation{
    public void check(WheeledTransport[] wheeledTransports){
        for (int i=0; i< wheeledTransports.length; i++){
            System.out.println("Обслуживаем " + wheeledTransports[i].getModelName());
            wheeledTransports[i].service();
        }
    }
}
