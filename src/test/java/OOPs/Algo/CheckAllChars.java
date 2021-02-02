package OOPs.Algo;

import OOPs.Abstract.CheckAllCharsSame;

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
}
