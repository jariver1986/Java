/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
zona A                          
        Nevera de Produccion AM https://stem.ubidots.com/app/dashboards/public/widget/TYo8xTq9E8NOgoqdvbDGsdlOghDPYThqKzNwnrnGvLQ
        Estufa de Produccion AG https://stem.ubidots.com/app/dashboards/public/widget/oK9_omyKmkS9yJZRVfT1rrCqg7cJDN_g1vGtvb1P38E
        Produccion Incubadora AP https://stem.ubidots.com/app/dashboards/public/widget/XEFwU9F8I37T4Hzfhf6QpdPEOEHqd394kLk_CWPFM8U
        Ambiente A              https://stem.ubidots.com/app/dashboards/public/widget/mZajKbpFiMn0TeT4C1P8ReniXEOV_I74VOQJGtQxpJU

zona B
        Nevera Micobacterias BP https://stem.ubidots.com/app/dashboards/public/widget/X-Nr5zYg6mNWIyyG78qdvvOR99QjT4RWVO7XKlPVY74
        Estufa de Produccion BG https://stem.ubidots.com/app/dashboards/public/widget/KRAOuiRt2Cganel5pmsSQ9xwZIYgB8_Mfn4Km9A9dFU
        Ambiente B              https://stem.ubidots.com/app/dashboards/public/widget/eXAJ30KbrkBE2VpIWi5n1Hu-3u7SnTjP24rx2a8_9bw              

zona C
        Nevera Bioquimica CM https://stem.ubidots.com/app/dashboards/public/widget/rC_WJP7G3RnVOPf8yok5IRWxSH-v0vlAS-HO51vmIos
        Ambiente C           https://stem.ubidots.com/app/dashboards/public/widget/vtSmmdFJtMnuCcyfhIenF11jbb2sYZOrG71kOG97qGw

zona D 
        Frezzer -20 DM https://stem.ubidots.com/app/dashboards/public/widget/DwJgZfb7gOAh_9p8KiWGV_fmwUwIShWolvUd4A4cSRU
        Nevera DP https://stem.ubidots.com/app/dashboards/public/widget/Pl4ZoHoebqvDcoaW8SjMli-eP-HyjHsOVVUGAnBj-Og
        Ambiente D https://stem.ubidots.com/app/dashboards/public/widget/rRSckdNrmQ_dmgHOdaeuFotjOl75oG-e3zeCtC7muPE
                  

zona E Incubadora 1 Micologia E1 https://stem.ubidots.com/app/dashboards/public/widget/O0KEbiBrPn-matXKi28cs6NYDsqfApW2DBmbAiYV1vs
       Incubadora 2 Micologia E2 https://stem.ubidots.com/app/dashboards/public/widget/8-8qiL-Juz78zW75PltrVNUnKVfSuxfXzSl7pPI4pkQ
       Estufa Bacteriologia E3   https://stem.ubidots.com/app/dashboards/public/widget/HEmEtIKNnCCYyFTUJWidii-jCYK6H6WtWTibrCWjtuI
       Ambiente E                https://stem.ubidots.com/app/dashboards/public/widget/qqU5Xygj9OTaU2PsIjXF-zFA4NNkdkWkCXr1geTqcJU

zona F
        Nevera Molecular FP https://stem.ubidots.com/app/dashboards/public/widget/ng3t6gaN0NrdfUYtvL7jPBuLrEaz-bx95fxVpxdx7ys 
        Ambiente F          https://stem.ubidots.com/app/dashboards/public/widget/f9WgNsLZXJAOGG_dO3cZG7EIV6cmNKkkrh1c3Z0Jd74

 */
package url;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author HP VICTUS
 */
public class paginas extends javax.swing.JFrame {

