package livraria;

public class Livro {
	
	String nome;
	String descricao;
	private double valor;
	String isbn;
	Autor autor;
	
	
	public Livro(Autor autor) {
		this();
		this.autor = autor;
	}
	public Livro() {
		this.isbn = "000-00-00000-00-0";
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro";
		System.out.println(mensagem);
		System.out.println("Nome: "+nome);
		System.out.println("Descri��o: "+descricao);
		System.out.println("Valor: "+valor);
		System.out.println("ISBN: "+isbn);
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("--");
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		this.valor -= this.valor * porcentagem;
		System.out.println("aplicando desconto no Livro");
		return true;
	}
	

}
