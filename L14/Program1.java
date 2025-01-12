class Program1{
    public static void main(String args[]){
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target= 2;
        System.out.println(findTarget(arr,target));
    }
static int findTarget(int[] arr, int target){
    int head= 0;
    int tail= arr.length-1;
    int midIndex = (head+tail)/2;
    while(target != arr[midIndex]){
        if(head>tail){
            return -1;
        } 
        if(target<arr[midIndex]){
            tail = midIndex-1;
            midIndex = (head+tail)/2;
        }else if(target>arr[midIndex]){
            head = midIndex+1;
            midIndex = (head+tail)/2;
        }
    }
    return midIndex;
}
}