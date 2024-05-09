public abstract class Vehicle {

    protected String maker;
    protected String model;
    protected String year;
    protected  double price;
    protected int miles;
    protected String feat;




    public Vehicle(String maker,String model, String year, double price, int miles){
        setMaker(maker);
        setModel(model);
        setYear(year);
        setPrice(price);
        setMiles(miles);

    }

    public void setMaker(String make){
        maker = make;
    }

    public void setModel(String mode){
        model = mode;

    }

    public void setYear(String yr){
        year = yr;
    }

    public void setPrice(double pr){
        price = pr;
    }

    public void setMiles(int mile){
        miles = mile;
    }

    public String getMaker(){
        return maker;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }

    public double getPrice(){
        return price;
    }

    public int getMiles(){
        return miles;
    }

    public abstract void setFeatures(String feat);
    public abstract String getFeatures();




}
