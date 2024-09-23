public class Game
{
    private char lastPutChar = 'O';
    private char[][] gameBoard;

    public void initBoard()
    {
        gameBoard = new char[][]{
                {' ','|',' ','|',' '},
                {'—','—','—','—','—'},
                {' ','|',' ','|',' '},
                {'—','—','—','—','—'},
                {' ','|',' ','|',' '}
        };
    }

    public void printBoard()
    {
        for (char[] chars : gameBoard)
        {
            for (char ch : chars)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    private boolean verfIndex(int index)
    {
        if(index > 0 && index < 4)
        {
            if(gameBoard[0][(index - 1) * 2] != ' ')
            {
                System.out.printf("Здесь стоит %s!\n", gameBoard[0][(index - 1) * 2]);
                return false;
            }
        }
        else if (index > 3 && index < 7)
        {
            if(gameBoard[2][((index - 3) - 1) * 2] != ' ')
            {
                System.out.printf("Здесь стоит %s!\n", gameBoard[2][((index - 3) - 1) * 2]);
                return false;
            }
        }
        else if(index > 6 && index < 10)
        {
            if(gameBoard[4][((index - 6) - 1) * 2] != ' ')
            {
                System.out.printf("Здесь стоит %s!\n", gameBoard[4][((index - 6) - 1) * 2]);
                return false;
            }
        }

        return true;
    }

    public void selectChar(int index, char ch)
    {
        if(!verfIndex(index))
        {
            return;
        }

        if(index > 0 && index < 4)
        {
            gameBoard[0][(index - 1) * 2] = ch;
        }
        else if (index > 3 && index < 7)
        {
            gameBoard[2][((index - 3) - 1) * 2] = ch;
        }
        else if(index > 6 && index < 10)
        {
            gameBoard[4][((index - 6) - 1) * 2] = ch;
        }
        else
        {
            return;
        }

        lastPutChar = ch;
    }

    public boolean checkWin()
    {
        for (int i = 0; i < 5; i+=2)
        {
            if((gameBoard[i][0] == 'X' && gameBoard[i][2] == 'X' && gameBoard[i][4] == 'X') ||
                    (gameBoard[i][0] == 'O' && gameBoard[i][2] == 'O' && gameBoard[i][4] == 'O'))
            {
                System.out.println("Победил " + gameBoard[i][0] + "!");
                return true;
            }
        }

        for (int i = 0; i < 5; i+=2)
        {
            if((gameBoard[0][i] == 'X' && gameBoard[2][i] == 'X' && gameBoard[4][i] == 'X') ||
                    (gameBoard[0][i] == 'O' && gameBoard[2][i] == 'O' && gameBoard[4][i] == 'O'))
            {
                System.out.println("Победил " + gameBoard[0][i] + "!");
                return true;
            }
        }

        if((gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') ||
                (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O'))
        {
            System.out.println("Победил " + gameBoard[0][0] + "!");
            return true;
        }
        else if((gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X') ||
                (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O'))
        {
            System.out.println("Победил " + gameBoard[0][4] + "!");
            return true;
        }

        return false;
    }

    public char getLastPutChar()
    {
        return lastPutChar;
    }
}
