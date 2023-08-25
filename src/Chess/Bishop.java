package Chess;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
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
        } else if (Math.abs(toLine - line) != Math.abs(toColumn - column)) {
            return false;
        } else if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)){
            return false;
        } if (Math.abs(toLine - line) > 1) {
            for (int i = 1; i < (Math.abs(toLine - line)); i++ ) {
                if (toLine > line && toColumn > column) {
                   if (chessBoard.board[line + i][column + i] != null) {
                       return false;
                   }
                }
                if (toLine < line && toColumn < column) {
                    if (chessBoard.board[line - i][column - i] != null) {
                        return false;
                    }
                }
                if (toLine > line && toColumn < column) {
                    if (chessBoard.board[line + i][column - i] != null) {
                        return false;
                    }
                }
                if (toLine < line && toColumn > column) {
                    if (chessBoard.board[line - i][column + i] != null) {
                        return false;
                    }
                }
            }
        }
        // здесь реализованы проверки на свободные поля для изменения положения в четыре стороны, куда может походить Bishop

        return true;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}


