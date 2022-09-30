package MaxArray;

public class Solution2 {
	
    public int solution(int [] A) throws Exception {
    	
        if(A.length > 1000) {
            throw new Exception();
        }
        boolean containOneDigit = false;
        int max = A[0];
        
        for (int i = 0; i < A.length; i++) {            
            if (A[i] > 10000 || A[i] < -10000) {
                throw new Exception();
            }
            else if(A[i] <= 9 && A[i] >= -9) {
                containOneDigit = true;
                if(A[i] > max) {
                    max = A[i];
                }
            }
        }
        if(!containOneDigit) {
        	throw new Exception();
        }
        
        return max;
    }
}
