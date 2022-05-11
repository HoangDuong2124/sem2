public class TestAccount {
    public static void main(String[] args) {
        Account ac =new Account();
        ac.input();
        ac.depositAndWithdraw(10000,1);
        System.out.println(ac);
    }
}
