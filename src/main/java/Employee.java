public class Employee {

    private int id;
    private String name;
    private Address address;
    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Employee ID vs name: " + id + " " + name);
        System.out.println("Employee address: " + address.city + " "+ address.state + " " + " " + address.country);
    }
}
