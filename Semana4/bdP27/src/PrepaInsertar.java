import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepaInsertar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            String depName = "Sanidad";
            Integer locId = 1800;
            Connection conn = DriverManager.getConnection(url);
            String sql = "insert into departments (department_name, location_id) values(?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, depName);
            pstmt.setInt(2, locId);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Creado Nuevo departamento. Con PreparedStatmente");

            }
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

}
