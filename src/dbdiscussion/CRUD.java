/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdiscussion;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author frank lou
 */
public class CRUD {

    public Connection getCon() {
        return con;
    }

    private Connection con;
    
    public CRUD(String host, String username, String password){
        try {
            
            this.con = DriverManager.getConnection(host, username, password);
            
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public boolean executeSQL(String query, Object[] data){
        boolean success = false;
        
        try {
            PreparedStatement stmt = this.con.prepareStatement(query);
            
            for (int i = 0; i < data.length; i++){
                stmt.setObject(i + 1, data[i]);
            }
            
           stmt.execute();
            
           success = true;
            
        } catch(SQLException e ){
            System.out.println("ERROR: " + e.getMessage());
        }
        
        return success;
    }

    public ArrayList getData(String query, String[] columns, String[] values){
        ArrayList list = new ArrayList();
        
        try {
            
            PreparedStatement stmt = this.con.prepareStatement(query);
            
            for (int i = 0; i < values.length; i++)
                stmt.setString(i + 1, values[i]);
            
            
            ResultSet rs = stmt.executeQuery();
            
            
            while (rs.next()){
                Object[] row = new Object[columns.length];
                
                for (int i = 0; i < columns.length; i++){
                    row[i] = rs.getString(columns[i]);
                }
                
                list.add(row);
            }
            
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return list;
    }
    
    public ArrayList getData(String query, String[] columns){
        return this.getData(query, columns, new String[]{});
    }
    
    public Object[] insertReturnData(String query, String[] data, String[] columns){
        Object[] return_value = new Object[columns.length];
        try {
            
            PreparedStatement stmt = this.con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            for (int i = 0; i < data.length; i++){
                stmt.setObject(i + 1, data[i]);
            }
            
            int rows =  stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                for (int i = 0; i < columns.length; i++)
                    return_value[i] = rs.getString(columns[i]);
            }
            
        } catch (SQLException e){
             System.out.println("Error: " + e.getMessage());
        }
        
        return return_value;
    }
    
}
