package interfaces;

import exceptions.UsuarioException;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clientes.Usuario;
import service.ServiceUsuario;

public class Gerenciamento_usuarios extends javax.swing.JInternalFrame {

    EditarUsuario EditarUsr = new EditarUsuario();
    VisualizarUsuario visu = new VisualizarUsuario();

    String ultimaPesquisa = null;

    public Gerenciamento_usuarios() {
        initComponents();
        setResizable(false); // Bloqueia o redimensionamento lateral da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        campo_Pesquisa = new javax.swing.JTextField();
        Label_Pesquisar = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldsenha2 = new javax.swing.JPasswordField();
        fieldnome = new javax.swing.JTextField();
        fieldcargo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldsenha1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Visualizar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setResizable(true);
        setTitle("Gerenciar Usuários");
        setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        campo_Pesquisa.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        campo_Pesquisa.setText("Insira o nome do usuario....");
        campo_Pesquisa.setToolTipText("Pesquise um usuário aqui");
        campo_Pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_PesquisaMouseClicked(evt);
            }
        });

        Label_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/search_1.png"))); // NOI18N
        Label_Pesquisar.setToolTipText("Clique para pesquisar");
        Label_Pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_PesquisarMouseClicked(evt);
            }
        });

        tabelaResultados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResultados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaResultados);
        if (tabelaResultados.getColumnModel().getColumnCount() > 0) {
            tabelaResultados.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaResultados.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaResultados.getColumnModel().getColumn(0).setMaxWidth(0);
            tabelaResultados.getColumnModel().getColumn(1).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(2).setResizable(false);
        }

        jTabbedPane1.addTab("Usuários", jScrollPane2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Usuário");

        jLabel3.setText("Cargo");

        jLabel6.setText("Senha");

        fieldsenha2.setText("jPa");
        fieldsenha2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));

        fieldnome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));

        fieldcargo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/453298_1_1.png"))); // NOI18N

        fieldsenha1.setText("jES");
        fieldsenha1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));

        jLabel7.setText("Repita a senha");

        Salvar.setForeground(new java.awt.Color(51, 0, 51));
        Salvar.setText("Salvar");
        Salvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fieldcargo)
                        .addComponent(fieldnome)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(fieldsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldsenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))))
                            .addGap(2, 2, 2)))
                    .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(fieldnome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(fieldcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldsenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar Usuários", jPanel1);

        Editar.setText("Editar ");
        Editar.setToolTipText("Edita dados dos usuários");
        Editar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Visualizar.setText("Visualizar");
        Visualizar.setToolTipText("Visualiza o usuário selecionado");
        Visualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.setToolTipText("Deleta o usuário selecionado");
        Excluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        jButton5.setText("Sair");
        jButton5.setToolTipText("Fecha esta janela");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Visualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campo_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Pesquisar)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Visualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Protótipo - Tela Principal - Usuários");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Label_PesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_PesquisarMouseClicked
        boolean resultSearch = false;
        ultimaPesquisa = campo_Pesquisa.getText();

        try {
            resultSearch = refreshList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_Label_PesquisarMouseClicked

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        try {
            final int row = tabelaResultados.getSelectedRow();
            if (row >= 0) {
                String nome = (String) tabelaResultados.getValueAt(row, 1);
                List<Usuario> resultado = ServiceUsuario.procurarUsuario(nome);
                for (int i = 0; i < resultado.size(); i++) {
                    Usuario usr = resultado.get(i);

                    if (usr.getId() == (int) tabelaResultados.getValueAt(row, 0)) {

                EditarUsr.dispose();
                EditarUsr = new EditarUsuario();
                EditarUsr.setUsuario(usr);
                EditarUsr.setTitle(usr.getNome() + " ");
                this.getParent().add(EditarUsr);
                this.openFrameInCenter(EditarUsr);
                EditarUsr.toFront();
                this.refreshList();
                return;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Você não selecionou ninguém.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste cliente.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarActionPerformed
        try {
            final int row = tabelaResultados.getSelectedRow();
            if (row >= 0) {
//                Integer id = (Integer) tabelaResultados.getValueAt(row, 0);
//
//                Usuario usr = ServiceUsuario.obterUsuario(id);
                String nome = (String) tabelaResultados.getValueAt(row, 1);
                List<Usuario> resultado = ServiceUsuario.procurarUsuario(nome);
                for (int i = 0; i < resultado.size(); i++) {
                    Usuario usr = resultado.get(i);

                    if (usr.getId() == (int) tabelaResultados.getValueAt(row, 0)) {
                visu.dispose();
                visu = new VisualizarUsuario();
                visu.setUsuario(usr);
                visu.setTitle(usr.getNome() + " ");
                this.getParent().add(visu);
                this.openFrameInCenter(visu);
                visu.toFront();
                this.refreshList();
                return;
                    }
                    }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Você não selecionou ninguém.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste cliente.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_VisualizarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (tabelaResultados.getSelectedRow() >= 0) {
            final int row = tabelaResultados.getSelectedRow();
            String nome = (String) tabelaResultados.getValueAt(row, 1);
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o Usuário \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    Integer id = (Integer) tabelaResultados.getValueAt(row, 0);
                    ServiceUsuario.excluirUsuario(id);
                    this.refreshList();
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não selecionou ninguém.");
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void campo_PesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_PesquisaMouseClicked
            campo_Pesquisa.setText("");
    }//GEN-LAST:event_campo_PesquisaMouseClicked

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        Usuario usr = new Usuario();
        if (fieldsenha1.getText().toLowerCase().equals(fieldsenha2.getText().toLowerCase())) {
            usr.setNome(fieldnome.getText());
            usr.setCargo(fieldcargo.getText());
            usr.setSenha(fieldsenha2.getText());

            try {
                ServiceUsuario.cadastrarUsuario(usr);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Usuário inserido com sucesso",
                "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);
            fieldsenha1.setText("");
            fieldsenha2.setText("");
            fieldcargo.setText("");
            fieldnome.setText("");

        } else {
            JOptionPane frame = new JOptionPane();
            JOptionPane.showMessageDialog(frame, "As senhas não coincidem!");
        }
    }//GEN-LAST:event_SalvarActionPerformed
    public boolean refreshList() throws UsuarioException, Exception {

        List<Usuario> resultado = ServiceUsuario.
                procurarUsuario(ultimaPesquisa);
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();
        model.setRowCount(0);
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        for (int i = 0; i < resultado.size(); i++) {
            Usuario usr = resultado.get(i);
            if (usr != null) {
                Object[] row = new Object[3];
                row[0] = usr.getId();
                row[1] = usr.getNome();
                row[2] = usr.getCargo();
                model.addRow(row);
            }
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JLabel Label_Pesquisar;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton Visualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo_Pesquisa;
    private javax.swing.JTextField fieldcargo;
    private javax.swing.JTextField fieldnome;
    private javax.swing.JPasswordField fieldsenha1;
    private javax.swing.JPasswordField fieldsenha2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaResultados;
    // End of variables declaration//GEN-END:variables

    private void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);

    }
}
