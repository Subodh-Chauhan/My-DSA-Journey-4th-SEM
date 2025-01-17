class Program6{
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{4,5,6}};
       System.out.println(maximumWealth(accounts));
    }
static int maximumWealth(int[][] accounts) {
    int max =0;
        for(int i=0;i<accounts.length;i++){
            int temp=0;
            for(int j=0;j<accounts[i].length;j++){
                temp+=accounts[i][j];
            }
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
}