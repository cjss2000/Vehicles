import java.util.ArrayList;
import java.util.List;

public class Person {

   ArrayList <Vehicle>  vehicles = new ArrayList();
  //  Vehicle vehicle1 = new Vehicle("honda", 3500, "CJ");


        public void buyVehicles(Vehicle vehicle){
       vehicles.add(vehicle);
        }

//        public void myVehicles(){
//        for (int i = 0; i < vehicles.size(); i++){
//            System.out.println(vehicles.get(i));
//        }
//        }
    //this provides the object needs a toString method?

    public void myVehicles(){
            for (Vehicle vehicle : vehicles){
                System.out.println(vehicle.getModel());
            }

    }

        // why does my buyVehicles method require an object in (as?) a parameters but the myVehicles method does not? Is it because it is already declared as an array object in the class? Where as, the buyVehicles method references an object from another class?
        public void drive(Vehicle vehicle, int miles){
        miles = miles + 1;
            System.out.println("You have driven: " + miles + " in " + vehicle);
        }


}
