/**
 * Created by msı on 13.5.2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class hastagiris extends  JFrame{
    JLabel lbl1=new JLabel("T.C. Kimlik Numarası:");
    JLabel lbl2=new JLabel("Parola:");
    JTextField txt1=new JTextField();
    JTextField txt2=new JTextField();
    ImageIcon kayıtico=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_diskette_64px_1110466_easyicon.net.png");
    ImageIcon girisico=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_lock_open_64px_1110475_easyicon.net.png");
    ImageIcon passerror=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_close_64px_1110464_easyicon.net.png");
    ImageIcon error=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_cross_64px_1110465_easyicon.net.png");
    JButton btn1=new JButton(girisico);
    JButton btn2=new JButton(kayıtico);
    DB db=new DB();
    public String TC;
    public String password;

    public String getTC(){
        return this.TC;
    }
    public void setTC(String tc){
        this.TC=tc;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }


    public hastagiris(){
        txt1.setDocument(new JTextFieldCharLimit(11));
        txt2.setDocument(new JTextFieldCharLimit(20));
        txt1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c=e.getKeyChar();
                if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| (c==KeyEvent.VK_DELETE))){
                        getToolkit().beep();//ses çıkaracak.
                        e.consume();//yazılmayacak demektir.
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        JPanel pnl1=new JPanel(new GridLayout(1,2));
        pnl1.add(lbl1);
        pnl1.add(txt1);
        JPanel pnl2=new JPanel(new GridLayout(1,2));
        pnl2.add(lbl2);
        pnl2.add(txt2);
        JPanel pnl3=new JPanel(new GridLayout(1,2));

        pnl3.add(btn1);
        pnl3.add(btn2);
        add(pnl1);
        add(pnl2);
        add(pnl3);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<hastagiris>  al=db.hastagirisdb();
                int sayac=0;
                if(!(txt1.getText().equals(""))&&!(txt2.getText().equals(""))){

                    for (hastagiris a:
                            al) {
                        if((a.getTC().equals(txt1.getText()))&&(a.getPassword().equals(txt2.getText()))){
                            kapat(a.getTC());

                        }
                        else{
                            sayac++;
                        }

                    }
                    if(sayac==al.size()){
                        JOptionPane.showMessageDialog(null,"Yanlış T.C.Kimlik No/Şifre girdiniz.Yeniden deneyiniz.","Hatalı Giriş",JOptionPane.ERROR_MESSAGE,passerror);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"T.C.Kimlik Numarası veya şifre boş geçilemez!","HATA!",JOptionPane.ERROR_MESSAGE,error);
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kapat2();
            }
        });


    }
    public static void main(String[] args){
        hastagiris hstg=new hastagiris();
        hstg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hstg.setVisible(true);
        hstg.setResizable(false);
        hstg.setLayout(new GridLayout(3,1));
        hstg.setLocationRelativeTo(null);
        hstg.setSize(300,200);
        hstg.setTitle("Hasta Giriş");
        ImageIcon icon1=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_key_64px_1110472_easyicon.net.png");
        hstg.setIconImage(icon1.getImage());
    }

    public void kapat(String s){
        this.dispose();
        hastasistem hst=new hastasistem();
        hst.gerekliler();
        hst.setRandevutckimlikno(s);
        hst.txt1.setText(s);
        hst.txt1.setEditable(false);
        hst.txt16.setText(s);
        hst.txt16.setEditable(false);
        hst.txt19.setText(s);
        hst.txt19.setEditable(false);
    }
    public void kapat2(){
        this.dispose();
        hastakayıtol ol=new hastakayıtol();
        ol.gerekenler();

    }
    public void gerekenler(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new GridLayout(3,1));
        this.setLocationRelativeTo(null);
        this.setSize(300,200);
        this.setTitle("Hasta Giriş");
        ImageIcon icon1=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_key_64px_1110472_easyicon.net.png");
        this.setIconImage(icon1.getImage());
    }

}
