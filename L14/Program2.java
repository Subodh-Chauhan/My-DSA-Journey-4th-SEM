

class Program2{
    public static void main(String args[]){
        int[] arrAs = {1,2,3,4,5,6,7,8,9,10,100};
        int[] arrDes = {10,9,8,7,6,5,4,3,2,1,100};
        int target = 100;
        System.out.println(findTarget(arrAs,target));
        System.out.println(findTarget(arrDes,target));
    }
static int findTarget(int[] arr,int target){
    int head = 0;
    int tail = arr.length-1;
    int midIndex = (head+tail)/2;
    // 0 means asscending and 1 means descending 
    int flag = identify(arr); 
    while(arr[midIndex] != target){
        if(head>tail){
            return -1;
        }
        if(target<arr[midIndex]){
            if(flag ==0){
            tail = midIndex-1;
            }else{
                head = midIndex+1;
            }
            midIndex = (head+tail)/2;
        }else if(target >arr[midIndex]){
            if(flag ==0){
            head = midIndex+1;
            }else{
                tail = midIndex-1;
            }
            midIndex =(head+tail)/2;
        }
        
    }
    return midIndex;

}
static int identify(int[] arr){
    if(arr[0]<arr[arr.length-1]){
        return 0;
    }else return 1;
}
}