import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    public Connection connectDB() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/uc11?user=root&password=joaquim&useSSL=false&allowPublicKeyRetrieval=true"
            );
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados:\n" + erro.getMessage());
            return null; 
        }
        return conn;
    }
}
