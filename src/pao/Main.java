package pao;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JOptionPane;

import java.text.DateFormat;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
	
		List<Oras> orase = new Vector<Oras>();
	        try {
	            for(String line : Files.readAllLines(Paths.get("cities.csv"))){
	                orase.add(new Oras(line.split(",")));
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	    Service.viewOrase(orase);
	    
	    List<Masina> masini = new Vector<Masina>();
        try {
            for(String line : Files.readAllLines(Paths.get("masini.csv"))){
                masini.add(new Masina(line.split(",")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
       Service.viewMasini(masini);
        
        List<Persoana> persoane = new Vector<Persoana>();
        try {
            for(String line : Files.readAllLines(Paths.get("persoane.csv"))){
                persoane.add(new Persoana(line.split(",")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Service.viewPersoane(persoane);
        
        List<Legatura> legaturi = new Vector<Legatura>();
        String fileName = "legaturi.csv";
        File file = new File(fileName);
        
        try {
        	Scanner inputStream = new Scanner(file);
        	while (inputStream.hasNext()) {
        		String data = inputStream.next();
//        		System.out.println(data);
        		String[] values = data.split(",");
        		System.out.println(values[3]);
        		legaturi.add(new Legatura(values));
//        		legaturi.add(new Legatura(data.split(",")));
        		
        	}
        	inputStream.close();
        }catch(FileNotFoundException e){
        	e.printStackTrace();
        	
        }
        
        Service.viewLegaturi(legaturi);
	   
	   
	    
        
         Service.scrieMasini(masini);
         Service.scriePersoane(persoane);
         Service.scrieOrase(orase);
          Service.scrieLegaturi(legaturi);
          Service.sorteazaPersoaneAlfabetic(persoane);
          
          Service.veziLegaturiExistente("Bucuresti", legaturi);
          List<Ruta> rute = new Vector<Ruta>();
          rute.add(Service.adaugaRuta(legaturi, persoane, masini));
          Service.viewRute(rute);
         
	}
	

	
	
    
	
}
