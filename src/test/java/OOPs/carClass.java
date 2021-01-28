package OOPs;

public class carClass extends vehicle {
    private int numOfDoors;
    void setNumOfDoors(int doors){
        this.numOfDoors = doors;
    }

    void getVehicleInfo(){
        System.out.println("Car Model Name: " + modelName);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price in $: " + price);
        System.out.println("Speed: "+ speed + " Km/hr");
        System.out.println("Number of Seats: " + numOfSeats);
        System.out.println("Date of manufacture:  " + yearOfManufacture);
        System.out.println("Number of Doors: " + numOfDoors);
    }
}
