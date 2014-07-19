import static org.junit.Assert.*;

import org.junit.Test;


public class VideospielTest {

	private String _kommentar;
	private String _bezeichnung;
	private String _titel;
	private String _system; 
	
	private Videospiel _spiel;
	
	public VideospielTest()
	{
		_kommentar = new String("Kindervideospiel");
		_bezeichnung = new String("ratzefummel");
		_titel = new String("RitterRost und das Abenteuer mit dem Koenig");		
		_system = new String("PS4");
		
		_spiel = new Videospiel(_kommentar, _bezeichnung, _titel, _system);
		
	}
	
	@Test
	public void testgetSystem() {
		assertEquals(_spiel.getSystem(), _system);
	}
	
	@Test
	public void testGetKommentar() {
		assertEquals(_spiel.getKommentar(), _kommentar);
	}	
	
	@Test
	public void testGetMedienBezeichnung()
	{
		assertEquals(_spiel.getMedienBezeichnung(),_bezeichnung);
	}

	@Test
	public void testGetTitel()
	{
		assertEquals(_spiel.getTitel(),_titel);
	}
}
