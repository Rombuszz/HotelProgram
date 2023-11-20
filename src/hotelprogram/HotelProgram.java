/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelprogram;

import javax.swing.JOptionPane;

public class HotelProgram extends javax.swing.JFrame {

    String tipusSzoba = "";
    String szamaEjsz = "";
    String szamaAgyak = "";
    String szamaSzem = "";
    String szamaSzem2 = "";
    
    double vegOsszeg;
    double szobaTipus;
    int ejszakakSzama = 0;
    int agyakSzama = 0;
    int szemelyekSzama = 0;
    
    int ejsz;
    int agyak;
    
    int szobaPenz = 0;
    int ejszPenz = 0;
    int agyakPenz = 0;
    int szemPenz = 0;
    int szemFelnottek = 0;
    int szemGyerekek = 0;
    
    int extraWifi = 0;
    int extraSzobaszerviz = 0;
    int extraSzef = 0;
    
    public HotelProgram() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        szobaTipusok = new javax.swing.ButtonGroup();
        pnlFejlec = new javax.swing.JPanel();
        lblBooking = new javax.swing.JLabel();
        btnRegisztracio = new javax.swing.JButton();
        lblPenznem = new javax.swing.JLabel();
        btnBelepes = new javax.swing.JButton();
        pnlHatter = new javax.swing.JPanel();
        pnlSzobatipus = new javax.swing.JPanel();
        pnlSzobatipus2 = new javax.swing.JPanel();
        lblSzobatipus = new javax.swing.JLabel();
        pnlAlap = new javax.swing.JPanel();
        rdbbtnAlap = new javax.swing.JRadioButton();
        pnlFelso = new javax.swing.JPanel();
        rdbbtnFelso = new javax.swing.JRadioButton();
        pnlKozep = new javax.swing.JPanel();
        rdbbtnKozep = new javax.swing.JRadioButton();
        pnlEjszSzama = new javax.swing.JPanel();
        pnlEjszSzama2 = new javax.swing.JPanel();
        lblEjszSzama = new javax.swing.JLabel();
        spnrEjszSzama = new javax.swing.JSpinner();
        pnlAgyakSzama = new javax.swing.JPanel();
        pnlAgyakSzama2 = new javax.swing.JPanel();
        lblAgyakSzama = new javax.swing.JLabel();
        spnrAgyakSzama = new javax.swing.JSpinner();
        pnlSzemSzama = new javax.swing.JPanel();
        pnlSzemSzama2 = new javax.swing.JPanel();
        lblSzemSzama = new javax.swing.JLabel();
        cmbbxFelnottek = new javax.swing.JComboBox<>();
        cmbbxGyerekek = new javax.swing.JComboBox<>();
        pnlExtrak = new javax.swing.JPanel();
        pnlExtrak2 = new javax.swing.JPanel();
        lblExtrak = new javax.swing.JLabel();
        tgbtnWifi = new javax.swing.JToggleButton();
        tgbtnSzef = new javax.swing.JToggleButton();
        tgbtnSzobaszerviz = new javax.swing.JToggleButton();
        pnlLegalso = new javax.swing.JPanel();
        txtflOsszegzes = new javax.swing.JTextField();
        pnlOsszegzes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlVegosszeg = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtflVegosszeg = new javax.swing.JTextField();
        btnLefoglalas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking.hu - Szállásfoglalás / Buda Hotel");
        setBackground(new java.awt.Color(153, 153, 255));
        setResizable(false);

        pnlFejlec.setBackground(new java.awt.Color(92, 103, 193));
        pnlFejlec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        lblBooking.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblBooking.setForeground(new java.awt.Color(255, 255, 255));
        lblBooking.setText("Booking.hu");

