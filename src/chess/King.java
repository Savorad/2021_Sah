package chess;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessPiece{
    public King(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        List<int[]> list = new ArrayList<>();

        if(x < 7 && y < 7){
            list.add(new int[]{x+1, y+1});
            list.add(new int[]{x+1, y});
            list.add(new int[]{x, y+1});
        }

        if(x > 0 && y > 0){
            list.add(new int[]{x-1, y-1});
            list.add(new int[]{x-1, y});
            list.add(new int[]{x, y-1});
        }

        if(x > 0 && y < 7){
            list.add(new int[]{x-1, y+1});
        }

        if(x < 7 && y > 0){
            list.add(new int[]{x+1, y-1});
        }


        return list;
    }
}
