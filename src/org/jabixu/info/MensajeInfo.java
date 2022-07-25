package org.jabixu.info;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Clase para la creación de mensajes de diálogo a mostrar al usuario.
 * @author JavierGR
 * @version 1.3
 */
public class MensajeInfo {

    /**
     * Constante para construir un mensaje de tipo ERROR
     */
    public static final int ERROR = JOptionPane.ERROR_MESSAGE;

    /**
     * Constante para construir un mensaje de tipo INFORMATION
     */
    public static final int INFORMATION = JOptionPane.INFORMATION_MESSAGE;

    /**
     * Constante para construir un mensaje de tipo WARNING
     */
    public static final int WARNING = JOptionPane.WARNING_MESSAGE;

    /**
     * Constante para construir un mensaje de tipo QUESTION
     */
    public static final int QUESTION = JOptionPane.QUESTION_MESSAGE;

    /**
     * Constante para construir un mensaje de tipo PLAIN
     */
    public static final int PLAIN = JOptionPane.PLAIN_MESSAGE;
    
    /**
     * Constante para construir un mensaje multilinea alineado a la derecha
     */
    public static final String RIGHT = "right";

    /**
     * Constante para construir un mensaje multilinea alineado en el centro
     */
    public static final String CENTER = "center";
    
    /**
     * Constante para construir un mensaje multilinea alineado a la izquierda
     */
    public static final String LEFT = "left";

    
    /**
     * Crea un mensaje general con el mensaje facilitado en x líneas, título, tipo e icono.
     * @param msg   mensaje a mostrar, separado en lineas
     * @param title <code>String</code> con el título del mensaje
     * @param tipo <code>int</code> con el tipo de mensaje; {@link org.jabixu.info.MensajeInfo#ERROR}, {@link org.jabixu.info.MensajeInfo#INFORMATION}, {@link org.jabixu.info.MensajeInfo#WARNING}, {@link org.jabixu.info.MensajeInfo#QUESTION}, or {@link org.jabixu.info.MensajeInfo#PLAIN}
     * @param icon <code>ImageIcon</code> con el icono en el mensaje
     * @param alignment <code>String</code> con el tipo de centrado; {@link org.jabixu.info.MensajeInfo#RIGHT}, {@link org.jabixu.info.MensajeInfo#CENTER} or {@link org.jabixu.info.MensajeInfo#LEFT}
     */
    public static void general(String[] msg, String title, int tipo, ImageIcon icon, String alignment){
        JOptionPane optionPane;
        if (msg.length == 0)
            optionPane = new JOptionPane(msg[0], tipo, JOptionPane.DEFAULT_OPTION, icon);
        else{
            String txt = "<html><body style='text-align: "+alignment+"'>";
            for (int i = 0; i < msg.length-1; i++){
                txt += msg[i] + "<br>";
            }
            txt += msg[msg.length-1] + "</html>";
            optionPane = new JOptionPane(new JLabel(txt, JLabel.CENTER), tipo, JOptionPane.DEFAULT_OPTION, icon);
        }
        JDialog dialog = optionPane.createDialog(title);
        if (icon != null)
            dialog.setIconImage(icon.getImage());  
        dialog.setModal(true);
        dialog.setVisible(true); 
       
    }
    
    /**
     * Crea un mensaje general con el mensaje facilitado en x líneas, título, tipo e icono.
     * @param msg   mensaje a mostrar, separado en lineas
     * @param title <code>String</code> con el título del mensaje
     * @param tipo <code>int</code> con el tipo de mensaje; {@link org.jabixu.info.MensajeInfo#ERROR}, {@link org.jabixu.info.MensajeInfo#INFORMATION}, {@link org.jabixu.info.MensajeInfo#WARNING}, {@link org.jabixu.info.MensajeInfo#QUESTION}, or {@link org.jabixu.info.MensajeInfo#PLAIN}
     * @param icon <code>ImageIcon</code> con el icono en el mensaje
     */
    public static void general(String[] msg, String title, int tipo, ImageIcon icon){
        general(msg, title, tipo, icon, LEFT); 
       
    }
    
    
    /**
     * Crea un mensaje general con el mensaje facilitado en x líneas, título y tipo.
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     * @param title <code>String</code> con el título del mensaje
     * @param tipo <code>int</code> con el tipo de mensaje; {@link org.jabixu.info.MensajeInfo#ERROR}, {@link org.jabixu.info.MensajeInfo#INFORMATION}, {@link org.jabixu.info.MensajeInfo#WARNING}, {@link org.jabixu.info.MensajeInfo#QUESTION}, or {@link org.jabixu.info.MensajeInfo#PLAIN}
     */
    public static void general(String[] msg, String title, int tipo){
        general(msg, title, tipo, null); 
       
    }    
    
    
    /**
     * Crea un mensaje general con el mensaje facilitado en x líneas y título.
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     * @param title <code>String</code> con el título del mensaje
     */
    public static void general(String[] msg, String title){
        general(msg, title, PLAIN); 
       
    }
    
    
    /**
     * Crea un mensaje general con el mensaje facilitado en x líneas.
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     */
    public static void general(String[] msg){
        general(msg, "General"); 
       
    }
    
