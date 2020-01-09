package Main;

import java.util.Scanner;

public class WestministerCarParkManager implements CarParkManager {
    static Scanner scannerObject = new Scanner(System.in);


    public static void main(String[] args) {
        WestministerCarParkManager wcpm_obj= new WestministerCarParkManager();
        System.out.println("01. Add a new Vehicle");
        System.out.println("02. Delete a vehicle");
        System.out.println("03. Print the list of Vehicles");
        System.out.println("04. Print some statics");
        System.out.println("05. Print the list of Vehicles for a specified day");
        System.out.println("06. Parking charges");
        System.out.println("_________________________________________________");
        System.out.print("Enter your choise : ");
        int choise=scannerObject.nextInt();

        switch (choise)
        {
            case 1:
                wcpm_obj.addVehicle();
                break;
            case 2:
                wcpm_obj.deleteVehicle();
                break;
            case 3:
                wcpm_obj.printVehicleList();
                break;
            case 4:
                wcpm_obj.printStatics();
                break;
            case 5:
                wcpm_obj.vehicleList_Day();
                break;
            case 6:
                wcpm_obj.charge();
                break;
            default:
                System.out.println("Wrong choise ");
        }

    }

    @Override
    public int addVehicle() {
        if(FreeSlot==0){
            System.out.println("Cannot insert a new vehicle.");
        }else{
            System.out.print("Select vehicle type : car-type1 van-type2 motorbike-type3\ntype: ");
            int x = scannerObject.nextInt();
            if(x==2 && FreeSlot==1){
                System.out.println("There is no two slots to park a Van.");
                //break;
            }
            switch (x)
            {
                case 1:
                    Car car= new Car();
                    car.park();
                    break;
                case 2:
                    Van van=new Van();
                    van.park();
                    break;
                case 3:
                    Moterbike bike=new Moterbike();
                    bike.park();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + x);
            }
        return FreeSlot ;
    }

    @Override
    public void deleteVehicle() {

    }

    @Override
    public void printVehicleList() {

    }

    @Override
    public void printStatics() {

    }

    @Override
    public void vehicleList_Day() {

    }

    @Override
    public void charge() {

    }
}
