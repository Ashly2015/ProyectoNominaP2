/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Sucely Alvarez
 */
public class Instrucciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Instrucciones
     */
    public Instrucciones() {
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();

        jLabel3.setText("<html>- Ingresamos nuestro usuario y contraseña en el login <p>\"\n" +
            "    + \"- En la ventana principal podemos salir directamente en el menu \\\"Archivo\\\" <p>\"\n" +
            "    + \"- El siguiente menu es el de \\\"Catalogo\\\" ahi se encuntra la gestion de:\"\n" +
            "    + \"Empleados, Departamentos y Puestos. \"\n" +
            "    + \"En empleados puede modificar los datos de los empleados asi como su estado ya sea activo o inactivo al igual que en Puestos y Depatamentos con el manejo de los diferentes botones <p> \"\n" +
            "    + \"- En el menu \\\"procesos\\\" tenemos la opcion nomina, iniciamos metiendo una fecha para la generacion de la nomina <p> luego escogemos el nombre de un empleado de la lista, asi como su sueldo base <p> luego ingresamos los ingresos extra como:<p> las comisiones<p>bonificaciones extra<p>bonificacion incentivo que es por defecto 250Q<p> y daria como resultado un sueldo devengado<p>luego vendrian los descuentos<p>como el IGGS, el ISR que se calcularian en base a un porcentaje predicho<p>los descuentos a ingresar serian:<p>anticipos, descuentos judiciales y otros descuentos no descritos <p> luego de eso se muestra el total descuentos y el total liquido como final.<p>"
            + "      -En el siguiente menu \"Herramientas\" tenemos otra clasificacion de gestores, conceptos, usuarios y aplicaciones. Al igual que en la primera aqui agregaremos y modificaremos a placer estos titulos con sus diferentes objetos:<p>para Concepto: <p>seleccionando el empleado deseado, y declarandole un nombre al concepto para aplicarselo a dicho empleado<p>tambien se puede modificar un concepto y eliminarlo con los diferentes botones de la pantalla<Para Usuarios: <p> el parametro de busqueda es el codigo usuario y se modificara, agregara o eliminara un usuario <p> Para Aplicaciones: <p> los parametros de busqueda seran el puesto y la exepcion y el usuario debera añadir el nombre de la aplicacion que desee para buscarla, agregarla, modificarla o eliminarla.  <html>");
        jScrollPane1.setViewportView(jLabel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(438, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(292, 292, 292))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
