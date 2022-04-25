public class RunningNumberSquareSum {
    public static void main(String[] args) {
       int lowerbround=1;
       int upperbround=100;
       int sum=0;
       int number=lowerbround;
       while (number<=upperbround){
           sum= sum + number*number;
           ++number;
       }
       System.out.println("The Sum is: "+sum);
    }
}
