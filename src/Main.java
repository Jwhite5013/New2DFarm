import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows is your farm?");
        int rows = scan.nextInt();
        scan.nextLine();
        System.out.println("How many columns are there?");
        int col = scan.nextInt();
Farm land = new Farm(rows, col);
      int count = 0;
      for(int i = 0; i<land.length;i++){
        for(int j = 0; j<land[i].length; j++){
          showPlant(i,j);
        }
      }
    }
  public static void showPlant(int row, int col){
    System.out.println("1. Corn");
    System.out.println("2. Potatoes");
    System.out.println("3. Soybeans");
    System.out.println("4. Wheat");
    System.out.println("5. Tree Nuts");
    System.out.println("0. Not a area to get plants");
    System.out.println("What would you like to grow in row: " + (row+1) + " Column: " + (col+1) + ". (" + row + "," + col + ")");
  }
  public static void showMenu(){
    System.out.println("1. Print all Crops");
    System.out.println("2. Count Acres of Crop");
    System.out.println("3. Change a Acre to a bad one");
    System.out.println("4. Check what crops will harvest in a number of days");
    System.out.println("5. Income of Harvest");
    System.out.println("6. Total income of crop over a number of days");
    System.out.println("0. Quit");
  }
}