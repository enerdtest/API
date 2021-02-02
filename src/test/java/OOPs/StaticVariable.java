package OOPs;

public class StaticVariable {
    private int rollNo;
    private String name;
    private static String college = "ITS";
    private static int staticCount = 0;

    public static void changeCollege(){
        college = "ISTQB";
    }

    public static void changeCount(){
        staticCount = 10;
    }

    public StaticVariable(int roll, String n){
       rollNo = roll;
       name = n;
    }

    public void displayStudent(){
        System.out.println(rollNo + " " + name+ " " + college + " " + staticCount);
    }
}
