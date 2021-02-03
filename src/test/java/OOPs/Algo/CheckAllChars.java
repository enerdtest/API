package OOPs.Algo;

import OOPs.Abstract.CheckAllCharsSame;

import java.util.HashSet;
import java.util.Set;

public class CheckAllChars extends CheckAllCharsSame {
    public boolean allChars(String str){
        int len = str.length();
        for (int i = 0; i < len; i++){
            if (str.charAt(i) != str.charAt(0)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean allCharWithSet(String str) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i<str.length(); i++)
            set.add(str.charAt(i));
        if (set.size() == 1) {
            System.out.println("all chars are the same!");
            return true;
        } else {
            System.out.println("all chars are not the same!");
            return false;
        }
     }
     @Override
    public void defaultMessage(){
         System.out.println("Update method from Abstract class from subclass!");
     }
}