    /**
     * Crea un mensaje general con el mensaje facilitado en 1 línea.
     * @param msg   <code>String</code> con el mensaje a mostrar
     */
    public static void general(String msg){
        general(new String[]{msg}); 
       
    }
    
    
    
    
    /**
     * Crea un mensaje info con el mensaje facilitado en x líneas y título.
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     * @param title <code>String</code> con el título del mensaje
     * @param alignment <code>String</code> con el tipo de centrado; {@link org.jabixu.info.MensajeInfo#RIGHT}, {@link org.jabixu.info.MensajeInfo#CENTER} or {@link org.jabixu.info.MensajeInfo#LEFT}
     */
    public static void info(String[] msg, String title, String alignment){
        JOptionPane optionPane;
        if (msg.length == 0)
            optionPane = new JOptionPane(msg[0], INFORMATION);
        else{
//            String txt = "<html>";
            String txt = "<html><body style='text-align: "+alignment+"'>";
            for (int i = 0; i < msg.length-1; i++){
                txt += msg[i] + "<br>";
            }
            txt += msg[msg.length-1] + "</html>";
            optionPane = new JOptionPane(new JLabel(txt, JLabel.CENTER), INFORMATION);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setModal(true);
        dialog.setVisible(true); 
       
    }
    
    
    /**
     * Crea un mensaje info con el mensaje facilitado en x líneas y título.
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     * @param title <code>String</code> con el título del mensaje
     */
    public static void info(String[] msg, String title){
        info(msg, "Info", LEFT); 
       
    }
    
    
    /**
     * Crea un mensaje info con el mensaje facilitado en x líneas
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     */
    public static void info(String[] msg){
        info(msg, "Info"); 
       
    }
    
    
    /**
     * Crea un mensaje info con el mensaje facilitado en 1 línea
     * @param msg   <code>String</code> con el mensaje a mostrar, separado en lineas
     */
    public static void info(String msg){
        info(new String[]{msg}); 
       
    }
    
    
    
    
    
    /**
     * Crea un mensaje error con el mensaje facilitado en x líneas y título.
     * 
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     * @param title <code>String</code> con el título del mensaje
     * @param alignment <code>String</code> con el tipo de centrado; {@link org.jabixu.info.MensajeInfo#RIGHT}, {@link org.jabixu.info.MensajeInfo#CENTER} or {@link org.jabixu.info.MensajeInfo#LEFT}
     */
    public static void error(String[] msg, String title, String alignment){
        JOptionPane optionPane;
        if (msg.length == 0)
            optionPane = new JOptionPane(msg[0], ERROR);
        else{
            String txt = "<html><body style='text-align: "+alignment+"'>";
            for (int i = 0; i < msg.length-1; i++){
                txt += msg[i] + "<br>";
            }
            txt += msg[msg.length-1] + "</html>";
            optionPane = new JOptionPane(new JLabel(txt, JLabel.CENTER), ERROR);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setModal(true);
        dialog.setVisible(true); 
       
    }
    
    /**
     * Crea un mensaje error con el mensaje facilitado en x líneas y título.
     * 
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     * @param title <code>String</code> con el título del mensaje
     */
    public static void error(String[] msg, String title){
        error(msg, "Error", LEFT); 
       
    }
    
    
    /**
     * Crea un mensaje error con el mensaje facilitado en x líneas
     * @param msg   array <code>String[]</code> con el mensaje a mostrar, separado en lineas
     */
    public static void error(String[] msg){
        error(msg, "Error"); 
       
    }
    
    /**
     * Crea un mensaje error con el mensaje facilitado en 1 línea
     * @param msg <code>String</code> con el mensaje a mostrar
     */
    public static void error(String msg){
        error(new String[]{msg}); 
       
    }
}
