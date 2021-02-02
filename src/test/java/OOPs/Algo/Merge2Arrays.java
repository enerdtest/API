package OOPs.Algo;

public class Merge2Arrays {
    private BubbleSort bubbleSort;
    public Merge2Arrays(int array1[], int array2[]){

        int aLen = array1.length;
        int bLen = array2.length;
        int cLen = aLen + bLen;
        int arrayC[] = new int[cLen];
        for (int i = 0; i < aLen; i++){
            arrayC[i] = array1[i];
        }

        for (int i = 0; i < bLen; i++) {
            arrayC[aLen + i] = array2[i];
        }

        bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortArr(arrayC);

        for (int i = 0; i< cLen; i++){
            System.out.println("Array C after merging and sorting! " + arrayC[i]);
        }
    }
}
