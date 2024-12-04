public class Car extends Vehicle{

    private int gasLevel;
Car(){
    super();
}
Car(String model, int miles, String owner ){
    super(model,miles,owner);
};
    public void setGasLevel(){
    this.gasLevel = gasLevel;
    }
    public int getGasLevel(int gasLevel){
    return gasLevel;
    }



    CarWheel Wheel1 = new CarWheel();
    CarWheel Wheel2 = new CarWheel();
    CarWheel Wheel3 = new CarWheel();
    CarWheel Wheel4 = new CarWheel();


    public void repair(){
        Wheel1 = new CarWheel();
    }


    Wheel[] wheels = {Wheel1,Wheel2,Wheel3,Wheel4};

    //make this an array

        //right a method to fill int gaslevel;

    public void fillGas(int gasLevel){
        this.gasLevel = gasLevel + 10;
    }

    public void drive(){
        System.out.println("You have driven:" + this.getMiles() + " miles") ;


    }

}
