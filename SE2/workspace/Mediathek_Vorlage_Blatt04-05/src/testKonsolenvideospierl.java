import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

	/**
	 */
	public class testKonsolenvideospierl
	{
	    private static final String KOMMENTAR = "Kommentar";
	    private static final String TITEL = "Titel";
	    private static final String BEZEICHNUNG = "Videospiel";
	    private static final String SYSTEM = "System";
	    private KonsolenVideospiel _videoSpiel;

	    @Before
	    public void setUp()
	    {
	    	_videoSpiel = getMedium();
	    }

	    @Test
	    public void testeKonstruktoren()
	    {
	        assertEquals(TITEL, _videoSpiel.getTitel());
	        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
	        assertEquals(SYSTEM, _videoSpiel.getSystem());
	    }

	    @Test
	    public void testGetMedienBezeichnung()
	    {
	        String videospielBezeichnung = BEZEICHNUNG;
	        assertEquals(videospielBezeichnung, _videoSpiel.getMedienBezeichnung());
	    }

	    protected KonsolenVideospiel getMedium()
	    {
	        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
	    }

	    @Test
	    public final void testSetKommentar()
	    {
	        KonsolenVideospiel medium = getMedium();
	        medium.setKommentar("Kommentar2");
	        assertEquals(medium.getKommentar(), "Kommentar2");
	    }

	    @Test
	    public final void testSetTitel()
	    {
	        KonsolenVideospiel medium = getMedium();
	        medium.setTitel("Titel2");
	        assertEquals(medium.getTitel(), "Titel2");
	    }
	    
	    @Test
	    public void testMietGebuehr()
	    {
	    	int tage = (int) Math.round(Math.random()*100);
	    	assertEquals(_videoSpiel.berechneMietgebuehr(tage), new Geldbetrag(200 + 700 * (tage/3)));
	    }

	    @Test
	    public void testMietGebuehr4()
	    {
	    	int tage = 4;
	    	assertEquals(_videoSpiel.berechneMietgebuehr(tage), new Geldbetrag(200 + 700 * (tage/3)));
	    }
	    
	    @Test
	    public void testMietGebuehr3()
	    {
	    	int tage = 3;
	    	assertEquals(_videoSpiel.berechneMietgebuehr(tage), new Geldbetrag(200 + 700 * (tage/3)));
	    }
	}
