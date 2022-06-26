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
	
	private void  AcrescentaGolEquipeUm() {
		golsEquipeUm += 1;
		
	}
	
	private void  AcrescentaGolEquipeDois() {
		golsEquipeDois += 1;
	}
	
	private void Resultado() {
		if(golsEquipeUm > golsEquipeDois) {
			equipeUm.AtualizaPontuacao(3);
			
			equipeUm.IncrementaVitoria();
			equipeDois.IncrementaDerrota();
			
			equipeUm.AtualizaSaldoGols(golsEquipeUm, golsEquipeDois);
			equipeDois.AtualizaSaldoGols(golsEquipeDois, golsEquipeUm);
		}
		else if(golsEquipeUm < golsEquipeDois) {
			equipeDois.AtualizaPontuacao(3);
			
			equipeDois.IncrementaVitoria();
			equipeUm.IncrementaDerrota();
			
			equipeUm.AtualizaSaldoGols(golsEquipeUm, golsEquipeDois);
			equipeDois.AtualizaSaldoGols(golsEquipeDois, golsEquipeUm);
		}
		else {
			equipeUm.IncrementaEmpate();
			equipeDois.IncrementaEmpate();
			
			equipeUm.AtualizaPontuacao(1);
			equipeDois.AtualizaPontuacao(1);
			
			equipeUm.AtualizaSaldoGols(golsEquipeUm, golsEquipeDois);
			equipeDois.AtualizaSaldoGols(golsEquipeDois, golsEquipeUm);
		}
	}
	
}