    /**
     * Creates new form paginas
     */
    String vAM = "https://stem.ubidots.com/app/dashboards/public/widget/TYo8xTq9E8NOgoqdvbDGsdlOghDPYThqKzNwnrnGvLQ";
    String vAG = "https://stem.ubidots.com/app/dashboards/public/widget/oK9_omyKmkS9yJZRVfT1rrCqg7cJDN_g1vGtvb1P38E";            
    String vAP = "https://stem.ubidots.com/app/dashboards/public/widget/XEFwU9F8I37T4Hzfhf6QpdPEOEHqd394kLk_CWPFM8U";
    String vA   = "https://stem.ubidots.com/app/dashboards/public/widget/mZajKbpFiMn0TeT4C1P8ReniXEOV_I74VOQJGtQxpJU";
    String vBP  = "https://stem.ubidots.com/app/dashboards/public/widget/X-Nr5zYg6mNWIyyG78qdvvOR99QjT4RWVO7XKlPVY74";
    String vBG =  "https://stem.ubidots.com/app/dashboards/public/widget/KRAOuiRt2Cganel5pmsSQ9xwZIYgB8_Mfn4Km9A9dFU";
    String vB =   "https://stem.ubidots.com/app/dashboards/public/widget/eXAJ30KbrkBE2VpIWi5n1Hu-3u7SnTjP24rx2a8_9bw";
    String vCM =  "https://stem.ubidots.com/app/dashboards/public/widget/rC_WJP7G3RnVOPf8yok5IRWxSH-v0vlAS-HO51vmIos";
    String vC =   "https://stem.ubidots.com/app/dashboards/public/widget/vtSmmdFJtMnuCcyfhIenF11jbb2sYZOrG71kOG97qGw";
    String vDM = "https://stem.ubidots.com/app/dashboards/public/widget/DwJgZfb7gOAh_9p8KiWGV_fmwUwIShWolvUd4A4cSRU";
    String vDP = "https://stem.ubidots.com/app/dashboards/public/widget/Pl4ZoHoebqvDcoaW8SjMli-eP-HyjHsOVVUGAnBj-Og";
    String vD =   "https://stem.ubidots.com/app/dashboards/public/widget/rRSckdNrmQ_dmgHOdaeuFotjOl75oG-e3zeCtC7muPE";
    String vE1 = "https://stem.ubidots.com/app/dashboards/public/widget/O0KEbiBrPn-matXKi28cs6NYDsqfApW2DBmbAiYV1vs";
    String vE2 = "https://stem.ubidots.com/app/dashboards/public/widget/8-8qiL-Juz78zW75PltrVNUnKVfSuxfXzSl7pPI4pkQ";
    String vE3 = "https://stem.ubidots.com/app/dashboards/public/widget/HEmEtIKNnCCYyFTUJWidii-jCYK6H6WtWTibrCWjtuI";
    String vE =  "https://stem.ubidots.com/app/dashboards/public/widget/qqU5Xygj9OTaU2PsIjXF-zFA4NNkdkWkCXr1geTqcJU";
    String vFP = "https://stem.ubidots.com/app/dashboards/public/widget/ng3t6gaN0NrdfUYtvL7jPBuLrEaz-bx95fxVpxdx7ys";
    String vF =  "https://stem.ubidots.com/app/dashboards/public/widget/f9WgNsLZXJAOGG_dO3cZG7EIV6cmNKkkrh1c3Z0Jd74";

