package TUF_Track.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> out= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> in=new ArrayList<>();
            in.add(1);
            for(int j=1;j<i;j++){
                in.add(out.get(i-1).get(j-1)+out.get(i-1).get(j));
            }
            if(i>0){
                in.add(1);
            }
            out.add(in);
        }
        return out;
    }
}
