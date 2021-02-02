package OOPs;

public class StaticMethod {
    private String rollNo;
    private String studentName;
    private String className;
    static String college = "ITS";

    public static void change(){
        college = "BBDIT";
    }

    public StaticMethod(String rollNo, String studentName, String className){
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.className = className;
    }

    public void showStudentInfo(){
        System.out.println("Student rollNo is "+rollNo+ " name is "+studentName+ " Classname is " + className+ " college is " + college);
    }
}
