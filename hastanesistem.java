


import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.lang.*;

/**
 * Created by msı on 8.5.2016.
 */
//DoktorEkle,(sil,güncelle),Randevu(Görüntüle,sil,düzenle),Hasta(görüntüle)
public class hastanesistem extends JFrame {
    int doktorID;
    String doktorisim;
    String doktorsoyisim;
    String doktorbolum;
    String doktorcinsiyet;
    String doktortelefon;
    String doktorgunler;
    String doktorsure;

    public int getdoktorID(){
        return doktorID;
    }
    public void setDoktorID(int doktorID){
        this.doktorID=doktorID;
    }
    public String getDoktorisim(){
        return doktorisim;
    }
    public void setDoktorisim(String doktorisim){
        this.doktorisim=doktorisim;
    }
    public String getDoktorsoyisim(){
        return doktorsoyisim;
    }
    public void setDoktorsoyisim(String doktorsoyisim){
        this.doktorsoyisim=doktorsoyisim;
    }
    public String getDoktorbolum(){
        return doktorbolum;
    }
    public void  setDoktorbolum(String doktorbolum){
        this.doktorbolum=doktorbolum;
    }
    public String getDoktorcinsiyet(){
        return doktorcinsiyet;
    }
    public void setDoktorcinsiyet(String doktorcinsiyet){
        this.doktorcinsiyet=doktorcinsiyet;
    }
    public String getDoktortelefon(){
        return doktortelefon;
    }
    public void setDoktortelefon(String doktortelefon){
        this.doktortelefon=doktortelefon;
    }
    public String getDoktorgunler(){
        return doktorgunler;
    }
    public void setDoktorgunler(String doktorgunler){
        this.doktorgunler=doktorgunler;
    }
    public String getDoktorsure(){
        return doktorsure;
    }
    public void setDoktorsure(String doktorsure){
        this.doktorsure=doktorsure;
    }



    JTabbedPane ya=new JTabbedPane();
    ImageIcon doktorekle=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_add_64px_1110459_easyicon.net.png");
    ImageIcon doktorsil=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_close_64px_1110464_easyicon.net.png");
    ImageIcon randevugor=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_diskette_64px_1110466_easyicon.net.png");
    ImageIcon hastalar=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_heart_64px_1110469_easyicon.net.png");
    ImageIcon error=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_cross_64px_1110465_easyicon.net.png");


    JButton dktrekle=new JButton("EKLE");
    JButton dktrtemiz=new JButton("TEMİZLE");
    JButton dktrsil=new JButton("SİL");
    JButton dktrduzenle=new JButton("DÜZENLE");


    JPanel pnl1=new JPanel(new GridLayout(9,2));
    JPanel pnl2=new JPanel(new GridLayout(9,2));
    JPanel pnl3=new JPanel(new GridLayout(1,1));
    JPanel pnl4=new JPanel(new GridLayout(1,1));
    JPanel pnl5=new JPanel(new BorderLayout());
    JPanel pnl6=new JPanel(new BorderLayout());
    JPanel pnl7=new JPanel(new BorderLayout());
    JPanel pnl8=new JPanel(new BorderLayout());


//JFormatted TExtFeld olarak devam etmem lazım.
    JTextField txtdktrid=new JTextField();
    JTextField txtdktrisim=new JTextField();
    JTextField txtdktsoyisim=new JTextField();
    JTextField txtdktrbolum=new JTextField();
    JTextField txtdktrcinsiyet=new JTextField();
    JTextField txtdktrtelefon=new JTextField();
    JTextField txtdktrgunler=new JTextField();
    JTextField txtdktrsure=new JTextField();


    JTextField txtdktrid2=new JTextField();
    JTextField txtdktrisim2=new JTextField();
    JTextField txtdktsoyisim2=new JTextField();
    JTextField txtdktrbolum2=new JTextField();
    JTextField txtdktrcinsiyet2=new JTextField();
    JTextField txtdktrtelefon2=new JTextField();
    JTextField txtdktrgunler2=new JTextField();
    JTextField txtdktrsure2=new JTextField();


