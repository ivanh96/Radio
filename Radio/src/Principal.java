
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
    	String e = "";
    	int i = 0;

		InputStreamReader input = new InputStreamReader(System.in); /* cosultado de http://www.scit.wlv.ac.uk/~in8297/CP4044/workshops/w03.html */
        BufferedReader console = new BufferedReader(input);			/* input de la consola convertido a int */
    	

    	while( i != 120){

    		if(estado == false){ 									/* verifica si el estado de encendido o apagado, para apagado es un menu diferente */
    			s = "[OFF]";

    	System.out.println("+--------------------------------------------+");
        System.out.println("|                 RADIO JAVA                 |");
    	System.out.println("+--------------------------------------------+");
    	System.out.println("+--------------------------------------------+");
        System.out.println("|   "+s+"  [  ]  [  ]                        |");
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

    }

    try{										/* try y catch del input, solo funcionan los que estan definidos */
        	i = console.read();
        }
        
        catch(IOException o){
            System.exit(1);
        }
        catch(NumberFormatException o){
            System.exit(1);
        }
        System.out.print("\033[H\033[2J");		/* Consultado de http://stackoverflow.com/questions/2979383/java-clear-the-console*/
        System.out.flush();						/* se corre la consola hasta el tope , creo que no funciona en Windows, solo en consolas UNIX */


    		if (i == 111){						/* si se ingresa o = 111 en ASCII, se enciende o apaga la radio */
    			carro.ON_OFF();
    			estado = carro.getEstado();
    			emisora = carro.getEmisora();
    		}

    		if (i == 97 && estado != false){	/* si se ingrea a = 97 y no esta apagada la radio, se cambia de AM a FM y viscevers */
    			carro.AM_FM();
    			frecuencia = carro.getFrecuencia();
    			emisora = carro.getEmisora();
    		}

    		if(estado == true){					/* si el estado de encendido es true, el radio esta ON */
    			s = "[ON]";
    			emisora = carro.getEmisora();
    			frecuencia = carro.getFrecuencia();


    		if (frecuencia == true){			/* si la frecuencia es true, el radio esta en FM */
    			f = "[FM]";
				emisora = carro.getEmisora();
				e = Double.toString(emisora);
    		}

    		if (frecuencia == false){			/* si la frecuencia es false, el radio esta en AM */
    			f = "[AM]";
				emisora = carro.getEmisora();
				e = String.valueOf((int)emisora);
    		}

    	

    	System.out.println("+--------------------------------------------+");
        System.out.println("|                 RADIO JAVA                 |");
    	System.out.println("+--------------------------------------------+");
    	System.out.println("+--------------------------------------------+");
        System.out.println("|   "+s+"  "+f+"  ["+e+"]                       |");
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

    }


    	}

    }

}
