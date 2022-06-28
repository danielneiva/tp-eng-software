import java.util.ArrayList;
import java.util.List;

public class Cidade {
	protected String nome;
	protected List<Aeroporto> aeroportos = new ArrayList<Aeroporto>();
	protected List<Hotel> hoteis = new ArrayList<Hotel>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void AdicionaHotel(Hotel hotel) {
		hoteis.add(hotel);
	}
	
	public void ConsultarHoteis() {
		hoteis.forEach(hotel->System.out.printf("%s, %s\n", hotel.getNome(), hotel.getEndereco()));
	}
	
	public void ConsultarAeroportos() {
		aeroportos.forEach(aeroporto->System.out.printf("%s, %s\n", aeroporto.getNome(), aeroporto.getEndereco()));
	}
	
}
