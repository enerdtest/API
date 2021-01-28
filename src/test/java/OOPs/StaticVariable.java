package OOPs;

public class StaticVariable {
    int rollNo;
    String name;
    static String college = "ITS";
    public StaticVariable(int roll, String n){
       rollNo = roll;
       name = n;
    }
    static int staticCount = 0;
    public void displayStudent(){
        System.out.println(rollNo + " " + name+ " " + college);
    }
}
