import org.testng.annotations.Test;

public class aggregation{
    @Test
    public void employee(){
        address address1 = new address("BD", "Binh Duong", "Viet Name");
        address address2 = new address("Dong Thap", "Dong Thap", "Viet Nam");
        employee employee = new employee(001, "Sang KT", address1);
        employee employee1 = new employee(002, "Bana", address2);

        employee.display();
        employee1.display();
    }
}
