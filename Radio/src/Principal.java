
import java.util.*;
import java.io.*;

/**
 * 
 */
public class Principal {
    public static void main(String[] args) {

    	Carro carro = new Carro();			

    	boolean estado = carro.getEstado();
    	boolean frecuencia = carro.getFrecuencia();
    	double emisora = carro.getEmisora();
    	String s = "";
    	String f = "";
    	int i = 0;

		InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(input);
    	

    	while( i != 120){

    		if(estado == true){
    			s = " ON";
    		} 

    		if(estado == false){
    		s = "OFF";
    		f = "  ";
    		emisora = 0;
    		}

    		if (frecuencia == true){
    			f = "FM";
    		}

    		if (frecuencia == false){
    			f = "AM";
    		}

    	System.out.println("+--------------------------------------------+");
        System.out.println("|                 RADIO JAVA                 |");
    	System.out.println("+--------------------------------------------+");
    	System.out.println("+--------------------------------------------+");
        System.out.println("|   ["+s+"]  ["+f+"]  ["+emisora+"]                      |");
        System.out.println("|                                            |");
        System.out.println("|                                            |");
        System.out.println("|  (1)(2))(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)  |");
        System.out.println("+--------------------------------------------+");
        System.out.println("");
    	System.out.println("+--------------------------------------------+");
        System.out.println("|               INSTRUCCIONES                |");
    	System.out.println("+--------------------------------------------+");
        System.out.println("| INGRESE CARACTER PARA ACCIONAR	     |");
        System.out.println("|  [o] ENCENDER/APAGAR                       |");
        System.out.println("|  [a] CAMBIAR FRECUENCIA AM/FM		     |");
        System.out.println("|  [x] SALIR                                 |");
        System.out.println("|                                            |");
    	System.out.println("+--------------------------------------------+");
        System.out.println("");

        try{
        	i = console.read();
        }
        
        catch(IOException o){

            System.out.println("INPUT ERROR");
            System.exit(1);
        }

        catch(NumberFormatException o){
            System.out.println(o.getMessage() + "INPUT ERROR");
            System.exit(1);
        }

    		if (i == 111){
    			carro.ON_OFF();
    			estado = carro.getEstado();
    			emisora = carro.getEmisora();
    		}

    		if (i == 97 && estado != false){
    			carro.AM_FM();
    			frecuencia = carro.getFrecuencia();
    			emisora = carro.getEmisora();
    		}

		System.out.print("\033[H\033[2J");  /* Consultado de http://stackoverflow.com/questions/2979383/java-clear-the-console*/
        System.out.flush();
    	}

    }

}
