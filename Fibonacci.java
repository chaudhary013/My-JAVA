class Fibonacci{
    public static void main(String[] args){
        int n=10;
        
        int firstterm = 0;
        int secondterm= 1;
        
        n=n-2;
        
        System.out.print(firstterm + " " + secondterm + " ");
        
        while(n>0){
            int thirdterm = firstterm+secondterm;
            
            System.out.print(thirdterm + " ");
            
            firstterm=secondterm;
            secondterm=thirdterm;
            
            n--;
        }
        
    }
}