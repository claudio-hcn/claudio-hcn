package principal;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import controlador.Controlador;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.DAOUsuario;
import modelo.Usuario;
import vista.FormLogin;

public class Principal {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new HiFiLookAndFeel());
        FormLogin log = new FormLogin();
        Usuario usu = new Usuario();
        DAOUsuario dusu = new DAOUsuario();
        Controlador ctrl = new Controlador(log, usu, dusu);
        ctrl.iniciarFormLogin();
    }

}
