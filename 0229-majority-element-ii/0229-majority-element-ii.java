class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> anslist = new ArrayList<>();
        int n = arr.length;
        int el1 = -98745612;
        int el2 = -32158795;
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && arr[i] != el2) {
                el1 = arr[i];
                cnt1 = 1;
            } else if (cnt2 == 0 && arr[i] != el1) {
                el2 = arr[i];
                cnt2 = 1;
            } else if (arr[i] == el1) {
                cnt1++;
            } else if (arr[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        //just checking if el1 &el2 are more than n/3 times
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el1) cnt1++;
            else if(arr[i]==el2) cnt2++; 
        }
        if(cnt1> (n/3) )
            anslist.add(el1);
        if(cnt2> (n/3) )
            anslist.add(el2);
        // Collections.sort(anslist);
        return anslist;
    }
}