public class selectionSort{
  public static void swap(int[] ary, int num1, int num2){
    int copy = aray[num1];
    ary[num1] = ary[num2];
    ary[num2] = num1;
  }
  public static void selectionsort(int[] ary){
    for (int i = 1; i < ary.length; i++){
      // set the min to the previous term
      int min = ary[i-1];
      int g = 0;
      for (int j = 1; j < ary.length; j++){
        // loop through array and replace min with a smaller number
        if (ary[j] < min){
          min = ary[j];
          g = j;
        }
      }
      // set the previous term to the min
      ary[g] = ary[i-1];
      ary[i-1] = min;
    }
  }
  public static void main(String[] args){
    int[] arr = new int[]{7,6,9,8,5,3,1};
    selectionsort(arr);
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
}
