/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import exceptions.ProdutoException;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clientes.Produto;
import service.ServicoProduto;

/**
 *
 * @author psilva
 */
public class Gerenciamento_produtos extends javax.swing.JInternalFrame {

    Cadastro_produtos CadastroProduto = new Cadastro_produtos();
    VisualizarPro VisualizarDados = new VisualizarPro();
    EditarPro formEditarPro = new EditarPro();
    String ultimaPesquisa = null;

    public Gerenciamento_produtos() {
        initComponents();
        setResizable(false); // Bloqueia o redimensionamento lateral da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        Editar = new javax.swing.JButton();
        CadastrarProduto = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Visualizar_Dados = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField13 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Label_Pesquisa = new javax.swing.JLabel();
        Campo_pesquisa = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        Nome_button = new javax.swing.JRadioButton();
        Tipo_button = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(true);
        setTitle("Estoque - Gerenciamento de Produtos");
        setToolTipText("");

        tabelaResultados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Categoria", "Modelo", "Quantidade", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tabelaResultados.getColumnModel().getColumn(3).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(4).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(5).setResizable(false);
        }

        Editar.setText("Editar ");
        Editar.setToolTipText("Editar dados do produto selecionado");
        Editar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        CadastrarProduto.setText("Cadastrar Produto");
        CadastrarProduto.setToolTipText("Cadastra novo produto");
        CadastrarProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        CadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutoActionPerformed(evt);
            }
        });

        jButton5.setText("Sair");
        jButton5.setToolTipText("Fecha esta janela");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.setToolTipText("Deletar produto selecionado");
        Excluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Visualizar_Dados.setText("Visualizar ");
        Visualizar_Dados.setToolTipText("Visualiza dados do produto selecionado");
        Visualizar_Dados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Visualizar_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Visualizar_DadosActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Sexo", "Endereço", "Telefone"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTextField13.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextField13.setText("Campo de Pesquisa...");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro de pesquisa"));

        jRadioButton8.setText("ID");

        jRadioButton9.setText("Nome do Cliente");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jButton8.setText("Editar ");

        jButton9.setText("Cadastrar Cliente");

        jButton10.setText("Sair");

        jButton11.setText("Deletar");

        jButton12.setText("Visualizar Dados");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/search.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/refresh-page-arrow-button_icon-icons.com_53909.png"))); // NOI18N

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        Label_Pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/search_1.png"))); // NOI18N
        Label_Pesquisa.setToolTipText("Clique para pesquisar");
        Label_Pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_PesquisaMouseClicked(evt);
            }
        });

        Campo_pesquisa.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Campo_pesquisa.setText("Campo de Pesquisa...");
        Campo_pesquisa.setToolTipText("Pesquise um produto aqui");
        Campo_pesquisa.setBorder(null);
        Campo_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo_pesquisaMouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(102, 0, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro de pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        Nome_button.setBackground(new java.awt.Color(102, 0, 102));
        buttonGroup1.add(Nome_button);
        Nome_button.setForeground(new java.awt.Color(255, 255, 255));
        Nome_button.setText("Nome");

        Tipo_button.setBackground(new java.awt.Color(102, 0, 102));
        buttonGroup1.add(Tipo_button);
        Tipo_button.setForeground(new java.awt.Color(255, 255, 255));
        Tipo_button.setText("Tipo");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(Nome_button)
                .addGap(18, 18, 18)
                .addComponent(Tipo_button)
                .addGap(19, 19, 19))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipo_button)
                    .addComponent(Nome_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Pesquisa)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Pesquisa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Visualizar_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 381, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 382, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Visualizar_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 237, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 237, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("Gerenciamento de Produtos - Estoque");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean refreshList() throws ProdutoException, Exception {
        List<Produto> resultado = ServicoProduto.
                procurarProduto(ultimaPesquisa);
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();
        model.setRowCount(0);
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        for (int i = 0; i < resultado.size(); i++) {
            Produto pro = resultado.get(i);
            if (pro != null) {
                Object[] row = new Object[6];
                row[0] = pro.getId();
                row[1] = pro.getNome();
                row[2] = pro.getCategoria();
                row[3] = pro.getModelo();
                row[4] = pro.getQuantidade();
                row[5] = pro.getPreco();
                model.addRow(row);
            }
        }
        return true;
    }

    public boolean refreshListTipo() throws ProdutoException, Exception {
        List<Produto> resultado = ServicoProduto.
                procurarProdutoTipo(ultimaPesquisa);
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();
        model.setRowCount(0);
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        for (int i = 0; i < resultado.size(); i++) {
            Produto pro = resultado.get(i);
            if (pro != null) {
                Object[] row = new Object[6];
                row[0] = pro.getId();
                row[1] = pro.getNome();
                row[2] = pro.getCategoria();
                row[3] = pro.getModelo();
                row[4] = pro.getQuantidade();
                row[5] = pro.getPreco();
                model.addRow(row);
            }
        }
        return true;
    }
    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    //Clique no Icon PESQUISA 
    private void Label_PesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_PesquisaMouseClicked
        //botão pesquisar
        if (Nome_button.isSelected() || !Nome_button.isSelected()) {
            boolean resultSearch = false;
            ultimaPesquisa = Campo_pesquisa.getText();
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
        } else if (Tipo_button.isSelected()) {
            boolean resultSearch = false;
            ultimaPesquisa = Campo_pesquisa.getText();
            try {
                resultSearch = refreshListTipo();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!resultSearch) {
                JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                        "Sem resultados", JOptionPane.ERROR_MESSAGE);
            }

        } 
    }//GEN-LAST:event_Label_PesquisaMouseClicked

    public boolean refreshListAtualizar() {
        boolean resultSearch = false;
        if (Nome_button.isSelected() || !Nome_button.isSelected()) {
            ultimaPesquisa = Campo_pesquisa.getText();
            try {
                resultSearch = refreshList();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (!resultSearch) {
                JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                        "Sem resultados", JOptionPane.ERROR_MESSAGE);
            }
        } else if (Tipo_button.isSelected()) {
            ultimaPesquisa = Campo_pesquisa.getText();
            try {
                resultSearch = refreshListTipo();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (!resultSearch) {
                JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                        "Sem resultados", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um filtro!");
        }
        return false;
    }


    private void CadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdutoActionPerformed
        if (CadastroProduto == null || CadastroProduto.isDisplayable()) {
            CadastroProduto = new Cadastro_produtos();
        }
        this.getParent().add(CadastroProduto);
        this.openFrameInCenter(CadastroProduto);
        CadastroProduto.toFront();
    }//GEN-LAST:event_CadastrarProdutoActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (tabelaResultados.getSelectedRow() >= 0) {
            final int row = tabelaResultados.getSelectedRow();
            String nome = (String) tabelaResultados.getValueAt(row, 1);
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o Cliente \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    Integer id = (Integer) tabelaResultados.getValueAt(row, 0);
                    ServicoProduto.excluirProduto(id);
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

    private void Visualizar_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Visualizar_DadosActionPerformed
        try {
            final int row = tabelaResultados.getSelectedRow();
            if (row >= 0) {
                String nome = (String) tabelaResultados.getValueAt(row, 1);
                List<Produto> resultado = ServicoProduto.procurarProduto(nome);
                for (int i = 0; i < resultado.size(); i++) {
                    Produto produ = resultado.get(i);

                    if (produ.getId() == (int) tabelaResultados.getValueAt(row, 0)) {

                        VisualizarDados.dispose();
                        VisualizarDados = new VisualizarPro();
                        VisualizarDados.setProduto(produ);
                        VisualizarDados.setTitle(produ.getNome());
                        this.getParent().add(VisualizarDados);
                        this.openFrameInCenter(VisualizarDados);
                        VisualizarDados.toFront();
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
    }//GEN-LAST:event_Visualizar_DadosActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        try {
            //Obtém a linha selecionada na tabela de resultados
            final int row = tabelaResultados.getSelectedRow();
            //Verifica se há linha selecionada na tabela
            if (row >= 0) {
                String nome = (String) tabelaResultados.getValueAt(row, 1);
                List<Produto> resultado = ServicoProduto.procurarProduto(nome);
                for (int i = 0; i < resultado.size(); i++) {
                    Produto produ = resultado.get(i);

                    if (produ.getId() == (int) tabelaResultados.getValueAt(row, 0)) {

                        //Cria uma nova instância da tela de edição,
                        //configura o cliente selecionado como elemento a
                        //ser editado e mostra a tela de edição.
                        //Para exibir a tela, é necessário adicioná-la ao
                        //componente de desktop, o "pai" da janela corrente
                        formEditarPro.dispose();
                        formEditarPro = new EditarPro();
                        formEditarPro.setProduto(produ);
                        formEditarPro.setTitle(produ.getNome());
                        this.getParent().add(formEditarPro);
                        this.openFrameInCenter(formEditarPro);
                        formEditarPro.toFront();
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "exibir os detalhes deste cliente.",
                    "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void Campo_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo_pesquisaMouseClicked
        if (evt.getClickCount() == 1) {
            Campo_pesquisa.setText("");
        }
    }//GEN-LAST:event_Campo_pesquisaMouseClicked
    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarProduto;
    private javax.swing.JTextField Campo_pesquisa;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JLabel Label_Pesquisa;
    private javax.swing.JRadioButton Nome_button;
    private javax.swing.JRadioButton Tipo_button;
    private javax.swing.JButton Visualizar_Dados;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTable tabelaResultados;
    // End of variables declaration//GEN-END:variables

}
