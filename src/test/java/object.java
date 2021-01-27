import org.testng.annotations.Test;

import java.util.Scanner;


public class object {
    //@Test(priority = 0)
    public void student(){
        Student student1 = new Student();
        student1.insertStudent(123, "Sang Kieu", "C13QV35");
        student1.displayStudent();
    }

   // @Test(priority = 0)
    public void eventOrOdd(){
        OddMethod oddMethod = new OddMethod();
        int num;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
//        System.out.println("input number is " + num);
//
//        oddMethod.findEventOdd(num);
    }

    @Test
    public void returnThisMethod(){
        new ReturnThis().getA().msg();
        A4 a4 = new A4();
    }

    class B{
        A4 a4;
        B(A4 a4){
            this.a4 = a4;
        }
        void display(){
            System.out.println(a4.data);
        }
    }
    class A4 {
        int data = 10;
        A4(){
            B b = new B(this);
            b.display();
        }
    }
}
