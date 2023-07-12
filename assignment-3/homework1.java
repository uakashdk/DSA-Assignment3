public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int ret=0;
        int temp=Integer.MAX_VALUE;
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            int j=i+1;
            int k=num.length-1;
            while(j<k){
                int sum=num[i]+num[j]+num[k];
                if(Math.abs(sum-target)<temp){
                    ret=sum;
                    temp=Math.abs(sum-target);
                }
                if(sum>target) k--;
                else j++;
            }
        }
        return ret;
    }
}