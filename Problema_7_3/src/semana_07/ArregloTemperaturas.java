package semana_07;

public class ArregloTemperaturas {

	// Atributos privados
	private double[] temperatura;
	private int indice;

	// Constructor
	public ArregloTemperaturas() {
		temperatura = new double[10];
		indice = 0;
	}

	// Operaciones p�blicas b�sicas
	public int tamanio() {
		return indice;
	}

	public double obtener(int i) {
		return temperatura[i];
	}

	public void adicionar(double numero) {
		if (indice == temperatura.length)
			ampliarArreglo();
		temperatura[indice] = numero;
		indice++;
	}

	// Operaciones p�blicas complementarias
	public void eliminarAlFinal() {
		indice--;
	}

	public void eliminarTodo() {
		indice = 0;
	}

	// Operaciones privadas
	private void ampliarArreglo() {
		double[] aux = temperatura;
		temperatura = new double[indice + 10];
		for (int i = 0; i < indice; i++)
			temperatura[i] = aux[i];
	}

	public double temperaturaPromedio() {
		double suma = 0;
		for (double valor : temperatura) {
			suma += valor;
		}
		return suma / indice;
	}

	public int posPrimeraTemperaturaFebril() {
		int i = 0;
		for (double valor : temperatura) {
			if (valor > 37.2) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public int buscarUltimaTemperaturaFebril() {
		for (int i = indice - 1; i >= 0; i--) {
			if (temperatura[i] > 37.2) {
				return i;
			}
		}
		return -1;
	}

	public void remplazarPrimeraTemperaturaFebril() {
		if (posPrimeraTemperaturaFebril() != -1) {
			temperatura[posPrimeraTemperaturaFebril()] = temperatura[buscarUltimaTemperaturaFebril()];
		}
	}

	public void remplazarUltimaTemperaturaFebril() {
		if (buscarUltimaTemperaturaFebril() != -1) {
			temperatura[buscarUltimaTemperaturaFebril()] = temperaturaPromedio();
		}
	}

	public void eliminarPrimeraTemperaturaFebril() {
		int pos1 = posPrimeraTemperaturaFebril();
		if (pos1 != -1) {
			eliminar(pos1);
		}
	}

	private void eliminar(int pos) {
		for (int i = pos; i < indice - 1; i++) {
			temperatura[i] = temperatura[i + 1];
		}
		indice--;
	}
}