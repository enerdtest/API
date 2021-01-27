package OOPs;

import OOPs.Algo.EvenOrOdd;
import org.testng.annotations.Test;

import java.util.Scanner;

import static OOPs.nonStatic.show;
import static OOPs.staticMethod.change;

public class testVehicle {
    private carClass carClass;
    private EvenOrOdd evenOrOdd;
    private vehicle vehicle;
    @Test
    public void oop(){
        carClass = new carClass();
        vehicle = new vehicle();
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
        constructor constructor = new constructor("Sang", 123);
        constructor constructor1 = new constructor(constructor);
        constructor constructor2 = new constructor();
        constructor.show();
        constructor1.show();
        constructor2.id = constructor.id;
        constructor2.name = constructor.name;
        constructor2.show();
    }

    @Test
    public void staticVariable(){
        staticVariable staticVariable = new staticVariable();
        staticVariable staticVariable1 =  new staticVariable();
        staticVariable staticVariable2 = new staticVariable();
        staticVariable.staticVariable();
        staticVariable1.staticVariable();
        staticVariable2.staticVariable();
    }

    @Test
    public void getStaticMethod(){
        change();
        staticMethod staticMethod = new staticMethod("C3QV35", "Sang KT", "C13QV 35");
        staticMethod staticMethod1 = new staticMethod("C3QV36", "Sang KT1", "C13QV 36");
        staticMethod staticMethod3 = new staticMethod("C3QV37", "Sang KT2", "C13QV 37");
        staticMethod.showStudentInfo();
        staticMethod1.showStudentInfo();
        staticMethod3.showStudentInfo();
    }
}
