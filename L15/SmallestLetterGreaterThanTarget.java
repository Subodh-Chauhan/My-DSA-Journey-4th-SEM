class SmallestLetterGreaterThanTarget{
    public static void main(String[] args) {
        char[] letters = {'a','c','c','g','z','z'};
        char target = 'z';
        System.out.println(findGreaterThanTarget(letters,target));
    }
static char findGreaterThanTarget(char[] letters,char target){
    int head = 0;
    int tail = letters.length-1;
    int midIndex = (head+tail)/2;
    while(head<=tail){
        if(target<letters[midIndex]){
            tail = midIndex-1;
        }else if(target>letters[midIndex]){
            head = midIndex+1;
        }else{
            head = midIndex+1;
        }
        midIndex = (head+tail)/2;
    }
    if(head==letters.length){
        return letters[0];
    }
    return letters[head];
}


}