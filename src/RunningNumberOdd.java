public class RunningNumberOdd {
    public static void main(String[] args) {
      int lowerbound=1;
      int upperbound=1000;
      int sum=0;
      int number=lowerbound;

      while (number<=1000){
         sum=sum+number;
         number+=2;
      }
      System.out.println("The Sum Odd From "+lowerbound+" to "+upperbound+" is: "+sum);
    }
}
