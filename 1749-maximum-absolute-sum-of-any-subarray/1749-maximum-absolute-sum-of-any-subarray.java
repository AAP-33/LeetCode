class Solution {
    public int maxAbsoluteSum(int[] arr) {
        
// //         for(int i=1;i<arr.length;i++){
// //             // if(csum>0)
// //                 csum+=arr[i];
// //             // else
// //                 // csum=arr[i];
// //             if(Math.abs(csum)>Math.abs(bsum)) 
// //                 bsum=Math.abs(csum);
// //         }
// //         return bsum;
        
//         for(int i=1;i<arr.length;i++){
//             if(Math.abs(arr[i]+csum) < Math.abs(arr[i]) ){
//                 // bsum=Math.abs(arr[i]+csum);
//                 // csum+=arr[i];
//                 csum=arr[i];
//             }
//             else{
                
//                 // csum=arr[i];
//                 csum+=arr[i];
//             }
//             if(Math.abs(csum)>bsum) bsum=Math.abs(csum);
//         }
//         return bsum;
        //YOUTUBE https://www.youtube.com/watch?v=gjCFVr_nJtU
        //we need to keep track of 2 things .. postive kadane and negative kadane..
           int box1=0,box2=0; 
        int ans=0; 
        for (int a:arr)
        {
            box1+=a;
            box2+=a;
            ans=Math.max( ans, Math.max(box1, Math.abs(box2)) );
            if (box1<0)
            {
                box1=0;
            }
            if (box2>0)
            {
                box2=0;
            }
        }
            return ans;
    }
}
