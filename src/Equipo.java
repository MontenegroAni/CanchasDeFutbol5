import java.util.List;

public class Equipo {
	private String nombre;
	private List<String> jugadores;
	private int max_jugadores;

	public Equipo(String nombre, int max_jugadores){
		this.nombre=nombre;
		this.max_jugadores=max_jugadores;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setMaxJugadores(int max_jugadores){
		this.max_jugadores=max_jugadores;
	}

	private boolean maximoJugadoresSuperado(){
		if(this.jugadores.size()>=getMaxJugadores()){
			return true;
			}
		else return false;
	}

	public void addJugador(String jugador){
		if(!maximoJugadoresSuperado()){
			this.jugadores.add(jugador); 
			}
		else System.out.println("Máximo jugadores superado.");
	}

	public String getNombre(){
		return nombre;
	}

	public List<String> getJugador(){
		return this.jugadores; 
	}

	public int getMaxJugadores(){
		return max_jugadores;
	}
}
