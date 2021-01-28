package OOPs;

public class CallByValue {
    public int data = 50;
    public void change(int data){
        data = data + 50;
        System.out.println(data);
    }
}
