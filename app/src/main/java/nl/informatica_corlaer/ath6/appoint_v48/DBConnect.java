package nl.informatica_corlaer.ath6.appoint_v48;

import java.sql.*;
import java.sql.DriverManager;

import static java.sql.DriverManager.getConnection;

public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;

       public DBConnect() {
           try {
               Class.forName("com.jdbc.mysql.Driver");

               con = DriverManager.getConnection("jdbc:mysql://ath6.informatica-corlaer:8080/ath6_Appoint","ath6","123456");
               st = con.createStatement();

           }catch(Exception ex){
               System.out.println("Error: "+ex);
           }
       }

       public void getData() {
           try {

               String query = "SELECT * FROM GebruikersLogin";
               rs = st.executeQuery(query);
               System.out.println("Results from Database");
               while (rs.next()){
                    String GebruikersID = rs.getString("GebruikersID");
                    String GebruikersNaam = rs.getString("Gebruikersnaam");
                    String GebruikersWachtwoord = rs.getString("GebruikersWachtwoord");
                    System.out.println("Name: "+GebruikersNaam+"   "+"Password: "+GebruikersWachtwoord);
               }

           } catch (Exception ex) {
               System.out.println("Error: " + ex);
           }

       }


}
