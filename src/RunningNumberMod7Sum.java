public class RunningNumberMod7Sum {
    public static void main(String[] args) {
       int lowerbound=1;
       int upperbound=1000;
       int sum=0;
       int number;
       for (number=lowerbound;number<=upperbound;number++){
           if(number%7==0){
               sum=sum+number;
           }
       }
       System.out.println("The Sum is: "+sum);
    }
}
