package dominio
import java.util.ArrayList;

public abstract class Profesor { 

	protected ArrayList<Merito> meritos = new ArrayList<>();
	protected String nombre:

	public Profesor()
	{ 
		meritos = new ArrayList<>();
	}

	public abstract float valorarMeritos();
	
	public Profesor annadirMerito(Merito m)
	{
		meritos.add(m);
		return this;
	}
}



~
~
~
