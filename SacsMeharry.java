/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//FIX ME!!!!!!!!!!!!
public class SacsMeharry extends JFrame{
    SacsMeharry(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);

        try {
            j.setPage("https://sacsmeharry.org/");
            /*JFrame frame = new JFrame("Google");
            frame.add(new JScrollPane(j));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true); */
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        }

        JScrollPane scrollPane = new JScrollPane(j);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        setSize(800,800);
        setLocation(250,120);
        setVisible(true);
    }
    public static void main(String[] args){
        new SacsMeharry().setVisible(true);
    }   

   // public void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
   //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }
}