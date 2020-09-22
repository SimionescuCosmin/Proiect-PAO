package pao;

public class Persoana implements Comparable<Persoana> {
   private String nume;
   private int varsta;
   
   public Persoana(String[] values) {
	   nume = values[0];
	   varsta = Integer.parseInt(values[1]);
   }
   public Persoana(String a, String b) {
	   nume = a;
	   varsta = Integer.parseInt(b);
   }
   
   public Persoana(Persoana a) {
	   nume = a.nume;
	   varsta = a.varsta;
   }
public String getNume() {
	return nume;
}

public void setNume(String nume) {
	this.nume = nume;
}

public int getVarsta() {
	return varsta;
}

public void setVarsta(int varsta) {
	this.varsta = varsta;
}

@Override
public int compareTo(Persoana o) {
	int compare = nume.compareTo(o.nume);
	if (compare==0) {
		compare = Integer.compare(varsta,  o.varsta);
	}
	return compare;
}

 public String toString() {
	 return "Nume: " + nume + ";  Varsta: " + varsta + '\n';
 }
   
   
}
