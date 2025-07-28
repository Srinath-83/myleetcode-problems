class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int i,j;
        int k = n1.length-1;
        i=m-1;
        j=n-1;
        while(i>=0 && j >=0){
            if(n1[i]>n2[j]){
               n1[k] = n1[i];
               i--;
            }else{
                n1[k] = n2[j];
                j--;
            }
            k--;

        }
        if(i<=0){
            for(int z =0;z<=j;z++){
                n1[z]=n2[z];
            }
        }
    }
}