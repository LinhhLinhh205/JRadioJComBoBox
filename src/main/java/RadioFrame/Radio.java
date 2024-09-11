/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RadioFrame;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Radio extends JFrame{
    private JLabel lbso1,lbso2,lbpheptinh,lbketqua;
    private JTextField txtso1,txtso2,txtk1;
    private JRadioButton rdcong,rdtru,rdnhan,rdchia;
    private JButton btntinh;

    public Radio() {
        setTitle("RadioJrame");
        createGUI();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createGUI() {
        
    }
    
}