        btnRegisztracio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegisztracio.setForeground(new java.awt.Color(92, 103, 193));
        btnRegisztracio.setText("Regisztráció");
        btnRegisztracio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisztracioActionPerformed(evt);
            }
        });

        lblPenznem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPenznem.setForeground(new java.awt.Color(255, 255, 255));
        lblPenznem.setText("Pénznem - HUF");

        btnBelepes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBelepes.setForeground(new java.awt.Color(92, 103, 193));
        btnBelepes.setText("Belépés");
        btnBelepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBelepesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFejlecLayout = new javax.swing.GroupLayout(pnlFejlec);
        pnlFejlec.setLayout(pnlFejlecLayout);
        pnlFejlecLayout.setHorizontalGroup(
            pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFejlecLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBooking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPenznem)
                .addGap(24, 24, 24)
                .addComponent(btnRegisztracio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBelepes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnlFejlecLayout.setVerticalGroup(
            pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFejlecLayout.createSequentialGroup()
                .addGroup(pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFejlecLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblBooking))
                    .addGroup(pnlFejlecLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFejlecLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblPenznem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBelepes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegisztracio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12))
        );

        pnlHatter.setBackground(new java.awt.Color(204, 204, 255));
        pnlHatter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        pnlSzobatipus.setBackground(new java.awt.Color(92, 103, 193));
        pnlSzobatipus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        pnlSzobatipus2.setBackground(new java.awt.Color(244, 244, 244));
        pnlSzobatipus2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        lblSzobatipus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSzobatipus.setForeground(new java.awt.Color(92, 103, 193));
        lblSzobatipus.setText("Szoba Típusa");

        javax.swing.GroupLayout pnlSzobatipus2Layout = new javax.swing.GroupLayout(pnlSzobatipus2);
        pnlSzobatipus2.setLayout(pnlSzobatipus2Layout);
        pnlSzobatipus2Layout.setHorizontalGroup(
            pnlSzobatipus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzobatipus2Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(lblSzobatipus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSzobatipus2Layout.setVerticalGroup(
            pnlSzobatipus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzobatipus2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSzobatipus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAlap.setBackground(new java.awt.Color(244, 244, 244));
        pnlAlap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        pnlAlap.setPreferredSize(new java.awt.Dimension(246, 43));

        szobaTipusok.add(rdbbtnAlap);
        rdbbtnAlap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdbbtnAlap.setText("Alapkategória - 20 m2");
        rdbbtnAlap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbbtnAlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbtnAlapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAlapLayout = new javax.swing.GroupLayout(pnlAlap);
        pnlAlap.setLayout(pnlAlapLayout);
        pnlAlapLayout.setHorizontalGroup(
            pnlAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbbtnAlap)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlAlapLayout.setVerticalGroup(
            pnlAlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbbtnAlap)
                .addContainerGap())
        );

        pnlFelso.setBackground(new java.awt.Color(244, 244, 244));
        pnlFelso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        pnlFelso.setPreferredSize(new java.awt.Dimension(246, 43));

        szobaTipusok.add(rdbbtnFelso);
        rdbbtnFelso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdbbtnFelso.setText("Felsőkategória - 38 m2");
        rdbbtnFelso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbbtnFelso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbtnFelsoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFelsoLayout = new javax.swing.GroupLayout(pnlFelso);
        pnlFelso.setLayout(pnlFelsoLayout);
        pnlFelsoLayout.setHorizontalGroup(
            pnlFelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFelsoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbbtnFelso)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlFelsoLayout.setVerticalGroup(
            pnlFelsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFelsoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbbtnFelso)
                .addContainerGap())
        );

        pnlKozep.setBackground(new java.awt.Color(244, 244, 244));
        pnlKozep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        szobaTipusok.add(rdbbtnKozep);
        rdbbtnKozep.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdbbtnKozep.setText("Középkategória - 32 m2");
        rdbbtnKozep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdbbtnKozep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbtnKozepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKozepLayout = new javax.swing.GroupLayout(pnlKozep);
        pnlKozep.setLayout(pnlKozepLayout);
        pnlKozepLayout.setHorizontalGroup(
            pnlKozepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKozepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbbtnKozep)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlKozepLayout.setVerticalGroup(
            pnlKozepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKozepLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbbtnKozep, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSzobatipusLayout = new javax.swing.GroupLayout(pnlSzobatipus);
        pnlSzobatipus.setLayout(pnlSzobatipusLayout);
        pnlSzobatipusLayout.setHorizontalGroup(
            pnlSzobatipusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzobatipusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSzobatipusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSzobatipus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSzobatipusLayout.createSequentialGroup()
                        .addComponent(pnlAlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlKozep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlFelso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlSzobatipusLayout.setVerticalGroup(
            pnlSzobatipusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzobatipusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSzobatipus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlSzobatipusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAlap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFelso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlKozep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEjszSzama.setBackground(new java.awt.Color(92, 103, 193));
        pnlEjszSzama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        pnlEjszSzama.setPreferredSize(new java.awt.Dimension(375, 52));

        pnlEjszSzama2.setBackground(new java.awt.Color(244, 244, 244));
        pnlEjszSzama2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        lblEjszSzama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEjszSzama.setForeground(new java.awt.Color(92, 103, 193));
        lblEjszSzama.setText("Éjszakák Száma");
        lblEjszSzama.setToolTipText("");

        javax.swing.GroupLayout pnlEjszSzama2Layout = new javax.swing.GroupLayout(pnlEjszSzama2);
        pnlEjszSzama2.setLayout(pnlEjszSzama2Layout);
        pnlEjszSzama2Layout.setHorizontalGroup(
            pnlEjszSzama2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEjszSzama2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEjszSzama)
                .addGap(112, 112, 112))
        );
        pnlEjszSzama2Layout.setVerticalGroup(
            pnlEjszSzama2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEjszSzama2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lblEjszSzama)
                .addContainerGap())
        );

        spnrEjszSzama.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        spnrEjszSzama.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        spnrEjszSzama.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrEjszSzamaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlEjszSzamaLayout = new javax.swing.GroupLayout(pnlEjszSzama);
        pnlEjszSzama.setLayout(pnlEjszSzamaLayout);
        pnlEjszSzamaLayout.setHorizontalGroup(
            pnlEjszSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEjszSzamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEjszSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlEjszSzama2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnrEjszSzama))
                .addContainerGap())
        );
        pnlEjszSzamaLayout.setVerticalGroup(
            pnlEjszSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEjszSzamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEjszSzama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnrEjszSzama)
                .addContainerGap())
        );

        pnlAgyakSzama.setBackground(new java.awt.Color(92, 103, 193));
        pnlAgyakSzama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        pnlAgyakSzama2.setBackground(new java.awt.Color(244, 244, 244));
        pnlAgyakSzama2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        lblAgyakSzama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAgyakSzama.setForeground(new java.awt.Color(92, 103, 193));
        lblAgyakSzama.setText("Ágyak Száma");

        javax.swing.GroupLayout pnlAgyakSzama2Layout = new javax.swing.GroupLayout(pnlAgyakSzama2);
        pnlAgyakSzama2.setLayout(pnlAgyakSzama2Layout);
        pnlAgyakSzama2Layout.setHorizontalGroup(
            pnlAgyakSzama2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgyakSzama2Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(lblAgyakSzama)
                .addGap(120, 120, 120))
        );
        pnlAgyakSzama2Layout.setVerticalGroup(
            pnlAgyakSzama2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgyakSzama2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lblAgyakSzama)
                .addContainerGap())
        );

        spnrAgyakSzama.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        spnrAgyakSzama.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        spnrAgyakSzama.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrAgyakSzamaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlAgyakSzamaLayout = new javax.swing.GroupLayout(pnlAgyakSzama);
        pnlAgyakSzama.setLayout(pnlAgyakSzamaLayout);
        pnlAgyakSzamaLayout.setHorizontalGroup(
            pnlAgyakSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgyakSzamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgyakSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spnrAgyakSzama)
                    .addComponent(pnlAgyakSzama2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAgyakSzamaLayout.setVerticalGroup(
            pnlAgyakSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgyakSzamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAgyakSzama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnrAgyakSzama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSzemSzama.setBackground(new java.awt.Color(92, 103, 193));
        pnlSzemSzama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        pnlSzemSzama.setPreferredSize(new java.awt.Dimension(375, 145));

        pnlSzemSzama2.setBackground(new java.awt.Color(244, 244, 244));
        pnlSzemSzama2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        lblSzemSzama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSzemSzama.setForeground(new java.awt.Color(92, 103, 193));
        lblSzemSzama.setText("Személyek Száma");

        javax.swing.GroupLayout pnlSzemSzama2Layout = new javax.swing.GroupLayout(pnlSzemSzama2);
        pnlSzemSzama2.setLayout(pnlSzemSzama2Layout);
        pnlSzemSzama2Layout.setHorizontalGroup(
            pnlSzemSzama2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzemSzama2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblSzemSzama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSzemSzama2Layout.setVerticalGroup(
            pnlSzemSzama2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSzemSzama2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lblSzemSzama)
                .addContainerGap())
        );

        cmbbxFelnottek.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cmbbxFelnottek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     Felnőttek", "     1 Felnőtt", "     2 Felnőtt", "     3 Felnőtt", "     4 Felnőtt" }));
        cmbbxFelnottek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxFelnottekActionPerformed(evt);
            }
        });

        cmbbxGyerekek.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cmbbxGyerekek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     Gyerekek", "     1 Gyerek", "     2 Gyerek", "     3 Gyerek", "     4 Gyerek" }));
        cmbbxGyerekek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxGyerekekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSzemSzamaLayout = new javax.swing.GroupLayout(pnlSzemSzama);
        pnlSzemSzama.setLayout(pnlSzemSzamaLayout);
        pnlSzemSzamaLayout.setHorizontalGroup(
            pnlSzemSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzemSzamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSzemSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSzemSzama2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSzemSzamaLayout.createSequentialGroup()
                        .addComponent(cmbbxFelnottek, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbbxGyerekek, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlSzemSzamaLayout.setVerticalGroup(
            pnlSzemSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzemSzamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSzemSzama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSzemSzamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbbxFelnottek)
                    .addComponent(cmbbxGyerekek))
                .addContainerGap())
        );

        pnlExtrak.setBackground(new java.awt.Color(92, 103, 193));
        pnlExtrak.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        pnlExtrak.setPreferredSize(new java.awt.Dimension(375, 145));

        pnlExtrak2.setBackground(new java.awt.Color(244, 244, 244));
        pnlExtrak2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        lblExtrak.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblExtrak.setForeground(new java.awt.Color(92, 103, 193));
        lblExtrak.setText("Extrák");

        javax.swing.GroupLayout pnlExtrak2Layout = new javax.swing.GroupLayout(pnlExtrak2);
        pnlExtrak2.setLayout(pnlExtrak2Layout);
        pnlExtrak2Layout.setHorizontalGroup(
            pnlExtrak2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExtrak2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExtrak)
                .addGap(153, 153, 153))
        );
        pnlExtrak2Layout.setVerticalGroup(
            pnlExtrak2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExtrak2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lblExtrak)
                .addContainerGap())
        );

        tgbtnWifi.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tgbtnWifi.setText("Wi-Fi");
        tgbtnWifi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tgbtnWifiStateChanged(evt);
            }
        });

        tgbtnSzef.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tgbtnSzef.setText("Széf");
        tgbtnSzef.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tgbtnSzefStateChanged(evt);
            }
        });

        tgbtnSzobaszerviz.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tgbtnSzobaszerviz.setText("Szobaszerviz");
        tgbtnSzobaszerviz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tgbtnSzobaszervizStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlExtrakLayout = new javax.swing.GroupLayout(pnlExtrak);
        pnlExtrak.setLayout(pnlExtrakLayout);
        pnlExtrakLayout.setHorizontalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlExtrak2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlExtrakLayout.createSequentialGroup()
                        .addComponent(tgbtnWifi, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tgbtnSzobaszerviz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tgbtnSzef, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlExtrakLayout.setVerticalGroup(
            pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExtrakLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlExtrak2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlExtrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgbtnWifi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtnSzef, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtnSzobaszerviz, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pnlLegalso.setBackground(new java.awt.Color(92, 103, 193));
        pnlLegalso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        txtflOsszegzes.setEditable(false);
        txtflOsszegzes.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N

        pnlOsszegzes.setBackground(new java.awt.Color(244, 244, 244));
        pnlOsszegzes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(92, 103, 193));
        jLabel6.setText("Összegzés:");

        javax.swing.GroupLayout pnlOsszegzesLayout = new javax.swing.GroupLayout(pnlOsszegzes);
        pnlOsszegzes.setLayout(pnlOsszegzesLayout);
        pnlOsszegzesLayout.setHorizontalGroup(
            pnlOsszegzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOsszegzesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(13, 13, 13))
        );
        pnlOsszegzesLayout.setVerticalGroup(
            pnlOsszegzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszegzesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnlVegosszeg.setBackground(new java.awt.Color(244, 244, 244));
        pnlVegosszeg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(92, 103, 193));
        jLabel7.setText("Végösszeg:");

        javax.swing.GroupLayout pnlVegosszegLayout = new javax.swing.GroupLayout(pnlVegosszeg);
        pnlVegosszeg.setLayout(pnlVegosszegLayout);
        pnlVegosszegLayout.setHorizontalGroup(
            pnlVegosszegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVegosszegLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlVegosszegLayout.setVerticalGroup(
            pnlVegosszegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVegosszegLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtflVegosszeg.setEditable(false);
        txtflVegosszeg.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N

        btnLefoglalas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLefoglalas.setForeground(new java.awt.Color(92, 103, 193));
        btnLefoglalas.setText("Lefoglalás");
        btnLefoglalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLefoglalasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLegalsoLayout = new javax.swing.GroupLayout(pnlLegalso);
        pnlLegalso.setLayout(pnlLegalsoLayout);
        pnlLegalsoLayout.setHorizontalGroup(
            pnlLegalsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLegalsoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLegalsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlVegosszeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOsszegzes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLegalsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtflOsszegzes)
                    .addGroup(pnlLegalsoLayout.createSequentialGroup()
                        .addComponent(txtflVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLefoglalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLegalsoLayout.setVerticalGroup(
            pnlLegalsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLegalsoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLegalsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlOsszegzes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtflOsszegzes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLegalsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlVegosszeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtflVegosszeg)
                    .addComponent(btnLefoglalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlHatterLayout = new javax.swing.GroupLayout(pnlHatter);
        pnlHatter.setLayout(pnlHatterLayout);
        pnlHatterLayout.setHorizontalGroup(
            pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlLegalso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSzobatipus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHatterLayout.createSequentialGroup()
                        .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlEjszSzama, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(pnlSzemSzama, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlAgyakSzama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlExtrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlHatterLayout.setVerticalGroup(
            pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHatterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSzobatipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlEjszSzama, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(pnlAgyakSzama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSzemSzama, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(pnlExtrak, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLegalso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pnlFejlec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFejlec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlHatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisztracioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisztracioActionPerformed
        JOptionPane.showMessageDialog(rootPane, "A regisztráció technikai okokból nem elérhető!", "Karbantartás folyamatban!", HEIGHT);
    }//GEN-LAST:event_btnRegisztracioActionPerformed

    private void btnBelepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBelepesActionPerformed
        JOptionPane.showMessageDialog(rootPane, "A belépés technikai okokból nem elérhető!", "Karbantartás folyamatban!", HEIGHT);
    }//GEN-LAST:event_btnBelepesActionPerformed

    private void btnLefoglalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLefoglalasActionPerformed
        if(szobaTipus >= 1 & ejszakakSzama >= 1 & agyakSzama >= 1 & szemFelnottek >= 1){
            JOptionPane.showMessageDialog(rootPane, "Foglalását rögzítettük!" + "\n" + "Fizetendő: " + vegOsszeg, "Rendszer", HEIGHT);
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Kérjük az egész oldalt töltse ki! Ne adjon meg hibás adatokat!", "Rendszer", HEIGHT);
    }//GEN-LAST:event_btnLefoglalasActionPerformed
}
    private void szamolasVegosszeg() {
        vegOsszeg = (szobaPenz * (ejszakakSzama * szemFelnottek)) + ((szobaPenz * (ejszakakSzama * szemGyerekek))*(.7)) + (extraWifi + extraSzobaszerviz + extraSzef);
        szemelyekSzama = szemFelnottek + szemGyerekek;
        
        txtflVegosszeg.setText(vegOsszeg + "");
        txtflOsszegzes.setText(tipusSzoba + szamaEjsz + szamaAgyak + szamaSzem + szamaSzem2);
    }
    
    private void rdbbtnAlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbbtnAlapActionPerformed
        szobaTipus = 1;
        szobaPenz = 33150;
        tipusSzoba = "Alapkategoria ";
        szamolasVegosszeg();
    }//GEN-LAST:event_rdbbtnAlapActionPerformed

    private void rdbbtnKozepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbbtnKozepActionPerformed
        szobaTipus = 1;
        szobaPenz = 46410;
        tipusSzoba = "Kozepkategoria ";
        szamolasVegosszeg();
    }//GEN-LAST:event_rdbbtnKozepActionPerformed

    private void rdbbtnFelsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbbtnFelsoActionPerformed
        szobaTipus = 1;
        szobaPenz = 64210;
        tipusSzoba = "Felsokategoria ";
        szamolasVegosszeg();
    }//GEN-LAST:event_rdbbtnFelsoActionPerformed

    private void spnrEjszSzamaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrEjszSzamaStateChanged
        ejszakakSzama = (int) spnrEjszSzama.getValue();
        szamaEjsz = ("/ " + ejszakakSzama + " Ejsz. ");
        szamolasVegosszeg();
    }//GEN-LAST:event_spnrEjszSzamaStateChanged

    private void spnrAgyakSzamaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrAgyakSzamaStateChanged
        agyakSzama = (int) spnrAgyakSzama.getValue();
        szamaAgyak = ("/ " + agyakSzama + " Agy. ");
        szamolasVegosszeg();
    }//GEN-LAST:event_spnrAgyakSzamaStateChanged

    private void cmbbxFelnottekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxFelnottekActionPerformed
        szemFelnottek = (int) cmbbxFelnottek.getSelectedIndex();
        szamaSzem = ("/ " + szemFelnottek + " Felnott. ");
        szamolasVegosszeg();
    }//GEN-LAST:event_cmbbxFelnottekActionPerformed

    private void cmbbxGyerekekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxGyerekekActionPerformed
        szemGyerekek = (int) cmbbxGyerekek.getSelectedIndex();
        szamaSzem2 = ("/ " + szemGyerekek + " Gyerek. ");
        szamolasVegosszeg();
    }//GEN-LAST:event_cmbbxGyerekekActionPerformed

    private void tgbtnWifiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tgbtnWifiStateChanged
        if(tgbtnWifi.isSelected() == true) {
            extraWifi = 3000;
        }else{
            extraWifi = 0;
        }
        szamolasVegosszeg();
    }//GEN-LAST:event_tgbtnWifiStateChanged
    
    private void tgbtnSzobaszervizStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tgbtnSzobaszervizStateChanged
        if(tgbtnSzobaszerviz.isSelected() == true) {
            extraSzobaszerviz = 8000;
        }else{
            extraSzobaszerviz = 0;
        }   
        szamolasVegosszeg();
    }//GEN-LAST:event_tgbtnSzobaszervizStateChanged

    private void tgbtnSzefStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tgbtnSzefStateChanged
        if(tgbtnSzef.isSelected() == true) {
            extraSzef = 5000;
        }else{
            extraSzef = 0;
        }   
        szamolasVegosszeg();
    }//GEN-LAST:event_tgbtnSzefStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HotelProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBelepes;
    private javax.swing.JButton btnLefoglalas;
    private javax.swing.JButton btnRegisztracio;
    private javax.swing.JComboBox<String> cmbbxFelnottek;
    private javax.swing.JComboBox<String> cmbbxGyerekek;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAgyakSzama;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblEjszSzama;
    private javax.swing.JLabel lblExtrak;
    private javax.swing.JLabel lblPenznem;
    private javax.swing.JLabel lblSzemSzama;
    private javax.swing.JLabel lblSzobatipus;
    private javax.swing.JPanel pnlAgyakSzama;
    private javax.swing.JPanel pnlAgyakSzama2;
    private javax.swing.JPanel pnlAlap;
    private javax.swing.JPanel pnlEjszSzama;
    private javax.swing.JPanel pnlEjszSzama2;
    private javax.swing.JPanel pnlExtrak;
    private javax.swing.JPanel pnlExtrak2;
    private javax.swing.JPanel pnlFejlec;
    private javax.swing.JPanel pnlFelso;
    private javax.swing.JPanel pnlHatter;
    private javax.swing.JPanel pnlKozep;
    private javax.swing.JPanel pnlLegalso;
    private javax.swing.JPanel pnlOsszegzes;
    private javax.swing.JPanel pnlSzemSzama;
    private javax.swing.JPanel pnlSzemSzama2;
    private javax.swing.JPanel pnlSzobatipus;
    private javax.swing.JPanel pnlSzobatipus2;
    private javax.swing.JPanel pnlVegosszeg;
    private javax.swing.JRadioButton rdbbtnAlap;
    private javax.swing.JRadioButton rdbbtnFelso;
    private javax.swing.JRadioButton rdbbtnKozep;
    private javax.swing.JSpinner spnrAgyakSzama;
    private javax.swing.JSpinner spnrEjszSzama;
    private javax.swing.ButtonGroup szobaTipusok;
    private javax.swing.JToggleButton tgbtnSzef;
    private javax.swing.JToggleButton tgbtnSzobaszerviz;
    private javax.swing.JToggleButton tgbtnWifi;
    private javax.swing.JTextField txtflOsszegzes;
    private javax.swing.JTextField txtflVegosszeg;
    // End of variables declaration//GEN-END:variables

    private void print(int ejszakakSzama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
