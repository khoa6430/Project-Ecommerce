
package context;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;

public class DBContext {   

     public static com.mysql.jdbc.Connection connection;
    public static synchronized com.mysql.jdbc.Connection getConnection() throws SQLException{
        if(connection !=null){
            return connection;
        }
        else{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url= "jdbc:mysql://eu-cdbr-west-01.cleardb.com/heroku_c304eb44a326e97";  
                String user = "bc20062ccd2133";
                String pass= "fd304e32";
//                String url="jdbc:mysql://localhost:3306/ecommerce_web";  
//                String user = "root";
//                String pass="";
                try {
                    connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);
                } catch (SQLException ex) {
                    Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
    
                }
          
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
     
            }
        }
        return connection;
    }
    public static synchronized void closeConnection(){
        if(connection!=null){
            try{
                connection.close();
            }catch (SQLException e){
                
            }
            finally{
                connection=null;
            }
        }
    }
    public static void main(String[] args){
        try{
            System.out.println(new DBContext().getConnection());
        }catch(Exception e){
            
        }
    }
}
 
 