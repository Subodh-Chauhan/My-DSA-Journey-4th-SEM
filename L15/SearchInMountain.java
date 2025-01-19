class SearchInMountain{
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,10,8,6,5,4,2,0};
        int target = 0;
        System.out.println(findIndex(array,target));
    }
    static int search(int[] array,int peak,int target,boolean isAscending){
        int head;
        int tail;
        if (isAscending){
            head = 0;
            tail = peak;
        }else{
            head = peak+1;
            tail = array.length-1;
        }
        
        int midIndex = (head+tail)/2;
        while(head<=tail){

            if(target<array[midIndex]){
                if(isAscending){
                    tail = midIndex-1;
                }else{
                    head = midIndex+1;
                }
            }else if(target>array[midIndex]){
                if(isAscending){
                    head = midIndex+1;
                }else{
                    tail = midIndex-1;
                }
            }else{
                return midIndex;
            }
            midIndex = (head+tail)/2;
        }
        return -1;
    }
static int givePeak(int[] array){
    int head = 0;
    int tail = array.length-1;
    int midIndex = (head+tail)/2;
    while(head<tail){
        if(array[midIndex]<array[midIndex+1]){
            //we are at asc part of array
            head = midIndex+1;
        }else{
            // we  are in dec part of the array 
            tail = midIndex;
        }
        midIndex = (head+tail)/2;
    }
    return head;
}
static int findIndex(int[] array,int target){
    int peak = givePeak(array);
    int leftIndex = search(array,peak,target,true);
    int rightIndex = search(array,peak,target,false);
    if(leftIndex == -1){
        return rightIndex;
    }else {
        return leftIndex;
    }
}

}