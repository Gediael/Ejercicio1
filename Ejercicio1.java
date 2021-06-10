import java.util.Scanner;
public class Ejercicio1{

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int n, par=0, impar=0;

	System.out.println("Ingrese un numero entero porfavor ");
	n = entrada.nextInt();

	for (int i=1; i <= n ; i++ ) {

	int numero = (int)(Math.random()*100+1);
	System.out.println(numero);

		if (numero % 2 == 0){
			par =  par +1;	
			}else {
			impar = impar + 1;
			} 

	}

		System.out.println(" Numeros  pares: " + par);

		System.out.println(" Numeros impares: " + impar);
	}

}