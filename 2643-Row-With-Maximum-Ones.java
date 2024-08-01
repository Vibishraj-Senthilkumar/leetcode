class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] answer =  { 0 , 0 };
        int index = 0 ; 
        for(int[] j : mat){
            int count = 0 ; 
            for(int i : j){
                count += i ;
            }
            if(answer[1] < count){
                answer[0] = index ;
                answer[1] = count ; 
            }
            index++;
        }
        return answer ;
    }
}