/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDB;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author frank lou
 */
public class DB {

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }
 
    
    private Connection con;
    
    public DB(String host, String user, String pw){
       
        try {
            if (user.length() > 0 && pw.length() > 0)
                this.con = DriverManager.getConnection(host, user, pw);
            this.con = DriverManager.getConnection(host);
            
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        String path = this.getClass().getResource("assets/imgs/clear-all-clicked.png").toString();
    }
    
    public ArrayList<Object[]> select(String sql, String[] cols){
        return this.select(sql, cols, new String[]{});
    }
    
    public ArrayList<Object[]> select(String sql, String[] cols, String[] data){
        
        ArrayList<Object[]> rows = new ArrayList<>();
        
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            
            if (data.length > 0) {
                for (int i = 1; i <= data.length; i++) {
                    stmt.setString(i, data[i - 1]);
                }
            }
            
            ResultSet rs = stmt.executeQuery();
        
            while (rs.next()){
                Object[] row = new Object[cols.length];
                for (int i = 1; i <= cols.length; i++) 
                    row[i - 1] = rs.getObject(cols[i - 1]);
                rows.add(row);
            }
            
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        
         return rows;
    }
    
    public boolean executeSQL(String sql){
        return this.executeSQL(sql, new String[]{});
    }
    
    public boolean executeSQL(String sql, String[] data){
        try {
            
           PreparedStatement stmt = this.con.prepareStatement(sql);
           
            if (data.length > 0) {
                for (int i = 1; i <= data.length; i++) {
                    stmt.setString(i, data[i - 1]);
                }
            }
           
            stmt.execute();
            
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
        return true;
        
    } 
    
    
   
    
    public static void main(String[] args) {
      
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\DNSC\\2020-2021 - Second Sem\\IS122 - Computer Programming 2\\is122-lecture\\src\\testDB\\testDB.db");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            
            while (rs.next()){
                System.out.printf("%-4s %-4s %-4s\n", rs.getInt("id"), rs.getString("email"), rs.getString("password"));
            }
            
        } catch (SQLException e){
            System.out.println("ERROR: " + e.getMessage());
        }
//        
//        
//        DB db = new DB("jdbc:sqlite:C:\\DNSC\\2020-2021 - Second Sem\\IS122 - Computer Programming 2\\is122-lecture\\src\\testDB.db");
//        
//        
//        ArrayList<Object[]> rows = test.select("SELECT * FROM users", new String[]{"id","user_type","email","password"});
//        
//        rows.forEach((row) -> {
//            System.out.printf("%5s %5s %5s %5s\n", row[0], row[1], row[2], row[3]);
//        });
//        
//        boolean isSuccess = test.executeSQL("INSERT INTO users(user_type, email, password) VALUES(?,?,?)", new String[]{"USER","test@email.com", "password"});
//        System.out.println("REsult: " + isSuccess);
//        if (isSuccess){
//            System.out.println("Inserted!");
//        }
//        
//        rows = test.select("SELECT * FROM users", new String[]{"id","user_type","email","password"});
//        
//        rows.forEach((row) -> {
//            System.out.printf("%5s %5s %5s %5s\n", row[0], row[1], row[2], row[3]);
//        });
//        
    }
}
