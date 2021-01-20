package OOPs.Algo;

public class LinearSearch {
    public int linearSearch(int arr[], int key){
        for (int i= 0; i<arr.length; i++){
            if (arr[i] == key){
                System.out.println("your searching keyword " + key + " index at: " + i );
                return i;
            }
        }
        System.out.println("Can not find your searching " + key + " keyword!");
        return -1;
    }
}
