import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="RIBERA";
        String password="ribera";

        try (Connection conn = DriverManager.getConnection(url,user,password);
             Statement statement = conn.createStatement()){
            String sql="CREATE TABLE PRUEBA ("+
                    "id NUMBER PRIMARY KEY, "+
                    "nombre VARCHAR2(100), "+
                    "salario NUMBER(10,2))";
            statement.executeUpdate(sql);
            System.out.println("Table empleado creada");
        }catch (SQLException e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
