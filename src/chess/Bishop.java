package chess;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

//import static java.lang.Math.abs;

public class Bishop extends ChessPiece{
    public Bishop(int x, int y, Team team) {
        super(x, y, team);
    }

    @Override
    public List<int[]> possibleMoves() {
        List<int[]> list = new ArrayList<>();

        int i = x;
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


        //big brain metoda (nedovrsena)
        /*int dif = Math.abs(x-y);

        if(x<y) {
            for (int i = 0; i + dif < 7; i++) {
                int[] array = new int[]{i, i+dif};
                list.add(array);
            }
        }
        else {
            for (int i = 0; i + dif < 7; i++) {
                int[] array = new int[]{i+dif, i};
                list.add(array);
            }
        }*/
    }
}
