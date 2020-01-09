package Main;

public class Van extends Vehicle {

    public void park(){
        System.out.print("Enter the ID of the vehicle    : ");
        ID_Plate=UserInput.next();
        System.out.print("Enter the brand of the vehicle : ");
        Brand=UserInput.next();
        System.out.print("Enter date (Like 2019-07-27)   : ");
        date_vehicle=UserInput.next();
        System.out.print("Enter time in 24hours(17.35)   : ");
        time_vehicle=UserInput.nextDouble();
        System.out.print("Cargo volume of the vehicle    : ");
        value=UserInput.nextInt();
        System.out.print("Enter the date                 : ");
        date_vehicle=UserInput.next();
    }

}
