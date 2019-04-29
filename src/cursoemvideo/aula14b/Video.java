package cursoemvideo.aula14b;

public class Video {
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	public Video(String titulo, int avaliacao, int views, int curtidas, boolean reproduzindo) {
		this.titulo = titulo;
		this.avaliacao = avaliacao;
		this.views = views;
		this.curtidas = curtidas;
		this.reproduzindo = reproduzindo;
	}
	public Video() {
	}
	
	
}
