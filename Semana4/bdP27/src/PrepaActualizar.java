import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepaActualizar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            Integer locId = 1800;
            Integer depId = 7;

            Connection conn = DriverManager.getConnection(url);
            String sql = "update departments set location_id=? where department_id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, locId);
            pstmt.setInt(2, depId);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Actualizado departamento. Con PreparedStatmente");
            }
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

}
