/**
 * Created by msı on 13.5.2016.
 */
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;
import javax.swing.text.html.ObjectView;
import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.sql.Time;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.logging.SimpleFormatter;

public class hastasistem extends JFrame{

    DB db=new DB();
    String randevutckimlikno;
    String doktorisimsoyisim;
    String randevubolum;
    Date randevutarih;
    Time   randevuzaman;



    String tckimlikno;
    String ad;
    String soyad;
    String cinsiyet;
    String dogumyeri;
    Date dogumtarihi;
    String babaadi;
    String anneadi;
    String adres;
    String telefon;
    String ceptelefonu;
    String email;
    String guvenliksorusu;
    String guvenlikcevap;
    String password1;


    public String getTckimlikno(){
        return this.tckimlikno;
    }
    public void setTckimlikno(String s){
        this.tckimlikno=s;
    }
    public String getAd(){
        return this.ad;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getSoyad(){
        return this.soyad;
    }
    public void setSoyad(String s){
        this.soyad=s;
    }
    public String getCinsiyet(){
        return this.cinsiyet;
    }
    public void setCinsiyet(String s){
        this.cinsiyet=s;
    }
    public String getDogumyeri(){
        return this.dogumyeri;
    }
    public void setDogumyeri(String s){
        this.dogumyeri=s;
    }
    public Date getDogumtarihi(){
        return this.dogumtarihi;
    }
    public void setDogumtarihi(Date d){
        this.dogumtarihi=d;
    }
    public String getBabaadi(){
        return this.babaadi;
    }
    public void setBabaadi(String s){
        this.babaadi=s;
    }
    public String getAnneadi(){
        return this.anneadi;
    }
    public void setAnneadi(String s){
        this.anneadi=s;
    }
    public String getAdres(){
        return this.adres;
    }
    public void setAdres(String s){
        this.adres=s;
    }
    public String getTelefon(){
        return this.telefon;
    }
    public void setTelefon(String s){
        this.telefon=s;
    }
    public String getCeptelefonu(){
        return this.ceptelefonu;
    }
    public void setCeptelefonu(String s){
        this.ceptelefonu=s;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String s){
        this.email=s;
    }
    public String getGuvenliksorusu(){
        return this.guvenliksorusu;
    }
    public void setGuvenliksorusu(String s){
        this.guvenliksorusu=s;
    }
    public String getGuvenlikcevap(){
        return this.guvenlikcevap;
    }
    public void setGuvenlikcevap(String s){
        this.guvenlikcevap=s;
    }
    public String getPassword1(){
        return this.password1;
    }
    public void setPassword1(String s){
        this.password1=s;
    }





    public String getRandevutckimlikno()
    {
        return this.randevutckimlikno;
    }
    public void setRandevutckimlikno(String s){
        this.randevutckimlikno=s;
    }
    public String getDoktorisimsoyisim(){
        return this.doktorisimsoyisim;
    }
    public void setDoktorisimsoyisim(String s){
        this.doktorisimsoyisim=s;
    }
    public String getRandevubolum(){
        return this.randevubolum;
    }
    public void setRandevubolum(String s){
        this.randevubolum=s;
    }
    public Date getRandevutarih(){
        return this.randevutarih;
    }
    public void setRandevutarih(Date d){
        this.randevutarih=d;
    }
    public Time getRandevuzaman(){
        return this.randevuzaman;
    }
    public void setRandevuzaman(Time t){
        this.randevuzaman=t;
    }

    JTabbedPane za=new JTabbedPane();
    ImageIcon bilgidüzenle=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_pencil_64px_1110476_easyicon.net.png");
    ImageIcon doktorlar=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_help_64px_1110470_easyicon.net.png");
    ImageIcon randevual=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_clock_64px_1110463_easyicon.net.png");
    ImageIcon randevudüzenle=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_refresh_64px_1110479_easyicon.net.png");
    ImageIcon error=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_cross_64px_1110465_easyicon.net.png");
    ImageIcon basarili=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_checkmark_64px_1110462_easyicon.net.png");

    JPanel pnl1=new JPanel(new GridLayout(8,4));
    JPanel pnl2=new JPanel(new GridLayout(1,1));
    JPanel pnl3=new JPanel(new GridLayout(6,2));
    JPanel pnl4=new JPanel(new GridLayout(6,2));


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
    JButton btn1=new JButton("Düzenle!");
    JButton btn2=new JButton("Bilgileri çek!");




    //Randevu için tanımlamalar
    JLabel lbl16=new JLabel("Bölüm seçin:");
    JLabel lbl17=new JLabel("Doktor seçin:");
    JLabel lbl18=new JLabel("Tarih seçin(yyyy-MM-dd):");
    JLabel lbl19=new JLabel("Saat seçin(hh:mm:ss):");
    JLabel lbl20=new JLabel("T.C.Kimlik Numarası:");
    JTextField txt16=new JTextField();
    JComboBox<String> bolumlistesi=new JComboBox<String>();
    JComboBox<String> doktorlistesi=new JComboBox<String>();
    JFormattedTextField txt17=new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
    JFormattedTextField txt18=new JFormattedTextField();
    JButton btn3=new JButton("Temizle");
    JButton btn4=new JButton("Kaydet");



    //Randevu düzenleme için tanımlamalar;
    JLabel lbl21=new JLabel("T.C.Kimlik Numarası:");
    JLabel lbl22=new JLabel("Bölüm seçin:");
    JLabel lbl23=new JLabel("Doktor seçin:");
    JLabel lbl24=new JLabel("Tarih seçin(yyyy-MM-dd):");
    JLabel lbl25=new JLabel("Saat seçin(hh:mm:ss):");
    JTextField txt19=new JTextField();
    JComboBox<String> bolumlistesi1=new JComboBox<String>();
    JComboBox<String> doktorlistesi1=new JComboBox<String>();
    JFormattedTextField txt20=new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
    JFormattedTextField txt21=new JFormattedTextField();
    JButton btn5=new JButton("Düzenle");
    JButton btn6=new JButton("Sil");





    public hastasistem(){

        add(za);
        za.addTab("Bilgilerimi Düzenle",bilgidüzenle,pnl1,"Bu sekmede bilgilerinizi düzenleyebilirsiniz.");
        za.addTab("Doktorları Görüntüle",doktorlar,pnl2,"Bu sekmede mevcut doktorların listesine erişebilirsiniz.");
        za.addTab("Randevu Al",randevual,pnl3,"Bu sekmede randevu alabilirsiniz.");
        za.addTab("Randevu Düzenle/Sil",randevudüzenle,pnl4,"Bu sekmede randevularınızda değişiklik yapabilirsiniz.");

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
        txt17.addKeyListener(new KeyListener() {
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
        txt18.addKeyListener(new KeyListener() {
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
        txt20.addKeyListener(new KeyListener() {
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
        txt21.addKeyListener(new KeyListener() {
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

        MaskFormatter dateMask= null;
        try {
            dateMask = new MaskFormatter("####-##-##");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        dateMask.install(txt6);


        MaskFormatter dateMask2=null;
        try {
            dateMask2 = new MaskFormatter("####-##-##");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        dateMask2.install(txt17);

        MaskFormatter dateMask3=null;
        try{
            dateMask3 = new MaskFormatter("####-##-##");
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        dateMask3.install(txt20);

        MaskFormatter timeMask=null;
        try{
            timeMask=new MaskFormatter("##:##:##");
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        timeMask.install(txt18);

        MaskFormatter timeMask2=null;
        try{
            timeMask2=new MaskFormatter("##:##:##");
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        timeMask2.install(txt21);


        pnl1.add(lbl1);
        pnl1.add(txt1);
        pnl1.add(lbl2);
        pnl1.add(txt2);
        pnl1.add(lbl3);
        pnl1.add(txt3);
        pnl1.add(lbl4);
        pnl1.add(txt4);
        pnl1.add(lbl5);
        pnl1.add(txt5);
        pnl1.add(lbl6);
        pnl1.add(txt6);
        pnl1.add(lbl7);
        pnl1.add(txt7);
        pnl1.add(lbl8);
        pnl1.add(txt8);
        pnl1.add(lbl9);
        pnl1.add(txt9);
        pnl1.add(lbl10);
        pnl1.add(txt10);
        pnl1.add(lbl11);
        pnl1.add(txt11);
        pnl1.add(lbl12);
        pnl1.add(txt12);
        pnl1.add(lbl13);
        pnl1.add(txt13);
        pnl1.add(lbl14);
        pnl1.add(txt14);
        pnl1.add(lbl15);
        pnl1.add(txt15);
        pnl1.add(btn1);
        pnl1.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(db.hastabilgiduzenle(bu())){
                    ImageIcon ima=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_checkmark_64px_1110462_easyicon.net.png");
                    JOptionPane.showMessageDialog(null,"Duzenleme başarılı!","BAŞARILI",JOptionPane.INFORMATION_MESSAGE,ima);
                    validate();
                    repaint();
                    revalidate();
                    temizle();

                }
                else{
                    JOptionPane.showMessageDialog(null,"Duzenleme BAŞARISIZ","BAŞARISIZ",JOptionPane.ERROR_MESSAGE,error);
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txt1.getText().equals("")){
                    hastasistem hs=db.hastacek(txt1.getText());
                    ayarla(hs);
                }
                else{
                    JOptionPane.showMessageDialog(null,"T.C.Kimlik Numarası boş geçilemez!","HATA!",JOptionPane.ERROR_MESSAGE,error);
                }
            }
        });



        JScrollPane tablo=db.doktorlistesi();
        pnl2.add(tablo);

        ArrayList<String> doktorbolumler=db.doktorbolumleri();
        for (String a:
             doktorbolumler) {
            bolumlistesi.addItem(a);
        }
        bolumlistesi.validate();

        bolumlistesi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doktorlistesi.removeAllItems();
                ArrayList<ArrayList<String>> gelenler=db.doktorisimleri(bolumlistesi.getSelectedItem().toString());
                ArrayList<String> isimler=gelenler.get(0);
                ArrayList<String> soyisimler=gelenler.get(1);
                ArrayList<String> isimsoyisimler=new ArrayList<String>();
                if(isimler.size()==soyisimler.size()) {
                    for (int i = 0; i < isimler.size(); i++) {
                        isimsoyisimler.add(isimler.get(i)+ " " + soyisimler.get(i));
                    }
                }
                else
                {
                    System.out.println("Boyutlar aynı değil hata!");
                }


                for (int i=0;i<isimsoyisimler.size();i++) {
                    doktorlistesi.addItem(isimsoyisimler.get(i));
                }
                doktorlistesi.validate();

            }
        });


        txt16.setEditable(false);
        pnl3.add(lbl20);
        pnl3.add(txt16);
        pnl3.add(lbl16);
        pnl3.add(bolumlistesi);
        pnl3.add(lbl17);
        pnl3.add(doktorlistesi);
        pnl3.add(lbl18);
        pnl3.add(txt17);
        pnl3.add(lbl19);
        pnl3.add(txt18);
        pnl3.add(btn3);
        pnl3.add(btn4);


        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temizle2();
            }
        });


        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String isim=doktorlistesi.getSelectedItem().toString().split(" ")[0];
                String sure=db.surecek(isim);
                String sure1=sure.split("-")[0];
                String sure2=sure.split("-")[1];
                String saat=txt18.getText().split(":")[0];
                String dakika=txt18.getText().split(":")[1];
                String asılsaat=saat;

               /* System.out.println(Integer.parseInt(sure1));
                System.out.println(Integer.parseInt(sure2));
                System.out.println(Integer.parseInt(asılsaat));*/
                if(!txt16.getText().equals("")&&!txt17.getText().equals("")&&!txt18.getText().equals("")) {
                    if (Integer.parseInt(sure1) <= Integer.parseInt(asılsaat) && Integer.parseInt(asılsaat) <= Integer.parseInt(sure2)) {
                            if(db.randevuekle(bu())){
                                JOptionPane.showMessageDialog(null,"Ekleme başarılı!","BAŞARILI",JOptionPane.INFORMATION_MESSAGE,basarili);
                                temizle2();
                            }
                    } else {
                        JOptionPane.showMessageDialog(null, "Doktorun çalışma saatiyle uyumlu değil!", "HATA", JOptionPane.ERROR_MESSAGE, error);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Bir veya birden fazla alan boş!", "HATA", JOptionPane.ERROR_MESSAGE, error);
                }

            }
        });

        int sayac=0;

        bolumlistesi1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {
                bolumlistesi1.removeAllItems();
                doktorlistesi1.removeAllItems();
                ArrayList<String> bolumler1 = db.randevubolumler(bu());
                for (String a :
                            bolumler1) {
                        bolumlistesi1.addItem(a);


                }


                bolumlistesi1.validate();
                db.randevubilgiler(bu());
                doktorlistesi1.validate();

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        bolumlistesi1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if(bolumlistesi1.getSelectedItem()!=null) {//EXCEPTION OLMAMASI İÇİN
                    db.randevubilgiler(bu());
                    doktorlistesi1.validate();
                }


            }
        });














        pnl4.add(lbl21);
        pnl4.add(txt19);
        pnl4.add(lbl22);
        pnl4.add(bolumlistesi1);
        pnl4.add(lbl23);
        pnl4.add(doktorlistesi1);
        pnl4.add(lbl24);
        pnl4.add(txt20);
        pnl4.add(lbl25);
        pnl4.add(txt21);
        pnl4.add(btn5);
        pnl4.add(btn6);




        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String isim=doktorlistesi1.getSelectedItem().toString().split(" ")[0];
                String sure=db.surecek(isim);
                String sure1=sure.split("-")[0];
                String sure2=sure.split("-")[1];
                String saat=txt21.getText().split(":")[0];
                String dakika=txt21.getText().split(":")[1];
                String asılsaat=saat;
                if(!txt20.getText().equals("")&&!txt21.getText().equals("")&&!txt19.getText().equals("")) {
                    if(Integer.parseInt(sure1) <= Integer.parseInt(asılsaat) && Integer.parseInt(asılsaat) <= Integer.parseInt(sure2)) {
                        if (db.randevuduzenle(bu())) {
                            ImageIcon ima = new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_checkmark_64px_1110462_easyicon.net.png");
                            JOptionPane.showMessageDialog(null, "Duzenleme başarılı!", "BAŞARILI", JOptionPane.INFORMATION_MESSAGE, ima);
                            bolumlistesi1.validate();
                            doktorlistesi1.validate();
                            validate();
                            repaint();
                            revalidate();
                            temizle3();
                        } else {
                            JOptionPane.showMessageDialog(null, "Duzenleme BAŞARISIZ", "BAŞARISIZ", JOptionPane.ERROR_MESSAGE, error);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Doktorun çalışma saatiyle uyumlu değil!", "HATA", JOptionPane.ERROR_MESSAGE, error);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Bir veya birden fazla alan boş!", "HATA", JOptionPane.ERROR_MESSAGE, error);
                }
            }
        });



        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(db.randevusil(bu())){
                    ImageIcon ima = new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_checkmark_64px_1110462_easyicon.net.png");
                    JOptionPane.showMessageDialog(null, "Silme başarılı!", "BAŞARILI", JOptionPane.INFORMATION_MESSAGE, ima);

                    temizle3();

                }
                else{
                    JOptionPane.showMessageDialog(null, "Silme BAŞARISIZ", "BAŞARISIZ", JOptionPane.ERROR_MESSAGE, error);
                }
            }
        });





    }
    public static void main(String[] args){
        hastasistem hss=new hastasistem();
        hss.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        hss.setTitle("HastaSistem");
        hss.setLocationRelativeTo(null);
        hss.setSize(800,500);
        hss.setVisible(true);
        hss.setResizable(false);
        ImageIcon icon1=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_heart_64px_1110469_easyicon.net.png");
        hss.setIconImage(icon1.getImage());
        hss.setLayout(new GridLayout(1,1));
        hss.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                hss.kapat();
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
    public void gerekliler(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("HastaSistem");
        this.setLocationRelativeTo(null);
        this.setSize(800,500);
        this.setVisible(true);
        this.setResizable(false);
        ImageIcon icon1=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_heart_64px_1110469_easyicon.net.png");
        this.setIconImage(icon1.getImage());
        this.setLayout(new GridLayout(1,1));
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
    public void kapat(){
        this.dispose();
        hastagiris k=new hastagiris();
        k.gerekenler();
    }
    public void ayarla(hastasistem ar){

        //System.out.println(ar.size());
        txt1.setText(ar.getTckimlikno());
        txt1.setEditable(false);
        txt2.setText(ar.getAd());
        txt3.setText(ar.getSoyad());
        txt4.setText(ar.getCinsiyet());
        txt5.setText(ar.getDogumyeri());
        txt6.setText(ar.getDogumtarihi().toString());
        txt7.setText(ar.getBabaadi());
        txt8.setText(ar.getAnneadi());
        txt9.setText(ar.getAdres());
        txt10.setText(ar.getTelefon());
        txt11.setText(ar.getCeptelefonu());
        txt12.setText(ar.getEmail());
        txt13.setText(ar.getGuvenliksorusu());
        txt14.setText(ar.getGuvenlikcevap());
        txt15.setText(ar.getPassword1());
        txt16.setText(ar.getTckimlikno());
        txt16.setEditable(false);
        txt19.setText(ar.getTckimlikno());
        txt19.setEditable(false);




    }
    public hastasistem bu(){
        return this;
    }
    public void temizle(){
        //txt1.setText("");
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
        txt15.setText("");
        validate();
        repaint();
        revalidate();
    }
    public void temizle2(){
        //txt17.setText("");
        txt18.setText("");
        bolumlistesi.setSelectedIndex(0);
        doktorlistesi.removeAllItems();
        validate();
        repaint();
        revalidate();
    }
    public void temizle3(){
        txt20.setText("");
        txt21.setText("");
        bolumlistesi1.removeAllItems();
        doktorlistesi1.removeAllItems();
        validate();
        repaint();
        revalidate();
    }
}
