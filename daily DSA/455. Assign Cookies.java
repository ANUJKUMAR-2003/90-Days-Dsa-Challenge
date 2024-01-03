// Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

// Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

 

// Example 1:

// Input: g = [1,2,3], s = [1,1]
// Output: 1
// Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
// And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
// You need to output 1.
// import java.util.Collections;
// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         Arrays.sort(g);        
//         Arrays.sort(s);
//         int i = s.length-1;
//         int j = g.length-1;
//         int count = 0;
//         while(j>=0&&i>=0){
//             if(g[j--]<=s[i]){
//                 count++;
//                 i--;
//             }
//         }
//         return count;
//     }
// }

// *****************BETTER SOLUTION************
// import java.util.Collections;
// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         Arrays.sort(g);        
//         Arrays.sort(s);
//         int m = g.length;
//         int n = s.length;
//         int i = 0;
//         int j = 0;
//         while(i<m&&j<n){
//             if(g[i]<=s[j]){
//                 i++;
//             }
//             j++;
//         }
//         return i;
//     }
// }
// we have to maximize the number of satisfied childrens
// so we will give each children minimum valued cookie so that it can fulfil its greed
// so sort both arrays and start asigning cookie to each children
// if a cookie doesn't satisfies the greed
// assign one greater values cookir to the child
