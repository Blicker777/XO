import java.util.Random;
import java.util.Scanner;

/**
 * Created by Igor on 16.02.2017.
 */
public class Main {

    final static int X_SIZE = 3;
    final static int Y_SIZE = 3;

    static char[][] field = new char[Y_SIZE][X_SIZE];

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        initField();
        printField();

        playerTurn();

        aiTurn();

    }

    public static void initField() {
        for (int i = 0; i < Y_SIZE; i++) {
            for (int j = 0; j < X_SIZE; j++) {
                field[i][j] = '*';
            }
        }
    }

    public static void printField() {
        for (int i = 0; i < Y_SIZE; i++) {
            for (int j = 0; j < X_SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean setXO(int x, int y, char xo) {

        if(field[y][x] == '*') {
            field[y][x] = xo;
            return true;
        }

        return false;
    }

    public static void playerTurn() {

        int x;
        int y;

        do {
            System.out.println("Введите координаты: x y");
            x = scanner.nextInt();
            y = scanner.nextInt();

        }while(!isCellEmpty(x, y));

        setXO(x - 1, y - 1, 'X');
    }

    public static boolean isCellEmpty(int x, int y) {

        if(field[y][x] == '*')
            return true;

        return false;
    }

    public static void aiTurn() {

        int x;
        int y;

        do {
            x = rand.nextInt(X_SIZE);
            y = rand.nextInt(Y_SIZE);

        }while(!isCellEmpty(x, y));

        setXO(x - 1, y - 1, 'O');
    }

    public static boolean isFieldFull() {

        for (int i = 0; i < Y_SIZE; i++) {
            for (int j = 0; j < X_SIZE; j++) {
                if(field[i][j] == '*')
                    return true;
            }
        }

        return false;
    }



}
