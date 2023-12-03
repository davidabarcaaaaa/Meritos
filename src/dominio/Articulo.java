package dominio;

public class Articulo extends Merito {

	protected float impacto;

	public Artiiculo(String titulo, float impacto)
	{ 
		super(titulo);
		this.impacto = impacto;
	}

	public float valorar()
	{
		return impacto;
	}
