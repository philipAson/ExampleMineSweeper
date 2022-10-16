import java.util.*;

public class GameBoard {

    // Stores player move
    ArrayList<Integer> playerPositions = new ArrayList<>();
    // Stores mines positions
    ArrayList<Integer> minePositions = new ArrayList<>();

    Map<String, Integer> sweepPosition = new HashMap<>();

    public void setSweepPosition() {
        sweepPosition.put("a1", 1);
        sweepPosition.put("a2", 2);
        sweepPosition.put("a3", 3);
        sweepPosition.put("a4", 4);
        sweepPosition.put("a5", 5);
        sweepPosition.put("a6", 6);
        sweepPosition.put("b1", 7);
        sweepPosition.put("b2", 8);
        sweepPosition.put("b3", 9);
        sweepPosition.put("b4", 10);
        sweepPosition.put("b5", 11);
        sweepPosition.put("b6", 12);
        sweepPosition.put("c1", 13);
        sweepPosition.put("c2", 14);
        sweepPosition.put("c3", 15);
        sweepPosition.put("c4", 16);
        sweepPosition.put("c5", 17);
        sweepPosition.put("c6", 18);
        sweepPosition.put("d1", 19);
        sweepPosition.put("d2", 20);
        sweepPosition.put("d3", 21);
        sweepPosition.put("d4", 22);
        sweepPosition.put("d5", 23);
        sweepPosition.put("d6", 24);
        sweepPosition.put("e1", 25);
        sweepPosition.put("e2", 26);
        sweepPosition.put("e3", 27);
        sweepPosition.put("e4", 28);
        sweepPosition.put("e5", 29);
        sweepPosition.put("e6", 30);
        sweepPosition.put("f1", 31);
        sweepPosition.put("f2", 32);
        sweepPosition.put("f3", 33);
        sweepPosition.put("f4", 34);
        sweepPosition.put("f5", 35);
        sweepPosition.put("f6", 36);

    }
    private char [][] gameBoard = {
            {' ',' ',' ',' ',' ',' ' },
            {' ',' ',' ',' ',' ',' ' },
            {' ',' ',' ',' ',' ',' ' },
            {' ',' ',' ',' ',' ',' ' },
            {' ',' ',' ',' ',' ',' ' },
            {' ',' ',' ',' ',' ',' ' }};
    void printGameBoard() {
        System.out.println(
                "    1 | 2 | 3 | 4 | 5 | 6 |\n" +
                "  ----+---+---+---+---+---|\n" +
                "a | "+gameBoard[0][0]+" | "+gameBoard[0][1]+" | "+gameBoard[0][2]+" | "
                    +gameBoard[0][3]+" | "+gameBoard[0][4]+" | "+gameBoard[0][5]+" |\n"+
                "  ----+---+---+---+---+---|\n" +
                "b | "+gameBoard[1][0]+" | "+gameBoard[1][1]+" | "+gameBoard[1][2]+" | "
                    +gameBoard[1][3]+" | "+gameBoard[1][4]+" | "+gameBoard[1][5]+" |\n"+
                "  ----+---+---+---+---+---|\n" +
                "c | "+gameBoard[2][0]+" | "+gameBoard[2][1]+" | "+gameBoard[2][2]+" | "
                    +gameBoard[2][3]+" | "+gameBoard[2][4]+" | "+gameBoard[2][5]+" |\n"+
                "  ----+---+---+---+---+---|\n" +
                "d | "+gameBoard[3][0]+" | "+gameBoard[3][1]+" | "+gameBoard[3][2]+" | "
                    +gameBoard[3][3]+" | "+gameBoard[3][4]+" | "+gameBoard[3][5]+" |\n"+
                "  ----+---+---+---+---+---|\n" +
                "e | "+gameBoard[4][0]+" | "+gameBoard[4][1]+" | "+gameBoard[4][2]+" | "
                    +gameBoard[4][3]+" | "+gameBoard[4][4]+" | "+gameBoard[4][5]+" |\n"+
                "  ----+---+---+---+---+---|\n" +
                "f | "+gameBoard[5][0]+" | "+gameBoard[5][1]+" | "+gameBoard[5][2]+" | "
                    +gameBoard[5][3]+" | "+gameBoard[5][4]+" | "+gameBoard[5][5]+" |\n"+
                "  ------------------------|\n");
    }
    void generateMines() {
        for( int i = 1 ; i <= 10 ; i++) {
            Random rNG = new Random();
            int minePos = rNG.nextInt(36) + 1;
            while (minePositions.contains(minePos)) {
                System.out.println(minePos + " is taken. generating new position");
                minePos = rNG.nextInt(36) + 1;
                System.out.println("new position = " + minePos);
            }
            minePositions.add(minePos);
        }
    }
    void placePiece(int pos) {

        /* Switch statement that takes in an int which represents a place in the 2D array.
        and places an X/O there */
        switch (pos) {
            case 1:
                gameBoard[0][0] = 'X';
                break;
            case 2:
                gameBoard[0][1] = 'X';
                break;
            case 3:
                gameBoard[0][2] = 'X';
                break;
            case 4:
                gameBoard[0][3] = 'X';
                break;
            case 5:
                gameBoard[0][4] = 'X';
                break;
            case 6:
                gameBoard[0][5] = 'X';
                break;
            case 7:
                gameBoard[1][0] = 'X';
                break;
            case 8:
                gameBoard[1][1] = 'X';
                break;
            case 9:
                gameBoard[1][2] = 'X';
                break;
            case 10:
                gameBoard[1][3] = 'X';
                break;
            case 11:
                gameBoard[1][4] = 'X';
                break;
            case 12:
                gameBoard[1][5] = 'X';
                break;
            case 13:
                gameBoard[2][0] = 'X';
                break;
            case 14:
                gameBoard[2][1] = 'X';
                break;
            case 15:
                gameBoard[2][2] = 'X';
                break;
            case 16:
                gameBoard[2][3] = 'X';
                break;
            case 17:
                gameBoard[2][4] = 'X';
                break;
            case 18:
                gameBoard[2][5] = 'X';
                break;
            case 19:
                gameBoard[3][0] = 'X';
                break;
            case 20:
                gameBoard[3][1] = 'X';
                break;
            case 21:
                gameBoard[3][2] = 'X';
                break;
            case 22:
                gameBoard[3][3] = 'X';
                break;
            case 23:
                gameBoard[3][4] = 'X';
                break;
            case 24:
                gameBoard[3][5] = 'X';
                break;
            case 25:
                gameBoard[4][0] = 'X';
                break;
            case 26:
                gameBoard[4][1] = 'X';
                break;
            case 27:
                gameBoard[4][2] = 'X';
                break;
            case 28:
                gameBoard[4][3] = 'X';
                break;
            case 29:
                gameBoard[4][4] = 'X';
                break;
            case 30:
                gameBoard[4][5] = 'X';
                break;
            case 31:
                gameBoard[5][0] = 'X';
                break;
            case 32:
                gameBoard[5][1] = 'X';
                break;
            case 33:
                gameBoard[5][2] = 'X';
                break;
            case 34:
                gameBoard[5][3] = 'X';
                break;
            case 35:
                gameBoard[5][4] = 'X';
                break;
            case 36:
                gameBoard[5][5] = 'X';
                break;
            default:
                System.out.println("Not a valid position!");
        }
    }
}

