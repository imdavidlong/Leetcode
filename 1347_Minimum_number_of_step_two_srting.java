import java.lang.*; 
class Solution {
    public int minSteps(String s, String t) {
        //idea: to calculate the each char in s first
        //      then check back t to find how many are same 
        //      To find a same count and substrct
        
        int[] allchar = new int[26];
        for(int i=0; i<s.length();i++){
            allchar[s.charAt(i)-'a']++;
        }
        
        int samecount=0;
        for(int i=0; i<t.length();i++){
            if(allchar[t.charAt(i)-'a']>0){
                samecount++;
                allchar[t.charAt(i)-'a']--;
            }
        }
        
        return s.length()-samecount;
        
    }
}
