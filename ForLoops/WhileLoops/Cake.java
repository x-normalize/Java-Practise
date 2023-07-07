package WhileLoops;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int piecesFirst = Integer.parseInt(scanner.nextLine());
        int piecesSecond = Integer.parseInt(scanner.nextLine());
        int availablePieces = piecesSecond * piecesFirst;
        String input = scanner.nextLine();

        while (!input.equals("STOP")){
            int takePieces = Integer.parseInt(input);
            availablePieces -= takePieces;


            input = scanner.nextLine();
        }

        if (availablePieces <= 0){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(availablePieces));
        }else{
            System.out.printf("%d pieces are left.", availablePieces);
        }


    }
}
