package exercicio3;

public class Lista {

	No inicio, fim;
	
	// m�todo para inserir um elemento na lista
	public void inserir(int dado) {
		No aux = new No(dado);
		if(inicio == null) {
			fim = aux;
		} else {
			aux.dir = inicio;
			inicio.esq = aux;
		}
		inicio = aux;		
	}
	
	// m�todo para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}

   
}
