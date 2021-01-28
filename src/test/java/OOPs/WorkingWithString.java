package OOPs;

import OOPs.Algo.BubbleSort;
import OOPs.Algo.QuickSort;
import OOPs.Interface.Merge2Arrays;

public class WorkingWithString implements Merge2Arrays {
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
    public void mergeArrays(int array1[], int array2[]) {
        int a1 = array1.length;
        int b1 = array2.length;
        int cLen = a1 + b1;
        int c[] = new int[cLen];

        for (int i =0; i<a1; i++){
            c[i] = array1[i];
        }
        for (int i = 0; i < b1; i++){
            c[a1 +i] = array2[i];
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortArr(c);
        for (int i = 0; i < cLen; i++){
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
