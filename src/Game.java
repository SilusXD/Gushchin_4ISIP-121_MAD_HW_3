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
                return false;
            }
        }
        else if (index > 3 && index < 7)
        {
            if(gameBoard[2][((index - 3) - 1) * 2] != ' ')
            {
                return false;
            }
        }
        else if(index > 6 && index < 10)
        {
            if(gameBoard[4][((index - 6) - 1) * 2] != ' ')
            {
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

        lastPutChar = ch;
    }

    public char getLastPutChar()
    {
        return lastPutChar;
    }
}
