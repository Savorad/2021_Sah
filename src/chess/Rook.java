package chess;

import java.util.ArrayList;
import java.util.List;

public class Rook extends ChessPiece{

    public Rook(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i<7; i++){
            if(y!=i) {
                list.add(new int[]{x, i});
            }
            if(x!=i) {
                list.add(new int[]{i, y});
            }
        }
        return list;
    }
}
