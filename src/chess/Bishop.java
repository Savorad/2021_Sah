package chess;

import java.util.List;

public class Bishop extends ChessPiece{
    public Bishop(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        return null;
    }
}
