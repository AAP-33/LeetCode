class Solution {
    public int majorityElement(int[] arr) {
        int maj_ele=arr[0];
        int fre=0;
        
        for(int ele:arr){
            if(ele==maj_ele) fre++;
            else {
                fre--;
                if(fre==-1) {
                    fre=1;
                    maj_ele=ele;
                }
            }
        }
        return maj_ele;
    }
}