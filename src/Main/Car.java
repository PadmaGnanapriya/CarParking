package Main;

public class Car extends Vehicle {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void park(){
        Vehicle[] park;
        System.out.print("Enter the ID of the vehicle    : ");
        ID_Plate=UserInput.next();
        System.out.print("Enter the brand of the vehicle : ");
        Brand=UserInput.next();
        System.out.print("Enter date (Like 2019-07-27)   : ");
        date_vehicle=UserInput.next();
        System.out.print("Enter time in 24hours(17.35)   : ");
        time_vehicle=UserInput.nextDouble();
        System.out.print("Number of doors of the vehicle : ");
        value=UserInput.nextInt();
        System.out.print("Color of the vehicle           : ");
        color=UserInput.next();
    }
}
