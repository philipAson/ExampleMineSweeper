import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        gameBoard.printGameBoard();
        gameBoard.generateMines();
        gameBoard.setSweepPosition();

        System.out.println("\nfinal mine positions");
        System.out.println(gameBoard.minePositions);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("write in the position you want to sweep.\nletter followed by number.\nExample: f6");
            String key = scanner.nextLine();
            int i = gameBoard.sweepPosition.get(key);
            gameBoard.playerPositions.add(i);
            gameBoard.placePiece(i);
            if (gameBoard.minePositions.contains(i)) {
                System.out.println("BOOOOM! Game Over!");
                break;
            }

            System.out.println(gameBoard.minePositions);
            gameBoard.printGameBoard();
        }

    }
}