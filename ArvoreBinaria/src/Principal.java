
public class Principal {

	public static void main(String[] args) {
		Principal p = new Principal();
		
	}
	
	public Principal() {
		/*ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
		arvoreBinaria.raiz = new Node();
		arvoreBinaria.raiz.info = 9;
		
		arvoreBinaria.raiz.esq = new Node();
		arvoreBinaria.raiz.esq.info = 5;
		arvoreBinaria.raiz.esq.esq = null;
		arvoreBinaria.raiz.esq.dir = null;
		
		arvoreBinaria.raiz.dir = new Node();
		arvoreBinaria.raiz.dir.info = 13;
		arvoreBinaria.raiz.dir.esq = null;
		arvoreBinaria.raiz.dir.dir = null;*/
		
		ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
		arvoreBinaria.raiz = new Node(9);
		
		arvoreBinaria.inserirOrdenado(arvoreBinaria.raiz, 13);
		arvoreBinaria.inserirOrdenado(arvoreBinaria.raiz, 5);
		arvoreBinaria.inserirOrdenado(arvoreBinaria.raiz, 4);
		arvoreBinaria.inserirOrdenado(arvoreBinaria.raiz, 8);
		arvoreBinaria.inserirOrdenado(arvoreBinaria.raiz, 11);
		arvoreBinaria.inserirOrdenado(arvoreBinaria.raiz, 16);
		
		Node node = arvoreBinaria.buscaBinaria(arvoreBinaria.raiz, 11);
		System.out.println(node.info);
		
		System.out.println(arvoreBinaria.buscaBinaria(arvoreBinaria.raiz.info, 16));

//		preOrdem(arvoreBinaria.raiz);
//		System.out.println();
//		emOrdem(arvoreBinaria.raiz);
//		System.out.println();
//		posOrdem(arvoreBinaria.raiz);
	}
	
	public void preOrdem(Node raiz) {
		if(raiz == null) return;
		System.out.print(raiz.info + "-");
		preOrdem(raiz.esq);
		preOrdem(raiz.dir);
	}
	
	public void emOrdem(Node raiz) {
		if(raiz == null) return;
		emOrdem(raiz.esq);
		System.out.print(raiz.info + "-");
		emOrdem(raiz.dir);
	}
	
	public void posOrdem(Node raiz) {
		if(raiz == null) return;
		posOrdem(raiz.esq);
		posOrdem(raiz.dir);
		System.out.print(raiz.info + "-");
	}

}
