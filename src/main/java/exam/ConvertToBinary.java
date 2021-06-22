package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
   int number = 0;
   int cnt = 0;
    while(n!=0)
    {
      int rem=n%2;
      double c = Math.pow(10,cnt);
      number += rem * c;
      n/=2;
      cnt++;
    }
    
    return "number";
  }
  public static void main (string[]args)
  {
    int n=35;
    system.out.println(decimaltoBinary(n));
  }
}
