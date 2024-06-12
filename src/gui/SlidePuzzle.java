package gui;

import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author DILINI
 */
public class SlidePuzzle extends javax.swing.JFrame {

    private Timer stopWatch = null;
    private long millisec = 0;
    private long seconds = 0;
    private long minutes = 0;
    private long hours = 0;
    private Timer timer;
    private long startTime;
    private final int playType; //1 - Moves count, 2 - Time countdown, 3 - Freely
    private final String currentPlayer;
    Clip clip = null;
    int count = 0;
    int moves = 220;
    int totalMoves;
    boolean reduceMovesFlag = false;
    boolean clickFlag = false;
    static File file = new File("bestPlayer.txt");
    static int[] bestTiming = new int[4]; //[0] = milliseconds,[1] = seconds,[2] = minutes,[3] = hours
    static String bestPlayerName = null;
//static boolean state = true;

    public SlidePuzzle(String name, int i) {
        initComponents();
        setTitle("SLIDE PUZZLE");
        this.currentPlayer = name;
        this.playType = i;
        setPanelEnabled(jPanel1, false);
        setPanelEnabled(jPanel2, true);
        jPanel3.setVisible(false);
        FlatCobalt2IJTheme.setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        msec = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setFont(new java.awt.Font("STZhongsong", 1, 22)); // NOI18N
        jButton17.setText("START");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton17MousePressed(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("STZhongsong", 1, 22)); // NOI18N
        jButton19.setText("EXIT");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton19MousePressed(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel2.setText("Moves Remaining: ");

        jLabel4.setText("0");

        jLabel1.setText("Time Remaining: 00:00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        hour.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        hour.setText("00");
        hour.setPreferredSize(new java.awt.Dimension(30, 30));

        min.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        min.setText("00");
        min.setPreferredSize(new java.awt.Dimension(30, 30));

        sec.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        sec.setText("00");
        sec.setPreferredSize(new java.awt.Dimension(30, 30));

        msec.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        msec.setText("00");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel11.setText(":");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Best Timing:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("NAME");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("00 : 00 : 00 : 00");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("BestPlayer");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Player Name:");

        jLabel13.setText("Hours");

        jLabel14.setText("Minutes");

        jLabel15.setText("Seconds");

        jLabel16.setText("MilliSec");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 27, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(msec, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msec)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 0, 310, 400));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton1.setText("1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton2.setText("2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 100));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton3.setText("3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 100));

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton5.setText("5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 100, 100));

        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton6.setText("6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 100, 100));

        jButton7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton7.setText("7");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        jButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton8.setText("8");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 100));

        jButton9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton9.setText("9");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, 100));

        jButton10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton10.setText("10");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, 100));

        jButton11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton11.setText("11");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 100));

        jButton12.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton12.setText("12");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 100, 100));

        jButton13.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton13.setText("13");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 100, 100));

        jButton14.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton14.setText("14");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton14MousePressed(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 100, 100));

        jButton15.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton15.setText("15");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton15MousePressed(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 100, 100));

        jButton16.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton16MousePressed(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 100, 100));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton4.setText("4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /////////////////////// //////BEST TIMING & PLAYER WRITE ON FIEL////////////////////////////////////////////////
    public static void writeFile() {

        String newText = bestPlayerName + ":" + bestTiming[3] + ":" + bestTiming[2] + ":" + bestTiming[1] + ":" + bestTiming[0];

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file, false);
            writer.write(newText);
            writer.close();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
/////////////////////////////////////READ FILE///////////////////////////////////////////////////////////////////////////

    public static void readFile() {

        if (file.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                if (line != null) {
                    String[] record = line.split(":");
                    bestTiming[3] = Integer.parseInt(record[1]);
                    bestTiming[2] = Integer.parseInt(record[2]);
                    bestTiming[1] = Integer.parseInt(record[3]);
                    bestTiming[0] = Integer.parseInt(record[4]);
                    bestPlayerName = record[0];

                }

                reader.close();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

    }

    //////////////////////////MOVE NUMBER TO EMPTY SPOT/////////////////////////////////////////////////////////////////////
    private void emptySpotChecker(JButton btn1, JButton btn2) {

        String shuffleNumber = btn2.getText();
        if (shuffleNumber == null && moves != 0) {

            btn2.setText(btn1.getText());
            btn1.setText(null);
            if (reduceMovesFlag) {
                reduceMoves();
            } else {
                clicks();
            }
        } else if (moves == 0) {
            movesOver();

        }

    }

    ////////////////////////////MOVES OVER DISPLAY///////////////////////////////////////////////////////////////////////////
    private void movesOver() {

        setPanelEnabled(jPanel1, false);
        if (stopWatch != null) {
            stopWatch.stop();
        }

        timer.stop();
        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\sounds\\fail.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
        ImageIcon icon = new ImageIcon("src/images/sad.png");
        showCustomInfoMessage("MOVES ARE OVER!", icon);

    }

//////////////////////////////////////////////REDUCE MOVES COUNT///////////////////////////////////////////////////////////////
    private void reduceMoves() {

        moves--;
        jLabel4.setText(Integer.toString(moves));

    }

///////////////////////////////////////////////TOTAL NUMBER OF CLICKS////////////////////////////////////////////////////////////
    private void clicks() {

        totalMoves++;
        jLabel4.setText(Integer.toString(totalMoves));

    }

    //////////////////////////////////////////SOUND 01////////////////////////////////////////////////////////////////////////////
    private void sound1() {

        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\sounds\\select.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    ///////////////////////////////////////////SOUND 02////////////////////////////////////////////////////////////////////////////
    private void sound2() {

        try {

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\sounds\\jump.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    //////////////////////////////////////////SUFFLE THE NUMBERS////////////////////////////////////////////////////////////////////
    private void shuffle() {

        ArrayList<String> number = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            number.add(Integer.toString(i));
        }
        number.add(null);

        Collections.shuffle(number);
        if (isSolvable(number)) {
            jButton1.setText(number.get(0));
            jButton2.setText(number.get(1));
            jButton3.setText(number.get(2));
            jButton4.setText(number.get(3));
            jButton5.setText(number.get(4));
            jButton6.setText(number.get(5));
            jButton7.setText(number.get(6));
            jButton8.setText(number.get(7));
            jButton9.setText(number.get(8));
            jButton10.setText(number.get(9));
            jButton11.setText(number.get(10));
            jButton12.setText(number.get(11));
            jButton13.setText(number.get(12));
            jButton14.setText(number.get(13));
            jButton15.setText(number.get(14));
            jButton16.setText(number.get(15));
        } else {

            shuffle();
        }
    }

    /////////////////////////////////////////CHECK WHETHER THE SLOVABLE OR NOT///////////////////////////////////////////////////////
    private boolean isSolvable(ArrayList<String> n) {

        int[] values = new int[n.size()];

        for (int i = 0; i < n.size(); i++) {

            if (n.get(i) == null) {

                values[i] = 0;

            } else {
                values[i] = Integer.parseInt(n.get(i));

            }

        }

        int inversionCount = countInversions(values);
        int blankPosition = findBlankPosition(values);

        return (inversionCount % 2 == 0 && (blankPosition % 2 == 1))
                || (inversionCount % 2 == 1 && (blankPosition % 2 == 0));

    }

    public int countInversions(int[] puzzle) {
        int inversions = 0;
        for (int i = 0; i < puzzle.length - 1; i++) {
            for (int j = i + 1; j < puzzle.length; j++) {
                if (puzzle[i] > puzzle[j] && puzzle[j] != 0) {
                    inversions++;
                }
            }
        }
        return inversions;
    }

    public int findBlankPosition(int[] puzzle) {
        for (int i = 0; i < puzzle.length; i++) {
            if (puzzle[i] == 0) {
                return 4 - (i / 4);
            }
        }
        return -1;
    }

    /////////////////////////////////////////////TIMER//////////////////////////////////////////////////////////////////////////////
    public void timer() {

        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(1, (ActionEvent e) -> {
            long elapsedTime = System.currentTimeMillis() - startTime;
            hours = elapsedTime / 3600000;
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            millisec = elapsedTime % 1000;

            msec.setText(Long.toString(millisec));
            sec.setText(Long.toString(seconds));
            min.setText(Long.toString(minutes));
            hour.setText(Long.toString(hours));
        });
        startTime = System.currentTimeMillis();
        timer.start();
    }

    ////////////////////////////////////////////STOP WATCH/////////////////////////////////////////////////////////////////////////
    private void stopWatch() {

        if (stopWatch != null && stopWatch.isRunning()) {
            stopWatch.stop();
        }

        int totalSeconds = 3 * 60 + 00;

        stopWatch = new Timer(1000, new ActionListener() {
            int count = totalSeconds;

            @Override
            public void actionPerformed(ActionEvent e) {

                count--;

                if (count >= 0) {
                    int remainningMinutes = count / 60;
                    int remainningSeconds = count % 60;
                    jLabel1.setText(String.format("Time Remaining : %02d : %02d", remainningMinutes, remainningSeconds));
                } else {
                    stopWatch.stop();
                    timer.stop();
                    setPanelEnabled(jPanel1, false);
                    try {

                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\sounds\\fail.wav").getAbsoluteFile());
                        clip = AudioSystem.getClip();
                        clip.open(audioInputStream);
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                        ex.printStackTrace();
                    }
                    if (clip != null) {
                        clip.setFramePosition(0);
                        clip.start();
                    }
                    ImageIcon icon = new ImageIcon("src/images/sad.png");
                    showCustomInfoMessage("TIME'S UP!", icon);

                }

            }
        });

        stopWatch.start();

    }

    public static void setPanelEnabled(JPanel panel, boolean isEnabled) {
        panel.setEnabled(isEnabled);
        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JPanel jPanel) {
                setPanelEnabled(jPanel, isEnabled);
            } else {
                component.setEnabled(isEnabled);
            }
        }
    }

    //////////////////////////////////////////METHOD TO CHECK WINING STATE/////////////////////////////////////////////////////////
    public void solutionChecker() {

        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        String b10 = jButton10.getText();
        String b11 = jButton11.getText();
        String b12 = jButton12.getText();
        String b13 = jButton13.getText();
        String b14 = jButton14.getText();
        String b15 = jButton15.getText();

        if ("1".equals(b1) && "2".equals(b2) && "3".equals(b3) && "4".equals(b4) && "5".equals(b5) && "6".equals(b6)
                && "7".equals(b7) && "8".equals(b8) && "9".equals(b9) && "10".equals(b10) && "11".equals(b11) && "12".equals(b12)
                && "13".equals(b13) && "14".equals(b14) && "15".equals(b15)) {

            setPanelEnabled(jPanel1, false);
            if (stopWatch != null) {
                stopWatch.stop();
            }
            //state = false;
            timer.stop();

            int ms = Integer.parseInt(msec.getText());
            int s = Integer.parseInt(sec.getText());
            int m = Integer.parseInt(min.getText());
            int h = Integer.parseInt(hour.getText());

            if (bestTiming[0] == 0 && bestTiming[1] == 0 && bestTiming[2] == 0 && bestTiming[3] == 0 && bestPlayerName == null) {
                bestTiming[0] = ms;
                bestTiming[1] = s;
                bestTiming[2] = m;
                bestTiming[3] = h;
                bestPlayerName = currentPlayer;
                writeFile();

            } else if (bestTiming[0] > ms || bestTiming[1] > s || bestTiming[2] > m || bestTiming[3] > h) {

                bestTiming[0] = ms;
                bestTiming[1] = s;
                bestTiming[2] = m;
                bestTiming[3] = h;
                bestPlayerName = currentPlayer;
                writeFile();

            }

            try {

                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\sounds\\joy.wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                e.printStackTrace();
            }
            if (clip != null) {
                clip.setFramePosition(0);
                clip.start();
            }

            ImageIcon icon = new ImageIcon("src/images/congratz.png");
            showCustomInfoMessage("CONGRATULATIONS!", icon);

        }

    }

    ////////////////////////////////////////////////CUSTOME INFORMATION MESSAGE DIALOG//////////////////////////////////////////////
    public void showCustomInfoMessage(String message, ImageIcon icon) {

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        JLabel messageLabel = new JLabel(message);
        Font font = new Font(messageLabel.getFont().getName(), Font.BOLD, 24);
        messageLabel.setFont(font);
        JLabel messageLabel2 = new JLabel("Total Play Time: " + Long.toString(hours) + ": " + Long.toString(minutes) + ": "
                + Long.toString(seconds) + ": " + Long.toString(millisec));
        Font font2 = new Font(messageLabel2.getFont().getName(), Font.PLAIN, 20);
        messageLabel2.setFont(font2);
        panel1.add(messageLabel, BorderLayout.CENTER);
        panel1.add(messageLabel2, BorderLayout.AFTER_LAST_LINE);

        if (icon != null) {

            JLabel iconLabel = new JLabel();

            panel1.add(iconLabel, BorderLayout.LINE_START);

            JOptionPane window = new JOptionPane();
            window.showMessageDialog(null, panel1, "Slide Puzzle", JOptionPane.INFORMATION_MESSAGE, icon);

            if (window.OK_OPTION == JOptionPane.OK_OPTION) {

                this.dispose();
                Welcome wc = new Welcome();
                wc.setVisible(true);

            }

        } else {
            System.err.println("Failed to load the image.");
        }
    }


    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        shuffle();
        readFile();
        setPanelEnabled(jPanel1, true);
        jLabel6.setText(currentPlayer);
        jLabel8.setText(bestPlayerName);
        jLabel7.setText(bestTiming[3] + ":" + bestTiming[2] + ":" + bestTiming[1] + ":" + bestTiming[0]);
          totalMoves = 0;
        switch (playType) {
            case 1 -> {
                jPanel3.setVisible(true);
                jLabel4.setText("220");
                reduceMovesFlag = true;
                jLabel1.setText("");
                jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel2.setFont(new Font("Helvetica", Font.BOLD, 18));
                jLabel2.setForeground(Color.RED);
                jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel4.setFont(new Font("Helvetica", Font.BOLD, 20));
                jLabel4.setForeground(Color.RED);
            }
            case 2 -> {
                jPanel3.setVisible(true);
                clickFlag = true;
                jLabel1.setText("Time Remaining: 00:00");
                jLabel4.setText("");
                jLabel2.setText(" Total Movements : ");
                jLabel2.setHorizontalAlignment(SwingConstants.LEFT);
                jLabel2.setFont(new Font("Helvetica", Font.BOLD, 16));
                jLabel2.setForeground(Color.WHITE);
                jLabel4.setHorizontalAlignment(SwingConstants.LEFT);
                jLabel4.setFont(new Font("Helvetica", Font.BOLD, 16));
                jLabel4.setForeground(Color.WHITE);
                jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
                jLabel1.setFont(new Font("Helvetica", Font.BOLD, 20));
                jLabel1.setForeground(Color.RED);
                stopWatch();
            }
            default -> {
                jPanel3.setVisible(true);
                clickFlag = true;
                jLabel1.setText("");
                jLabel4.setText("");
                jLabel2.setText(" Total Movements : ");
                jLabel2.setHorizontalAlignment(SwingConstants.LEFT);
                jLabel2.setFont(new Font("Helvetica", Font.BOLD, 16));
                jLabel2.setForeground(Color.WHITE);
                jLabel4.setHorizontalAlignment(SwingConstants.LEFT);
                jLabel4.setFont(new Font("Helvetica", Font.BOLD, 16));
                jLabel4.setForeground(Color.WHITE);
            }
        }

        hours = 0;
        minutes = 0;
        seconds = 0;
        millisec = 0;
        moves = 220;
        timer();
        jButton17.setText("RESTART");
      

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        emptySpotChecker(jButton1, jButton2);
        emptySpotChecker(jButton1, jButton8);
        solutionChecker();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        emptySpotChecker(jButton2, jButton3);
        emptySpotChecker(jButton2, jButton1);
        emptySpotChecker(jButton2, jButton7);
        solutionChecker();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        emptySpotChecker(jButton3, jButton2);
        emptySpotChecker(jButton3, jButton4);
        emptySpotChecker(jButton3, jButton6);
        solutionChecker();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        emptySpotChecker(jButton4, jButton3);
        emptySpotChecker(jButton4, jButton5);
        solutionChecker();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        emptySpotChecker(jButton8, jButton9);
        emptySpotChecker(jButton8, jButton1);
        emptySpotChecker(jButton8, jButton7);
        solutionChecker();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        emptySpotChecker(jButton7, jButton2);
        emptySpotChecker(jButton7, jButton6);
        emptySpotChecker(jButton7, jButton8);
        emptySpotChecker(jButton7, jButton10);
        solutionChecker();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        emptySpotChecker(jButton6, jButton3);
        emptySpotChecker(jButton6, jButton5);
        emptySpotChecker(jButton6, jButton7);
        emptySpotChecker(jButton6, jButton11);
        solutionChecker();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        emptySpotChecker(jButton5, jButton4);
        emptySpotChecker(jButton5, jButton6);
        emptySpotChecker(jButton5, jButton12);
        solutionChecker();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        emptySpotChecker(jButton9, jButton8);
        emptySpotChecker(jButton9, jButton16);
        emptySpotChecker(jButton9, jButton10);
        solutionChecker();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        emptySpotChecker(jButton10, jButton9);
        emptySpotChecker(jButton10, jButton7);
        emptySpotChecker(jButton10, jButton11);
        emptySpotChecker(jButton10, jButton15);
        solutionChecker();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        emptySpotChecker(jButton11, jButton10);
        emptySpotChecker(jButton11, jButton14);
        emptySpotChecker(jButton11, jButton6);
        emptySpotChecker(jButton11, jButton12);
        solutionChecker();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        emptySpotChecker(jButton12, jButton5);
        emptySpotChecker(jButton12, jButton11);
        emptySpotChecker(jButton12, jButton13);
        solutionChecker();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        emptySpotChecker(jButton13, jButton12);
        emptySpotChecker(jButton13, jButton14);
        solutionChecker();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        emptySpotChecker(jButton14, jButton13);
        emptySpotChecker(jButton14, jButton15);
        emptySpotChecker(jButton14, jButton11);
        solutionChecker();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        emptySpotChecker(jButton15, jButton16);
        emptySpotChecker(jButton15, jButton14);
        emptySpotChecker(jButton15, jButton10);
        solutionChecker();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked

    }//GEN-LAST:event_jButton17MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        emptySpotChecker(jButton16, jButton15);
        emptySpotChecker(jButton16, jButton9);
        solutionChecker();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        Welcome wc = new Welcome();
        wc.setVisible(true);
        this.dispose();    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MousePressed
        sound1();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton17MousePressed

    private void jButton19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MousePressed
        sound1();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton19MousePressed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton12MousePressed

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton13MousePressed

    private void jButton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton14MousePressed

    private void jButton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton15MousePressed

    private void jButton16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MousePressed
        sound2();
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }//GEN-LAST:event_jButton16MousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//
//        FlatCobalt2IJTheme.setup();
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SlidePuzzle("Dilini", 3).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel min;
    private javax.swing.JLabel msec;
    private javax.swing.JLabel sec;
    // End of variables declaration//GEN-END:variables
}
