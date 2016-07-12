import java.util.*;

public class Carro implements Radio{
    public Carro() {}
    private float emisora;
    private boolean estado;
    private boolean frecuencia;
    private double[] botonesAM;
    private double[] botonesFM;
    
    public void setEmisora(float emisora){
        this.emisora = emisora;
    }
    
    public double getEmisora(){
        return emisora;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public void setFrecuencia(boolean frecuencia){
        this.frecuencia = frecuencia;
    }
    
    public boolean getFrecuencia(){
        return frecuencia;
    }
    
    public void setBotonesAM(int numBoton, double emisora){
        botonesAM[numBoton] = emisora;
    }
    
    public double getBotonesAM(int numBoton){
        return botonesAM[numBoton];
    }
    
        public void setBotonesFM(int numBoton, double emisora){
        botonesFM[numBoton] = emisora;
    }
    
    public double getBotonesFM(int numBoton){
        return botonesFM[numBoton];
    }
    
    public void ON_OFF() {
        estado = !estado;
    }

    public void AM_FM() {
        frecuencia = !frecuencia;
        if (frecuencia == false){
            emisora = 530;
        } else {
            emisora = 89.9;
        }
    }

    public void Cambio_de_Emisora(boolean frecuencia) {
 
    }

    public void Guardar_Emisora(int boton) {
        
    }

    public void Seleccionar_emisora_guardada() {
        
    }

    public void Guardar_seleccion() {
        
    }

    public void MenuOn() {
        
    }

    public void MenuOff() {
        
    }

}
