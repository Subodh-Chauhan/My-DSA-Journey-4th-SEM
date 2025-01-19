class PeakIndexInMountain{
    public static void main(String[] args) {
        int[] mount= {1,3,5,7,9,6};
        System.out.println(findPeak(mount));
    }
    static int findPeak(int[] mount){
        int head = 0;
        int tail = mount.length-1;
        int midIndex = (head+tail)/2;
        while(head<tail){
            if(mount[midIndex+1]>mount[midIndex]){

                head = midIndex+1;
            }else if (mount[midIndex+1]<mount[midIndex]) {
                tail = midIndex;
            }
            midIndex = (head+tail)/2;
        }
    return head;
    }
}