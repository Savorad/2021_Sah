package chess;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessPiece{
    public King(int x, int y, Team team) {
        super(x, y, team);
    }
    
    public List<int[]> possibleMovesBetter() {
        List<int[]> list = new ArrayList<>();

        for(int i=x-1; i<x+1; i++) {
            if (i<0 || i>7) continue;
            for(int j=y-1; j<y+1; j++) {
                if (j<0 || j>7) continue;
                list.add(new int[]{i, j});
            }
        }

        return list;
    }
}
