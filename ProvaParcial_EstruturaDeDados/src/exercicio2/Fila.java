package exercicio2;

public class Fila {

	No inicio, fim;
	
	// m�todo para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// m�todo para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		
		if (inicio == null) {
			System.out.println("A fila est� vazia");
		} else {
			No aux;
			inicio = aux.dir;
			aux = null;
		}
	}
	
	// m�todo para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		
		No aux = inicio;
		
		while (aux != null) {
			
			System.out.println("{Nome do motorista: " + aux.motorista.getNome() 
			+ "} {Placa do carro: " + aux.motorista.getPlaca() + "}");
			
			aux = aux.dir;
		}
		
	}
}
