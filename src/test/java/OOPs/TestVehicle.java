package OOPs;

import OOPs.Algo.EvenOrOdd;
import org.testng.annotations.Test;

import java.util.Scanner;

import static OOPs.NonStatic.show;
import static OOPs.StaticMethod.change;

public class TestVehicle {
    private CarClass carClass;
    private EvenOrOdd evenOrOdd;
    private Vehicle vehicle;
    @Test
    public void oop(){
        carClass = new CarClass();
        vehicle = new Vehicle();
        vehicle.setBrandName("Toyota");
        vehicle.setName("Camry 2.0");
        vehicle.setNumOfSeats(4);
        vehicle.setPrice(200000f);
        vehicle.setSpeed(200);
        vehicle.setYearOfManufacture();

        vehicle.vehicleInfo();

        carClass.setPrice(2000);
        carClass.setNumOfSeats(4);
        carClass.setName("Seltos");
        carClass.setBrandName("Kia");
        carClass.setYearOfManufacture();
        carClass.setNumOfDoors(4);
        carClass.vehicleInfo();
    }
   // @Test
    public void evenOrOdd(){
        evenOrOdd = new EvenOrOdd();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: " );
        int num = scanner.nextInt();
        evenOrOdd.findEvenOrOdd(num);
        scanner.close();
    }
    @Test
    public void testNonStatic(){
        show();
    }
    @Test
    public void getConstructor(){
        Constructor constructor = new Constructor("Sang", 123);
        Constructor constructor1 = new Constructor(constructor);
        Constructor constructor2 = new Constructor();
        constructor.show();
        constructor1.show();
        constructor2.id = constructor.id;
        constructor2.name = constructor.name;
        constructor2.show();
    }

//    @Test
//    public void staticVariable(){
//        StaticVariable staticVariable = new StaticVariable();
//        StaticVariable staticVariable1 =  new StaticVariable();
//        StaticVariable staticVariable2 = new StaticVariable();
//        staticVariable.StaticVariable();
//        staticVariable1.StaticVariable();
//        staticVariable2.StaticVariable();
//    }

    @Test
    public void getStaticMethod(){
        change();
        StaticMethod staticMethod = new StaticMethod("C3QV35", "Sang KT", "C13QV 35");
        StaticMethod staticMethod1 = new StaticMethod("C3QV36", "Sang KT1", "C13QV 36");
        StaticMethod staticMethod3 = new StaticMethod("C3QV37", "Sang KT2", "C13QV 37");
        staticMethod.showStudentInfo();
        staticMethod1.showStudentInfo();
        staticMethod3.showStudentInfo();
    }
}
