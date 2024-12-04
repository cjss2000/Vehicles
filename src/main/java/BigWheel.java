public class BigWheel extends Vehicle {

    private final Wheel bigWheelFront = new BikeWheel("Front wheel", 12, 3);
    private final Wheel backLeft = new BikeWheel("back wheel", 6, 2);
    private final Wheel backRight = new BikeWheel("back wheel", 6, 2);

    BigWheel(Wheel bigWheelFront, Wheel backleft, Wheel backRight) {

    }

    //I want to use my constructor to ensure all BigWheel objects have the predefined objects I listed above.
    public void repair() {
        Wheel newWheel = new CarWheel();
        Wheel bigWheelWheel = new BikeWheel();
    }

    ;

    public void repairFront() {
        Wheel bigWheelFront = new BikeWheel("Front wheel", 12, 3);
    }

    public void repairBack() {
        Wheel bigWheelbackWheel = new BikeWheel("back wheel", 6, 2);
    }


}
