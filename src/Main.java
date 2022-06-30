/* Decompiler 12ms, total 863ms, lines 12 */
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
	static Database db = new Database();
	
	
	public static void main(String[] args) throws IOException {
	   db.loadInfo();
	   

	   Scanner input = new Scanner(System.in);
       int opcaoMenu;
       
	   do {

     		System.out.println("Sistema de Acompanhamento da Copa do Mundo!\n\n\n");
     		System.out.println("Menu: ");
     		System.out.println("1: Selecione um Grupo");
     		System.out.println("2: Selecione um time");
     		System.out.println("3: Selecione um estádio");
     		System.out.println("4: Selecione uma Cidade");
     		System.out.println("5: Sair");
     		
     		opcaoMenu = input.nextInt();
            input.nextLine();
            
            if (opcaoMenu == 1) {
            	int opcaoGrupo;
				do{
	            	System.out.print("Selecione um Grupo: \n");
	            	Grupo gp = new Grupo();
	            	JSONArray grupos = gp.getGrupos();
	            	for (int i = 0; i < grupos.length(); i++) {
	            		System.out.println((i+1)+" - "+grupos.getJSONObject(i).getString("nome"));
	            	}
	            	opcaoGrupo = input.nextInt();
	            	String gruposString = "abcdefgh";
					System.out.println();
					gp.printInfo(gruposString.substring(opcaoGrupo-1, opcaoGrupo));
					opcaoGrupo=9;
					opcaoMenu=5;
//    				System.out.println("1: View team details");
//    				System.out.println("2: View matches");
//    				System.out.println("3: View discipline");
//    				System.out.println("4: View goals");
//    				System.out.println("5: View All teams");
//    				System.out.println("6: Exit");
				}while(opcaoGrupo != 9);
                input.nextLine();
                
            }
	   }while(opcaoMenu != 5);
	}
}