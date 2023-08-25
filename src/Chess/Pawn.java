package Chess;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
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
        }  else if (color.equals("White")) {
            if (toLine < line || toColumn != column) {
                return false;
            }
            if (line == 1 && toLine > line + 2) {
                return false;
            }
            if (line != 1 && toLine > line + 1) {
                return false;
            }
            if (line == 1 && toLine == line + 2) {
               if (chessBoard.board[line + 1][column] != null) {
                   return false;
               }
            }

        }
        else if (color.equals("Black")) {
            if (toLine > line || toColumn != column) {
                return false;
            }
            if (line == 6 && toLine < line - 2) {
                return false;
            }
            if (line != 6 && toLine < line - 1) {
                return false;
            }
            if (line == 6 && toLine == line - 2) {
                if (chessBoard.board[line - 1][column] != null) {
                    return false;
                }
            }
        } else if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)){
            return false;
        }
        // в задании не было точно указано, что Pawn должна рубить по диагонали, поэтому проверка сделана для перемещения только вперед и рубить она может только вперед
        return true;
    }



    @Override
    public String getSymbol() {
        return "P";
    }
}




