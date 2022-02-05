
package imagen;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dvn
 */
public class conectar {

    Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/galeria", "root", "ALEJANDRO");
          //  JOptionPane.showMessageDialog(null, "Conectado");
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(,"Error: "+ e);
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conect;
    }
}
