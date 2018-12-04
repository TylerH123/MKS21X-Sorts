public class selectionSort{
  public static void selectionsort(int[] ary){
    for (int i = 1; i < ary.length; i++){
      //sets the min to the previous term
      int min = ary[i-1];
      for (int j = 1; j < ary.length; j++){
        // loop through array and replace min with a smaller number
        if (ary[j] < min){
          min = ary[j];
        }
      }
      ary[i-1] = min;
    }
  }
}
