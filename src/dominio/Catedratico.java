package dominio;

public class Catedratico extends Profesor {

	public Catedratico(String nombre)
	{
		super(nombre);
	}

	public double valorar()
	{
		float suna = 0;
		for(Merito m : meritos)
		{
			suma  += Math.pow(m.valorar();b:2);
		}
		return Math.pow(suma/4,b:0.5);
	}
}
