class Solution {
    public void reverseString(char[] s) {
        char temp;
        int endi=s.length-1;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[endi];
            s[endi--]=temp;
            
        }
        
    }
}