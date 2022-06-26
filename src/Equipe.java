
public class Equipe {
	protected int quantidadeInscritos;
	protected int pontuacao;
	protected int jogos;
	protected int vitorias;
	protected int empates;
	protected int derrotas;
	protected int golsP;
	protected int golsC;
	protected int saldoGols;
	
	
	public int getQuantidadeInscritos() {
		return quantidadeInscritos;
	}
	public void setQuantidadeInscritos(int quantidadeInscritos) {
		this.quantidadeInscritos = quantidadeInscritos;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public int getJogos() {
		return jogos;
	}
	public void setJogos(int jogos) {
		this.jogos = jogos;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getGolsP() {
		return golsP;
	}
	public void setGolsP(int golsP) {
		this.golsP = golsP;
	}
	public int getGolsC() {
		return golsC;
	}
	public void setGolsC(int golsC) {
		this.golsC = golsC;
	}
	public int getSaldoGols() {
		return saldoGols;
	}
	public void setSaldoGols(int saldoGols) {
		this.saldoGols = saldoGols;
	}
	
	public void AtualizaPontuacao(int pontuacaoPartida) {
		this.pontuacao += pontuacaoPartida;
	}
	
	public void AtualizaSaldoGols(int golsMarcados, int golsSofridos) {
		int saldoPartida = golsMarcados + golsSofridos;
		
		this.golsC += golsSofridos;
		this.golsP += golsMarcados;
		this.saldoGols = saldoPartida;
		
	}
	
	public void IncrementaEmpate() {
		this.empates +=1;
	}
	
	public void IncrementaVitoria() {
		this.vitorias +=1;
	}
	
	public  void IncrementaDerrota() {
		this.derrotas +=1;
	}

	
	
}
