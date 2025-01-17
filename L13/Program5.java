class Program5{
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,212121};
        System.out.println(calcEvenDigitNo(nums));
    }
static int calcEvenDigitNo(int[] nums){
    int n =0;
     for(int i=0;i<nums.length;i++){
        float temp= nums[i];
        int count=1;
        while(temp/10 >1){
            temp=temp/10;
            count++;
        }
        if(count%2==0){
            n++;
        }
    }
return n;
     }
}
