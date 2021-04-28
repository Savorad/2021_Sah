package chess;

import java.util.List;

public class Queen extends ChessPiece{
    public Queen(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        return null;
    }
}
