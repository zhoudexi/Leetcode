class Solution {
    public int findKthLargest(int[] nums, int k) {
        int heapsize = nums.length;
        buildMaxHeap(nums,heapsize);
        for(int i = nums.length - 1;i >= nums.length - k + 1; --i){
            swap(nums, 0, i);
            --heapsize;
            maxHeapify(nums,0,heapsize);
        }
        return nums[0];
    }
    public void buildMaxHeap(int[] a,int heapsize) {
        for (int i = heapsize / 2; i >= 0; --i) {
            maxHeapify(a,i,heapsize);
        }
    }
    public void maxHeapify(int[] a,int i,int heapsize) {
        int l = i * 2 + 1,r = i * 2 + 2,largest = i;
        if(l < heapsize && a[l] > a[largest])
            largest = l;
        if(r < heapsize && a[r] > a[largest])
            largest = r;
        if(largest != i){
            swap(a,i,largest);
            maxHeapify(a, largest, heapsize);
        }
    }
    public void swap(int[] a,int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}