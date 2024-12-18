/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


class Prime_Factors {


  public static boolean isPrime(int n){
    int count = 0;
    for(int i=1;i<=n; i++){
      if(n%i==0){
        count++;
      }
    }
    if(count ==2){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {

    int n=24;

    for(int i=1;i<=n;i++){
      if(n%i==0 && isPrime(i)==true){
        System.out.print(i+" ");
      }
    }
  }
}