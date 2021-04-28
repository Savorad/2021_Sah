package chess;

import java.util.List;

public class Rook extends ChessPiece{

    public Rook(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        return null;
    }
}
