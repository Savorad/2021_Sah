package chess;

import java.util.List;

public class Pawn extends ChessPiece{
    public Pawn(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        return null;
    }
}
