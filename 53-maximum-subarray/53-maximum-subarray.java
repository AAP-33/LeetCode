class Solution {
    public int maxSubArray(int[] arr) {
        

        int sum=0;
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            sum=sum+arr[i];

  //          check condition

            if(sum > max_sum){
            max_sum=sum;
            }

//            * check another condition if sum is less than 0 update the sum with zero;

            if(sum<0){
             sum=0;
            }
        }
        return max_sum;
    }
}