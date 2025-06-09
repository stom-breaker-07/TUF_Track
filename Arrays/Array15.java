package TUF_Track.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array15 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans=new ArrayList<>();
            int total=0;
            int r=matrix.length;
            int c=matrix[0].length;
            int Tr=0 ,Rc=c-1 ,Br=r-1 ,Lc=0;
            while(total < r*c){
                for(int j=Lc ;j<=Rc && total < r*c ;j++){
                    ans.add(matrix[Tr][j]);
                    total++;
                }
                Tr++;
                for(int i=Tr ;i<=Br && total < r*c ;i++ ){
                    ans.add(matrix[i][Rc]);
                    total++;
                }
                Rc--;
                for(int j=Rc;j>=Lc && total < r*c; j-- ){
                    ans.add(matrix[Br][j]);
                    total++;
                }
                Br--;
                for(int i=Br ;i>=Tr && total < r*c;i--){
                    ans.add(matrix[i][Lc]);
                    total++;
                }
                Lc++;
            }
            return ans;
        }
    }
}
/*Spiral Matrix*/