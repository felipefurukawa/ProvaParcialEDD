package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// m�todo para inserir um elemento na lista.
	// a inser��o deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {

		No aux = new No(dado);
		No pq = inicio;

		if(inicio == null){
			
			inicio = aux;
			fim = aux;
			
		} else if(aux.dado >= fim.dado ) {

			fim.dir = aux;
			aux.esq = fim;
			fim = aux;

		} else if (aux.dado <= inicio.dado) {
			inicio.esq = aux;
			aux.dir = inicio;
			inicio = aux;

		} else {

			while (pq != null) {

				if (aux.dado > pq.dado && aux.dado <= pq.dir.dado) {

					aux.dir = pq.dir;
					aux.esq = pq;
					pq.dir = aux;
					aux.dir.esq = aux;

					break;
				}
				
				pq = pq.dir;
			}

		}
		
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
