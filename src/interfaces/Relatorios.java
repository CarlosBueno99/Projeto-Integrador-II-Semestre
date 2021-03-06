package interfaces;

import db.dao.DaoVendas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clientes.Venda;
import service.ServicoVendas;

/**
 *
 * @author psilva
 */
public class Relatorios extends javax.swing.JInternalFrame {

    public Relatorios() {
        initComponents();
        setResizable(false); // Bloqueia o redimensionamento lateral da tela
    }
    String ultimaPesquisa = null;
    String data_final;
    String data_inicial;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton5 = new javax.swing.JButton();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Campo_data_ini = new javax.swing.JFormattedTextField();
        Campo_data_fim = new javax.swing.JFormattedTextField();
        Pesquisa_data = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Campo_pesquisa = new javax.swing.JTextField();
        Pesquisa_nome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(true);
        setTitle("Relatório de Vendas");
        setToolTipText("");

        jButton5.setText("Sair");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "VENDA Nº", "CLIENTE", "PRODUTO", "QUANTIDADE", "TOTAL", "DATA", "HORA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResultados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaResultados);
        if (tabelaResultados.getColumnModel().getColumnCount() > 0) {
            tabelaResultados.getColumnModel().getColumn(0).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(1).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(2).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(3).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(4).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(5).setResizable(false);
            tabelaResultados.getColumnModel().getColumn(6).setResizable(false);
        }

        jTabbedPane1.addTab("Histórico de Vendas", jScrollPane2);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Pesquisa por data", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("De");

        try {
            Campo_data_ini.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_data_ini.setToolTipText("O máximo é 30 dias!");

        try {
            Campo_data_fim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_data_fim.setToolTipText("O máximo é 30 dias!");

        Pesquisa_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/search_1.png"))); // NOI18N
        Pesquisa_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pesquisa_dataMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Até");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_data_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_data_fim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pesquisa_data, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pesquisa_data)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Campo_data_fim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Campo_data_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Pesquisa por Nome do Cliente", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        Campo_pesquisa.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Campo_pesquisa.setText("Insira o nome do cliente...");
        Campo_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo_pesquisaMouseClicked(evt);
            }
        });

        Pesquisa_nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/search_1.png"))); // NOI18N
        Pesquisa_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pesquisa_nomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Pesquisa_nome)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pesquisa_nome)
                    .addComponent(Campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 402, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 402, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 230, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 229, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Campo_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo_pesquisaMouseClicked
        Campo_pesquisa.setText("");
    }//GEN-LAST:event_Campo_pesquisaMouseClicked

    private void Pesquisa_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pesquisa_nomeMouseClicked
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
    }//GEN-LAST:event_Pesquisa_nomeMouseClicked

    private void Pesquisa_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pesquisa_dataMouseClicked
        boolean resultSearch = false;

        try {
            resultSearch = refreshListData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_Pesquisa_dataMouseClicked

    public boolean refreshList() throws Exception {
        List<Venda> resultado = ServicoVendas.procurarVenda_N_cliente(ultimaPesquisa);
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();
        model.setRowCount(0);
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        for (int i = 0; i < resultado.size(); i++) {
            Object[] row = new Object[7];
            Venda venda = resultado.get(i);
            List<Venda> resultado_itens = DaoVendas.listarITens();
            for (int j = 0; j < resultado_itens.size(); j++) {
                try {
                    Venda v_itens = resultado_itens.get(i);
                    if (v_itens != null) {
                        row[2] = v_itens.getNomeProduto();
                        row[3] = v_itens.getQuantidade();
                    }
                    if (venda != null) {
                        row[0] = venda.getNumero_venda();
                        row[1] = venda.getClienteNome();
                        row[4] = venda.getValorTotal();
                        row[5] = venda.getData();
                        row[6] = venda.getHora();
                        
                        model.addRow(row);
                    }
                } catch (Exception e) {
                }
            }
        }
        return true;
    }

    public boolean refreshListData() throws ParseException, Exception {
        if (Campo_data_ini.getText().isEmpty() || Campo_data_fim.getText().isEmpty()
                || Campo_data_ini.getText().equals("  /  /    ") || Campo_data_fim.getText().equals("  /  /    ")) {
            DaoVendas.listar();
            return true;
        }
        data_inicial = Campo_data_ini.getText();
        char data_inicial_ano, data_dia, data_mes;
        StringBuilder ano = new StringBuilder();
        StringBuilder dia = new StringBuilder();
        StringBuilder mes = new StringBuilder();
        //pega o ano
        for (int i = 6; i < data_inicial.length(); i++) {
            data_inicial_ano = data_inicial.charAt(i);
            ano.append(data_inicial_ano);
        }
        //pega o dia
        for (int i = 0; i <= 1; i++) {
            data_dia = data_inicial.charAt(i);//trocar pra dia
            dia.append(data_dia);
        }
        for (int i = 3; i <= 4; i++) {
            data_mes = data_inicial.charAt(i);//trocar pra mes
            mes.append(data_mes);
        }
        data_inicial = ano + "/" + mes + "/" + dia;
        //-----------------------------------------------------------------------------
        data_final = Campo_data_fim.getText();
        char data_final_ano, final_dia, final_mes;
        StringBuilder ano_final = new StringBuilder();
        StringBuilder dia_final = new StringBuilder();
        StringBuilder mes_final = new StringBuilder();
        //pega o ano
        for (int i = 6; i < data_final.length(); i++) {
            data_final_ano = data_final.charAt(i);
            ano_final.append(data_final_ano);
        }
        //pega o dia
        for (int i = 0; i <= 1; i++) {
            final_dia = data_final.charAt(i);
            dia_final.append(final_dia);
        }//pega o mes
        for (int i = 3; i <= 4; i++) {
            final_mes = data_final.charAt(i);
            mes_final.append(final_mes);
        }
        data_final = ano_final + "/" + mes_final + "/" + dia_final;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        java.sql.Date d_inicial = new java.sql.Date(formato.parse(data_inicial).getTime());
        java.sql.Date d_final = new java.sql.Date(formato.parse(data_final).getTime());

        //---------------------------------------------------
        List<Venda> resultado = ServicoVendas.procurarVendaData(d_inicial, d_final);
        DefaultTableModel model = (DefaultTableModel) tabelaResultados.getModel();
        model.setRowCount(0);
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        for (int i = 0; i < resultado.size(); i++) {
            Object[] row = new Object[7];
            Venda venda = resultado.get(i);
            List<Venda> resultado_itens = DaoVendas.listarITens();
            for (int j = 0; j < resultado_itens.size(); j++) {
                try {
                    Venda v_itens = resultado_itens.get(i);
                    if (v_itens != null) {
                        row[2] = v_itens.getNomeProduto();
                        row[3] = v_itens.getQuantidade();
                    }
                    if (venda != null) {
                        row[0] = venda.getNumero_venda();
                        row[1] = venda.getClienteNome();
                        row[4] = venda.getValorTotal();
                        row[5] = venda.getData();
                        row[6] = venda.getHora();
                        model.addRow(row);
                    }
                } catch (Exception e) {

                }
            }

        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Campo_data_fim;
    private javax.swing.JFormattedTextField Campo_data_ini;
    private javax.swing.JTextField Campo_pesquisa;
    private javax.swing.JLabel Pesquisa_data;
    private javax.swing.JLabel Pesquisa_nome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTable tabelaResultados;
    // End of variables declaration//GEN-END:variables
}
