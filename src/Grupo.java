import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class Grupo {

	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public JSONArray getGrupos(){
		JSONObject gruposRaw;
		JSONArray grupos = new JSONArray();
		
		gruposRaw = Main.db.data.getJSONObject("groups");
		Iterator<String> keys = gruposRaw.keys();
		
		while(keys.hasNext()) {
			String key = keys.next();
			if (gruposRaw.get(key) instanceof JSONObject) {
				JSONObject grupoRaw = gruposRaw.getJSONObject(key);
				JSONObject grupo = new JSONObject();
				grupo.put("nome", grupoRaw.get("name"));
				grupos.put(grupo);
			}
		}
		
		return grupos;
		
	}
	
	public void printInfo(String grupo) {
		System.out.println(grupo);
		JSONObject gruposRaw;
		gruposRaw = Main.db.data.getJSONObject("groups");
		gruposRaw = gruposRaw.getJSONObject(grupo);
		String leftAlignFormat = "| %-15s | %-4d |%n";
		String centerAlignFormat = "| %-15s | %-4d |%n";
		System.out.format("+-----------------+------+%n");
		System.out.format("|         " + gruposRaw.get("name") + "        |%n");
		System.out.format("+-----------------+------+%n");
		System.out.format("|   Seleção   | Pontos   |%n");
		System.out.format("+-----------------+------+%n");
		JSONArray times = gruposRaw.getJSONArray("teams");
		
		for (int i=0; i<times.length(); i++) {
			JSONObject time = times.getJSONObject(i);
			System.out.format(leftAlignFormat, time.get("name"), time.get("points"));
		}
		System.out.format("+-----------------+------+%n");
	}
}
