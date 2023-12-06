public class Farm {
    private Acre[][] Land;

    public Farm(int r, int c) {
Acre[][] temp = new Acre[r][c];
      Land = temp;
    }

    public void plant(int choice, int row, int col) {
 Land[row][col] = new Acre(choice);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < Land.length; i++) {
            for (int j = 0; j < Land[i].length; j++) {
                temp += Land[i][j].toString();

            }
        }
        return temp;
    }
}

