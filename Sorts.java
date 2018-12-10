public class Sorts{
  public static void swap(int[] ary, int num1, int num2){
    // swap the position of 2 numbers of an array
    int copy = ary[num1];
    ary[num1] = ary[num2];
    ary[num2] = copy;
  }
  public static void selectionSort(int[] ary){
    int pos = 0;
    for(int i = 1; i < ary.length+1; i++){
      //setting the minimum to the previous term
      int min = ary[i-1];
      int idx = i-1;
      //loop through the array and get the minimum
      //if the loop has been completed n times the first n terms will be ignored
      for (int j = pos; j < ary.length; j++){
        if (ary[j] < min){
          min = ary[j];
          idx = j;
        }
      }
      //swaps the previous term value with the minimum
      swap(ary, i-1, idx);
      pos++;
    }
  }
  public static void bubbleSort(int[] ary){
    boolean sorted = false;
    //loop through array if its not sorted
    int count = 0;
    while (!sorted){
      if (count == ary.length - 1){
        sorted = true;
      }
      else{
      //if the array is in order, count will be 1 less than the length and the if statement will not trigger
        count = ary.length - 1;
        for (int i = 0; i < ary.length-1; i++){
          if (ary[i] > ary[i+1]){
            swap(ary, i, i+1);
            count--;
          }
        }
      }
    }
  }
}
