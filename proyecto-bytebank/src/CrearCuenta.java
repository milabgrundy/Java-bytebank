public class CrearCuenta {
	
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();  // Cuenta es la class
		primeraCuenta.saldo = 1000;
		//primeraCuenta.pais = "Peru"; No compila
		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
	}

}
