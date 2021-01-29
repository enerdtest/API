 import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GetProperties {

    @Test (enabled = false, priority = 0)
    public void getPropertiesSystem() throws IOException {

//        System.out.println(System.getProperties());
        // get all the system properties
        Properties p = System.getProperties();

        // stores set of properties information
        Set set = p.entrySet();

        // iterate over the set
        Iterator itr = set.iterator();
        while (itr.hasNext()) {

            // print each property
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " = "
                    + entry.getValue());
            p.store(new FileWriter("filewriter.csv"),"FileWriter");
        }
        ArrayList<String> array =  new ArrayList<>();
        array.add(System.getProperties().toString());

        System.out.println("After Array List");
        System.out.println(array);

    }
    @Test(priority = 1)
    public void scanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name: " + sc.nextLine());
        System.out.println("input your age: " + sc.nextInt());

        System.out.println(sc);
        sc.close();
    }
}

