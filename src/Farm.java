public class Farm {
    private Acre[][] Land;

    public Farm(int r, int c) {

    }

    public void plant(String plan, int row, int col) {

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

