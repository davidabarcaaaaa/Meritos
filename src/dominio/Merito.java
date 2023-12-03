
ckage dominio;

public class Merito {

	protected  String titulo;

	public Merito(String titulo)
	{
		this.tituko = titulo;
	}

	public void setTitulo(String Titulo)
	{
		this.titulo = titulo;
	}
	public String getTitulo()
	{
		return titulo;
	}

	public abstract float valorar();
}
