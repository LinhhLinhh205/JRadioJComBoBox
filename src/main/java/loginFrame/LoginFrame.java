/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class LoginFrame extends JFrame {

    private JLabel lb1, lb2;
    private JTextField txtuser;
    private JPasswordField txtpass;
    private JButton btnlogin, btnreset;

    public LoginFrame(String title) {
        super(title);
        createGUI();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void createGUI() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 10, 10));
        p.add(lb1 = new JLabel("User name"));
        p.add(txtuser = new JTextField(10));
        p.add(lb2 = new JLabel("Password"));
        p.add(txtpass = new JPasswordField(10));
        p.add(btnlogin = new JButton("Login"));
        p.add(btnreset = new JButton("Reset"));
        btnlogin.setIcon(new ImageIcon(this.getClass().getResource("/login.png")));
        btnreset.setIcon(new ImageIcon(this.getClass().getResource("/reset.png")));
//        lb1.setBounds(10, 10, 100, 40);
//        txtuser.setBounds(120, 10, 150, 40);
//        
//        lb2.setBounds(10, 60, 100, 40);
//        txtpass.setBounds(120, 60, 150, 40);
//        
//        btnlogin.setBounds(20, 110, 100, 40);
//        btnreset.setBounds(150, 110, 100, 40);
        btnlogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String user=txtuser.getText();
                String pass=txtpass.getText();
                if(user.equals("linh")||pass.equals("12345"))
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Đăng nhập thất bại","Lỗi",JOptionPane.ERROR_MESSAGE);
            }
            
        });
        btnreset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtuser.setText("");
                txtpass.setText("");
                txtuser.requestFocus();
            }
        
        });
        add(p);
    }

    public static void main(String[] args) {
        LoginFrame frm = new LoginFrame("Login Frame");
        frm.setVisible(true);
    }
}
