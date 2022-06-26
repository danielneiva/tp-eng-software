import java.time.LocalDateTime;

public class Partida {
	protected Estadio local;
	protected LocalDateTime dataHora;
	protected Equipe equipeUm;
	protected Equipe equipeDois;
	protected int golsEquipeUm;
	protected int golsEquipeDois;
	
	public Estadio getLocal() {
		return local;
	}
	public void setLocal(Estadio local) {
		this.local = local;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Equipe getEquipeUm() {
		return equipeUm;
	}
	public void setEquipeUm(Equipe equipeUm) {
		this.equipeUm = equipeUm;
	}
	public Equipe getEquipeDois() {
		return equipeDois;
	}
	public void setEquipeDois(Equipe equipeDois) {
		this.equipeDois = equipeDois;
	}
	public int getGolsEquipeUm() {
		return golsEquipeUm;
	}
	public void setGolsEquipeUm(int golsEquipeUm) {
		this.golsEquipeUm = golsEquipeUm;
	}
	public int getGolsEquipeDois() {
		return golsEquipeDois;
	}
	public void setGolsEquipeDois(int golsEquipeDois) {
		this.golsEquipeDois = golsEquipeDois;
	}
	
}
