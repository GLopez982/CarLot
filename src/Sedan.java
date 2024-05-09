public class Sedan extends Vehicle{




    public Sedan(String maker, String model, String year, double price, int miles) {
        super(maker, model, year, price, miles);
    }

    @Override
    public String getFeatures(){
        return feat;
    }
    @Override
    public void setFeatures(String fea){
        feat = fea;




    }
}
