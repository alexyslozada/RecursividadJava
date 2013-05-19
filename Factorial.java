public class Factorial{

	public Factorial(){

		int numero = 5;

		// Utilizando un Ciclo
		System.out.println(
			"El factorial de "+numero+
			" es: "+getFactorialConCiclo(numero)
		);

		// De forma recursiva
		System.out.println(
			"El factorial de "+numero+
			" es: "+getFactorialRecursivo(numero));
	}

	// Método que utiliza un ciclo
	public int getFactorialConCiclo(int n){
		int acumulado = 1;
		for(int i=n; i>=1; i--){
			acumulado *= i;
		}
		return acumulado;
	}

	// Método recursivo
	public int getFactorialRecursivo(int n){
		if(n==0){
			return 1;
		} else {
			return n*getFactorialRecursivo(n-1);
		}
	}

	// Main de la clase Factorial
	public static void main(String args[]){
		new Factorial();
	}
}