    //////////////////////////////////////////////////////////////
    public paginas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AG = new javax.swing.JButton();
        AM = new javax.swing.JButton();
        AP = new javax.swing.JButton();
        Ambiente_A = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BG = new javax.swing.JButton();
        BP = new javax.swing.JButton();
        Ambiente_B = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CM = new javax.swing.JButton();
        Ambiente_C = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        FP = new javax.swing.JButton();
        Ambiente_F = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        E2 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        Ambiente_E = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DP = new javax.swing.JButton();
        DM = new javax.swing.JButton();
        Ambiente_D = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AG.setText("AG");
        AG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGActionPerformed(evt);
            }
        });

        AM.setText("AM");
        AM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMActionPerformed(evt);
            }
        });

        AP.setText("AP");
        AP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APActionPerformed(evt);
            }
        });

        Ambiente_A.setText("Ambiente_A");
        Ambiente_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ambiente_AMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(AG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(Ambiente_A, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Ambiente_A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 531, 270, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BG.setText("BG");
        BG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGActionPerformed(evt);
            }
        });

        BP.setText("BP");
        BP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPActionPerformed(evt);
            }
        });

        Ambiente_B.setText("Ambiente_B");
        Ambiente_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ambiente_BMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(Ambiente_B, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ambiente_B))
                .addGap(18, 18, 18)
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 190, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CM.setText("CM");
        CM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMActionPerformed(evt);
            }
        });

        Ambiente_C.setText("Ambiente_C");
        Ambiente_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ambiente_CMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(Ambiente_C, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CM, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ambiente_C)
                    .addComponent(CM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 190, 130));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FP.setText("FP");
        FP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPActionPerformed(evt);
            }
        });

        Ambiente_F.setText("Ambiente_F");
        Ambiente_F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ambiente_FMouseClicked(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 45, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ambiente_F, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ambiente_F)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 110));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        E2.setText("E2");
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        E1.setText("E1");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        E3.setText("E3");
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        Ambiente_E.setText("Ambiente_E");
        Ambiente_E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ambiente_EMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Ambiente_E, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(139, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(E3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Ambiente_E)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 160));

        jLabel2.setText("Laboratorio Henry Parra");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 130, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 680));

        DP.setText("DP");
        DP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DPActionPerformed(evt);
            }
        });
        jPanel1.add(DP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 50, 30));

        DM.setText("DM");
        DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DMActionPerformed(evt);
            }
        });
        jPanel1.add(DM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 50, 30));

        Ambiente_D.setText("Ambiente_D");
        Ambiente_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ambiente_DMouseClicked(evt);
            }
        });
        jPanel1.add(Ambiente_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 67, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 132, 110, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGActionPerformed
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vAG));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_AGActionPerformed

    private void APActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vAP));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_APActionPerformed

    private void AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vAM));
        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_AMActionPerformed

    private void BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vBP));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BPActionPerformed

    private void BGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vBG));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BGActionPerformed

    private void CMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vCM));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CMActionPerformed

    private void DPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DPActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vDP));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_DPActionPerformed

    private void FPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vFP));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_FPActionPerformed

    private void DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DMActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vDM));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_DMActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vE1));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_E1ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vE2));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_E2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vE3));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_E3ActionPerformed

    private void Ambiente_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ambiente_AMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vA));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Ambiente_AMouseClicked

    private void Ambiente_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ambiente_BMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vB));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Ambiente_BMouseClicked

    private void Ambiente_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ambiente_CMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vC));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Ambiente_CMouseClicked

    private void Ambiente_DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ambiente_DMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vD));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Ambiente_DMouseClicked

    private void Ambiente_EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ambiente_EMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vE));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Ambiente_EMouseClicked

    private void Ambiente_FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ambiente_FMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //Desktop.getDesktop().browse(new URI(hp.getText()));
              Desktop.getDesktop().browse(new URI(vF));

        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Ambiente_FMouseClicked

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
            java.util.logging.Logger.getLogger(paginas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AG;
    private javax.swing.JButton AM;
    private javax.swing.JButton AP;
    private javax.swing.JLabel Ambiente_A;
    private javax.swing.JLabel Ambiente_B;
    private javax.swing.JLabel Ambiente_C;
    private javax.swing.JLabel Ambiente_D;
    private javax.swing.JLabel Ambiente_E;
    private javax.swing.JLabel Ambiente_F;
    private javax.swing.JButton BG;
    private javax.swing.JButton BP;
    private javax.swing.JButton CM;
    private javax.swing.JButton DM;
    private javax.swing.JButton DP;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton FP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
