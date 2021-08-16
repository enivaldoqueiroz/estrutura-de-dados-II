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
