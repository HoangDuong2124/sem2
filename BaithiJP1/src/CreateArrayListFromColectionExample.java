import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromColectionExample {
    public static void main(String[] args) {
        List<Integer> firstfivePrimeNumbers =new ArrayList<>();
        firstfivePrimeNumbers.add(2);
        firstfivePrimeNumbers.add(3);
        firstfivePrimeNumbers.add(5);
        firstfivePrimeNumbers.add(7);
        firstfivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstfivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);


        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);
    }
}
