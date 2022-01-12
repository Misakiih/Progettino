import java.io.*;
public class ProgProdotti {

	public static void main(String[] args) {
		
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader prodotti = new BufferedReader(input);
 
		Prodotti Prod= new Prodotti(); 
		
		 int num=0;
		 int cont;
		
	  System.out.println("Inserisci il numero dei prodotti:");
	   try {
	        	
	        num= (Integer.valueOf(prodotti.readLine()));
	            
	   } catch (IOException ex) {}
	        
	   for(cont=0; cont<num; cont++)
	   {
		System.out.println("Inserisci il codice del prodotto");
		try {
			
			Prod.Set_codice(Integer.valueOf(prodotti.readLine()));
			
		} catch (IOException ex) {}
		
		System.out.println("Inserisci la descrizione del prodotto:");
		try {
			
			Prod.Set_descrizione(prodotti.readLine());
			
		} catch (IOException ex) {}
		
		System.out.println("Inserisci il prezzo del prodotto");
		try {
			
			Prod.Set_prezzo(Integer.valueOf(prodotti.readLine()));
			
		} catch (IOException ex) {}
		
		System.out.println("Inserisci lo sconto del prodotto:");
		try {
			
			Prod.Set_sconto(Integer.valueOf(prodotti.readLine()));
			
		} catch (IOException ex) {}
		
		System.out.println("Inserisci l'iva del prodotto");
		try {
			
			Prod.Set_iva(Integer.valueOf(prodotti.readLine()));
			
		} catch (IOException ex) {}
		
		
		   System.out.println("Visualizzazione codice prodotto:" + Prod.Get_codice());
	       System.out.println("Visualizzazione descrizione prodotto:" + Prod.Get_descrizione());
	       System.out.println("Visualizzazione prezzo del prodotto scontato:" + (Prod.Get_prezzo() -Prod.CalcoloSconto()));
	       System.out.println("Visualizzazione del prodotto ivato:" + (Prod.Get_prezzo() + Prod.CalcoloIva()));
	   }
	   
	   System.out.println("Visualizzazione numero prodotti selezionati:" +num);
	}

}
