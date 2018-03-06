package interfaces;

import db.dao.DaoUsuarios;
import db.dao.DaoVendas;
import exceptions.ClienteException;
import exceptions.ProdutoException;
import static interfaces.Tela_Login.usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.clientes.Cliente;
import model.clientes.Produto;
import model.clientes.Usuario;
import model.clientes.Venda;
import service.ServicoCliente;
import service.ServicoProduto;
import service.ServicoVendas;

public class Gerenciamento_vendas extends javax.swing.JInternalFrame {

    int n_venda;
    String ultimaPesquisa = null;
    Cliente cliente = new Cliente();
    Cliente cli = null;
    Produto pro = new Produto();
    Usuario usr = null;
    int x = 0;//verifica se o carrinho está vazio

    public Gerenciamento_vendas() throws Exception {
        initComponents();
        setResizable(false); // Bloqueia o redimensionamento lateral da tela
        Date data_venda = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        label_data.setText(formato.format(data_venda));
        label_usuario.setText(usuario.toUpperCase());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        Campo_pesquisa = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Compras = new javax.swing.JTable();
        Remover_produto = new javax.swing.JButton();
        Adicionar_produto = new javax.swing.JButton();
        Pesquisar_produto = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaResultados = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Campo_desconto = new javax.swing.JTextField();
        valor_recebido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campo_troco = new javax.swing.JTextField();
        Total_pagar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Button_Cancelar = new javax.swing.JButton();
        Finalizar_button = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        Total_semDesconto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Campo_quantidade = new javax.swing.JFormattedTextField();
        jPanel9 = new javax.swing.JPanel();
        label_data = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label_usuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pesquisar_cliente_CPF = new javax.swing.JButton();
        Nome_field = new javax.swing.JTextField();
        CPF_Cliente = new javax.swing.JFormattedTextField();
        fechar_button = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setTitle("Venda");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        Campo_pesquisa.setText("Digite o nome do produto aqui...");
        Campo_pesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Campo_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo_pesquisaMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true), "Itens da venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 102))); // NOI18N

        Tabela_Compras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));
        Tabela_Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ITEM", "MODELO", "QUANT.", "SUBTOTAL", "ESTOQUE", "barras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela_Compras);
        if (Tabela_Compras.getColumnModel().getColumnCount() > 0) {
            Tabela_Compras.getColumnModel().getColumn(0).setMinWidth(0);
            Tabela_Compras.getColumnModel().getColumn(0).setPreferredWidth(0);
            Tabela_Compras.getColumnModel().getColumn(0).setMaxWidth(0);
            Tabela_Compras.getColumnModel().getColumn(1).setResizable(false);
            Tabela_Compras.getColumnModel().getColumn(2).setResizable(false);
            Tabela_Compras.getColumnModel().getColumn(3).setResizable(false);
            Tabela_Compras.getColumnModel().getColumn(4).setResizable(false);
            Tabela_Compras.getColumnModel().getColumn(5).setResizable(false);
            Tabela_Compras.getColumnModel().getColumn(6).setMinWidth(0);
            Tabela_Compras.getColumnModel().getColumn(6).setPreferredWidth(0);
            Tabela_Compras.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        Remover_produto.setText("Remover");
        Remover_produto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Remover_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remover_produtoActionPerformed(evt);
            }
        });

        Adicionar_produto.setText("Adicionar");
        Adicionar_produto.setToolTipText("Adiciona ");
        Adicionar_produto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Adicionar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adicionar_produtoActionPerformed(evt);
            }
        });

        Pesquisar_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/search.png"))); // NOI18N
        Pesquisar_produto.setToolTipText("Pesquisa produto no banco de dados");
        Pesquisar_produto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Pesquisar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesquisar_produtoActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true), "Resultados da busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 102))); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(51, 0, 51));
        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        tabelaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ITEM", "MARCA", "MODELO", "PREÇO", "ESTOQUE", "BARRAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
            tabelaResultados.getColumnModel().getColumn(6).setMinWidth(0);
            tabelaResultados.getColumnModel().getColumn(6).setPreferredWidth(0);
            tabelaResultados.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Campo_pesquisa))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Adicionar_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(Remover_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pesquisar_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Campo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Adicionar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Remover_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Módulo de Vendas", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true), "Pagamento"));

        jLabel4.setText("Descontos");

        Campo_desconto.setEditable(false);
        Campo_desconto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));

        valor_recebido.setEditable(false);
        valor_recebido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));

        jLabel5.setText("Valor Recebido");

        jLabel6.setText("Troco");

        campo_troco.setEditable(false);
        campo_troco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));

        Total_pagar.setEditable(false);
        Total_pagar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));

        jLabel7.setText("Total à Pagar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Campo_desconto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(valor_recebido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_troco, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Campo_desconto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_troco, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(Total_pagar)
                            .addComponent(valor_recebido))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Button_Cancelar.setText("Cancelar");
        Button_Cancelar.setToolTipText("Fecha esta janela");
        Button_Cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CancelarActionPerformed(evt);
            }
        });

        Finalizar_button.setText("Finalizar Venda");
        Finalizar_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Finalizar_button.setEnabled(false);
        Finalizar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finalizar_buttonActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(102, 0, 102));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        Total_semDesconto.setEditable(false);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quantidade:");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total");

        Campo_quantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(Campo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total_semDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Total_semDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        jPanel9.setBackground(new java.awt.Color(102, 0, 102));

        label_data.setForeground(new java.awt.Color(255, 255, 255));
        label_data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_data.setText("Data");

        label_usuario.setBackground(new java.awt.Color(255, 255, 255));
        label_usuario.setForeground(new java.awt.Color(255, 255, 255));
        label_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_usuario.setText("Vendedor");

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        Pesquisar_cliente_CPF.setText("Pesquisar");
        Pesquisar_cliente_CPF.setToolTipText("Pesquisa clientes no banco de dados");
        Pesquisar_cliente_CPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        Pesquisar_cliente_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesquisar_cliente_CPFActionPerformed(evt);
            }
        });

        Nome_field.setEditable(false);
        Nome_field.setToolTipText("Este é um campo opcional");

        try {
            CPF_Cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPF_Cliente.setToolTipText("Este é um campo obrigatório");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Nome_field, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CPF_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Pesquisar_cliente_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome_field, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CPF_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisar_cliente_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(label_data, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(label_data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(label_usuario)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fechar_button.setText("Fechar venda");
        fechar_button.setToolTipText("Fecha a venda sem salvar ");
        fechar_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        fechar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar_buttonActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Img/picture12545492204816.png"))); // NOI18N
        jLabel16.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Finalizar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechar_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(145, 145, 145))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(486, 486, 486))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel16))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(Finalizar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Pesquisar_cliente_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesquisar_cliente_CPFActionPerformed
        boolean resultSearch = false;
        ultimaPesquisa = CPF_Cliente.getText();
        try {
            resultSearch = refreshList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter nome", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Pesquisar_cliente_CPFActionPerformed
    public boolean refreshList() throws ClienteException, Exception {

        List<Cliente> resultado = ServicoCliente.
                procurarClienteCPF(ultimaPesquisa);

        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        int i = 0;
        JOptionPane.showMessageDialog(rootPane, "Cliente encontrado!");
        cli = resultado.get(i);
        Nome_field.setText(cli.getNome());
        return true;
    }
    private void Button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CancelarActionPerformed
        // guarda a venda no relatório
        Venda venda = new Venda();//adiciona os dados da venda
        if (Nome_field.getText().equals("") || Nome_field.getText() == (null)
                || Total_pagar.getText().equals("")
                || Total_pagar.getText() == (null)) {
        } else {
            venda.setClienteNome(Nome_field.getText());//add o nome do cliente
            venda.setValorTotal(Double.parseDouble(Total_pagar.getText()));//add o valor total da venda
        }
        String status = "Cancelada";
        venda.setStatusVenda(status);//add o status da venda

        this.dispose();
    }//GEN-LAST:event_Button_CancelarActionPerformed
    public boolean refreshListProdutoPesquisa() throws ProdutoException, Exception {
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

                Object[] row = new Object[7];
                row[0] = pro.getId();
                row[1] = pro.getNome();
                row[2] = pro.getMarca();
                row[3] = pro.getModelo();
                row[4] = pro.getPreco();
                row[5] = pro.getQuantidade();
                row[6] = pro.getCod_barras();
                model.addRow(row);
                String preco = String.valueOf(pro.getPreco());
            }
        }
        return true;
    }
    private void Pesquisar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesquisar_produtoActionPerformed
        boolean resultSearch = false;
        ultimaPesquisa = Campo_pesquisa.getText();
        try {
            resultSearch = refreshListProdutoPesquisa();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Pesquisar_produtoActionPerformed
    private void Adicionar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adicionar_produtoActionPerformed
        x = 1;
        int selecao = tabelaResultados.getSelectedRow();
        if (selecao < 0) {
            JOptionPane.showMessageDialog(rootPane, "Você não selecionou um produto!");
            return;
        }
        ultimaPesquisa = (String) tabelaResultados.getValueAt(selecao, 1);
        int estoque = (int) (tabelaResultados.getValueAt(selecao, 5));

        try {
            int x = Integer.parseInt(Campo_quantidade.getText());
            if (x <= 0){
            JOptionPane.showMessageDialog(rootPane, "Insira um valor válido!");
                return;
            }
        } catch (Exception e) {
            String x = Campo_quantidade.getText();
            if (x.isEmpty() || x.equals("") || x.equals("0")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um valor válido!");
                return;
            }else{
                JOptionPane.showMessageDialog(rootPane, "Insira um valor válido!");
                return;
            }
        }
        if (Campo_quantidade.getText().isEmpty() || Campo_quantidade.getText().equals("") || Campo_quantidade.getText().equals(0)) {
            JOptionPane.showMessageDialog(rootPane, "Insira um valor válido!");
            return;
        } else if (Integer.parseInt(Campo_quantidade.getText()) > estoque) {
            Campo_quantidade.setText("");
            JOptionPane.showMessageDialog(rootPane, "A quantidade inserida é maior do que a quantidade disponível em estoque!");
        } else if (selecao >= 0) {

            int qtd = Integer.parseInt(Campo_quantidade.getText());
            boolean resultSearch = false;
            try {
                resultSearch = refreshListProduto();
                int novo_estoque = estoque - qtd;//novo estoque deve ser guardado no banco quando o botão finalizar for clicado--------------------------------------------------------------------------------------
                Campo_quantidade.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return;
            }
            if (!resultSearch) {
                JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                        "Sem resultados", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Adicionar_produtoActionPerformed
    private void fechar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar_buttonActionPerformed

        try {
            if (CPF_Cliente.getText().equals("") || CPF_Cliente.getText().equals("   .   .   -  ") || Nome_field.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um cliente para realizar a venda!");
                fechar_button.setEnabled(true);
                return;
            } else if (x == 0) {
                JOptionPane.showMessageDialog(rootPane, "Carrinho vazio!");
                return;
            } else {
                CPF_Cliente.setEditable(false);
                Campo_pesquisa.setEditable(false);
                Campo_quantidade.setEditable(false);
                Pesquisar_cliente_CPF.setEnabled(false);
                Pesquisar_produto.setEnabled(false);
                Adicionar_produto.setEnabled(false);
                Remover_produto.setEnabled(false);
                fechar_button.setEnabled(false);
            }
        } catch (Exception e) {
        }
        Object[] options = {"Adicionar desconto", "Venda sem desconto"};
        int n = JOptionPane.showOptionDialog(rootPane, "Desejar adicionar 5% de desconto?", "Aviso",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (n == JOptionPane.YES_OPTION) {
            double porcentagem = Double.parseDouble(Total_pagar.getText()) / 100;
            double desconto = porcentagem * 5;
            double total_com_porcentagem = Double.parseDouble(Total_pagar.getText()) - desconto;
            Campo_desconto.setText(String.valueOf(desconto));
            Total_pagar.setText(String.valueOf(total_com_porcentagem));
        }
        if (n == JOptionPane.YES_OPTION || n != JOptionPane.YES_OPTION) {
            int cont = 0;
            double v = 0;
            double total = 0;
            while (cont == 0) {
                String valor = JOptionPane.showInputDialog(rootPane, "Qual foi o valor recebido? ", "digite o valor");
                Number number = (Number) Double.parseDouble(valor.replace(',', '.'));
                v = Double.parseDouble(valor);
                total = Double.parseDouble(Total_pagar.getText());
                if (v < total || String.valueOf(v) == null
                        || String.valueOf(v).equals("digite o valor")) {
                    JOptionPane.showMessageDialog(rootPane, "O valor inserido é menor que o total da compra!\nTente novamente.");
                } else if (v > total) {
                    cont = 1;
                } else {
                    cont = 0;
                }
            }
            double troco = v - total;
            campo_troco.setText(String.valueOf(troco));
            valor_recebido.setText(String.valueOf(v));
            Finalizar_button.setEnabled(true);
        }


    }//GEN-LAST:event_fechar_buttonActionPerformed
    private void Campo_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo_pesquisaMouseClicked
        Campo_pesquisa.setText("");
    }//GEN-LAST:event_Campo_pesquisaMouseClicked
    private void Remover_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remover_produtoActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) Tabela_Compras.getModel();
            final int row = Tabela_Compras.getSelectedRow();
            if (row >= 0) {
                Object[] options = {"Retirar do carrinho", "Manter no carrinho"};
                int j = JOptionPane.showOptionDialog(rootPane, "Desejar manter ou remover o item?", "Aviso",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
                if (j == JOptionPane.YES_OPTION) {

                    double valor = (double) Tabela_Compras.getValueAt(row, 4);//armazena o subtotal da linha que guarda o valor em 
                    //dinheiro para fazer a subtração
                    double total = Double.parseDouble(Total_pagar.getText());//armazena o valor total a ser pagar
                    Total_pagar.setText(String.valueOf(total - valor));//subtrai o valor do item removido do total a ser pago e atualiza o campo na tela
                    int qtd = Integer.parseInt((String) Tabela_Compras.getValueAt(row, 3));//armazena a quantidade a ser devolvida ao estoque em 
                    //uma string e já a converte para int
                    ((DefaultTableModel) Tabela_Compras.getModel()).removeRow(row);//deleta a linha selecionada
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Você não selecionou nenhum produto.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Não é possível "
                    + "excluir este produto.",
                    "Erro ao excluir produto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Remover_produtoActionPerformed
    private void Finalizar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finalizar_buttonActionPerformed
        // guarda a venda no relatório
        Date data_venda = new Date();
        SimpleDateFormat formato_hora = new SimpleDateFormat("hh:mm");
        String hora = (formato_hora.format(new Date()));
        Venda venda = new Venda();
        venda.setClienteNome(cli.getNome());//add o nome do cliente
        venda.setCliente_id(cli.getId());//add o id do cliente
        venda.setData(data_venda);//add a data da venda
        venda.setVendedorNome(usuario);//add o nome do vendedor
        venda.setHora(hora);
        try {
            // pega o id do usuario no banco e o adiciona no array
            List<Usuario> resultado = DaoUsuarios.procurarNome(usuario);
            usr = resultado.get(0);
            venda.setUsuario_id(usr.getId());//add o id do usuario
        } catch (Exception ex) {
            Logger.getLogger(Gerenciamento_vendas.class.getName()).log(Level.SEVERE, null, ex);
        }
        venda.setValorTotal(Double.parseDouble(Total_pagar.getText()));//add o valor total da venda
        List<Venda> lista;

        for (int i = 1; i < Tabela_Compras.getRowCount(); i++) {
            try {
                lista = DaoVendas.numeroVenda();
                Venda v = lista.get(lista.size());
                venda.setNumero_venda(v.getNumero_venda() - 1);//add  o numero da venda
            } catch (Exception ex) {
                venda.setNumero_venda(1);
            }
            int instrumento_id = (int) Tabela_Compras.getValueAt(i, 0);
            String nome_produto = (String) Tabela_Compras.getValueAt(i, 1);
            String quantidade_produto = (String) Tabela_Compras.getValueAt(i, 3);
            double total_produto = (double) Tabela_Compras.getValueAt(i, 4);
            venda.setQuantidade(Integer.parseInt(quantidade_produto));
            venda.setValorTotal(total_produto);
            venda.setNomeProduto(nome_produto);
            venda.setInstrumento_id(instrumento_id);
            try {
                DaoVendas.inserirItens(venda);
            } catch (Exception ex) {
                Logger.getLogger(Gerenciamento_vendas.class.getName()).log(Level.SEVERE, null, ex);
            }
            //----------código para o estoque-----------
            try {
                ultimaPesquisa = (String) Tabela_Compras.getValueAt(i, 1);
                List<Produto> resultado = ServicoProduto.procurarProduto(ultimaPesquisa);
                for (int j = 0; j < resultado.size(); j++) {
                    Produto produ = resultado.get(j);//pega o indice 0 do array retornado
                    if (produ.getId() == (int) Tabela_Compras.getValueAt(i, 0)) {
                        int estoque_saida = (int) Integer.parseInt((String) Tabela_Compras.getValueAt(i, 3));
                        int qtd = produ.getQuantidade();//pega a quantidade em estoque
                        int novo_valor = qtd - estoque_saida;//subtrai da quantidade em estoque a quantidade vendida
                        produ.setQuantidade(novo_valor);//atribui o novo estoque
                        ServicoVendas.AtualizarEstoque(produ);
                    }
                }
            } catch (Exception ex) {

                Logger.getLogger(Gerenciamento_vendas.class.getName()).log(Level.SEVERE, null, ex);
            }
//---------------------fim do código para o estoque-----------------------------
        }
        ServicoVendas.cadastrarVenda(venda);
        JOptionPane.showMessageDialog(rootPane, "Estoque atualizado!");
        this.dispose();
    }//GEN-LAST:event_Finalizar_buttonActionPerformed

    public boolean refreshListProduto() throws ProdutoException, Exception {

        int selecao = tabelaResultados.getSelectedRow();
        List<Produto> resultado = ServicoProduto.procurarProduto(ultimaPesquisa);
        DefaultTableModel model = (DefaultTableModel) Tabela_Compras.getModel();
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        int j = 0;

        for (int i = 0; i < resultado.size(); i++) {
            Produto pro = resultado.get(i);
            if (pro != null) {
                int a = (int) tabelaResultados.getValueAt(selecao, 0);

                if (pro.getId() == (a)) {
                    Object obj = Tabela_Compras.getValueAt(j, i);
                    if (obj == null || Tabela_Compras.getRowCount() == 1) {
                        double qtd = Double.parseDouble(Campo_quantidade.getText());
                        double preco = (double) tabelaResultados.getValueAt(j, 4);
                        double total_unidade = qtd * preco;
                        Object[] row = new Object[7];
                        row[0] = pro.getId();
                        row[1] = pro.getNome();
                        row[2] = pro.getModelo();
                        row[3] = Campo_quantidade.getText();
                        row[4] = total_unidade;
                        row[5] = pro.getQuantidade();
                        row[6] = pro.getCod_barras();
                        model.addRow(row);
                        //adiciona todos os items acima à tabela
                        //verifica se o campo Total_pagar está vazio, se sim insere o valor
                        //caso contrário pega o valor que já está no campo, converte para double e 
                        //faz a soma com o novo valor.
                        if (Total_pagar.getText().length() == 0) {
                            String t = String.valueOf(total_unidade);
                            Total_pagar.setText(t);
                            Total_semDesconto.setText(t);

                        } else {
                            double n1 = Double.parseDouble(Total_pagar.getText());
                            double n = total_unidade + n1;
                            String t = String.valueOf(n);
                            Total_pagar.setText(t);
                        }
                        break;
                    }
                }
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar_produto;
    private javax.swing.JButton Button_Cancelar;
    private javax.swing.JFormattedTextField CPF_Cliente;
    private javax.swing.JTextField Campo_desconto;
    private javax.swing.JTextField Campo_pesquisa;
    private javax.swing.JFormattedTextField Campo_quantidade;
    private javax.swing.JButton Finalizar_button;
    private javax.swing.JTextField Nome_field;
    private javax.swing.JButton Pesquisar_cliente_CPF;
    private javax.swing.JButton Pesquisar_produto;
    private javax.swing.JButton Remover_produto;
    private javax.swing.JTable Tabela_Compras;
    private javax.swing.JTextField Total_pagar;
    private javax.swing.JTextField Total_semDesconto;
    private javax.swing.JTextField campo_troco;
    private javax.swing.JButton fechar_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JTable tabelaResultados;
    private javax.swing.JTextField valor_recebido;
    // End of variables declaration//GEN-END:variables
}
