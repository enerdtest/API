package testOOPs;

import org.testng.annotations.Test;

public class TestInnerClass {
   @Test(enabled = false)
    public void appendString(){
       StringBuffer alpha = new StringBuffer(),
               spec = new StringBuffer(),
               num = new StringBuffer();
       String arr = "aa6655aa+_@@abbh324";

       for (int i = 0; i<arr.length(); i++){
          if (Character.isAlphabetic(arr.charAt(i))){
             alpha.append(arr.charAt(i));
          } else if (Character.isDigit(arr.charAt(i))){
             num.append(arr.charAt(i));
          }else {
             spec.append(arr.charAt(i));
          }
       }
       System.out.println("Alpha is " + alpha);
      System.out.println("number is " + num);
      System.out.println("special char is: " + spec);
   }
}
