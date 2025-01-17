
public class Program4 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target){
        int head=0;
        int tail= letters.length-1;
        int midIndex = (head+tail)/2;
        while(target!= letters[midIndex]){
            
            if(head>tail){
                return letters[head];
            }        
            if(target<letters[midIndex]){
                    tail = midIndex -1;
            }else if(target>letters[midIndex]){
                    head = midIndex+1;
            }
            midIndex = (head+tail)/2;
        }
        if(head==letters.length || head==letters.length-1){
            return letters[0];
        }
        return letters[midIndex+1];
    }
}
