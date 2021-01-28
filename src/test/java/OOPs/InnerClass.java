package OOPs;

public class InnerClass {
    interface myInterface{
        void run();
        interface innerInterface {
            void runInner();
        }
    }
    public void innerClassMethod(){
      class innerClass1{
          public void runInner(){
              System.out.println("print inner Method");
          }
          public void innerMethod(){
              System.out.println("Inner Method within a class! ");
          }
      }
        System.out.println("Inner class Method  ");
    }

    public static class defaultPrint {
        public String passWord(String password){
            return password;
        }
    }
}
