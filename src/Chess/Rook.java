package Chess;

public class Rook extends ChessPiece {
    public Rook(String color) {
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
        } else if (toLine != line && toColumn != column) {
            return false;
        } else if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)){
            return false;
        }
        if (Math.abs(toLine - line) > 1) {
            for (int i = 1; i < (Math.abs(toLine - line)); i++ ) {
                if (toLine > line && toColumn == column) {
                    if (chessBoard.board[line + i][column] != null) {
                        return false;
                    }
                }
                if (toLine < line && toColumn == column) {
                    if (chessBoard.board[line - i][column] != null) {
                        return false;
                    }
                }

            }
        }
        if (Math.abs(toColumn - column) > 1) {
            for (int i = 1; i < (Math.abs(toColumn - column)); i++ ) {
                if (toLine == line && toColumn > column) {
                    if (chessBoard.board[line][column + i] != null) {
                        return false;
                    }
                }
                if (toLine == line && toColumn < column) {
                    if (chessBoard.board[line][column - i] != null) {
                        return false;
                    }
                }

            }
        }
        // здесь проверки на пустые поля только для изменения позиции по горизонтали или вертикали
        return true;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}


