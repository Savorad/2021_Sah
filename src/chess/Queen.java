package chess;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessPiece{
    public Queen(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        List<int[]> list = new ArrayList<>();

        int i = 0;

        for(; i<7; i++){
            if(y!=i) {
                list.add(new int[]{x, i});
            }
            if(x!=i) {
                list.add(new int[]{i, y});
            }
        }

        i = x;
        int j = y;
        while(i<7 && j<7){
            i++;
            j++;
            list.add(new int[]{i, j});
        }

        i = x;
        j = y;
        while(i<7 && j>0){
            i++;
            j--;
            list.add(new int[]{i, j});
        }

        i = x;
        j = y;
        while(i>0 && j<7){
            i--;
            j++;
            list.add(new int[]{i, j});
        }

        i = x;
        j = y;
        while(i>0 && j>0){
            i--;
            j--;
            list.add(new int[]{i, j});
        }

        return list;
    }
}
