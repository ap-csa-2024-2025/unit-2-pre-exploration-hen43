public class WarmUp
{
  public static void main(String[] args)
  {
    System.out.println(isEven(4));
    System.out.println(isDivisible(15,5));
  }

  public static boolean isEven(int x){
    return(x % 2 == 0);
  }

  public static boolean isDivisible(int x, int y){
    return(x % y == 0);
  }
}
