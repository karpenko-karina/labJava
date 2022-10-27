import java.util.Arrays;
import java.util.Comparator;
/**
 * class created for solving task using Arrays methods
 */
public class t2 {
    private int m;
    private int n;
    private int[][] darr;
    private int min;
    private String[] carr;
    StringBuilder strbuilder;
    /**
     * this is a constructor
     * @param m - rows count in array
     * @param n - columns count in array
     */
    public t2 (int m, int n) {
        this.m = m;
        this.n = n;

        darr = new int[m][n];
        carr = new String[m];
        strbuilder = new StringBuilder();
    }
    /**
     * this method is for generating random number
     * @param min - minimal number in range
     * @param max - maximum number in range
     * @return pseudo random number in range [min, nax]
     */
    public int randomNum(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /**
     * fill 2d array
     */
    public void filldArr() {
        int num;
        for (int i = 0; i < darr.length; i++) {
            for (int j = 0; j < darr[i].length; j++) {
                num = randomNum(3, 31);
                darr[i][j] = num % 2 == 0 ? num + 1 : num;
            }
        }
    }
    //search for min number in 2d arr,
    // calls fillcArr() function and send index and min number
    public void findMin() {
        for (int i = 0; i < m; i++) {
            min = darr[i][0];
            for (int j = 0; j < darr[i].length; j++)
                if (darr[i][j] < min) min = darr[i][j];
            System.out.print("[Min in row #" + i + ": " + min + "]\t");
            fillcArr(i, min);
        }
        System.out.println("\n");
    }

    /**
     * fill char arr with min values
     * @param i - index of element in array
     * @param min - minimum value
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
    }
    //print arr
    public <T> void printanyArr(T[] a){
        System.out.println(Arrays.deepToString(a) + "\n");
    }
    //to make
    public void make() {
        t2.this.filldArr();
        t2.this.printanyArr(darr);
        t2.this.findMin();
        t2.this.sortStrArr();
        t2.this.printanyArr(carr);
    }
}
