package OOPs.Algo;

public class PairMinMax {
  public int getMinValue(int arr[]){
      int minValue = arr[0];
      for (int i = 0; i<arr.length; i++){
          if (arr[i] < minValue){
              minValue = arr[i];
          }
      }
      return minValue;
  }

  public int getMaxValue(int arr[]){
      int maxValue = arr[0];
      for (int i = 0; i < arr.length; i++){
          if(arr[i] > maxValue){
              maxValue = arr[i];
          }
      }
      return maxValue;
  }
}
