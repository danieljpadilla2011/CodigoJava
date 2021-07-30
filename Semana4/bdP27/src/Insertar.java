import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sql = "insert into departments (department_name, location_id) values ('Auxiliares', 1700)";
            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Nuevo departamento creado. Se insertó " + rows + " filas");
            }
            conn.close();

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }

    }

}
