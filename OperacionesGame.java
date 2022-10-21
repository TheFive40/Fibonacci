package JuegosMatematicos;

import java.util.Random;
import java.util.Scanner;

public class OperacionesGame {

	public static void main(String[] args) {
		Random r = new Random();
	    int resp,num1,num2,contCorrectas =0,num1Correcto = 0; //la Variable resp guarda la respuesta
	   //Ingresada por el usuario num1 y num2 son las variables que guardaran los dos valores 
	    //Que la maquina generara aleatoriamente  //En contCorrectas es el contador y Num1Correcto 
	    //Es el Numero correcto de la operacion osea el resultado que luego usaremos para ya sea sumar
	    //Multiplicar o dividir de manera aleatoria 
	    char sig;
	    boolean correcto = false;
	    Scanner leer = new Scanner(System.in);
	    char [] signo = {'+','-','*', '/', '^'};
	    int [] respCorrecta = new int[5];
	    for (int i = 0; i < 5; i++) {
	        if(correcto && i> 0){
	            System.out.println("Operacion numero " +(i+1)+":");
	            num2=r.nextInt(20);
	            sig = signo[r.nextInt(5)];
	            System.out.println(num1Correcto+""+ sig+"" + num2 + "= ");
	            resp = leer.nextInt();
	            switch(sig){
	                case '+':
	                    respCorrecta[i] = num1Correcto+num2;
	                    break;
	                case '-':
	                    respCorrecta[i] = num1Correcto-num2;
	                    break;
	                case '*':
	                    respCorrecta[i] = num1Correcto*num2;
	                    break;
	                case '/':
	                	respCorrecta[i] = num1Correcto/num2;
	                case '^':
	                respCorrecta[i] = (int) Math.pow(num1Correcto, num2);

	            }//switch
	            if(respCorrecta[i] == resp){
	                correcto = true;
	                num1Correcto = respCorrecta[i];
	                contCorrectas++;
	            }else{
	                System.out.println("Respuesta incorrecta!\nLa respuesta correcta es: " + respCorrecta[i] +
	                        "\nCantidad de respuestas correctas: "+ contCorrectas);
	                break;
	            }
	 
	 
	        }else{
	            System.out.println("Operacion numero " +(i+1)+":");
	            num1=r.nextInt(20);
	            num2=r.nextInt(20);
	            sig = signo[r.nextInt(5)];
	            System.out.println(num1+""+ sig +""+ num2 + "= ");
	            resp = leer.nextInt();
	            switch(sig){
	                case '+':
	                    respCorrecta[i] = num1+num2;
	                    break;
	                case '-':
	                    respCorrecta[i] = num1-num2;
	                    break;
	                case '*':
	                    respCorrecta[i] = num1*num2;
	                    break;
	                    
	                case '/':
	                	respCorrecta[i] = num1/num2;
	                case '^':
	                	respCorrecta[i] = (int) Math.pow(num1, num2);
	            }//switch
	            if(respCorrecta[i] == resp){
	                correcto = true;
	                num1Correcto = respCorrecta[i];
	                contCorrectas++;
	            }else{
	                System.out.println("Respuesta incorrecta!\nLa respuesta correcta es: " + respCorrecta[i] +
	                        "\nCantidad de respuestas correctas: "+ contCorrectas);
	                break;
	            }
	        }//if
	    }
		
	}

}
