import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
/* class created for solving task2
 */
public class t2 {
    private int m;
    private int n;
    private int[][] darr;
    private int min;
    private String[] carr;
    Random rand = new Random();
    int iRand;
    StringBuilder strbuilder;
    /* constructor
            @param rows - rows count in array
            @param cols - columns count in array
      */
    public t2 (int m, int n) {
        this.m = m;
        this.n = n;

        darr = new int[m][n];
        carr = new String[m];
        strbuilder = new StringBuilder();
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
                num = rand.nextInt(28) + 3;
                if (num % 2 == 0)
                    darr[i][j] = num + 1;
                else
                    darr[i][j] = num;
            }
        }
    }
    //search for min number in 2d arr,
    // calls fillcArr() function and send index and min number
    public void findMin() {
        min = 3;
        for (int i = 0; i < m; i++) {
            min = darr[i][0];
            for (int j = 0; j < n; j++) {
                if (darr[i][j] < min) min = darr[i][j];
            }
            System.out.print(min + "\t");
            fillcArr(i, min);
        }
        System.out.println();
    }
    /* fill char arr with min values
    @param i - index of element in array
    @param min - minimum value
     */
    public void fillcArr(int i, int min) {
        strbuilder.setLength(0);
        for ( ; min > 0; min--)
            strbuilder.append('a');
        carr[i] = strbuilder.toString();
    }
    //sort str array
    public void sortStrArr() {
        Arrays.sort(carr, Comparator.reverseOrder());
        for (String ch : carr) {
            System.out.print(ch + "\t");
        }
    }
    //to make
    public void make() {
        t2.this.filldArr();
        t2.this.printdArr();
        t2.this.findMin();
        t2.this.printcArr();
        t2.this.sortStrArr();
    }
}
