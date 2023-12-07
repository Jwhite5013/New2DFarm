import java.util.*;
public class Main {

    public static void main(String[] args) {
      boolean contine = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rows is your farm?");
        int rows = scan.nextInt();
        scan.nextLine();
        System.out.println("How many columns are there?");
        int cols = scan.nextInt();
Farm land = new Farm(rows, cols);
      for(int i = 0; i<land.getRowSize();i++){
        for(int j = 0; j<land.getColSize(); j++){
          showPlant(i,j);
         int choice = scan.nextInt();
        
          land.plant(choice,i,j);
        }
      }
    
  while(contine){
showMenu();
int choice = scan.nextInt();
switch(choice){
  case 1:
    for(int i = 0; i<land.getRowSize(); i++){
      for( int j = 0; j<land.getColSize(); j++){
        System.out.println(land.toString(i,j));
        System.out.println();
      }
    }
    break;
  case 2:
    System.out.println("1. Corn");
    System.out.println("2. Potatoes");
    System.out.println("3. Soybeans");
    System.out.println("4. Wheat");
    System.out.println("5. Tree Nuts");
    System.out.println("0. Not a area to get plants");
    System.out.println("What choice would you like?");
  int see = scan.nextInt();
  String check = "";
    switch(see){
      case 1:
        check = "Corn";
        break;
      case 2:
        check = "Potatoes";
        break;
      case 3:
        check = "Soybeans";
        break;
      case 4:
        check = "Wheat";
        break;
      case 5:
        check = "Tree Nuts";
        break;
      case 0:
        check = "No Crop";
        break;
      default:
        System.out.println("Not a option Pick again");
    }
    System.out.println("There is " + land.countCrop(check) + " Acres of " + check + " on your farm");
    break;
  case 3:
    System.out.println("Which Crop went bad? Row?");
    int row = scan.nextInt();
    System.out.println("Column?");
    int col = scan.nextInt();
    land.badPlant(row,col);
    break;
  case 4:
    System.out.println("How many days?");
    int days = scan.nextInt();
    land.checkDays(days);
    break;
  case 5:
    land.getIncome();
    break;
  case 6:
    System.out.println("How many days?");
    days = scan.nextInt();
    land.getIncome(days);
    break;
  case 0:
    contine = false;
    break;

  default:
    System.out.println("Not a option. Please try again");
} 
  }
  System.out.println("Thank you for your time");
    }//end of main
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
    System.out.println("Choose what you would like to do");
  }
}