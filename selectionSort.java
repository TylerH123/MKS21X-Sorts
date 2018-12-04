public class selectionSort{
  public static void swap(int[] ary, int num1, int num2){
    // swap the position of 2 numbers of an array
    int copy = ary[num1];
    ary[num1] = ary[num2];
    ary[num2] = num1;
  }
  public static void selectionsort(int[] ary){
    for (int i = 1; i < ary.length; i++){
      // set the min to the previous term
      int min = ary[i-1];
      int idx = 0;
      for (int j = 0; j < ary.length; j++){
        // loop through array and replace min with a smaller number
        if (ary[j] < min){
          min = ary[j];
          idx = j;
        }
      }
      // set the previous term to the min
      swap(ary, i-1, idx);
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
