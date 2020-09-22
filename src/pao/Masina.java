package pao;

public class Masina {
   private String marca;
   private int anul;
   
   public Masina(Masina a) {
	   marca = a.marca;
	   anul = a.anul ;
   }
   
   public Masina(String[] values)
   {
	   marca=values[0];
	   anul=Integer.parseInt(values[1]);
   }
  public Masina (String a, String b) {
	  marca = a;
	  anul=Integer.parseInt(b);
  }
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getAnul() {
	return anul;
}
public void setAnul(int anul) {
	this.anul = anul;
}

   public String toString() {
	   return (marca + " anul "+ anul );
   }
}
