public class BikeWheel extends Wheel {

   private double diameter;
    private String name;

    BikeWheel(){
        super();
    }
    BikeWheel(String name, double diameter, double width){
        //super(name, diameter, width);
    }
    //my super method is not working, my goal here was to have the width come from the abstract class itself, but since I couldn't get it to work I manually added it to the BikeWheel class.

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getDiameter(){
        return diameter;
    }
}
