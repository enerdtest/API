package OOPs;

public class staticVariable {
    int count = 0;
    staticVariable(){
        count++;
        System.out.println("counter is " + count);
    }
    static int staticCount = 0;
    void staticVariable(){
        staticCount++;
        System.out.println("Static Variable " + staticCount);
    }
}
