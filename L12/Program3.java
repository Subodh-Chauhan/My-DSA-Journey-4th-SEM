class Program3{
    public static void main(String args[]){
        int[] arr = {1,2,5666,3,4,5};
        System.err.println(findMax(arr));
    }
static int findMax(int[] arr){
    int x =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>x){
            x= arr[i];
        }
    }
return x;
}
}