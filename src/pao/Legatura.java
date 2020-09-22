package pao;

public class Legatura {
   private Oras plecare;
   private Oras destinatie;
   
   public void viewLegatura() {
	   System.out.println(plecare.getOras() + "-" + destinatie.getOras());
   }
   
   public Legatura(Legatura a) {
	   plecare = a.plecare;
	   destinatie= a.destinatie;
   }
  
   public Legatura(String[] values)
   {
    //   System.out.println(values[3]);
       plecare = new Oras(values[0], values[1]);
//       plecare.setNume(values[0]);
//	   plecare.setDistrict(values[1]);
       destinatie = new Oras(values[2], values[3]);
//	   destinatie.setNume(values[2]);
//	   destinatie.setDistrict(values[3]);
	   
   }


public Oras getPlecare() {
	return plecare;
}


public void setPlecare(Oras plecare) {
	this.plecare = plecare;
}


public Oras getDestinatie() {
	return destinatie;
}


public void setDestinatie(Oras destinatie) {
	this.destinatie = destinatie;
}



}
