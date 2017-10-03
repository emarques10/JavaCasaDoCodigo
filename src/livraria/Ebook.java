package livraria;

public class Ebook extends Livro{
	
	private String watermark;
	public Ebook (Autor autor) {
		super(autor);
	}
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		System.out.println("aplicando desconto no Ebook");
		return aplicaDescontoDe(porcentagem);
	}
	
	
	public String getWatermark() {
		return watermark;
	}
	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}
	
	
	
}
