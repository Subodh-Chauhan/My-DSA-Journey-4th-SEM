class Program4{
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {2,3,4,7,9},
            {2,435,64,7,4,54},
            {231,12,4,25,2,21,32,-98,23,3},
            {13,423,4,3},
            {1}
        };
    System.out.println(findMin(arr));
    
    }
static int findMin(int[][] arr){
    int n = arr[0][0];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]<n){
                n= arr[i][j]; 
            }
        }
    }
    return n;
}
}