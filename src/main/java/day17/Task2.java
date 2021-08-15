package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY}
        });
        chessBoard.print();
    }
}
