package Algorithm;



public class Main {
    public static void main(String[] args) {
        int n = 8;
        EightQueens eightQueens = new EightQueens();
        System.out.println("***** " + n + " Queens Algorithm ******");
        eightQueens.nQueens(n);
    }
}
