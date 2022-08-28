class Solution {
    public int maxProfit(int[] ar) {
    //MY APPROACH
//         int[] b =new int[ar.length];
//         b=ar.clone();
//     //System.out.println(Arrays.toString(b));  //checking whether .clone() works or not
//         //now we have to sort the cloned arr
//         Arrays.sort(b);//in-place sort
        
//         ArrayList<Integer>a =new ArrayList<>();
        
//         for(int i=0; i<ar.length; i++)
//               a.add(ar[i]);
        
//         for(int i=0,j=b.length-1; ; )
//         {
//             if(i>=j) return 0;
//             if( a.indexOf(b[i]) < a.indexOf(b[j] )     ){
//                 return (b[j]-b[i]);
//             }
//             else{
//                 if((b[i+1]-b[i])>(b[j])-b[j-1]){
//                     j--;
//                 }
//                 else{
//                     i++;
//                 }
//             }
//         }
//         // return 0;
//     }
//     // this function is NOT WORKING
//     // public ArrayList<T> arrayToArrayList(<T> array)
//     // {
//     //      ArrayList<T> list = new ArrayList<T>();
//     //      for(int i=0; i<array.length; i++)
//     //           list.add(array[i]);
//     //      return list;
//     // }
        
        //MOST OPTIMAL with O(1) space
        
        int mp=0;   //maximum profit
        int msf=ar[0];   //minimum so far
        for(int i=1;i<ar.length;i++){
            if(ar[i]<msf){
                msf=ar[i];
            }else{
                mp= (ar[i]-msf)>mp ? (ar[i]-msf) :mp ;
            }
        }
        return mp;  
    }
}