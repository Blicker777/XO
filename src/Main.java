import java.util.Scanner;

/**
 * Created by Igor on 16.02.2017.
 */
public class Main {

    final static int X_SIZE = 3;
    final static int Y_SIZE = 3;

    static char[][] field = new char[Y_SIZE][X_SIZE];

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }

    public static void initField() {
        for (int i = 0; i < Y_SIZE; i++) {
            for (int j = 0; j < X_SIZE; j++) {
                field[i][j] = '*';
            }
        }
    }



}
