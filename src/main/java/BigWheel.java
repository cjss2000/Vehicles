public class BigWheel extends Vehicle {

    Wheel bigWheelFront = new BikeWheel();
    Wheel backLeft = new BikeWheel();
    Wheel backRight = new BikeWheel();
    //ide has asked me to make Wheel class non abstract in order to instatiate object

    public void repair() {
        Wheel newWheel = new CarWheel();
    };
//abstract method?? isn't working, is this just because constructor?

}
