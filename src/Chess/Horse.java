package Chess;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine || column == toColumn) {
            return false;
        } else if (line == toLine && column == toColumn) {
            return false;
        } else if (toLine < 0 || toLine > 7) {
            return false;
        } else if (toColumn < 0 || toColumn > 7) {
            return false;
        } else if (Math.abs(toLine - line) > 2 && Math.abs(toColumn - column) > 2) {
            return false;
        } else if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)){
            return false;
        }
        // Horse прыгает через фигуры, сквозь фигуры не ходит (проверка на это не нужна), может только рубить.
        else return true;
    }


    @Override
    public String getSymbol() {
        return "H";
    }
}




