package OOPs;

public class Constructor {
    public String name;
    public int id;
    public Constructor(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Constructor(Constructor c){
        this.id = c.id;
        this.name = c.name;
    }
    public Constructor(){

    }

    public void show(){
        System.out.println("constructor ID is "+ id + " and Name is " + name);
    }


}
