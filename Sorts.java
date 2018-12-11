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
  public static void insertionSort(int[] ary){
    for (int i = 1; i < ary.length; i++){
      //copy of the current num
      int current = ary[i];
      //loop through the sorted portion of the array to determine where to place the current num
      for (int j = i-1; j >= 0; j--){
        //if current is smaller than all the numbers, then j = 0, which means it has to be the first element
        if (j == 0){
          ary[0] = current;
        }
        //if the current num is bigger than the num at index j is shifted down and current replaces that num at j
        if (current > ary[j]){
          ary[j+1] = current;
        }
        //if the current number is less than the num at index j then shift the numbers down
        else{
          ary[j+1] = ary[j];
        }
      }
    }
  }
}
