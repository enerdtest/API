import org.testng.annotations.Test;

public class Aggregation {
    @Test
    public void employee(){
        Address address1 = new Address("BD", "Binh Duong", "Viet Name");
        Address address2 = new Address("Dong Thap", "Dong Thap", "Viet Nam");
        Employee Employee = new Employee(001, "Sang KT", address1);
        Employee employee1 = new Employee(002, "Bana", address2);

        Employee.display();
        employee1.display();
    }
}
