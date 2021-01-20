package OOPs;

import OOPs.Interface.Merge2Arrays;

public class workingWithString implements Merge2Arrays {
    public void stringWithRegex(String str){
        StringBuffer alpha = new StringBuffer(),
                number = new StringBuffer(),
                special = new StringBuffer();
        for (int i = 0; i<str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else if (Character.isDigit(str.charAt(i)))
                number.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
        System.out.println("Alphabet after splitting " + alpha);
        System.out.println("Number after splitting " + number);
        System.out.println("Special char after splitting " + special);
    }

    @Override
    public void mergeArrays(int arraya[], int arrayb[]) {
        int a1 = arraya.length;
        int b1 = arrayb.length;
        int cLen = a1 + b1;
        int c[] = new int[cLen];

        for (int i =0; i<a1; i++){
            c[i] = arraya[i];
        }
        for (int i = 0; i < b1; i++){
            c[a1 +i] = arrayb[i];
        }

        for (int i = 0; i < cLen; i = i +1){
            System.out.println(c[i]);
        }
    }

    @Override
    public void printAbstract() {
        System.out.println("Null");
    }

    @Override
    public void absMethod() {

    }
}
