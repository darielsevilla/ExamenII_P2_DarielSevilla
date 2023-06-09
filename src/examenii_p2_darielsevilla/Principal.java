/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenii_p2_darielsevilla;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author HP
 */
public class Principal extends javax.swing.JFrame {

    private ArrayList<Deporte> deportes = new ArrayList();
    private DefaultMutableTreeNode actual;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        fillTree();
        actualizarComboBox();
    }

    public void fillTree() {
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Torneos");
        DefaultTreeModel modelo = (DefaultTreeModel) jt_arbol.getModel();
        modelo.setRoot(raiz);
        for (int i = 1; i <= 5; i++) {
            if (i != 3) {
                String x = "Q" + Integer.toString(i);
                raiz.add(new DefaultMutableTreeNode(x));
            }

        }

        for (int i = 0; i < raiz.getChildCount(); i++) {
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) raiz.getChildAt(i);
            String nombre = (String) nodo.getUserObject();

            for (Deporte deporte : deportes) {
                DefaultMutableTreeNode sport = new DefaultMutableTreeNode(deporte);

                nodo.add(sport);
                for (Torneo t : deporte.getTorneos()) {
                    if (t.getPeriodo().equals((String) nodo.getUserObject())) {
                        sport.add(new DefaultMutableTreeNode(t));
                    }
                }
            }
        }
        modelo.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jt_arbol1 = new javax.swing.JTree();
        pop_menu = new javax.swing.JPopupMenu();
        mi_crearDeporte = new javax.swing.JMenuItem();
        pop_crearTorneo = new javax.swing.JPopupMenu();
        crearTorneo = new javax.swing.JMenuItem();
        pop_torneos = new javax.swing.JPopupMenu();
        mi_crearEquipo = new javax.swing.JMenuItem();
        mi_crearPartido = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        mi_listarParticipantes = new javax.swing.JMenuItem();
        mi_tablaPosiciones = new javax.swing.JMenuItem();
        jd_crearPartido = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        cb_equipo2 = new javax.swing.JComboBox<>();
        cb_equipo1 = new javax.swing.JComboBox<>();
        sp_punt2 = new javax.swing.JSpinner();
        sp_punt1 = new javax.swing.JSpinner();
        cb_equipo3 = new javax.swing.JComboBox<>();
        bt_newPartido = new javax.swing.JButton();
        jd_crearEquipo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_teamName = new javax.swing.JTextField();
        bt_crearEquipo = new javax.swing.JButton();
        jd_listarEquipo = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_teams = new javax.swing.JList<>();
        bt_partidas = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_gamesPlayed = new javax.swing.JTable();
        jd_tabla = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_arbol = new javax.swing.JTree();
        cb_principal = new javax.swing.JComboBox<>();
        bt_save = new javax.swing.JButton();
        bt_load = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();

        jScrollPane2.setViewportView(jt_arbol1);

        mi_crearDeporte.setText("Crear Deporte");
        mi_crearDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearDeporteActionPerformed(evt);
            }
        });
        pop_menu.add(mi_crearDeporte);

        crearTorneo.setText("Crear Torneo");
        crearTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTorneoActionPerformed(evt);
            }
        });
        pop_crearTorneo.add(crearTorneo);

        mi_crearEquipo.setText("Crear Equipo");
        mi_crearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearEquipoActionPerformed(evt);
            }
        });
        pop_torneos.add(mi_crearEquipo);

        mi_crearPartido.setText("Crear Partido");
        mi_crearPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearPartidoActionPerformed(evt);
            }
        });
        pop_torneos.add(mi_crearPartido);
        pop_torneos.add(separador1);

        mi_listarParticipantes.setText("Listar participantes");
        mi_listarParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_listarParticipantesActionPerformed(evt);
            }
        });
        pop_torneos.add(mi_listarParticipantes);

        mi_tablaPosiciones.setText("Tabla de Posiciones");
        mi_tablaPosiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_tablaPosicionesActionPerformed(evt);
            }
        });
        pop_torneos.add(mi_tablaPosiciones);

        jd_crearPartido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_equipo2.setBackground(new java.awt.Color(255, 255, 255));
        cb_equipo2.setForeground(new java.awt.Color(0, 0, 0));
        cb_equipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_equipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 100, -1));

        cb_equipo1.setBackground(new java.awt.Color(255, 255, 255));
        cb_equipo1.setForeground(new java.awt.Color(0, 0, 0));
        cb_equipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_equipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, -1));

        sp_punt2.setModel(new javax.swing.SpinnerNumberModel());
        jPanel3.add(sp_punt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        sp_punt1.setModel(new javax.swing.SpinnerNumberModel());
        jPanel3.add(sp_punt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cb_equipo3.setBackground(new java.awt.Color(255, 255, 255));
        cb_equipo3.setForeground(new java.awt.Color(0, 0, 0));
        cb_equipo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cb_equipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 100, -1));

        bt_newPartido.setBackground(new java.awt.Color(51, 255, 0));
        bt_newPartido.setForeground(new java.awt.Color(0, 0, 0));
        bt_newPartido.setText("Nuevo partido");
        bt_newPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_newPartidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_newPartidoMouseEntered(evt);
            }
        });
        bt_newPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_newPartidoActionPerformed(evt);
            }
        });
        jPanel3.add(bt_newPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jd_crearPartido.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 120));

        jd_crearEquipo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jd_crearEquipo.setBackground(new java.awt.Color(255, 51, 51));
        jd_crearEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jd_crearEquipoMouseClicked(evt);
            }
        });
        jd_crearEquipo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Crear equipo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, -1, -1));

        tf_teamName.setBackground(new java.awt.Color(255, 255, 255));
        tf_teamName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tf_teamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 34, 157, -1));

        bt_crearEquipo.setBackground(new java.awt.Color(0, 204, 0));
        bt_crearEquipo.setForeground(new java.awt.Color(0, 0, 0));
        bt_crearEquipo.setText("crear");
        bt_crearEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearEquipoMouseClicked(evt);
            }
        });
        jPanel2.add(bt_crearEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jd_crearEquipo.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 90));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Listado Equipos");

        jl_teams.setBackground(new java.awt.Color(255, 255, 255));
        jl_teams.setForeground(new java.awt.Color(0, 0, 0));
        jl_teams.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_teams);

        bt_partidas.setBackground(new java.awt.Color(51, 204, 0));
        bt_partidas.setForeground(new java.awt.Color(0, 0, 0));
        bt_partidas.setText("Partidos jugados");
        bt_partidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_partidasMouseClicked(evt);
            }
        });

        tb_gamesPlayed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Partidas"
            }
        ));
        jScrollPane5.setViewportView(tb_gamesPlayed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(bt_partidas))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_partidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jd_listarEquipoLayout = new javax.swing.GroupLayout(jd_listarEquipo.getContentPane());
        jd_listarEquipo.getContentPane().setLayout(jd_listarEquipoLayout);
        jd_listarEquipoLayout.setHorizontalGroup(
            jd_listarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_listarEquipoLayout.setVerticalGroup(
            jd_listarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_tabla.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Equipo", "valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tb_tabla);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 350));

        jd_tabla.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 410));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Examen 2");

        jt_arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_arbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_arbol);

        cb_principal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bt_save.setText("Guardar");
        bt_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_saveMouseClicked(evt);
            }
        });

        bt_load.setText("Cargar");
        bt_load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(cb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt_load)
                                            .addComponent(bt_save))
                                        .addGap(69, 69, 69)))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(cb_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(bt_load, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_arbolMouseClicked
        jt_arbol.setSelectionRow(jt_arbol.getClosestRowForLocation(evt.getX(), evt.getY()));
        if (SwingUtilities.isRightMouseButton(evt)) {
            actual = (DefaultMutableTreeNode) jt_arbol.getSelectionPath().getLastPathComponent();
            if (actual.getUserObject() instanceof Deporte) {
                pop_crearTorneo.show(jt_arbol, evt.getX(), evt.getY());
            } else if (actual.getUserObject() instanceof String) {
                pop_menu.show(jt_arbol, evt.getX(), evt.getY());
            } else {
                pop_torneos.show(jt_arbol, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_arbolMouseClicked

    public void crearDeporte() {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de deporte");

        deportes.add(new Deporte(nombre));
        actualizarComboBox();
        fillTree();
    }
    private void mi_crearDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearDeporteActionPerformed
        crearDeporte();
    }//GEN-LAST:event_mi_crearDeporteActionPerformed

    private void crearTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTorneoActionPerformed
        createTorneo();
    }//GEN-LAST:event_crearTorneoActionPerformed

    private void mi_crearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearEquipoActionPerformed
        tf_teamName.setText("");
        jd_crearEquipo.pack();
        jd_crearEquipo.setLocationRelativeTo(this);
        jd_crearEquipo.setVisible(true);
    }//GEN-LAST:event_mi_crearEquipoActionPerformed

    private void bt_crearEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearEquipoMouseClicked

        ArrayList<Equipo> equipos = ((Torneo) actual.getUserObject()).getEquipos();
        String newName = tf_teamName.getText();
        int validacion = 0;

        for (Equipo equipo : equipos) {
            if (newName.equals(equipo.getNombre())) {
                validacion++;
                break;
            }
        }

        if (validacion == 0) {
            equipos.add(new Equipo(newName, 0));
            ((Torneo) actual.getUserObject()).sortTeams();
            jd_crearEquipo.dispose();
        } else {
            JOptionPane.showMessageDialog(jd_crearEquipo, "Nombre repetido");
        }

    }//GEN-LAST:event_bt_crearEquipoMouseClicked

    private void mi_crearPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearPartidoActionPerformed
        if (((Torneo) actual.getUserObject()).getEquipos().size() < 2) {
            JOptionPane.showMessageDialog(jt_arbol, "Debe tener al menos 2 equipos para esta opcion");
        } else {

            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_equipo1.getModel();
            modelo.removeAllElements();
            for (Equipo e : ((Torneo) actual.getUserObject()).getEquipos()) {
                modelo.addElement(e);
            }

            modelo = (DefaultComboBoxModel) cb_equipo2.getModel();
            modelo.removeAllElements();
            for (Equipo e : ((Torneo) actual.getUserObject()).getEquipos()) {
                modelo.addElement(e);
            }
            sp_punt1.setValue(0);
            sp_punt2.setValue(0);
            jd_crearPartido.pack();
            jd_crearPartido.setLocationRelativeTo(this);
            jd_crearPartido.setVisible(true);

        }

    }//GEN-LAST:event_mi_crearPartidoActionPerformed

    private void jd_crearEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jd_crearEquipoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jd_crearEquipoMouseClicked

    private void bt_newPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_newPartidoMouseClicked
        Equipo team1 = (Equipo) cb_equipo1.getSelectedItem();
        Equipo team2 = (Equipo) cb_equipo2.getSelectedItem();

        if (team1.equals(team2)) {
            JOptionPane.showMessageDialog(jd_crearPartido, "No se puede jugar contra el mismo equipo");
        } else {
            Partidos p = new Partidos((int) sp_punt1.getValue(), (int) sp_punt2.getValue());
            p.setEquipos(new String[]{team1.getNombre(), team2.getNombre()});
            team1.setPuntos(team1.getPuntos() + ((int) sp_punt1.getValue()));
            team2.setPuntos(team2.getPuntos() + ((int) sp_punt2.getValue()));
            ((Torneo) actual.getUserObject()).getPartidos().add(p);
            ((Torneo) actual.getUserObject()).sortTeams();
            jd_crearPartido.dispose();
        }

    }//GEN-LAST:event_bt_newPartidoMouseClicked

    private void bt_newPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_newPartidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_newPartidoActionPerformed

    private void bt_newPartidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_newPartidoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_newPartidoMouseEntered

    private void mi_listarParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_listarParticipantesActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) tb_gamesPlayed.getModel();
        tabla.setRowCount(0);
        DefaultListModel modelo = (DefaultListModel) jl_teams.getModel();
        modelo.removeAllElements();
        for (Equipo e : ((Torneo) actual.getUserObject()).getEquipos()) {
            modelo.addElement(e);
        }
        jd_listarEquipo.pack();
        jd_listarEquipo.setLocationRelativeTo(null);
        jd_listarEquipo.setVisible(true);


    }//GEN-LAST:event_mi_listarParticipantesActionPerformed

    private void bt_partidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_partidasMouseClicked
        if (jl_teams.getSelectedIndex() != -1) {
            DefaultListModel modelo = (DefaultListModel) jl_teams.getModel();
            Equipo e = (Equipo) modelo.getElementAt(jl_teams.getSelectedIndex());
            DefaultTableModel tabla = (DefaultTableModel) tb_gamesPlayed.getModel();
            tabla.setRowCount(0);
            for (Partidos p : ((Torneo) actual.getUserObject()).getPartidos()) {
                if (p.getEquipos()[0].equals(e.getNombre()) || p.getEquipos()[1].equalsIgnoreCase(e.getNombre())) {
                    tabla.addRow(new Object[]{p});
                }
            }

        }
    }//GEN-LAST:event_bt_partidasMouseClicked

    private void mi_tablaPosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_tablaPosicionesActionPerformed
        jd_tabla.pack();
        jd_tabla.setLocationRelativeTo(this);
        DefaultTableModel modelo = (DefaultTableModel) tb_tabla.getModel();
        modelo.setRowCount(0);
        for (Equipo e : ((Torneo) actual.getUserObject()).getEquipos()) {
            modelo.addRow(new Object[]{e.getNombre(), e.getPuntos()});
        }
        jd_tabla.setVisible(true);
    }//GEN-LAST:event_mi_tablaPosicionesActionPerformed

    private void bt_loadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loadMouseClicked
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(bt_save);
        if (op == JFileChooser.APPROVE_OPTION) {
            try {
                File f = jfc.getSelectedFile();
                if (f.exists()) {
                    String[] path = f.getPath().split("\\.");
                    if (path[path.length - 1].equals("dar")) {
                        FileInputStream in = new FileInputStream(f);
                        ObjectInputStream input = new ObjectInputStream(in);
                        try {
                            Deporte deporte = (Deporte) input.readObject();
                            deportes.add(deporte);
                            fillTree();
                        } catch (EOFException ex) {

                        }
                        in.close();
                        input.close();

                    } else {
                        JOptionPane.showMessageDialog(this, "File Not Supported");
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        actualizarComboBox();
    }//GEN-LAST:event_bt_loadMouseClicked

    private void bt_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_saveMouseClicked
        JFileChooser jfc = new JFileChooser();
        int op = jfc.showSaveDialog(bt_save);
        if (op == JFileChooser.APPROVE_OPTION) {
            try {
                File f = jfc.getSelectedFile();
                if (!f.exists()) {
                    f = new File(f.getPath() + ".dar");
                } 
                    String[] path = f.getPath().split("\\.");
                    if (path[path.length - 1].equals("dar")) {
                        ProgressBar pb = new ProgressBar(progressBar, ((Deporte) cb_principal.getSelectedItem()));
                        pb.start();
                        FileOutputStream out = new FileOutputStream(f, false);
                        ObjectOutputStream output = new ObjectOutputStream(out);
                        output.writeObject(((Deporte) cb_principal.getSelectedItem()));
                        out.close();
                        output.close();
                    }else{
                        JOptionPane.showMessageDialog(jfc, "Archivo no valido");
                    }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt_saveMouseClicked

    public void createTorneo() {
        DefaultMutableTreeNode padre = (DefaultMutableTreeNode) actual.getParent();

        ((Deporte) actual.getUserObject()).getTorneos().add(new Torneo(JOptionPane.showInputDialog("Ingrese nombre de torneo"), (String) padre.getUserObject()));
        fillTree();
    }

    public void actualizarComboBox() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_principal.getModel();
        modelo.removeAllElements();
        for (Deporte deporte : deportes) {
            modelo.addElement(deporte);
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_crearEquipo;
    private javax.swing.JButton bt_load;
    private javax.swing.JButton bt_newPartido;
    private javax.swing.JButton bt_partidas;
    private javax.swing.JButton bt_save;
    private javax.swing.JComboBox<String> cb_equipo1;
    private javax.swing.JComboBox<String> cb_equipo2;
    private javax.swing.JComboBox<String> cb_equipo3;
    private javax.swing.JComboBox<String> cb_principal;
    private javax.swing.JMenuItem crearTorneo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JDialog jd_crearEquipo;
    private javax.swing.JDialog jd_crearPartido;
    private javax.swing.JDialog jd_listarEquipo;
    private javax.swing.JDialog jd_tabla;
    private javax.swing.JList<String> jl_teams;
    private javax.swing.JTree jt_arbol;
    private javax.swing.JTree jt_arbol1;
    private javax.swing.JMenuItem mi_crearDeporte;
    private javax.swing.JMenuItem mi_crearEquipo;
    private javax.swing.JMenuItem mi_crearPartido;
    private javax.swing.JMenuItem mi_listarParticipantes;
    private javax.swing.JMenuItem mi_tablaPosiciones;
    private javax.swing.JPopupMenu pop_crearTorneo;
    private javax.swing.JPopupMenu pop_menu;
    private javax.swing.JPopupMenu pop_torneos;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JSpinner sp_punt1;
    private javax.swing.JSpinner sp_punt2;
    private javax.swing.JTable tb_gamesPlayed;
    private javax.swing.JTable tb_tabla;
    private javax.swing.JTextField tf_teamName;
    // End of variables declaration//GEN-END:variables
}
