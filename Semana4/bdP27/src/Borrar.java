import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Borrar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sql = "delete from departments where department_id=15";
            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Departamento Borrado");

            } else {
                System.out.println("Departamento no existe");

            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }

    }

}
