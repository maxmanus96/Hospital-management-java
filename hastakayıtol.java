/**
 * Created by msı on 13.5.2016.
 */
import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class hastakayıtol extends  JFrame{
    JLabel lbl1=new JLabel("T.C.Kimlik Numarası:");
    JLabel lbl2=new JLabel("Ad:");
    JLabel lbl3=new JLabel("Soyad:");
    JLabel lbl4=new JLabel("Cinsiyet:");
    JLabel lbl5=new JLabel("Doğum yeri:");
    JLabel lbl6=new JLabel("Doğum Tarihi(yyyy-MM-dd):");
    JLabel lbl7=new JLabel("Baba Adı:");
    JLabel lbl8=new JLabel("Anne Adı:");
    JLabel lbl9=new JLabel("Adres:");
    JLabel lbl10=new JLabel("Telefon:");
    JLabel lbl11=new JLabel("Cep Telefonu:");
    JLabel lbl12=new JLabel("Email:");
    JLabel lbl13=new JLabel("Güvenlik Sorusu:");
    JLabel lbl14=new JLabel("G.Sorusunun Cevabı:");
    JLabel lbl15=new JLabel("Şifre:");
    JTextField txt1=new JTextField();
    JTextField txt2=new JTextField();
    JTextField txt3=new JTextField();
    JTextField txt4=new JTextField();
    JTextField txt5=new JTextField();
    JFormattedTextField txt6=new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
    JTextField txt7=new JTextField();
    JTextField txt8=new JTextField();
    JTextField txt9=new JTextField();
    JTextField txt10=new JTextField();
    JTextField txt11=new JTextField();
    JTextField txt12=new JTextField();
    JTextField txt13=new JTextField();
    JTextField txt14=new JTextField();
    JTextField txt15=new JTextField();



    JButton btn1=new JButton("Temizle");
    JButton btn2=new JButton("Kayıt Ol");
    JButton btn3=new JButton("Test");
    DB db=new DB();
    ImageIcon ima=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_checkmark_64px_1110462_easyicon.net.png");
    ImageIcon error=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_cross_64px_1110465_easyicon.net.png");
    public hastakayıtol(){
        JPanel pnl1=new JPanel(new GridLayout(1,4));
        JPanel pnl2=new JPanel(new GridLayout(1,4));
        JPanel pnl3=new JPanel(new GridLayout(1,4));
        JPanel pnl4=new JPanel(new GridLayout(1,4));
        JPanel pnl5=new JPanel(new GridLayout(1,4));
        JPanel pnl6=new JPanel(new GridLayout(1,4));
        JPanel pnl7=new JPanel(new GridLayout(1,6,10,10));
        JPanel pnl8=new JPanel(new BorderLayout());
        txt1.setDocument(new JTextFieldCharLimit(11));
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
        txt6.addKeyListener(new KeyListener() {
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
        txt2.setDocument(new JTextFieldCharLimit(50));
        txt3.setDocument(new JTextFieldCharLimit(20));
        txt4.setDocument(new JTextFieldCharLimit(10));
        txt5.setDocument(new JTextFieldCharLimit(30));
        txt7.setDocument(new JTextFieldCharLimit(30));
        txt8.setDocument(new JTextFieldCharLimit(30));
        txt9.setDocument(new JTextFieldCharLimit(50));
        txt10.setDocument(new JTextFieldCharLimit(20));
        txt11.setDocument(new JTextFieldCharLimit(20));
        txt12.setDocument(new JTextFieldCharLimit(50));
        txt13.setDocument(new JTextFieldCharLimit(75));
        txt14.setDocument(new JTextFieldCharLimit(50));
        txt15.setDocument(new JTextFieldCharLimit(20));

        MaskFormatter dateMask= null;
        try {
            dateMask = new MaskFormatter("####-##-##");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        dateMask.install(txt6);




        pnl1.add(lbl1);
        pnl1.add(txt1);
        pnl1.add(lbl2);
        pnl1.add(txt2);
        pnl2.add(lbl3);
        pnl2.add(txt3);
        pnl2.add(lbl4);
        pnl2.add(txt4);
        pnl3.add(lbl5);
        pnl3.add(txt5);
        pnl3.add(lbl6);
        pnl3.add(txt6);
        pnl4.add(lbl7);
        pnl4.add(txt7);
        pnl4.add(lbl8);
        pnl4.add(txt8);
        pnl5.add(lbl9);
        pnl5.add(txt9);
        pnl5.add(lbl10);
        pnl5.add(txt10);
        pnl6.add(lbl11);
        pnl6.add(txt11);
        pnl6.add(lbl12);
        pnl6.add(txt12);
        pnl7.add(lbl13);
        pnl7.add(txt13);
        pnl7.add(lbl14);
        pnl7.add(txt14);
        pnl7.add(lbl15);
        pnl7.add(txt15);
        btn1.setPreferredSize(new Dimension(100,10));
        btn2.setPreferredSize(new Dimension(100,10));
        btn3.setPreferredSize(new Dimension(100,10));
        pnl8.add(btn1,BorderLayout.WEST);
        pnl8.add(btn3,BorderLayout.CENTER);
        pnl8.add(btn2,BorderLayout.EAST);
        add(pnl1);
        add(pnl2);
        add(pnl3);
        add(pnl4);
        add(pnl5);
        add(pnl6);
        add(pnl7);
        add(pnl8);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temizle();
            }
        });


        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txt1.getText().equals("")&&!txt2.getText().equals("")&&!txt3.getText().equals("")&&!txt4.getText().equals("")&&!txt5.getText().equals("")&&!txt6.getText().equals("")&&!txt7.getText().equals("")&&!txt8.getText().equals("")&&!txt9.getText().equals("")&&!txt10.getText().equals("")&&!txt11.getText().equals("")&&
                        !txt12.getText().equals("")&&!txt13.getText().equals("")&&!txt14.getText().equals("")&&!txt15.getText().equals("")
                )
                {
                    if (db.HastaEkle(bu())) {
                        JOptionPane.showMessageDialog(null, "Kayıt başarılı!", "BAŞARILI", JOptionPane.INFORMATION_MESSAGE, ima);
                        temizle();
                        kapat();
                    } else {
                        JOptionPane.showMessageDialog(null, "Kayıt BAŞARISIZ", "BAŞARISIZ", JOptionPane.ERROR_MESSAGE, error);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Doldurmadığınız alan bulunmakta!","Dikkat!",JOptionPane.ERROR_MESSAGE,error);
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("14814812345");
                txt2.setText("Murat");
                txt3.setText("Ateş");
                txt4.setText("Erkek");
                txt5.setText("İstanbul");
                txt6.setText("1984-08-04");
                txt7.setText("Ahmet");
                txt8.setText("Ayşegül");
                txt9.setText("Çiçekçi cad.Destan sok.Aydınlar apt.A-68");
                txt10.setText("021223491520");
                txt11.setText("05056143215");
                txt12.setText("muratates@gmail.com");
                txt13.setText("En sevdiğiniz taşıt?");
                txt14.setText("Motorsiklet");
                txt15.setText("polis");
            }
        });

    }
    public static void main(String[] args){
        hastakayıtol kyıt=new hastakayıtol();
        kyıt.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        kyıt.setLayout(new GridLayout(8,1));
        kyıt.setVisible(true);
        kyıt.setLocationRelativeTo(null);
        kyıt.setTitle("KAYIT OL");
        kyıt.setSize(800,1000);
        kyıt.setResizable(false);
        ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_diskette_64px_1110466_easyicon.net.png");
        kyıt.setIconImage(icon.getImage());
        kyıt.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

                kyıt.kapat();

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });



    }
    public void gerekenler(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLayout(new GridLayout(8,1));
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("KAYIT OL");
        this.setSize(800,1000);
        this.setResizable(false);
        ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_diskette_64px_1110466_easyicon.net.png");
        this.setIconImage(icon.getImage());
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

                kapat();

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
    public void temizle(){
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        txt8.setText("");
        txt9.setText("");
        txt10.setText("");
        txt11.setText("");
        txt12.setText("");
        txt13.setText("");
        txt14.setText("");
    }
    public hastakayıtol bu(){
        return this;
    }
    public void kapat(){
        this.dispose();
        hastagiris h=new hastagiris();
        h.gerekenler();
    }
}
