public class GomokuBoard {

    private char[][] board = new char[15][15];

    /**
     * An empty board is constructed which contains all spaces
     */
    public GomokuBoard()
    {
        for(int i=0; i<15; i++)
            for(int j=0; j<15; j++)
                board[i][j] = ' ';
        String a = toString();
        System.out.println(a);
    }

    /**
     * A move is applied to generate this board's state
     */

}
