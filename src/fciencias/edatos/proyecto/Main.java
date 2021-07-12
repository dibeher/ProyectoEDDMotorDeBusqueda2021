package fciencias.edatos.proyecto;

import fciencias.edatos.proyecto.gui.MarcoTexto;
import java.io.File;
import java.text.ParseException;
import java.io.IOException;
import fciencias.edatos.proyecto.LectorDeTextos;

public class Main /*extends JButton */{

  public static void main(String[] args) throws IOException{

    MarcoTexto miMarco = new MarcoTexto();
    miMarco.cerrar();

    LectorDeTextos ldt = new LectorDeTextos();
    //busca la carpeta textos
    File currentDirFile = new File(".");
    String path = currentDirFile.getAbsolutePath();
    String rightPath = path.replace(".", "Textos");
    File folder = new File(rightPath);
    ldt.imprimeArchivos(folder);
  }
}
