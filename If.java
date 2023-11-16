import java.io.*;

public class indice_de_masa_corporal {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double imc;
		double masa;
		double talla;
		double tallatotal;
		System.out.println("ingresar valor de masa");
		masa = Double.parseDouble(bufEntrada.readLine());
		System.out.println("ingresar valor de talla");
		talla = Double.parseDouble(bufEntrada.readLine());
		tallatotal = talla*talla;
		imc = masa/tallatotal;
		System.out.println("imc="+imc);
		if (imc<18.5) {
			System.out.println("insuficiencia_ponderal");
		} else {
			if (imc>18.5 && imc<24.9) {
				System.out.println("intervalo_normal");
			} else {
				if (imc>25.0 && imc<29.9) {
					System.out.println("preobesidad");
				} else {
					if (imc>30.0 && imc<34.4) {
						System.out.println("obesidad_clase_I");
					} else {
						if (imc>35.0 && imc<39.9) {
							System.out.println("obesidad_clase_II");
						} else {
							if (imc>40.0) {
								System.out.println("obesidad_clase_III");
							}
						}
					}
				}
			}
		}
	}


}
