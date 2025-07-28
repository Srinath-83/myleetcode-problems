class Solution {
    public boolean containsDuplicate(int[] a) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<a.length;i++){
		    if(set.contains(a[i])){
		          return  true;
		      }
            set.add(a[i]); 
		
        } 
		return false;
    }
}