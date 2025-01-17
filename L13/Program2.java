class Program2{
    public static void main(String[] args) {
        int[] arr ={1,23,34,4,5,6,7,12,45,3,89};
        String str = "Subodh";
        //now try to search for a target value from both arr and string 
        int target1 = 00000000;
        char target2 = '3';
        if(findChar(str,target2)==1){
            System.out.println("Yes target exists in string ");
        }else {
            System.out.println("No it dont lies in the String");
        }
        if(findInt(arr,target1)==1){
            System.out.println("Yes the target exists in Array ");
        }else {
            System.out.println("No it dont lies in the Array");
        }
    }
static int findChar(String str,char target){
    for(char ch :str.toCharArray()){
        if (ch==target){
            return 1;
        }
    }
return -1;
}
static int findInt(int[] arr, int target){
    for(int i: arr){
        if(i == target){
            return 1;
        }
    }
    return -1;
}
}