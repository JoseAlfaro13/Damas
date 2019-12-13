/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
/**
 *
 * @author Asus
 */
class AcercaDe extends JDialog implements ActionListener {
    
    //Declarar Variables
    private JButton cerrar;


    AcercaDe(){
        //Propiedades del JDialog
        this.setTitle("Acerca de...");
        this.setLayout(null);
        this.setSize(450,170);
        this.setResizable(false);
        JLabel version,autor,descripcion,titulo;

		this.setLocationRelativeTo(null);
		
        //Texto Central
        titulo = new JLabel("Juego de Damas");
        add(titulo);
        titulo.setBounds(10, 10, 350, 27);
        titulo.setFont(new Font("Titulo",Font.BOLD + Font.ITALIC,22));

        version = new JLabel("Versión: Original XD");
        version.setBounds(40, 70, 350, 15);
        add(version);

        autor = new JLabel("Autor: Bruno ALdair Rubio Infantes");
        autor.setBounds(40, 100, 350, 15);
        add(autor);

        descripcion = new JLabel("Juego de Damas Proyecto Progrmacion");
        descripcion.setBounds(30, 40, 350, 15);
        add(descripcion);


        //Creando Botones.
        cerrar = new JButton("Cerrar");
        add(cerrar);
        cerrar.setBounds(350,115,80,22);
        cerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        //Accion del boton Cerrar
        this.dispose();
    }


}
