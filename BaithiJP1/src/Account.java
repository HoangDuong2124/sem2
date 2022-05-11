import java.util.Scanner;

public class Account {
      public String customerCode;
      public   String customerName;
      public   int accNumber;
      public   long amount=0;
        public void input() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ten nguoi dung: ");
            customerName = scanner.nextLine();

            Scanner scanner1 = new Scanner(System.in);
            do {
                System.out.print("Nhap Ma nguoi dung: ");
                customerCode = scanner1.nextLine();
            } while (customerCode.length() < 5);

            Scanner scanner2 = new Scanner(System.in);
            do {
                System.out.print("Nhap so tai khoan cua ban: ");
                accNumber = scanner2.nextInt();
            } while (accNumber < 100000 || accNumber > 100999);
        }

    public  void depositAndWithdraw(long money, int type){

            if (type==0){
                System.out.println("Ban da chon gui tien.");
                if (money<0){
                    System.out.println("So tien gui phai lon hon 0");
                }
                else {
                    System.out.println("So tien ban gui la:" +money+"VND");
                }
                amount=amount+money;
            }

            if (type==1){
                System.out.println("Ban da chon rut tien." );
                if (money<0&&money>amount){
                    System.out.println("So tien rut lon hon 0 va nho hon Amount");
                }
                else {
                    System.out.println("So tien ban rut la: "+money+"VND");
                }
                amount=amount-money;
            }


    }
    public String toString(){
            return "Ten nguoi dung: "+customerName+",Ma nguoi dung: "+customerCode+" va so du trong tai khoan la: "+amount;
    }

}
