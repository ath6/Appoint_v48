package nl.informatica_corlaer.ath6.appoint_v48;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

/**
 * Created by ath6 on 16-02-15.
 */
class Connect {

    Connection con = null;
    public Connect() {
        String url = "jdbc:mysql://ath6.informatica-corlaer:8080/ath6_Appoint";
        String user = "ath6"; // defaultnya adalah root
        String pass = "123456";// sesuaikan dengan konfigurasi saat install
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = (Connection) DriverManager.getConnection(url, user, pass);

            System.out.print("connecté à la base!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public Connection getCon() {
        return con;
    }
    public Connection crtst() {
        return con;
    }
}
