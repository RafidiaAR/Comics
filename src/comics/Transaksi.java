/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Rafid
 */
public class Transaksi extends javax.swing.JFrame {
    String nol_jam="",nol_menit="",nol_detik="";
    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();
        
        
        String user = null;
        admin.setText(user);
        selectData();
        selectData2();
        setJam();
        setTanggal();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LabelTanggal = new javax.swing.JLabel();
        LabelJam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_komik = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_trans = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        peminjam = new javax.swing.JTextField();
        tgllahir = new com.toedter.calendar.JDateChooser();
        alamat = new javax.swing.JTextField();
        judul = new javax.swing.JTextField();
        pengarang = new javax.swing.JTextField();
        penerbit = new javax.swing.JTextField();
        tglsewa = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/comic.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 3, 140, 50);

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel8.setText("Born to Entertain You");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 40, 180, 40);

        admin.setText("User");
        jPanel1.add(admin);
        admin.setBounds(1050, 0, 60, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/admin.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1020, 0, 20, 30);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/exit.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1110, -5, 50, 40);

        jLabel13.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel13.setText("The Comic Store ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(440, 0, 250, 70);

        LabelTanggal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelTanggal.setText("Tanggal");
        jPanel1.add(LabelTanggal);
        LabelTanggal.setBounds(1010, 30, 130, 17);

        LabelJam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelJam.setText("Waktu");
        jPanel1.add(LabelJam);
        LabelJam.setBounds(1010, 50, 120, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1150, 70);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_komik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Komik", "Judul Komik", "Pengarang", "Penerbit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_komik.getTableHeader().setReorderingAllowed(false);
        tabel_komik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_komikMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_komik);
        if (tabel_komik.getColumnModel().getColumnCount() > 0) {
            tabel_komik.getColumnModel().getColumn(0).setResizable(false);
            tabel_komik.getColumnModel().getColumn(1).setResizable(false);
            tabel_komik.getColumnModel().getColumn(2).setResizable(false);
            tabel_komik.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 580, 200));

        tabel_trans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Peminjam", "Alamat", "Tanggal Lahir", "Judul Buku", "Pengarang", "Penerbit", "Tanggal Sewa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabel_trans);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 700, 180));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("List Transaction");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 730, 40));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/refresh.png"))); // NOI18N
        jLabel24.setText("Refresh Transaction");
        jPanel4.add(jLabel24);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 140, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/trash.png"))); // NOI18N
        jLabel10.setText("Delete Transaction");
        jPanel3.add(jLabel10);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 140, 30));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/print.png"))); // NOI18N
        jLabel26.setText("Print Transaction");
        jPanel6.add(jLabel26);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/print.png"))); // NOI18N
        jLabel27.setText("Print Transaction");
        jPanel7.add(jLabel27);

        jPanel6.add(jPanel7);

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 140, 30));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("List Of Available Comics");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/backk.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/print.png"))); // NOI18N
        jLabel25.setText("Print Transaction");
        jPanel5.add(jLabel25);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 140, 30));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(420, 70, 730, 620);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setText("Nama Peminjam");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 90, 140, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 160, 80, 17);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setText("Tanggal Lahir");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 240, 120, 17);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel4.setText("Judul Buku");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 320, 90, 17);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel5.setText("Pengarang");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 390, 140, 20);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel6.setText("Penerbit");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 460, 150, 30);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel7.setText("Tanggal Sewa");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 540, 93, 17);
        getContentPane().add(peminjam);
        peminjam.setBounds(90, 110, 190, 30);
        getContentPane().add(tgllahir);
        tgllahir.setBounds(90, 260, 180, 30);
        getContentPane().add(alamat);
        alamat.setBounds(90, 180, 190, 30);

        judul.setEditable(false);
        judul.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(judul);
        judul.setBounds(90, 340, 190, 30);

        pengarang.setEditable(false);
        pengarang.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pengarang);
        pengarang.setBounds(90, 410, 190, 30);

        penerbit.setEditable(false);
        penerbit.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(penerbit);
        penerbit.setBounds(90, 490, 190, 30);
        getContentPane().add(tglsewa);
        tglsewa.setBounds(90, 560, 190, 30);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 610, 90, 30);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 610, 90, 30);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/11.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 110, 40, 30);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cal.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(50, 560, 40, 30);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/22.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(50, 180, 40, 30);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/33.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(50, 260, 40, 30);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/44.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(50, 340, 40, 30);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/55.png"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(50, 410, 40, 30);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/home.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(50, 490, 40, 30);

        setSize(new java.awt.Dimension(1152, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String user1 = Login.user;
        admin.setText(user1);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void tabel_komikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_komikMouseClicked
        int baris = tabel_komik.getSelectedRow();
        if(baris != -1){
        judul.setText((String) tabel_komik.getValueAt(baris, 1));
        pengarang.setText((String) tabel_komik.getValueAt(baris, 2));
        penerbit.setText((String) tabel_komik.getValueAt(baris, 3));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabel_komikMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(tgllahir.getDate());
        String tanggal2 = dateFormat.format(tglsewa.getDate());
       
        
        if("".equals(peminjam.getText())||"".equals(alamat.getText())||"".equals(judul.getText())||"".equals(pengarang.getText())||"".equals(penerbit.getText())||tanggal.equals("")||tanggal2.equals("")) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data Terlebih Dahulu","Error", 
            JOptionPane.WARNING_MESSAGE);
        }else{ 
        String SQL = "insert into  tb_transaksi(peminjam,alamat,tgl_lahir,buku,pengarang,penerbit,tgl_sewa) "
                + "VALUES('"+peminjam.getText()+"', '"+alamat.getText()+"', '"+tanggal+"', '"+judul.getText()+"', '"+pengarang.getText()+"', '"+penerbit.getText()+"',"
                + "'"+tanggal2+"')";
        int status = KoneksiDB.execute(SQL);
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        peminjam.setText("");
        alamat.setText("");
        tgllahir.setDate(null);
        judul.setText("");
        pengarang.setText("");
        penerbit.setText("");
        tglsewa.setDate(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        int baris = tabel_trans.getSelectedRow();
        if (baris != -1){
            String kd_trans = tabel_trans.getValueAt(baris,0).toString();
            String SQL = "DELETE FROM tb_transaksi WHERE kd_transaksi='"+kd_trans+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error",JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        selectData2();        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
         MessageFormat header = new MessageFormat("List Transaction");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}       ");
        
        try {
            tabel_trans.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelJam;
    private javax.swing.JLabel LabelTanggal;
    private javax.swing.JLabel admin;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField judul;
    private javax.swing.JTextField peminjam;
    private javax.swing.JTextField penerbit;
    private javax.swing.JTextField pengarang;
    private javax.swing.JTable tabel_komik;
    private javax.swing.JTable tabel_trans;
    private com.toedter.calendar.JDateChooser tgllahir;
    private com.toedter.calendar.JDateChooser tglsewa;
    // End of variables declaration//GEN-END:variables

    private void setJam() {
        ActionListener taskPerformer = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if(nilai_jam <= 9){
                    nol_jam = "0";
                }
                if(nilai_menit <= 9){
                    nol_menit = "0";
                }
                if(nilai_detik <= 9){
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                LabelJam.setText("Jam "+jam + ":" + menit + ":" + detik );
            }
        };
        new Timer(100, taskPerformer).start();
    }

    private void setTanggal() {
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new
        java.text.SimpleDateFormat("dd/MM/yyy");
        LabelTanggal.setText(kal.format(skrg));
    }

    private void selectData() {
       String kolom[] = {"Kode Komik","Judul Komik","Pengarang","Penerbit"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT * FROM tb_comic";
       ResultSet rs = KoneksiDB.executeQuery(SQL);
       try{
           while(rs.next()){
               String kd = rs.getString(1);
               String jdl = rs.getString(2);
               String pgr = rs.getString(3);
               String pnr = rs.getString(4);
               String data [] = {kd,jdl,pgr,pnr};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
       tabel_komik.setModel(dtm);
    }

    private void selectData2() {
        String kolom[] = {"No","Peminjam","Alamat","Tanggal Lahir","Judul Buku", "Pengarang", "Penerbit","Tanggal Sewa"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT * FROM tb_transaksi";
       ResultSet rs = KoneksiDB.executeQuery(SQL);
       try{
           while(rs.next()){
               String no = rs.getString(1);
               String pj = rs.getString(2);
               String al = rs.getString(3);
               String tgl = rs.getString(4);
               String jd = rs.getString(5);
               String pg = rs.getString(6);
               String pn = rs.getString(7);
               String tgs = rs.getString(8);
               String data [] = {no,pj,al,tgl,jd,pg,pn,tgs};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
       tabel_trans.setModel(dtm);
    }
}
