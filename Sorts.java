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
    while (!sorted){
      for (int i = 0; i < ary.length; i++){
        
      }
    }
  }
  public static void main(String[] args){
    int[] arr = new int[]{1,2,3,4,5,6,7,8};
    int[] arr2 = new int[]{2,7,9,1,5,4,8};
    //selectionsort(arr);
    selectionSort(arr2);
    /*for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }*/
    for (int i = 0; i < arr2.length; i++){
      System.out.println(arr2[i]);
    }
  }
}