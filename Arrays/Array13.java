package TUF_Track.Arrays;

public class Array13 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int low=0 , high = n*m-1;
        while(low <= high){
            int mid=low + (high-low )/2;
            int r=mid/m , c=mid%m;
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}
/*Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true*/