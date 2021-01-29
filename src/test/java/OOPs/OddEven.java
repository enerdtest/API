package OOPs;

public class OddEven {
    public void oddEven(int num){
        if(num%2 != 0){
            System.out.println("Weird!");
        } else if( num%2 == 0 && num >= 2 && num <=5){
            System.out.println(" Greater than 2 and smaller than 5 ==>> Not Weird!");
        }else if (num%2 == 0 && num >= 6 && num <= 20){
            System.out.println(" Greater than 6 and smaller than 20 ==>> Weird!");
        }else{
            System.out.println("Greater than 20 ==>> Not Weird!");
        }
    }

}
