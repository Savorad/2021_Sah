package chess;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private ChessPiece[][] pieces = new ChessPiece[8][8];

    public ChessPiece getPiece(int x, int y){
        return pieces[x][y];
    }


    //Vraca sva polja gde odabrana figura moze biti pomerena
    public List<int[]> possibleMoves(int x, int y){
        List<int[]> positions = new ArrayList<>();

        //TODO Implementacija provere za sve tipove figura. Potencijalno pomeriti u ChessPiece klasu

        return positions;
    }


    //Provera da li je potez iz move() metode dozvoljen
    public void isLegalMove(int x, int y, int xnew, int ynew){


    }

    //Pomeranje figure
    public void move(int x, int y, int xnew, int ynew){


    }


    //Restartuje pozicije svih figura pred početak nove partije
    public void restartPositions(){
        pieces[0][0] = new ChessPiece(PieceType.ROOK, Team.WHITE);
        pieces[1][0] = new ChessPiece(PieceType.KNIGHT, Team.WHITE);
        pieces[2][0] = new ChessPiece(PieceType.BISHOP, Team.WHITE);
        pieces[3][0] = new ChessPiece(PieceType.QUEEN, Team.WHITE);
        pieces[4][0] = new ChessPiece(PieceType.KING, Team.WHITE);
        pieces[5][0] = new ChessPiece(PieceType.BISHOP, Team.WHITE);
        pieces[6][0] = new ChessPiece(PieceType.KNIGHT, Team.WHITE);
        pieces[7][0] = new ChessPiece(PieceType.ROOK, Team.WHITE);
        pieces[0][7] = new ChessPiece(PieceType.ROOK, Team.BLACK);
        pieces[1][7] = new ChessPiece(PieceType.KNIGHT, Team.BLACK);
        pieces[2][7] = new ChessPiece(PieceType.BISHOP, Team.BLACK);
        pieces[3][7] = new ChessPiece(PieceType.QUEEN, Team.BLACK);
        pieces[4][7] = new ChessPiece(PieceType.KING, Team.BLACK);
        pieces[5][7] = new ChessPiece(PieceType.BISHOP, Team.BLACK);
        pieces[6][7] = new ChessPiece(PieceType.KNIGHT, Team.BLACK);
        pieces[7][7] = new ChessPiece(PieceType.ROOK, Team.BLACK);

        for(int i=0; i<8; i++){
            pieces[i][6] = new ChessPiece(PieceType.PAWN, Team.BLACK);
            pieces[i][1] = new ChessPiece(PieceType.PAWN, Team.WHITE);
        }

    }
}