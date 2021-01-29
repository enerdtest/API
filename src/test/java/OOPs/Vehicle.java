package OOPs;
import java.text.SimpleDateFormat;
import java.util.Date;


class Vehicle {
    private String brandName;
    private int speed;
    private int numOfSeats;
    private String modelName;
    private float price;
    private String yearOfManufacture;
    private int numWheel;

    void setBrandName(String brandName){
        this.brandName = brandName;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    void setNumOfSeats(int numOfSeats){
        this.numOfSeats = numOfSeats;
    }
    void setName(String name){
        this.modelName = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    String setYearOfManufacture(){
        this.yearOfManufacture = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        return yearOfManufacture;
    }
    void setNumWheel(int wheel){
        this.numWheel = wheel;
    }
    void vehicleInfo(){
        System.out.println("Car Model Name: " + modelName);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price in $: " + price);
        System.out.println("Speed: "+ speed + " Km/hr");
        System.out.println("Number of Seats: " + numOfSeats);
        System.out.println("Date of manufacture:  " + yearOfManufacture);
    }
}
