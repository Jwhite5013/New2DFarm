public class Acre{
    private String cropType;
    private double sellPrice;
    private double growCropPrice;
    private int growDays;
    private boolean growCheck;
    public Acre(int ha) {
        growCheck = true;
      switch(ha){
        case 1:
          cropType = "Corn";
          sellPrice = 153.00;
          growCropPrice = 103.00;
          growDays = 60;
          break;
        case 2:
          cropType = "Potatoes";
          sellPrice = 485.00;
          growCropPrice = 336.00;
          growDays = 70;
          break;
        case 3:
          cropType = "Soybeans";
          sellPrice = 9.64;
          growCropPrice = 3.78;
          growDays = 45;
        case 4:
          cropType = "Wheat";
          sellPrice = 827.00;
          growCropPrice = 170.00;
          growDays = 240;
          break;
        case 5:
          cropType = "Tree Nuts";
          sellPrice = 7200.00;
          growCropPrice = 5800.00;
          growDays = 365;
          break;
        case 0:
          cropType = "No Crop";
          growCheck = false;
          sellPrice = 0.0;
          growDays = 0;
          growCropPrice = 0.0;
          break;
        default:
          System.out.println("Not a option");
          
      }
    }
public Acre(){
            cropType = "No Crop";
            growCheck = false;
            sellPrice = 0.0;
            growDays = 0;
            growCropPrice = 0.0;
        }
        public String getCrop(){
            return cropType;
        }
        public boolean enoughDays(int days){
            boolean check;
            if(days>=growDays){
                check = true;
            } else{
                check = false;
            }
            return check;
        }
        public double income(){
            double income;
            income = sellPrice - growCropPrice;
            return income;
        }
        public double income(int days){
            double income;
            income = (days/growDays)*(sellPrice - growCropPrice);
            return income;
        }
        public String toString(){
            String stuff = "";
            stuff += "Crop: " + cropType + "\tCost: " + growCropPrice + "\tSell price: " + sellPrice;
            return stuff;
        }
    }
