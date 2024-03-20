/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package net_catering;


import java.awt.Color;
import java.awt.Insets;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.LookAndFeel;

/**
 *
 * @author Admin
 */
public class NET_CATERING {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
       // UIManager.setLookAndFeel( new FlatLightLaf() {} );
        UIManager.put( "Button.arc", 999 );
        UIManager.put( "Component.arc", 999 );
        UIManager.put( "ProgressBar.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );
        UIManager.put( "Component.arrowType", "chevron" );
        UIManager.put( "ScrollBar.trackArc", 999 );
        UIManager.put( "ScrollBar.thumbArc", 999 );
        UIManager.put( "ScrollBar.trackInsets", new Insets( 2, 4, 2, 4 ) );
        UIManager.put( "ScrollBar.thumbInsets", new Insets( 2, 2, 2, 2 ) );
        UIManager.put( "ScrollBar.track", new Color( 0xe0e0e0 ) );
        UIManager.put( "Button.innerFocusWidth", 1 );
        System.out.println("Hello World!");
        new login().setVisible(true);
        
    }

    private static abstract class FlatLightLaf extends LookAndFeel {

        public FlatLightLaf() {
        }
    }
    /**
     * @param args the command line arguments
     */
    public class DatabaseConnection {
   static final String JDBC_DRIVER = "org.postgresql.Driver";  
   static final String DB_URL = "jdbc:postgresql://localhost:5432/catering";

   static final String USER = "admin";
   static final String PASS = "12345678";

   public static void main(String[] args) {
      Connection conn = null;
      try {
         Class.forName(JDBC_DRIVER);

         System.out.println("Connecting to database...");
         conn = DriverManager.getConnection(DB_URL, USER, PASS);

         System.out.println("Connection established!");
      } catch (SQLException | ClassNotFoundException e) {
         System.out.println("Error connecting to the database: " + e.getMessage());
      } finally {
         try {
            if (conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            System.out.println("Error closing the connection: " + e.getMessage());
         }
      }
   }
}
    
}
