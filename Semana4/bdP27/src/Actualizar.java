import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Actualizar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sql = "update departments set location_id=1700 where department_id=5";
            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Registro Actualizado");
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }

    }
}
