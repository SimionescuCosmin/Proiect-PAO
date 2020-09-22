package pao;

public class Oras {
    private String nume;
    private String district;
    
    public String getOras() {
    	return (getNume() + "," + getDistrict());
    }
    
    public Oras(String [] values){
        nume = values[0];
        district = values[1];
    }
    
    public Oras(String a, String b)
    {
    	nume=a;
    	district=b;
    }


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}
    
    

}
