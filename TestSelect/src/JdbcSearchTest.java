import java.sql.*;
import java.util.Scanner;

public class JdbcSearchTest {
    public static void main(String[] args) {
        int searchID;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID can tim trong bang: ");
        searchID = scanner.nextInt();
       try (
               Connection conn = DriverManager.getConnection(
                       "jdbc:mysql://localhost:3306/ebookshop","root",""  );
               Statement sttm = conn.createStatement();
               ){
           String strSelect ="Select title, price, qty from books where id ='"+searchID+"'" ;
           System.out.println("The SQL statement is: "+strSelect+"\n");
           ResultSet rset = sttm.executeQuery(strSelect);
           System.out.println("The records selected are:");
           while (rset.next()){
               String title =rset.getString("title");
               double price = rset.getDouble("price");
               int qty =rset.getInt("qty");
               System.out.println(title+", "+price+", "+qty);
           }

       }catch (SQLException ex){
           ex.printStackTrace();
       }

    }

}
