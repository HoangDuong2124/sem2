public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        int lowerbround=1;
        int upperbround=1000;
        int sum=0;
        int number=lowerbround;

        while (number<=1000){
            if (number%3==0||number%5==0||number%7==0&&number%15!=0&&number%21!=0&&number%35!=0&&number%105!=0){
                sum=sum+number;
            }
            ++number;
        }
        System.out.println("The Sum is: "+sum);
    }
}
