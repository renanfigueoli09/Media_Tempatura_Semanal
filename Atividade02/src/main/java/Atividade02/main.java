package Atividade02;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[]args){
        float media = 0;
         float segunda_feira = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura de Segunda-Feira"));
         float terça_feira = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura de Terça-Feira"));
         float quarta_feira = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura de Quarta-Feira"));
         float quinta_feira = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura de Quinta-Feira"));
         float sexta_feira = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura de Sexta-Feira"));
         float sabado = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura de Sabado"));
         float domingo = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura de Domingo"));
  
         
           Semana e01 = new Semana(media);
        
        e01.CalculaMedia(media);
        e01.VerificaMedia(media);
        
    }
}
