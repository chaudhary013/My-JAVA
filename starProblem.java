import java.util.Scanner;

class starProblem{
    public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    
    int row = in.nextInt();
    int space=row-1;
    int star=1;
    
    for(int i=1;i<row;i++){
        
        for(int j=1;j<=space;j++){
            System.out.print(" ");
    }
    for(int j=1;j<=star;j++){
        System.out.print("*");
    }
    star++;
    space--;
    System.out.println();
}
}
}