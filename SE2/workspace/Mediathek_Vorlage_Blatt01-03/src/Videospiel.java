
public class Videospiel implements Medium {

	private String _kommentar;
	private String _medienBezeichnung;
	private String _titel;
	private String _system; 
		

	public Videospiel(String kom, String med, String tit, String sys)
	{
		_kommentar = kom;
		_medienBezeichnung = med;
		_titel = tit;
		_system = sys;
		
	}
	
	public String getSystem(){
		return _system;
	}
	
	@Override
	public String getKommentar() {
		return _kommentar;
	}

	@Override
	public String getMedienBezeichnung() {
		return _medienBezeichnung;
	}

	@Override
	public String getTitel() {
		return _titel;
	}
	
	@Override
    public String getFormatiertenString() {
    	return ("Medium: " + _medienBezeichnung + "\nTitel: "  + _titel + "\nKommentar: " + _kommentar + "\nSystem: " + _system);
    }
}
