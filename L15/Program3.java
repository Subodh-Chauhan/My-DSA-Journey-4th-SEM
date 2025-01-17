class Program3{
    public static void main(String[] args){
        char[] letters = {'z','f','d','a'};
        char target = 'i';
        System.out.println(letters[nextGreatestLetter(letters,target)]);
    }
static int nextGreatestLetter(char[] letters, char target){
    int head=0;
    int tail= letters.length-1;
    int midIndex = (head+tail)/2;
    int flag = identify(letters);
    while(target!= letters[midIndex]){
        if(head>tail){
            if (head==0){
            return head;
        }else return tail;
        }
        if(target<letters[midIndex]){
            if(flag==0){
                tail = midIndex -1;
            }else {
                head = midIndex+1;
            }
        }else if(target>letters[midIndex]){
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
static int identify(char[] letters){
    if(letters[0]<letters[letters.length-1]){
        return 0;
    }else return 1;
}
}