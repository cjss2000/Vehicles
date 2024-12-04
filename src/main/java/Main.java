public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.setMiles =  0;
//        System.out.println(myCar.miles);
//        myCar.drive(5);
//        System.out.println(myCar.miles);
//        Bike bike = new Bike();
//        bike.popWheelie();
//
//
//
//        myCar.fillGas(3);
//
//        System.out.println(bike.miles);
//        bike.drive(10);
//        System.out.println(bike.miles);

        Car myCar = new Car();
    myCar.setMiles(12);
    myCar.drive();

    Car oldHonda = new Car();
    Car S10 = new Car("Chevy", 500, "CJ");

    Bike Mongoose = new Bike();

    BigWheel FischerPriceToy = new BigWheel();

    Person CJ = new Person();
    CJ.buyVehicles(oldHonda);
    CJ.buyVehicles(S10);
    CJ.myVehicles();
    CJ.drive(oldHonda, 10);

    Person Mike = new Person();
    Mike.myVehicles();
    CJ.myVehicles();
    myVehicles(CJ);
    Motorcycle motorcycle = new Motorcycle();
    motorcycle.setMiles(2);
    motorcycle.drive();


    }
    public static void myVehicles(Person person){
        for (Vehicle vehicle : person.vehicles){
            System.out.println(vehicle.getModel());
        }
    }

}
