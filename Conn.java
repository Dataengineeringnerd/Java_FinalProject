package finalproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
/**
 *
 * @author ughosh
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/universitydb","root","Blogger#1");
            s=c.createStatement();
            //System.out.println("Connection: "+s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}