/*
 * Representação da Raiz
 * */
public class ArvoreBinaria {

	Node raiz;
	
	public void inserirOrdenado(Node raiz, int valor) {
		if (valor > raiz.info) {
			//Inserir o valor a direita da raiz
			if(raiz.dir == null) {
				raiz.dir = new Node();
				raiz.dir.info = valor;
				raiz.dir.esq = null;
				raiz.dir.dir = null;
			}
			else {
				inserirOrdenado(raiz.dir,valor);
			}
			
		}
		else {
			//Inserir o valor a esquerda da raiz
			if(raiz.esq == null) {
				raiz.esq = new Node();
				raiz.esq.info = valor;
				raiz.esq.esq = null;
				raiz.esq.dir = null;
			}
			else {
				inserirOrdenado(raiz.esq,valor);
			}
		}
	}
}
