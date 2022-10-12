/* class created for solving task1
 */

public class t1 {
    private int m;
    private int n;
    private int[][] darr;
    private int[] marr;
    private String[] carr;
    /* constructor
        @param rows - rows count in array
        @param cols - columns count in array
     */
    public t1 (int m, int n) {
        this.m = m;
        this.n = n;

        darr = new int[m][n];
        marr = new int[m];
        carr = new String[m];
    }
    /* generate rand numer
    @param min - minimal number in range
    @param max - maximum number in range
    @return pseudo random number in range [min, nax]

     */
    public int randomNum(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    // print 2d array
    public void printdArr() {
        for (int i = 0; i < darr.length; i++) {
            for (int j = 0; j < darr[i].length; j++) {
                System.out.print(darr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    //print array of min elements
    public void printmAarr() {
        for (int i = 0; i < marr.length; i++) {
            System.out.print(marr[i] + "\t");
        }
        System.out.println();
    }
    //print char array
    public void printcArr() {
        for (int i = 0; i < carr.length; i++) {
            System.out.print(carr[i] + "\t");
        }
        System.out.println();
    }
    //fill 2d array
    public void filldArr() {
        int num;
        for (int i = 0; i < darr.length; i++) {
            for (int j = 0; j < darr[i].length; j++) {
                num = randomNum(3, 31);
                if (num % 2 == 0) {
                    darr[i][j] = num + 1;
                }
                else {
                    darr[i][j] = num;
                }
            }
        }
    }
    //finds min value in 2d arr and fill it to 1d arr
    public void fillmArr() {
        int min = 3;
        for (int i = 0; i < marr.length; i++) {
            min = darr[i][0];
            for (int j = 0; j < darr[i].length; j++) {
                if (darr[i][j] < min) min = darr[i][j];
            }
            marr[i] = min;
        }
    }
    //fill char array with symbol 'a' min number of times
    public void fillcArr() {
        for (int i = 0; i < carr.length; i++) {
            carr[i] = "";
        }
        for (int i = 0; i < carr.length; i++) {
            for (int j = 0; j < marr[i]; j++) {
                carr[i] += "" + "a";
            }
        }
    }
    //sort str array using bubble sort
    public void sortStrArr() {
        String tmp;

        for (int i = 0; i < carr.length - 1; i++) {
            for (int j = i + 1; j < carr.length; j++) {
                if(carr[j].compareTo(carr[i]) > 0) {
                    tmp = carr[j];
                    carr[j] = carr[i];
                    carr[i] = tmp;
                }
            }
        }
    }
    //to make
    public void make() {
        t1.this.filldArr();
        t1.this.printdArr();
        t1.this.fillmArr();
        t1.this.printmAarr();
        t1.this.fillcArr();
        t1.this.printcArr();
        t1.this.sortStrArr();
        t1.this.printcArr();
    }
}
