package Chess;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine < 0 || toLine > 7) {
            return false;
        } else if (toColumn < 0 || toColumn > 7) {
            return false;
        } else if (line == toLine && column == toColumn) {
            return false;
        } else if (Math.abs(toLine - line) > 1 || Math.abs(toColumn - column) > 1) {
            return false;
        } else if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)){
            return false;
        }
        // King ходит только на одну клетку, сквозь фигуры не ходит (проверка на это не нужна), может только рубить.
        return true;
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] != null) {
                    String s = board.board[i][j].getSymbol();
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}




