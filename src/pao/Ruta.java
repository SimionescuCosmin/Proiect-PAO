package pao;

public class Ruta extends Legatura{
     
	private Persoana sofer;
    private Masina masina;
    private int pret;
    
    
    public Ruta(String[] values) {
		super(values);
		sofer = new Persoana(values[4], values[5]);
		masina = new Masina(values[6], values[7]);
	}
    
    public Ruta(Legatura l,Persoana a, Masina b, int c) {
    	super(l);
    	sofer=a;
    	masina=b;
    	pret = c;
    }
    
    public void viewRuta() {
    	System.out.println("Ruta are ruta: " + getPlecare().getOras() + "-" + getDestinatie().getOras() + "; Soferul este: " + sofer.toString() + " care conduce masina: " + masina.toString()+ " iar cursa are pretul de: "+ pret + " lei");
    }
}
