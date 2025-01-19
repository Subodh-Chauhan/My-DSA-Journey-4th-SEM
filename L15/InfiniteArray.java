

class InfiniteArray{
    public static void main(String[] args) {
        int[] infArray = { 2, 16, 21, 33, 34, 36, 50, 51, 64, 84, 99, 107, 136, 140, 144, 146, 151, 168, 174, 184, 191, 193, 206, 206, 213, 218, 219, 247, 260, 261, 270, 287, 295, 302, 302, 312, 314, 348, 350, 360, 363, 366, 379, 382, 383, 389, 391, 411, 417, 441, 442, 455, 468, 472, 481, 486, 487, 491, 494, 507, 514, 535, 540, 545, 557, 561, 583, 597, 599, 611, 617, 622, 658, 663, 671, 674, 680, 695, 702, 704, 714, 718, 763, 773, 784, 785, 787, 800, 843, 865, 879, 884, 893, 921, 928, 929, 959, 963, 990, 997 };
        int target = 213;
        int start = findRange(infArray,target)[0];
        int end = findRange(infArray,target)[1];
        System.out.println(binarySearch(infArray,target,start,end));
    }
static int[] findRange(int[] infArray,int target){
    int start = 0;
    int end = 1;
    while(target>infArray[end]){
        int newStart = end+1;
        end = end + (end-start+1)*2;
        start = newStart;
    }
    int[] range = {start,end};
    return range;
}
static int binarySearch(int[] infArray,int target,int head,int tail){
    int midIndex = (head+tail)/2;
    while(head<=tail){
        if(target<infArray[midIndex]){
            tail = midIndex-1;
        }else if(target >infArray[midIndex]){
            head = midIndex+1; 
        }else{
            return midIndex;
        }
        midIndex = (head+tail)/2;
    }
    return -1;
}

}