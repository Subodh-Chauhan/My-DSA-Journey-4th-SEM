class Program3{
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,53,42,1,-98,43,23,2,42};
        //find min
        System.out.println(findMin(arr));

    }
static int findMin(int[] arr){
    int n= arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<n){
            n=arr[i];
        }
    }
return n;
}
}