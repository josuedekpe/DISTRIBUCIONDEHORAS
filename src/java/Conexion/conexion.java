/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC-04
 */
public class conexion {
    // definición de los miembros de la clase
    public static Connection conexion =  null;
    
    public static String host = "127.0.0.1";
    public static String database = "CDHQUISPICANCHI";
    public static String url = "jdbc:mysql://" + host + "/" + database;
    public static String user = "root";
    public static String pass = "root";
    public static String Driver_MySql = "com.mysql.jdbc.Driver";
    //public static String Driver_SqlServer = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //public static String Driver_Oracle = "oracle.jdbc.driver.OracleDriver";    

    // constructor
    public conexion()
    {
        try
        {
            // cargar el driver de conexión
            Class.forName(Driver_MySql);
            // establecer la conexión
            conexion = DriverManager.getConnection(url , user, pass);
            // enviar un mensaje de confirmación
            System.out.println("Conexión establecida con éxito.");
        }
        catch (ClassNotFoundException e)
        {
            // mostrar el mensaje de error
            System.out.println("Error cargando el Driver MySql JDBC.");
        }
        catch (SQLException e)
        {
            // mostrar el mensaje de error
            System.out.println("Imposible establecer conexión con la base de datos.");
        }
    }

    public void Cerrar_Conexion()
    {
        // verificar la conexión existe
        if (conexion != null)
        {
            try
            {
                // verificar el estado de la conexión
                if (conexion.isClosed() != true)
                {
                    // cerrar la conexión
                    conexion.close();
                }
            }
            catch (SQLException e)
            {
                // mostrar el mensaje de error
                System.out.println(e.getMessage());
            }
        }
    }  
}
