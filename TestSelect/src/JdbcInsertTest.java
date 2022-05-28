import java.sql.*;

public class JdbcInsertTest {
    public static void main(String[] args) {
        try (
                Connection connn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement sttm = connn.createStatement();
                ){
                String sqlDelete = "delete from books where id >=3000 and id<=4000";
                System.out.println("The SQL statement is: "+sqlDelete+"\n");
                int countDelete = sttm.executeUpdate(sqlDelete);
                System.out.println(countDelete+"records deleted.\n");

                String sqlInsert = "insert into books values (3001,'Gone Fishing','Kumar',11.11,11)";
                System.out.println("The SQL statement is: "+sqlInsert+"\n");
                int countInserted = sttm.executeUpdate(sqlInsert);
                System.out.println(countInserted+"records inserted.\n");

                sqlInsert ="insert into books values"
                        +"(3002,'Gone Fishing 2','Kumar',22.22,22),"
                        +"(3003,'Gone Fishing 3','Kumar',33.33,33)";
                System.out.println("The SQL statement is: "+sqlInsert+"\n");
                countInserted= sttm.executeUpdate(sqlInsert);
                System.out.println(countInserted+"records inserted. \n");

                sqlInsert = "insert into books (id,title,author) values (3004,'Fishing 101','Kumar')";
                System.out.println("The SQL statement is: "+sqlInsert+"\n");
                countInserted =sttm.executeUpdate(sqlInsert);
            System.out.println(countInserted+"records inserted. \n");

            String strSelect = "Select * from books";
            System.out.println("The SQL statement is: "+strSelect+"\n");
            ResultSet rset=sttm.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("id")+", "
                                  + rset.getString("author")+", "
                                  +rset.getString("title")+", "
                                  +rset.getDouble("price")+", "
                                  +rset.getInt("qty"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
