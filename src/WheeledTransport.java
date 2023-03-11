public abstract class WheeledTransport implements Diagnostable {
    private String modelName;
    private int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


    @Override
    public void service(){
        for (int i=0; i<wheelsCount; i++){
            updateTyre();
        }
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
