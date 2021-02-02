package OOPs;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Vehicle {
    String brandName;
    int speed;
    int numOfSeats;
    String modelName;
    float price;
    String yearOfManufacture;
    int numWheel;

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setNumOfSeats(int numOfSeats){
        this.numOfSeats = numOfSeats;
    }
    public void setName(String name){
        this.modelName = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public String setYearOfManufacture(){
        this.yearOfManufacture = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        return yearOfManufacture;
    }
    public void setNumWheel(int wheel){
        this.numWheel = wheel;
    }
    public void vehicleInfo(){
        System.out.println("Car Model Name: " + modelName);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price in $: " + price);
        System.out.println("Speed: "+ speed + " Km/hr");
        System.out.println("Number of Seats: " + numOfSeats);
        System.out.println("Date of manufacture:  " + yearOfManufacture);
    }
}
