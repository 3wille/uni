

/**
 * Basisimplementation der KLassen CD, DVD, Videospiel
 * 
 */

public abstract class AbstractMedium {	
	
	protected String _titel;
	protected String _kommentar;

	
	public AbstractMedium(String titel, String kommentar)
	{
		_titel = titel;
		_kommentar = kommentar;
	}
	
	public String getKommentar()
	{//    /**
//	     * Ein Kommentar zum Medium
//	     */
//	    private String _kommentar;
	//
//	    /**
//	     * Der Titel des Mediums
//	     */
//	    private String _titel;
		return _kommentar;
	}
	
	public void setKommentar(String kommentar) 
	{
		_kommentar = kommentar;
	}
	
	
	public String getTitel()
	{
		return _titel;
	}
	
	public void setTitel(String titel)
	{
		_titel = titel;
	}
	
	public String getFormatiertenString()
	{
		return "Titel:" + _titel + "\nKommentar:" + _kommentar;
	}
	
	public Geldbetrag berechneMietgebuehr(int tage)
	{
		return new Geldbetrag(tage * 300);
	}
}
