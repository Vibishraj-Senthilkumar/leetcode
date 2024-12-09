class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mind=m-1,nind=n-1,tot=mind+nind+1;
        while(nind>=0)
        {
            if(mind>=0&&nums1[mind]>nums2[nind])
            {
                nums1[tot]=nums1[mind];
                mind--;
            }
            else
            {
                nums1[tot]=nums2[nind];
                nind--;
            }
            tot--;
        }
    }
}