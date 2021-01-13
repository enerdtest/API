package OOPs;

public class staticMethod {
    String rollNo;
    String studentName;
    String className;
    static String college = "ITS";
    static void change(){
        college = "BBDIT";
    }
    staticMethod(String rollNo, String studentName, String className){
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.className = className;
    }
    void showStudentInfo(){
        System.out.println("Student rollNo is "+rollNo+ " name is "+studentName+ " Classname is " + className+ " college is " + college);
    }
}
