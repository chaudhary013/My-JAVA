
class Binary_to_Decimal {
    public static void main(String[] args){
        int n=10101;
        
        int power=1;
        int sum=0;
        
        while(n>0){
            int lastdigit =n%10;
            sum=sum+lastdigit*power;
            
            power=power*2;
            
            n=n/10;
        }
    }
}