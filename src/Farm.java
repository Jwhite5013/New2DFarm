public class Farm {
    private Acre[][] Land;

    public Farm(int r, int c) {
Acre[][] temp = new Acre[r][c];
      Land = temp;
    }

    public void plant(int choice, int row, int col) {
 Land[row][col] = new Acre(choice);
    }
  public void badPlant(int row, int col){
  Land[row][col] = new Acre();
  }

    public String toString(int i, int j) {
        String temp = "";
               temp = Land[i][j].toString(); 
        return temp;
    }
  public int getRowSize(){
    return Land.length;
  }
  public int getColSize(){
    return Land[0].length;
  }
  public int countCrop(String choice){
    int count = 0;
    for(int i = 0;i<Land.length;i++){
      for(int j = 0; j<Land[0].length;j++){
        if(choice.equals(Land[i][j].getCrop())){
          count++;
        }
      }
    }
    return count;
  }
  public void checkDays(int days){
    String overall = "";
    for(int i = 0; i<Land.length;i++){
      for(int j= 0; j<Land[i].length; j++){
        if(Land[i][j].enoughDays(days)&&Land[i][j].getDays() != 0){
          System.out.println("Row: " + i + " Column: " + j + "    " + Land[i][j].getCrop() + " will harvest in " + days + " days.");
System.out.println();
        } else{
          System.out.println("Row: " + i + " Column: " + j + Land[i][j].getCrop() + " will not harvest in " + days + " days.");
          System.out.println();
        }
      
      }
    }
  }
  public void getIncome(){
      String overall = "";
      for(int i = 0; i<Land.length;i++){
          for(int j= 0; j<Land[i].length; j++){
             System.out.println("Row: " + i + " Column: " + j + "    " + Land[i][j].getCrop() + " will make " + Land[i][j].income());
             System.out.println();
          }
      }
  }
    public void getIncome(int days){
        String overall = "";
        for(int i = 0; i<Land.length;i++){
            for(int j= 0; j<Land[i].length; j++){
                System.out.println("Row: " + i + " Column: " + j + "    " + Land[i][j].getCrop() + " will make " + Land[i][j].income(days) + " in " + days + " days");
                System.out.println();
            }
        }
    }
}

