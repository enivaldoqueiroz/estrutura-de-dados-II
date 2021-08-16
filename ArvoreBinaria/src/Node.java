/*
 * Representação do Nó
 * 
 * */
public class Node {
	int info;
	Node esq; //Esquerda
	Node dir; //Direita
	
	public Node() {
		esq = null;
		dir = null;
	}
	
	public Node(int v) {
		info = v;
		esq = null;
		dir = null;
	}
	
}
