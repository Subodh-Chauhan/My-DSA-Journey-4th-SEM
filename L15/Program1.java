//Ceiling of a no. from asscending or descending array
class Program1 {
    public static void main(String[] args) {
        int[] arr1 ={2,3,5,9,14,16,18};
        int[] arr2 ={18,16,14,9,5,3,2};
        int target = 2 ;
        System.out.println(findCeiling(arr1,target));
        System.out.println(findCeiling(arr2,target));
    }
static int findCeiling(int[] arr, int target){
    int head = 0;
    int tail = arr.length-1;
    int midIndex = (head+tail)/2;
    int flag = identify(arr);
    while(target!= arr[midIndex]){
        if(head>tail){
            if(flag == 0)return head;
            else return tail;
        }
        if(target<arr[midIndex]){
            if(flag==0){
                tail = midIndex-1;
            }else{
                head = midIndex+1;
            }
        }else if(target>arr[midIndex]){
            if(flag==0){
                head = midIndex+1;
            }else{
                tail = midIndex-1;
            }
        }
        midIndex = (head+tail)/2;
    }
return midIndex;
}
static int identify(int[] arr){
    if(arr[0]<arr[arr.length-1]){
        return 0;
    }else return 1;

}
}
