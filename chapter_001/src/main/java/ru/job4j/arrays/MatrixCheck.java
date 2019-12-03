package ru.job4j.arrays;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int count = 0;

        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                if ((board[1][0] == 'X'
                        && board[1][1] == 'X'
                        && board[1][2] == 'X'
                        && board[1][3] == 'X'
                        && board[1][4] == 'X')
                        || (board[0][2] == 'X'
                        && board[1][2] == 'X'
                        && board[2][2] == 'X'
                        && board[3][2] == 'X'
                        && board[4][2] == 'X')) {
                    result = true;
                }
            }
            System.out.println();
        }
        if (count == board.length) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
        System.out.println();
    }
}
