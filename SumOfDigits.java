public class SumOfDigits{
  public static int calculateSum(int number){
    int sum=0;
    while(number!=0){
      sum+=number%10;
      number=number/10;
    }
    return sum;
  }
    public static void main(String[] args){
      int number=1223;
      int result=calculateSum(number);
      System.out.println("Sum of Digits of "+number+" is "+result);
    }
}
