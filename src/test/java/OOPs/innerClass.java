package OOPs;

public class innerClass {
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
    }

    public class defaultPrint {
        public String passWord(String password){
            return password;
        }
    }
}
