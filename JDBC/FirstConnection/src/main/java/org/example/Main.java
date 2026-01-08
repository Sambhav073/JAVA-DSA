package org.example;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException {

        String sql="SELECT customer_id FROM payment where amount=0";
        String url="jdbc:postgresql://localhost:5432/dvdrental";
        String username="postgres";
        String password="1234";

        Connection con=DriverManager.getConnection(url,username,password);
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(sql);

        while(rs.next()){
            int id=rs.getInt(1);
            System.out.println(id);
        }
        con.close();
    }
}