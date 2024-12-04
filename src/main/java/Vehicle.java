public abstract class Vehicle {

    private String model;
    private int miles;
    private String owner;


    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setMiles(int miles){
        this.miles = miles;
    }
    public int getMiles(){
        return miles;
    }
    public void setOwner(String Owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }

//public void drive(int miles){
//    this.miles += miles;
//}
    public void drive(){
        this.miles += miles;
    }

public abstract void repair();

public Vehicle(){}

public Vehicle(String model, int miles, String owner){
    this.model = model;
    this.miles = miles;
    this.owner = owner;
}



}
