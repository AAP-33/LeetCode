class Solution {
    public int maxSubArray(int[] arr) {
        

//         int sum=0;
//         int max_sum=Integer.MIN_VALUE;

//         for(int i=0;i<arr.length;i++){

//             sum=sum+arr[i];

//   //          check condition

//             if(sum > max_sum){
//             max_sum=sum;
//             }

// //            * check another condition if sum is less than 0 update the sum with zero;

//             if(sum<0){
//              sum=0;
//             }
//         }
//         return max_sum;
        
        //MY KADANE's method
        
        
//         int sum=0;
//         int bs=Integer.MIN_VALUE; //bs-->best sum
//         for(int ele:arr){
            
//             sum+=ele;
//             if(sum>bs){
//                 bs=sum;
//                 //yaha chahe to hum do index pointers leke uss subarray ko bhi kahi store kar sakte the
                
//             }
            
//             if(sum<0) sum=0;
//         }
//         return bs;
        
        //PEPCODING BEST  easy to understand
        int csum=arr[0];
        int bsum=arr[0];
        for(int i=1; i<arr.length;i++){
            if(csum>0){
                csum+=arr[i];
            }
            else{
                csum=arr[i];
            }
            
            bsum= (csum > bsum) ?csum:bsum;
            
        }
        return bsum;//best sum
    }
}