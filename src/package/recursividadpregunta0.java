
public class recursividadpregunta0{

    public static void main (String[] args)
    {
   
		// Leer Número ingresado
        long numero;
        numero = 467;


		int temporalContarDigitos = ContarDigitos(numero);
		System.out.println("cantidad total de dígitos: "+temporalContarDigitos);
	
    }
	
	// Contar la cantidad total de dígitos
	public static int ContarDigitos (long numero)
	{		
		// Variable Contador = 0
		int contador = 0;
		// Variable NúmeroTemp = Número ingresado
		long numerotemp = numero;
		// Mientras que haya el NúmeroTemp >0 
		while (numerotemp >0)
		{
			System.out.println("Se ha entrado al while "+ contador);
			// NúmeroTemp  = NúmeroTemp  / 10
			numerotemp = numerotemp /10;
			System.out.println("Se tiene este valor de numerotemp "+numerotemp);
            //System.out.println();
			// Contador = Contador + 1
			contador = contador +1;						
		}
		// Devolver Contador 
		return contador;
	}
}