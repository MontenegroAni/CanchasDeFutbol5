import java.util.Date;

public class Reserva {
	private Date fechaReserva;
	private Equipo equipo1, equipo2;


	public Reserva(Date fechaReserva, Equipo equipo1, Equipo equipo2){
		this.fechaReserva=fechaReserva;
		this.equipo1=equipo1;
		this.equipo2=equipo2;
	}

	public void setFechaReserva(Date fechaReserva){
		this.fechaReserva= fechaReserva;
	}

	public void setEquipo1(Equipo e1){
		this.equipo1=e1;
	}

	public void setEquipo2(Equipo e2){
		this.equipo2=e2;
	}

	public Equipo getEquipo1(){
		return equipo1;
	}

	public Equipo getEquipo2(){
		return equipo2;
	}

	private boolean hayJugadoresRepetidos(Equipo e1, Equipo e2){
		for (String jugadorEquipo1 : e1.getJugador()){
			for (String jugadorEquipo2 : e2.getJugador()){
				if (jugadorEquipo1 == jugadorEquipo2){
					return true;
				}
			}
		}
		return false;
	}	
	
}
