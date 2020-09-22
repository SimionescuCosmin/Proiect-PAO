package pao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Service {
    
   
	public static void viewOrase(List<Oras> orase)
   {
	   for(Oras oras: orase)
	    	System.out.println(oras.getDistrict()+" "+ oras.getNume());
	   log("viewOrase");
   }
	
	public static void viewMasini(List<Masina> masini)
	   {
		   for(Masina masina: masini)
		    	System.out.println(masina.getMarca()+" "+ masina.getAnul());
		   log("viewMasini");
	   }
   
   public static void viewLegaturi(List<Legatura> legaturi) {
	   for(Legatura legatura: legaturi)
		   legatura.viewLegatura();
	   log("viewLegatura");
   }
   
   public static void viewPersoane(List<Persoana> persoane)
   {
	   for(Persoana persoana: persoane)
		   System.out.println(persoana.getNume() +" "+persoana.getVarsta());
	   log("viewPersoane");
   }
   
   public static void viewRute(List<Ruta> rute) {
	   for(Ruta ruta: rute)
		   ruta.viewRuta();
	   log("viewLegatura");
   }
   
   public static void scrieMasini(List<Masina> masini)
   {
	   for(Masina masina: masini) {
		   try {
		   FileWriter fw = new FileWriter("masini2.csv",true);
  		  BufferedWriter bw = new BufferedWriter(fw);
  		  PrintWriter pw = new PrintWriter(bw);
  		  pw.println(masina.getMarca()+","+ masina.getAnul());
  		  pw.flush();
  		  pw.close();
  		  } catch(Exception E)
		   	{
  	   		JOptionPane.showMessageDialog(null, "Nu s-a putut scrie");
  	   	}}
	   log("scrieMasini");
   }
   
   public static void scriePersoane(List<Persoana> persoane)
   {
	   for(Persoana persoana: persoane) {
		   try {
		   FileWriter fw = new FileWriter("persoane2.csv",true);
  		  BufferedWriter bw = new BufferedWriter(fw);
  		  PrintWriter pw = new PrintWriter(bw);
  		  pw.println(persoana.getNume()+","+ persoana.getVarsta());
  		  pw.flush();
  		  pw.close();
  		  } catch(Exception E)
		   	{
  	   		JOptionPane.showMessageDialog(null, "Nu s-a putut scrie");
  	   	}}
	   log("scriePersoane");
   }
   
   public static void scrieOrase(List<Oras> orase)
   {
	   for(Oras oras: orase) {
		   try {
		   FileWriter fw = new FileWriter("orase2.csv",true);
  		  BufferedWriter bw = new BufferedWriter(fw);
  		  PrintWriter pw = new PrintWriter(bw);
  		  pw.println(oras.getNume()+","+ oras.getDistrict());
  		  pw.flush();
  		  pw.close();
  		  } catch(Exception E)
		   	{
  	   		JOptionPane.showMessageDialog(null, "Nu s-a putut scrie");
  	   	}}
	   log("scrieOrase");
   }
   
   public static void scrieLegaturi(List<Legatura> legaturi)
   {
	   for(Legatura legatura: legaturi) {
		   try {
		   FileWriter fw = new FileWriter("legaturi2.csv",true);
  		  BufferedWriter bw = new BufferedWriter(fw);
  		  PrintWriter pw = new PrintWriter(bw);
  		  pw.println(legatura.getPlecare().getNume()+","+legatura.getPlecare().getDistrict()+"," + legatura.getDestinatie().getNume()+ "," + legatura.getDestinatie().getDistrict());
  		  pw.flush();
  		  pw.close();
  		  } catch(Exception E)
		   	{
  	   		JOptionPane.showMessageDialog(null, "Nu s-a putut scrie");
  	   	}}
	   log("scrieLegaturi");
   }
   
   public static void sorteazaPersoaneAlfabetic(List<Persoana> persoane)
   { 
	   Collections.sort(persoane);
	   System.out.println(persoane);
	   log("sorteazaPersoaneAlfabetic");
   }
   
   public static Ruta adaugaRuta(List<Legatura> legaturi, List<Persoana> persoane, List<Masina> masini)
   {
	  Scanner console=new Scanner(System.in);
	  
	  
	  System.out.println("Care dintre urmatoarele legaturi doriti sa o adaugati la ruta? (nr)");
	  viewLegaturi(legaturi);
	  int raspuns = console.nextInt();
	  Legatura l = new Legatura(legaturi.get(raspuns));
	  
	  System.out.println("Care dintre urmatoarele persoane doriti sa o alegeti ca sofer la ruta? (nr)");
	  viewPersoane(persoane);
	  raspuns = console.nextInt();
	  Persoana p = new Persoana(persoane.get(raspuns));
	  
	  System.out.println("Care dintre urmatoarele masini va fi folosita pentru ruta? (nr)");
	  viewMasini(masini);
	  raspuns=console.nextInt();
	  Masina m = new Masina(masini.get(raspuns));
	  
	  System.out.println("Ce pret doriti sa aiba cursa?");
	  raspuns=console.nextInt();
	  int pret= raspuns;
	  
	  Ruta r = new Ruta(l,p,m,pret);
	  
	  
	  console.close();
	  log("adaugaRuta");
	  return r;
   }
   
   public static void veziLegaturiExistente(String plecare, List<Legatura> legaturi) {
	   for (Legatura legatura: legaturi )
	   {
		   if (legatura.getPlecare().getNume().equals(plecare))
			   legatura.viewLegatura();
	   }
   }
   
   
   
   public static void log(String action) {
   	try {
   		FileWriter fw = new FileWriter("logs.csv",true);
   		BufferedWriter bw = new BufferedWriter(fw);
   		PrintWriter pw = new PrintWriter(bw);
   		Date date = new Date();
   		String dateStr = date.toString();
   		pw.println(action+","+ dateStr);
   		pw.flush();
   		pw.close();
   	}
   	catch(Exception E)
   	{
   		JOptionPane.showMessageDialog(null, "Nu s-a putut scrie");
   	}
   }
   
   
}
