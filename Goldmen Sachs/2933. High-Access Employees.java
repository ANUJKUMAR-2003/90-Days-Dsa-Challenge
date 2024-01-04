// class Solution {
//     public int toMinutes(String s){
//         int i = Integer.parseInt(s);
//         return ((int)i/100)*60 + (i%100);
//     }
//     public  boolean help(List<Integer> numbers) {
//         if (numbers.size() < 3) {
//             return false; // Cannot have consecutive difference with less than 3 elements
//         }

//         for (int i = 0; i < numbers.size() - 2; i++) {
//             int first = numbers.get(i);
//             int second = numbers.get(i + 1);
//             int third = numbers.get(i + 2);

//             // Check if the difference between three consecutive elements is less than 60
//             if (Math.abs(second - first) < 60 && Math.abs(third - second) < 60 && Math.abs(third - first) < 60) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public List<String> findHighAccessEmployees(List<List<String>> access_times) {
//         Map<String,List<Integer>> m = new HashMap<>();
//         for(List<String> s : access_times){
//             if(m.containsKey(s.get(0))){
//                 m.get(s.get(0)).add(toMinutes(s.get(1)));
//             }
//             else{
//                 m.put(s.get(0),new ArrayList());
//                 m.get(s.get(0)).add(toMinutes(s.get(1)));
//             }
//         }
//         List<String> ans = new ArrayList<>();
//         for(Map.Entry<String,List<Integer>> mp : m.entrySet()){
//             Collections.sort(mp.getValue());
//             // System.out.println(mp.getValue().toString());
//             if(mp.getValue().size()>=3){
//                 if(help(mp.getValue())){
//                 ans.add(mp.getKey());
//             }
//             }
           
//         }
//         return ans;
//     }
// }






// optimised



// class Solution {
//     public List<String> findHighAccessEmployees(List<List<String>> access_times) {
//         Map<String,List<Integer>> map = new HashMap<>();
//         for(List<String> a:access_times)
//         {
//             if(!map.containsKey(a.get(0))){
//                 map.put(a.get(0), new ArrayList<>());
//             }
//             char[] s = a.get(1).toCharArray();
//             int h = (s[0]-'0')*10 + s[1]-'0';
//             int m = (s[2]-'0')*10 + s[3]-'0';
//             map.get(a.get(0)).add(h*60+m);
//         }
//         List<String> ans = new ArrayList<>();
//         for(String key: map.keySet())
//         {
//             List<Integer> val = map.get(key);
//             Collections.sort(val);
//             for(int i=0;i<val.size()-2;i++)
//             {
//                 if(val.get(i+2)-val.get(i)<=59)
//                 {
//                     ans.add(key);
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }