/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.logging.Level;
import java.util.logging.Logger;
import projetoaerolp2.CadastroCliente;
import Banco.ConectaBanco;

/**
 *
 * @author Stephanie
 */
public class TelaInicial extends javax.swing.JFrame {

    ConectaBanco conexao = new ConectaBanco();//variavel global

    public TelaInicial() {
        initComponents();
        conexao.conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastrar = new javax.swing.JMenu();
        jmCadastrarCliente = new javax.swing.JMenuItem();
        jmCadastrarAeronave = new javax.swing.JMenuItem();
        jmCadastrarVoo = new javax.swing.JMenuItem();
        jmCadastrarProgDatas = new javax.swing.JMenuItem();
        jmConsultar = new javax.swing.JMenu();
        jmConsultarVoo = new javax.swing.JMenuItem();
        jmConsultarSaldoPontos = new javax.swing.JMenuItem();
        jmPassagem = new javax.swing.JMenu();
        jmPassagemVender = new javax.swing.JMenuItem();
        jmPassagemEmitir = new javax.swing.JMenuItem();
        jmPassagemCancelar = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmSobreCia = new javax.swing.JMenu();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA COMPANHIA AÉREA");

        jmCadastrar.setText("Cadastrar");

        jmCadastrarCliente.setText("Cliente");
        jmCadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCadastrarClienteMouseClicked(evt);
            }
        });
        jmCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarClienteActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadastrarCliente);

        jmCadastrarAeronave.setText("Aeronave");
        jmCadastrarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarAeronaveActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadastrarAeronave);

        jmCadastrarVoo.setText("Voo");
        jmCadastrar.add(jmCadastrarVoo);

        jmCadastrarProgDatas.setText("Programação de Datas");
        jmCadastrar.add(jmCadastrarProgDatas);

        jMenuBar1.add(jmCadastrar);

        jmConsultar.setText("Consultar");

        jmConsultarVoo.setText("Vôo");
        jmConsultar.add(jmConsultarVoo);

        jmConsultarSaldoPontos.setText("Saldo de Pontos");
        jmConsultar.add(jmConsultarSaldoPontos);

        jMenuBar1.add(jmConsultar);

        jmPassagem.setText("Passagem");

        jmPassagemVender.setText("Vender");
        jmPassagem.add(jmPassagemVender);

        jmPassagemEmitir.setText("Emitir");
        jmPassagem.add(jmPassagemEmitir);

        jmPassagemCancelar.setText("Cancelar");
        jmPassagem.add(jmPassagemCancelar);

        jMenuBar1.add(jmPassagem);
        jMenuBar1.add(jMenu7);

        jmSobreCia.setText("Sobre a CIA");
        jMenuBar1.add(jmSobreCia);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
       
        conexao.desconectar();
        System.exit(0);
    }//GEN-LAST:event_jmSairMouseClicked

    private void jmCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarClienteActionPerformed
       
        CadastroCliente cadcli = null;
        try {
            cadcli = new CadastroCliente();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        cadcli.setVisible(true);        
    }//GEN-LAST:event_jmCadastrarClienteActionPerformed

    private void jmCadastrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCadastrarClienteMouseClicked
     
    }//GEN-LAST:event_jmCadastrarClienteMouseClicked

    private void jmCadastrarAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarAeronaveActionPerformed
        CadastroAeronave aero = new CadastroAeronave();
        aero.setVisible(true);
    }//GEN-LAST:event_jmCadastrarAeronaveActionPerformed

    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenuItem jmCadastrarAeronave;
    private javax.swing.JMenuItem jmCadastrarCliente;
    private javax.swing.JMenuItem jmCadastrarProgDatas;
    private javax.swing.JMenuItem jmCadastrarVoo;
    private javax.swing.JMenu jmConsultar;
    private javax.swing.JMenuItem jmConsultarSaldoPontos;
    private javax.swing.JMenuItem jmConsultarVoo;
    private javax.swing.JMenu jmPassagem;
    private javax.swing.JMenuItem jmPassagemCancelar;
    private javax.swing.JMenuItem jmPassagemEmitir;
    private javax.swing.JMenuItem jmPassagemVender;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenu jmSobreCia;
    // End of variables declaration//GEN-END:variables
}
