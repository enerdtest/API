package OOPs;

public class Constructor {
    public String name;
    public int id;
    Constructor(String name, int id){
        this.name = name;
        this.id = id;
    }

    Constructor(Constructor c){
        this.id = c.id;
        this.name = c.name;
    }
    Constructor(){

    }

    void show(){
        System.out.println("constructor ID is "+ id + " and Name is " + name);
    }


}
