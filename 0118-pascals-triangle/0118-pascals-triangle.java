class Solution {
    public List<List<Integer>> generate(int n) {
    //     List<List<Integer>> res = new ArrayList<>();
		// List<Integer> row, pre = null;
		// for (int i = 0; i < numRows; ++i) {
		// 	row = new ArrayList<Integer>();
		// 	for (int j = 0; j <= i; ++j)
		// 		if (j == 0 || j == i)
		// 			row.add(1);
		// 		else
		// 			row.add(pre.get(j - 1) + pre.get(j));
		// 	pre = row;
		// 	res.add(row);
		// }
		// return res;
    // }
		List<List<Integer>> anslist = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            List<Integer> temp = new ArrayList<>();
            int ans = 1;
            temp.add(ans);
            int row = i + 1;
            for (int j = 1; j <= i; j++) {
                ans *= (row - j);
                ans /= j;
                temp.add(ans);
            }
            anslist.add(temp);
        }

        return anslist;
		}
}