    JLabel lblid=new JLabel("ID:");
    JLabel lblisim=new JLabel("İsim:");
    JLabel lblsoyisim=new JLabel("Soyisim:");
    JLabel lblbolum=new JLabel("Bölüm:");
    JLabel lblcinsiyet=new JLabel("Cinsiyet:");
    JLabel lbltelefon=new JLabel("Telefon:");
    JLabel lblgunler=new JLabel("Çalışma Günleri:");
    JLabel lblsure=new JLabel("Çalışma saat aralığı:");

    JLabel lblid2=new JLabel("ID:");
    JLabel lblisim2=new JLabel("İsim:");
    JLabel lblsoyisim2=new JLabel("Soyisim:");
    JLabel lblbolum2=new JLabel("Bölüm:");
    JLabel lblcinsiyet2=new JLabel("Cinsiyet:");
    JLabel lbltelefon2=new JLabel("Telefon:");
    JLabel lblgunler2=new JLabel("Çalışma Günleri:");
    JLabel lblsure2=new JLabel("Çalışma saat aralığı:");




    JComboBox<Integer> jc=new JComboBox<Integer>();








    public hastanesistem(){



        add(ya);
        ya.addTab("Doktor Ekle",doktorekle,pnl1,"Bu sekmede doktor ekleyebilirsiniz.");
        ya.addTab("Doktor Sil/Güncelle",doktorsil,pnl2,"Bu sekmede doktor bilgilerini düzenleyip silebilirsiniz.");
        ya.addTab("Randevu ",randevugor,pnl3,"Bu sekmede mevcut olan randevuları görebilir ve düzenleyebilirsiniz.");
        ya.addTab("Hasta",hastalar,pnl4,"Bu sekmede mevcut hastaları görebilirsiniz.");

        pnl1.add(lblid);
        pnl1.add(txtdktrid);
        pnl1.add(lblisim);
        pnl1.add(txtdktrisim);
        pnl1.add(lblsoyisim);
        pnl1.add(txtdktsoyisim);
        pnl1.add(lblbolum);
        pnl1.add(txtdktrbolum);
        pnl1.add(lblcinsiyet);
        pnl1.add(txtdktrcinsiyet);
        pnl1.add(lbltelefon);
        pnl1.add(txtdktrtelefon);
        pnl1.add(lblgunler);
        pnl1.add(txtdktrgunler);
        pnl1.add(lblsure);
        pnl1.add(txtdktrsure);
        pnl5.add(dktrekle,BorderLayout.EAST);
        pnl6.add(dktrtemiz,BorderLayout.EAST);
        pnl1.add(pnl6);
        pnl1.add(pnl5);




        DB db=new DB();
        ArrayList<Integer> ar=db.doktorIDCek();
        for (Integer a:
             ar) {
            jc.addItem(a);
        }


        pnl2.add(lblid2);
        pnl2.add(jc);//JCOMBOBOX
        pnl2.add(lblisim2);
        pnl2.add(txtdktrisim2);
        pnl2.add(lblsoyisim2);
        pnl2.add(txtdktsoyisim2);
        pnl2.add(lblbolum2);
        pnl2.add(txtdktrbolum2);
        pnl2.add(lblcinsiyet2);
        pnl2.add(txtdktrcinsiyet2);
        pnl2.add(lbltelefon2);
        pnl2.add(txtdktrtelefon2);
        pnl2.add(lblgunler2);
        pnl2.add(txtdktrgunler2);
        pnl2.add(lblsure2);
        pnl2.add(txtdktrsure2);
        pnl7.add(dktrsil,BorderLayout.EAST);
        pnl8.add(dktrduzenle, BorderLayout.EAST);
        pnl2.add(pnl7);
        pnl2.add(pnl8);


        jc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //System.out.println(Integer.parseInt(jc.getSelectedItem().toString()));
                ArrayList<hastanesistem> hs;

                hs=db.doktorBul((Integer.parseInt(jc.getSelectedItem().toString())));
                txtdktrisim2.setText(hs.get(0).getDoktorisim());
                txtdktsoyisim2.setText(hs.get(0).getDoktorsoyisim());
                txtdktrbolum2.setText(hs.get(0).getDoktorbolum());
                txtdktrcinsiyet2.setText(hs.get(0).getDoktorcinsiyet());
                txtdktrtelefon2.setText(hs.get(0).getDoktortelefon());
                txtdktrgunler2.setText(hs.get(0).getDoktorgunler());
                txtdktrsure2.setText(hs.get(0).getDoktorsure());

               // System.out.println(e.getID());
            }
        });






        dktrtemiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temizle();
            }
        });



        dktrekle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon ima=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_checkmark_64px_1110462_easyicon.net.png");
                DB db=new DB();

                //hastanesistem hs=new hastanesistem();
                if(!txtdktrid.getText().equals("")&&!txtdktrisim.getText().equals("")&&!txtdktsoyisim.getText().equals("")&&!txtdktrbolum.getText().equals("")&&!txtdktrcinsiyet.getText().equals("")&&!txtdktrtelefon.getText().equals("")&&!txtdktrgunler.getText().equals("")&&!txtdktrsure.getText().equals("")) {
                    if (true==db.doktorEkle(cek())) {
                        JOptionPane.showMessageDialog(null,"Ekleme başarılı!","BAŞARILI",JOptionPane.INFORMATION_MESSAGE,ima);
                        jc.revalidate();
                        jc.validate();

                        temizle();

                    } else {
                        JOptionPane.showMessageDialog(null,"Ekleme BAŞARISIZ","BAŞARISIZ",JOptionPane.ERROR_MESSAGE,error);
                    }

                }
                else
                {
                    //JOptionPane.showMessageDialog(null,"Doldurmadığınız alan bulunmakta!","Dikkat!",JOptionPane.OK_OPTION,JOptionPane.ERROR_MESSAGE,error);
                    JOptionPane.showMessageDialog(null,"Doldurmadığınız alan bulunmakta!","Dikkat!",JOptionPane.ERROR_MESSAGE,error);
                }

            }
        });


        dktrsil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean durum=db.doktorSil(Integer.parseInt(jc.getSelectedItem().toString()));
                jc.removeItem(jc.getSelectedItem());
                jc.revalidate();
                jc.validate();
                if(durum)
                {

                    ImageIcon ima=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_checkmark_64px_1110462_easyicon.net.png");
                    JOptionPane.showMessageDialog(null,"Silme başarılı!","BAŞARILI",JOptionPane.INFORMATION_MESSAGE,ima);

                    txtdktrisim2.setText("");
                    txtdktsoyisim2.setText("");
                    txtdktrbolum2.setText("");
                    txtdktrcinsiyet2.setText("");
                    txtdktrtelefon2.setText("");
                    txtdktrgunler2.setText("");
                    txtdktrsure2.setText("");

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Silme BAŞARISIZ","BAŞARISIZ",JOptionPane.ERROR_MESSAGE,error);
                }
            }
        });

        dktrduzenle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(db.doktorDuzenle(cek())){
                    ImageIcon ima=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_checkmark_64px_1110462_easyicon.net.png");
                    JOptionPane.showMessageDialog(null,"Duzenleme başarılı!","BAŞARILI",JOptionPane.INFORMATION_MESSAGE,ima);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Duzenleme BAŞARISIZ","BAŞARISIZ",JOptionPane.ERROR_MESSAGE,error);
                }
            }
        });

        JScrollPane tablo=db.tablefromdatase();
        pnl3.add(tablo);

        JScrollPane tablo1=db.hastatablocek();
        tablo1.setPreferredSize(new Dimension(800,500));

        pnl4.add(tablo1);





    }
    public static void main(String[] args){
        hastanesistem hs=new hastanesistem();

        hs.gerekliler();

    }

    public hastanesistem cek(){
        return this;
    }
    public void temizle(){
        txtdktrid.setText("");
        txtdktrisim.setText("");
        txtdktsoyisim.setText("");
        txtdktrbolum.setText("");
        txtdktrcinsiyet.setText("");
        txtdktrtelefon.setText("");
        txtdktrgunler.setText("");
        txtdktrsure.setText("");
    }

    public void gerekliler(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("HastaneSistem");
        this.setLocationRelativeTo(null);
        this.setSize(800,500);
        this.setVisible(true);
        this.setResizable(false);
        ImageIcon icon1=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\health-care-shield-icon-150.png");
        this.setIconImage(icon1.getImage());
        this.setLayout(new GridLayout(1,1));
    }
    public String cevir(int i)
    {
        return Integer.toString(i);
    }


}
