public class fibonacci{
  public static void main(String[] args){
    System.out.println(fib(46)); //46 is the limit for under 10 -- 7.1sec
  }

  public static int fib(int n){
    if (n > 1){
      return fib(n-1) + fib(n-2);
    }
    else {
      return n;
    }
  }
}
