public class Coupe extends Vehicle {

    public Coupe(String maker, String model, String year, double price, int miles) {
        super(maker, model, year, price, miles);
    }

    @Override
    public void setFeatures(String fea){
        feat = fea;
    }

    @Override
    public String getFeatures(){
        return feat;
    }
}
