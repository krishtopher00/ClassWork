public class 2DArrays{
  public static void main(String[] args){
    int [][] x = numberArray();
    printArray(x);
  }
  public static int[][] numberArray(){
    int[][] numArray = new int[4][4];
    int index = 1;
    for(int i = 0; i < 4; i++){
      for(int x = 0; x < 4; x++){
        numArray[i][x] = index;
        index++;
      }
    }
  }

  public static void printArray(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.println(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
