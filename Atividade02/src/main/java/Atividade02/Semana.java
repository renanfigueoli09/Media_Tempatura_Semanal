package Atividade02;


import javax.swing.JOptionPane;

public class Semana {
    float[] semana = new float[6];
    private float media;

    public Semana(float segunda_feira, float terça_feira, float quarta_feira, float quinta_feira, float sexta_feira,
    float sabado,float domingo){
        segunda_feira = semana[0];
        terça_feira = semana[1];
        quarta_feira = semana[2];
        quinta_feira = semana[3];
        sexta_feira = semana[4];
        sabado = semana[5];
        domingo = semana[6];
    }
    public Semana(float media){
        this.media=media;
    }


    public float[] getSemana() {
        return semana;
    }
    
    public double getMedia() {
        return media;
    }

    public void setSemana(float[] semana) {
        this.semana = semana;
    }

    public void setMedia(float media) {
        this.media = media;
    }
 
    public void CalculaMedia(float media){
        float auxi=0;
       for(int i=0;i<7;i++){
            this.media=semana[i]+auxi;
        }
        media=media/7;
        String men= "A media é:"+media;
        JOptionPane.showMessageDialog(null, men);
   }
    
    public void VerificaMedia(float media){
        float sub=0;
        String mensagem = "Dias com temapraturas acima da media";
  
        JOptionPane.showMessageDialog(null, mensagem);
        if(semana[0]>media){
            sub=media-semana[0];
            String mensagemS = "Segunda-feira estar"+sub+"acima da media";
            JOptionPane.showMessageDialog(null, mensagemS);
            
        }
        else if(semana[1]>media){
                sub=semana[1]-media;
            String mensagemS = "Terça-feira estar"+sub+"acima da media";
            JOptionPane.showMessageDialog(null, mensagemS);
            }
        else if(semana[2]>media){
            sub=semana[2]-media;
            String mensagemS = "Quarta-feira estar"+sub+"acima da media";
            JOptionPane.showMessageDialog(null, mensagemS);
        }
        else if(semana[3]>media){
            sub=semana[3]-media;
            String mensagemS = "Quinta-feira estar"+sub+"acima da media";
            JOptionPane.showMessageDialog(null, mensagemS);
        }
        else if(semana[4]>media){
            sub=semana[4]-media;
            String mensagemS = "Sexta-feira estar"+sub+"acima da media";
            JOptionPane.showMessageDialog(null, mensagemS);
        }
        else if(semana[5]>media){
            sub=semana[5]-media;
            String mensagemS = "Sabado estar"+sub+"acima da media";
            JOptionPane.showMessageDialog(null, mensagemS);
        }
        else if(semana[6]>media){
            sub=semana[6]-media;
            String mensagemS = "Domingo estar"+sub+"acima da media";
            JOptionPane.showMessageDialog(null, mensagemS);
        }
        }

    

    
        
    }

    

