import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:sqlite:C:\\db\\hr.db";
        try {
            Connection con = DriverManager.getConnection(url);
            Statement stm = con.createStatement();
            String sql = "select * from departments";
            ResultSet resultado = stm.executeQuery(sql);
            // while (resultado.next()) {
            // Integer IdDept = resultado.getInt("department_id");
            // String NombDep = resultado.getString("department_name");
            // Integer IdLoc = resultado.getInt("location_id");
            // System.out.println(IdDept + " " + NombDep + " " + IdLoc);
            // }
            resultado.next();
            System.out.println(resultado.getInt("department_id") + " " + resultado.getString("department_name") + " "
                    + resultado.getInt("location_id"));

            resultado.next();

            System.out.println(resultado.getInt("department_id") + " " + resultado.getString("department_name") + " "
                    + resultado.getInt("location_id"));

        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }

    }
}
