/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author an1me
 */
public class Equipo extends javax.swing.JFrame {
    private DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
    //modelo para la tabla
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    /**
     * Creates new form Equipo
     */
    public Equipo() {
        llenarModeloComboBox();
        agregarModeloTabla();
        initComponents();
        setLocationRelativeTo(null); //centrar ventana
    }
    
    //Agregando Columnas a la tabla
    private void agregarModeloTabla() {
        modeloTabla.addColumn("Nombres");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Cedula");
        modeloTabla.addColumn("Equipo");
        modeloTabla.addColumn("Direccion");
    }
    
    private void llenarModeloComboBox() {
        modelo.addElement(new Persona("Adrián", "Ramos", "1060821234", "América de Cali", "Cali(Valle del Cauca), Calle 5 #04-12"));
        modelo.addElement(new Persona("Iago", "Falque", "107081111", "América de Cali", "Cali(Valle del Cauca), Calle 8 #12-12"));
        modelo.addElement(new Persona("Cristian", "Arrieta", "1050234553", "América de Cali", "Cali(Valle del Cauca), Calle 12 #21-33"));
        modelo.addElement(new Persona("Juan David", "Pérez", "1034005112", "América de Cali", "Cali(Valle del Cauca), Calle 90 #83-33"));
        modelo.addElement(new Persona("Luis", "Suárez", "75902123", "Atlético Nacional", "Medellin(Antioquia), Carrera 67 #58-13"));
        modelo.addElement(new Persona("Álex", "Mejía", "1035865102", "Atlético Nacional", "Medellin(Antioquia), Manzana 20 #58-13"));
        modelo.addElement(new Persona("Daniel", "Mantilla", "90455633", "Atlético Nacional", "Medellin(Antioquia), Carrera 67 #128-13"));
        modelo.addElement(new Persona("Emanuel", "Olivera", "79002124", "Atlético Nacional", "Medellin(Antioquia), Carrera 133 #12-78"));
        modelo.addElement(new Persona("Guillermo", "Celis", "1053933123", "Once Caldas", "Manizales(Caldas), Carrera 22 #52-58"));
        modelo.addElement(new Persona("alejandro", "Barbaro", "1053495032", "Once Caldas", "Manizales(Caldas), Carrera 10 #13-45"));
        modelo.addElement(new Persona("alejandro", "Barbaro", "1053495032", "Once Caldas", "Manizales(Caldas), Carrera 10 #13-45"));
        modelo.addElement(new Persona("David", "Murillo", "1053867234", "Once Caldas", "Manizales(Caldas), Carrera 07 #10-11"));
        modelo.addElement(new Persona("Esteban", "Beltran", "1053113566", "Once Caldas", "Manizales(Caldas), Carrera 21 #58-45"));
        modelo.addElement(new Persona("Carmelo", "valencia", "170923811", "Junior de Barranquilla", "Barranquilla(Atlántico), Manzana 70 #02-06"));
        modelo.addElement(new Persona("fernando", "Uriba", "170009311", "Junior de Barranquilla", "Barranquilla(Atlántico), Manzana 70 #02-06"));
        modelo.addElement(new Persona("Freddy", "Hinestroza", "170093871", "Junior de Barranquilla", "Barranquilla(Atlántico), Manzana 20 #97-15"));
        modelo.addElement(new Persona("Jhon", "Pajoy", "170084145", "Junior de Barranquilla", "Barranquilla(Atlántico), Diagona 12 #104-03"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaPersona = new javax.swing.JLabel();
        comboPersonas = new javax.swing.JComboBox<>();
        botonInsertar = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        separador = new javax.swing.JSeparator();
        etiquetaDatos = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaApellidos = new javax.swing.JLabel();
        cajaApellidos = new javax.swing.JTextField();
        etiquetaCedula = new javax.swing.JLabel();
        cajaCedula = new javax.swing.JTextField();
        etiquetaEquipo = new javax.swing.JLabel();
        cajaEquipo = new javax.swing.JTextField();
        etiquetaDireccion = new javax.swing.JLabel();
        cajaDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaPersona.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaPersona.setText("Jugador");

        comboPersonas.setModel(modelo);

        botonInsertar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonInsertar.setText("Insertar Jugador");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        tabla.setModel(modeloTabla);
        ListSelectionListener oyenteSeleccion = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    int filaSeleccionada = tabla.getSelectedRow(); //obtener la fila seleccionada

                    String nombres = (String) modeloTabla.getValueAt(filaSeleccionada, 0); //guardando filas seleccionadas
                    String apellidos = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
                    String cedula = (String) modeloTabla.getValueAt(filaSeleccionada, 2);
                    String equipo = (String) modeloTabla.getValueAt(filaSeleccionada, 3);
                    String direccion = (String) modeloTabla.getValueAt(filaSeleccionada, 4);

                    cajaNombre.setText(nombres);
                    cajaApellidos.setText(apellidos);
                    cajaCedula.setText(cedula);
                    cajaEquipo.setText(equipo);
                    cajaDireccion.setText(direccion);
                }

            }
        };

        tabla.getSelectionModel().addListSelectionListener(oyenteSeleccion);
        scrollTabla.setViewportView(tabla);

        etiquetaDatos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        etiquetaDatos.setText("Datos del Jugador");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaNombre.setText("Nombre");

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        etiquetaApellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaApellidos.setText("Apellidos");

        etiquetaCedula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaCedula.setText("Cedula");

        etiquetaEquipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaEquipo.setText("Equipo");

        etiquetaDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaDireccion.setText("Dirección");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaDireccion)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cajaCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaApellidos)
                            .addComponent(cajaEquipo)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaPersona)
                            .addComponent(etiquetaDatos)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(etiquetaNombre)
                                .addGap(203, 203, 203)
                                .addComponent(etiquetaApellidos))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(etiquetaCedula)
                                .addGap(213, 213, 213)
                                .addComponent(etiquetaEquipo))
                            .addComponent(etiquetaDireccion))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiquetaPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaCedula)
                    .addComponent(etiquetaEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiquetaDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Persona p = (Persona)comboPersonas.getSelectedItem(); // Retorna el objeto persona que seleccione del combo box, Guardamos en la variable y hacemos un cash para convertirlo a persona
        
        String nombres = p.getNombres(); //Creamos String para guardar los objetos personas
        String apellidos = p.getApellidos();
        String cedula = p.getCedula();
        String equipo = p.getEquipo();
        String direccion = p.getDireccion();
        
        String [] persona = {nombres,apellidos,cedula,equipo,direccion}; // para agregar a la tabla creamos un arreglo en orden segun lo señalado
        
        modeloTabla.addRow(persona); //traemos a nuestro modelo tabla y añadimos a la fila
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextField cajaApellidos;
    private javax.swing.JTextField cajaCedula;
    private javax.swing.JTextField cajaDireccion;
    private javax.swing.JTextField cajaEquipo;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<Persona> comboPersonas;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaDatos;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaEquipo;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPersona;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
