public class employee {
    int id;
    String name;
    address address;
    public employee(int id, String name, address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Employee ID vs name: " + id + " " + name);
        System.out.println("Employee address: " + address.city + " "+ address.state + " " + " " + address.country);
    }
}
