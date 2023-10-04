package semana_07;

public class ArregloCodigos {
	private int[] codigo;
	private int indice;

	public ArregloCodigos() {
		codigo = new int[10];
		indice = 0;
	}

	public int tamanio() {
		return indice;
	}

	public int obtener(int i) {
		return codigo[i];
	}

	private void ampliarArreglo() {
		int[] aux = codigo;
		codigo = new int[indice + 10];
		for (int i = 0; i < indice; i++)
			codigo[i] = aux[i];
	}

	public void adicionar(int numero) {
		if (indice == codigo.length)
			ampliarArreglo();
		codigo[indice] = numero;
		indice++;
	}

	private void intercambiar(int pos1, int pos2) {
		int aux = codigo[pos1];
		codigo[pos1] = codigo[pos2];
		codigo[pos2] = aux;
	}

	public void intercambiarSegPen() {
		if (indice > 2) {
			intercambiar(1, indice - 2);
		}
	}

	private void eliminar(int pos) {
		for (int i = pos; i < indice - 1; i++) {
			codigo[i] = codigo[i + 1];
		}
		indice--;
	}

	public void eliminarPrimero() {
		int pos01 = 0;
		eliminar(pos01);
	}

	public int posCodigo() {
		for (int i = indice - 1; i >= 0; i--) {
			if (codigo[i] >= 1000 && codigo[i] <= 1111) {
				return i;
			}
		}
		return -1;
	}

	public void intercambiarCodigo() {
		if (indice > 2 && posCodigo() != -1) {
			intercambiar(posCodigo(), 2);
		}
	}

	public void eliminarCodigo() {
		if (posCodigo() != -1) {
			int pos01 = posCodigo();
			eliminar(pos01);
		}
	}
}