import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

public class Database {
	protected JSONObject data;
	
	public void loadInfo() throws IOException {
		this.loadJson();	
	}
	
	public void loadJson() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/data/data.json"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    this.data = new JSONObject(everything);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    br.close();
		}
	}	
}
