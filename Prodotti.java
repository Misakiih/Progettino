
public class Prodotti {

	private int codice;
	private String descrizione;
	private double prezzo;
	private double sconto;
	private double iva;
	
	public void Set_codice(int cod) 
	{
		codice= cod;
	}
	
	public int Get_codice()
	{
		return codice;
	}
	
	public void Set_descrizione(String descr) 
	{
		descrizione= descr;
	}
	
	public String Get_descrizione()
	{
		return descrizione;
	}
	
	public void Set_prezzo(double pre) 
	{
		prezzo= pre;
	}
	
	public double Get_prezzo()
	{
		return prezzo;
	}
	
	public void Set_sconto(double sc) 
	{
		sconto= sc;
	}
	
	public double Get_sconto()
	{
		return sconto;
	}
	
	public void Set_iva(double i) 
	{
		iva= i;
	}
	
	public double Get_iva()
	{
		return iva;
	}
	
	public double CalcoloSconto()
	{
		return (Double.valueOf((prezzo*sconto)/100));
	}
	
	public double CalcoloIva()
	{
		return (Double.valueOf((prezzo*iva)/100));
	}


}
