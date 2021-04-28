package chess;

import java.util.List;

public class King extends ChessPiece{
    public King(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        return null;
    }
}
