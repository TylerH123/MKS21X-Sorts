public class selectionSort{
  public static void swap(int[] ary, int num1, int num2){
    // swap the position of 2 numbers of an array
    int copy = ary[num1];
    ary[num1] = ary[num2];
    ary[num2] = num1;
  }
  public static void selectionsort(int[] ary){
    for(int i = 1; i < ary.length+1; i++){
      //setting the minimum to the previous term
      int min = ary[i-1];
      int pos = 0;
      int idx = 0;
      //loop through the array and get the minimum
      //if the loop has been completed n times the first n terms will be ignored
      for (int j = pos; j < ary.length; j++){
        if (ary[pos] < min){
          min = ary[j];
          idx = j;
        }
      }
      swap(ary, i-1, idx);
      pos++;
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
