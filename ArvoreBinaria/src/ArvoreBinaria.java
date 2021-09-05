/*
 * Representação da Raiz
 * */
public class ArvoreBinaria {

	Node raiz;
	
	Node buscaBinaria(Node raiz, int valor) {
		if(raiz == null) return null;
		
		if(valor == raiz.info) return raiz;
		
		if(valor > raiz.info) {
			return buscaBinaria(raiz.dir, valor);
		}
		else {
			return buscaBinaria(raiz.esq, valor);
		}
	}
	
	void remover(Node raiz, int valor) {
		//Buscar o pai do node cujo valor estou procurando
		if(raiz.info == valor) {
			//1. Essa raiz não tem filhos
			
			//2. Essa raiz tem um filho
			
			//3. Essa raiz tem dois filhos
		}
		else {
			
		}
	}
	
	Node sucessor(Node raiz) {
		if(raiz.dir != null) {
			return minimo(raiz.dir);
		}
		return null;
	}
	
	Node minimo(Node raiz) {
		if(raiz.esq != null) {
			return minimo(raiz.esq);
		}
		else {
			return raiz;
		}
		
	}
	
	public void inserirOrdenado(Node raiz, int valor) {
		if (valor > raiz.info) {
			//Inserir o valor a direita da raiz
			if(raiz.dir == null) {
				raiz.dir = new Node(valor);

			}
			else {
				inserirOrdenado(raiz.dir,valor);
			}
			
		}
		else {
			//Inserir o valor a esquerda da raiz
			if(raiz.esq == null) {
				raiz.esq = new Node(valor);

			}
			else {
				inserirOrdenado(raiz.esq,valor);
			}
		}
	}
}
