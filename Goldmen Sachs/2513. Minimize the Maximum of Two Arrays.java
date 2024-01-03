// class Solution {
//     public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
//         int g = divisor1;
//         int x = divisor2;
//         while(x>0) {
//             int tmp = g; 
//             g = x; 
//             x = tmp%x;
//         }
//         long lo = 0, hi = Integer.MAX_VALUE, multi = ((long)divisor1*divisor2)/g;
//         while(lo<hi){
//             long mid = lo+(hi-lo)/2;
//             if (uniqueCnt1 <= mid-mid/divisor1 && uniqueCnt2 <= mid-mid/divisor2 && uniqueCnt1+uniqueCnt2 <= mid-mid/multi) hi = mid; 
// 			else lo = mid+1; 
// 		}
// 		return (int)lo; 

        
//     }
// }