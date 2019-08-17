import com.sun.glass.ui.InvokeLaterDispatcher;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 * Created by msı on 8.5.2016.
 */
public class hastanegiris extends JFrame{
    JLabel lbl1=new JLabel("ID:");
    JLabel lbl2=new JLabel("Şifre:");
    JTextField txt1=new JTextField();
    JTextField txt2=new JTextField();
    ImageIcon ico1=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_key_64px_1110472_easyicon.net.png");
    ImageIcon ico2=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_cancel_64px_1110461_easyicon.net.png");
    ImageIcon error=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_cross_64px_1110465_easyicon.net.png");
    ImageIcon passerror=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_close_64px_1110464_easyicon.net.png");
    JButton btn1=new JButton(ico1);
    JButton btn2=new JButton(ico2);
    public int id;
    public String password;
    DB db=new DB();



    public int getid(){
        return id;
    }
    public String getpassword(){
        return password;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setpassword(String password){
        this.password=password;
    }





    public hastanegiris(){

        txt1.setPreferredSize(new Dimension(100,50));

       // txt1.setColumns(10);
        txt2.setSize(50,50);



        //btn1.setSize(25,25);
        //JButton btn1=new JButton("Giriş Yap");

        //btn2.setSize(25,25);
        JPanel pnl1=new JPanel();
        pnl1.setLayout(new GridLayout(1,2));
        JPanel pnl2=new JPanel(new GridLayout(1,2));
        JPanel pnl3=new JPanel(new GridLayout(1,2,25,25));
        pnl1.add(lbl1);
        pnl1.add(txt1);
        pnl2.add(lbl2);
        pnl2.add(txt2);
        pnl3.add(btn1);
        pnl3.add(btn2);

        add(pnl1);
        add(pnl2);
        add(pnl3);


        txt1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                uyar();
                kontrol();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                uyar();
                kontrol();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                uyar();
                kontrol();
            }
            public void uyar(){
                if(txt1.getText().length()>3){
                    JOptionPane.showMessageDialog(null,"3 karakterden fazla giriş yapılamaz!","Hata",JOptionPane.ERROR_MESSAGE,error);
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            txt1.setText("");
                        }
                    });

                }
                if(txt1.getText()==""||txt1.getText()=="0"||txt1.getText()==" "){
                    JOptionPane.showMessageDialog(null,"0 yazılamaz veya boş geçilemez!","HATA!",JOptionPane.ERROR_MESSAGE,error);
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            txt1.setText("");
                        }
                    });
                }

            }
            public void kontrol(){
                if((txt1.getText()==""||txt1.getText().length()==0)&&(txt2.getText()==""||txt2.getText().length()==0))
                    btn1.setEnabled(false);
                else
                    btn1.setEnabled(true);
            }

        });






        txt2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                uyar2();
                kontrol2();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                uyar2();
                kontrol2();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                uyar2();
                kontrol2();
            }
            public void uyar2(){
                if(txt2.getText().length()>20){
                    JOptionPane.showMessageDialog(null,"20 karakterden fazla giriş yapılamaz!","Hata",JOptionPane.ERROR_MESSAGE,error);
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            txt2.setText("");
                        }
                    });
                }
                if(txt2.getText()==""||txt2.getText()=="0"||txt2.getText()==" "){
                    JOptionPane.showMessageDialog(null,"0 yazılamaz ve ya boş geçilemez!","HATA!",JOptionPane.ERROR_MESSAGE,error);
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            txt2.setText("");
                        }
                    });
                }

            }
            public void kontrol2(){
                if(txt2.getText()==""||txt2.getText().length()==0)
                    btn1.setEnabled(false);
                else
                    btn1.setEnabled(true);
            }

        });








        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ArrayList<hastanegiris> al=db.hastanegirisbilgisicek();
                int sayac=0;
                if(!(txt1.getText().equals(""))&&!(txt2.getText().equals(""))){
                    //int i=0;
                   /* for(int  i=0;i<al.size();i++) {
                        if ((Integer.parseInt(txt1.getText())==al.get(i).getid())&&(txt2.getText()==al.get(i).getpassword())) {
                            hastanesistem hs=new hastanesistem();
                        }
                        sayac++;



                    }*/
                    for (hastanegiris a:
                            al) {
                        if((a.getid()==Integer.parseInt(txt1.getText()))&&(a.getpassword().equals(txt2.getText()))){
                            //hastanesistem hs=new hastanesistem();
                            kapat2();
                        }
                        else{
                            sayac++;
                        }

                    }
                    if(sayac==al.size()){
                        JOptionPane.showMessageDialog(null,"Yanlış id/şifre girdiniz.Yeniden deneyiniz.","Hatalı Giriş",JOptionPane.ERROR_MESSAGE,passerror);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Kullanıcı adı ve ya şifre boş geçilemez!","HATA!",JOptionPane.ERROR_MESSAGE,error);
                }




            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kapat();
            }
        });



    }

    public void kapat(){
        this.dispose();
        Menu men=new Menu();

        men.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        men.setVisible(true);
        men.setLocationRelativeTo(null);
        men.setSize(500,500);
        men.setLayout(new GridLayout(2,1));
        men.setTitle("Hastane Randevu Sistemi");
        ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\health-care-shield-icon-150.png");
        men.setIconImage(icon.getImage());

    }
    public void kapat2(){
        this.dispose();
        hastanesistem hs=new hastanesistem();
        hs.gerekliler();
    }

    public static void main(String[] args){
        hastanegiris jf=new hastanegiris();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(new GridLayout(3,1));
        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
        jf.setTitle("Hastane Giriş");
        ImageIcon icon2=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_lock_open_64px_1110475_easyicon.net.png");
        jf.setIconImage(icon2.getImage());


    }
}
