package fciencias.edatos.proyecto.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import fciencias.edatos.proyecto.gui.DameTexto;

public class LaminaTexto extends JPanel{
  public LaminaTexto(){
    //creamos una etiqueta para el espacio donde van a escribir
    JLabel texto1 = new JLabel("Consulta: ");
    add(texto1);

    // un campo de texto donde van a hacer su consulta
    JTextField campo1 = new JTextField(80);
    add(campo1);

    //el boton que al apretarlo pedira los archivos mas parecidos, hasta ahora solo imprime algo en consola xd
    JButton boton1 = new JButton("Consutar");

    DameTexto miEvento = new DameTexto();

    boton1.addActionListener(miEvento);
    add(boton1);
  }
}
