public class student {
    int studentID;
    String studentName;
    String studentClassName;
    public void insertStudent(int studentID, String studentName, String studentClassName){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentClassName = studentClassName;
    }
    public void displayStudent(){
        System.out.println("Student ID, Name, Class Name: " + studentID +" " + studentName + " " + studentClassName);
    }
}
