package OOPs;

public class constructor {
    public String name;
    public int id;
    constructor(String name, int id){
        this.name = name;
        this.id = id;
    }

    constructor(constructor c){
        this.id = c.id;
        this.name = c.name;
    }
    constructor(){

    }

    void show(){
        System.out.println("constructor ID is "+ id + " and Name is " + name);
    }


}
