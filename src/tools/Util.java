/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 *
 * @author u06716483144
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if ((componentes[i]) instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            } else if ((componentes[i]) instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            } else {
                ((JCheckBox) componentes[i]).setSelected(false);
            }

        }
    }
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
  public static boolean perguntar(String cad) {
        JOptionPane.showConfirmDialog(null, cad);
        return true;
        
      
    }
    public static int strToInt(String num) {
        return Integer.valueOf(num);
        
    }
    
    public static String intToString(int num) {
        return String.valueOf(num);
    }
    
    public static double strToDouble(int num) {
        return 0;
    }
    public static String DoubleToString(int num) {
        return "";
    }
    public static Date strToDate(String data) {
        return null;
    }
    public static String dateToStr(Date data) {
        return "";
    }
    
    //primeiro commit - Pacotes tools e view Util.java finalizado
    //2 commit tela principal e dos cadastros finalizado
    //3 commit telas cadastros usando o util.java
    
    
    
    
}
