package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		
		No aux = new No(dado);
		No i = inicio;

		if (inicio == null) {
			inicio = aux;
			fim = aux;
			
		} else if (aux.dado <= inicio.dado){
			inicio.esq = aux;
			aux.dir = inicio;
			inicio = aux;

		} else if (aux.dado >= fim.dado){
			fim.dir = aux;
			aux.esq = fim;
			fim = aux;

		} else{
			
			while(i != null){	
				
				if(aux.dado >= i.dado && aux.dado <= i.dir.dado){
					
					i.dir.esq = aux;
					aux.esq = i;
					aux.dir = i.dir;
					i.dir = aux;
					
					break;
					
				}
				
				i = i.dir;
				
			}
		}
		
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
