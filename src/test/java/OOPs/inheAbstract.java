package OOPs;

import OOPs.Abstract.AbstractClass;

public class inheAbstract extends AbstractClass {
    @Override
    public void mergeArrays(int[] array1, int[] array2) {
        int aLen = array1.length;
        int bLen = array2.length;
        for (int i = 0; i < aLen; i++){
            System.out.println(array1[i]);
        }
       for (int i = 0; i < bLen; i++) {
           System.out.println(array2[i]);
       }
    }

    public void printAbstract(){
        System.out.println("original message! ");
        System.out.println("Modify from inherit class! ");
    }

    @Override
    public void draw() {
        System.out.println("override draw method from inhe class!");
    }

    @Override
    public void absMethod() {
        System.out.println("override absMethod!");
    }


}
