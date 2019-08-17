import jdk.nashorn.internal.runtime.Debug;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by msı on 7.5.2016.
 */
public class Menu extends JFrame {


    Menu(){
        ImageIcon icon1=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\HM.jpg");
        JButton btn1=new JButton("Hastane Girişi");
        JButton btn2=new JButton("Hasta Girişi");
        JButton btn3=new JButton("Hazırlayanlar");
        JButton btn4=new JButton("Çıkış");
        JLabel lbl1=new JLabel(icon1);



        JPanel pnl1=new JPanel(new GridLayout(1,1));
        JPanel pnl2=new JPanel(new GridLayout(4,1));

        pnl1.add(lbl1);
        pnl2.add(btn1);
        pnl2.add(btn2);
        pnl2.add(btn3);
        pnl2.add(btn4);

        add(pnl1);
        add(pnl2);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hastanegiris hs=new hastanegiris();
                hs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                hs.setResizable(false);
                hs.setLayout(new GridLayout(3,1));
                ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\HospitalManagement\\src\\icons\\admin_lock_open_64px_1110475_easyicon.net.png");
                hs.setIconImage(icon.getImage());
                hs.setSize(300,200);
                hs.setVisible(true);
                hs.setLocationRelativeTo(null);
                hs.setTitle("Hastane Giriş");


                setVisible(false);


            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fr=new JFrame();
                fr.setLayout(new GridLayout(1,1));
                fr.setVisible(true);
                fr.setSize(400,200);
                //fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fr.setLocationRelativeTo(null);
                fr.setTitle("Hazırlayanlar");
                JTextArea txt1=new JTextArea();
                txt1.setFont(new Font("TimesNewRoman", Font.BOLD,20));
                txt1.setLineWrap(true);
                txt1.setWrapStyleWord(true);
                txt1.setText("HÜSEYİN HÜRKAN KARAMAN 1030516163 \n SEMİH CAN BOZOK 1030516177 \n ALİ FURKAN GEZER 1030516153 \n EKREM KÜRŞAD DAL 1030516296");
                txt1.setEnabled(false);
                txt1.setEditable(false);
                fr.add(txt1);
                fr.setResizable(false);


            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


    }

    public  static void main(String[] args){
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





}

