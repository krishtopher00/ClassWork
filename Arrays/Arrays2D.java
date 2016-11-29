/**
* Program that contans a bunch of methods about arrays
* Author: Krish Bhavnani
* @version 1.0
*/



public class Arrays2D{
  public static void main(String[] args){
    int [][] x = numberArray();
    printArray(x);
    System.out.println();
    int [][] y = anyArray(7,8);
    printArray(y);
    System.out.println();
    int [][] z = anyArray(6,6);
    fancyPrint(z);
    System.out.println();
    int [][] w = anyArray(9,9);
    fancyPrint(w);

  }
  // Prints 1-16 in grid
  public static int[][] numberArray(){
    /* This method creates a 2d array of numbers 1-16 with a nested
    for loop
    */
    int[][] numArray = new int[4][4];
    int index = 1;
    for(int i = 0; i < 4; i++){
      for(int x = 0; x < 4; x++){
        numArray[i][x] = index;
        index++;
      }
    }
    return numArray;
  }

  public static void printArray(int[][] arr){
    /* This method prints an array of numbers in
    a readable format (grid fashion)
    */
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Print array of any dimension
  public static int[][] anyArray(int rows, int columns){
    /*
    This method prints an array of any size populated with numbers
    */
    int[][] arr = new int[rows][columns];
    int index = 1;
    for(int i = 0; i < rows; i++){
      for(int x = 0; x < columns; x++){
        arr[i][x] = index;
        index ++;
      }
    }
    return arr;
  }

  public static void fancyPrint(int[][] arr){
    /*
    This method prints an array in a fancy fashion
    It starts with a dashed line at the top then each number of the
    array separated by a pipe character and the appropriate amount
    of spaces to make each nmber the same amount of digits
    It then separates each row with a dashed line
    */
    int rows = arr.length;
    int columns = arr[0].length;
    int maxDigit = digits(rows * columns);
    int dashLength = (int)(3.15 * columns);
    String dashes = "";
    for(int i = 0; i < dashLength; i ++){
      dashes += "-";
    }
    for(int i = 0; i < rows; i++){
      System.out.println(dashes);
      System.out.print("|");
      for(int x = 0; x < columns; x++){
        System.out.print(spaces(arr[i][x], maxDigit));
      }
      System.out.println();
    }
  }

  public static int digits(int x){
    /* Helper function to find amount of digits in a numberArray
    */
    if(x < 10){
      return 1;
    }else{
      return 1 + digits(x / 10);
    }
  }

  public static String spaces(int n, int max){
    /* Method to find the appropriate amount of spaces
    for a number for it to be of the same size as the other numbers
    It then creates a string with the number and the spaces with a pipe chartacter
    */
    int spacesAdd = max - digits(n);
    String space = "";
    for(int i = 0; i < spacesAdd; i++){
      space += " ";
    }
    space += (n + "|");
    return space;
  }

  public static int[][] staircase2D(int n){
    /*
    This method creates a staircase 2d array
    */
    int[][] arr = new int[n][];
    for(int i = 0; i < n; i++){
      arr[i] = new int[i + 1];
    }
    return arr;
  }
}
