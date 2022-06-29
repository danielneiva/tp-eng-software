/* Decompiler 12ms, total 863ms, lines 12 */
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
      Database db = new Database();
      db.loadInfo();
      System.out.println(db.data.getJSONArray("stadiums").getJSONObject(0).get("nearby_airports"));
   }
}