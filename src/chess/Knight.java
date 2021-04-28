package chess;

import java.util.List;

public class Knight extends ChessPiece{
    public Knight(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        return null;
    }
}
