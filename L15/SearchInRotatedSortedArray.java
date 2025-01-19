class SearchInRotatedSortedArray{
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 7;
        //find pivot index here
        System.out.println(search(arr,target));
    }
static int search(int[] arr, int target){
    int pivot = findPivot(arr);
    
    int res1= findIndex(arr,target,0,pivot);
    int res2 = findIndex(arr, target, pivot+1,arr.length-1 );
    if(res1==-1){
        return res2;
    }else{
        return res1;
    }
}

static int findPivot(int[] arr){
    int head =0;
    int tail =arr.length-1;
    int midIndex = (head+tail)/2;
    while(head<tail){
        if(arr[midIndex+1]<arr[head]){
            tail = midIndex;
        }else {
            head = midIndex+1;
        }
        midIndex = (head+tail)/2;
    }
    return head;
}
static int findIndex(int[] arr,int target,int head,int tail){
    
    int midIndex = (head+tail)/2;
    while(head<=tail){
        if(target<arr[midIndex]){
            tail = midIndex-1;
        }else if(target>arr[midIndex]){
            head = midIndex+1;
        }else{
            return midIndex;
        }
        midIndex = (head+tail)/2;
    }
    return -1;
}

}