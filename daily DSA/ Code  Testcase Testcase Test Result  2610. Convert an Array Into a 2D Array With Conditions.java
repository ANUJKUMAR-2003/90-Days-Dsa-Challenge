//*******self              */
// approach : 
//  as 1<=nums[i]<=nums.length
//  we can keep the count of each element in a extra space of length nums.length + 1
//  then keep traversing the extra space and make lists such that each list have unique elements
// class Solution {
//     public List<List<Integer>> findMatrix(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         int [] m = new int[nums.length+1];
//         for(int x : nums){
//             m[x]++;
//         }
//         boolean allZero = false;
//         while(!allZero){
//             allZero = true;
//             List<Integer> l = new ArrayList<>();
//             for(int i = 1;i<=nums.length;i++){
//                 if(m[i]!=0){
//                     l.add(i);
//                     m[i]--;
//                     allZero = false;
//                 }
//             }
//             if(!allZero)
//             ans.add(l);
//         }
//         return ans;
//     }
// }