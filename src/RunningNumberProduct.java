public class RunningNumberProduct {
    public static void main(String[] args) {
        int lowerbround=1;
        int upperbround=10;
        int number=lowerbround;
        int product=1;
        while (number<=upperbround){
            product=product*number;
            ++number;
        }
        System.out.println("The Product is: "+product);
    }
}
