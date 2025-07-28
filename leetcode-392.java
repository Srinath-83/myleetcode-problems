class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.isEmpty()){
        return true;
      }
      char[] c = s.toCharArray();
      char[] d = t.toCharArray();
      int n = c.length;
      int x = d.length;
      int l = 0;
      for(int i=0;i<x;i++){
        if(c[l]==d[i]){
            l++;
        }
        if(l==n){
          return true;    
        }
      }
      return false;  
    }
}