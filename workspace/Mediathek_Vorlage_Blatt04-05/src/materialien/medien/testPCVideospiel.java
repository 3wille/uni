package materialien.medien;
import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fachwerte.Geldbetrag;

/**
 */
public class testPCVideospiel {
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private PCVideospiel _videoSpiel;

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

    protected PCVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        PCVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        PCVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }
    
    @Test
    public void testMietGebuehr7()
    {
    	int tage = 7;
    	assertEquals(_videoSpiel.berechneMietgebuehr(tage), new Geldbetrag(200));
    }
    @Test
    public void testMietGebuehr8()
    {
    	int tage = 8;
    	assertEquals(_videoSpiel.berechneMietgebuehr(tage), new Geldbetrag(700));
    }
    @Test
    public void testMietGebuehr9()
    {
    	int tage = 9;
    	assertEquals(_videoSpiel.berechneMietgebuehr(tage), new Geldbetrag(700));
    }
    @Test
    public void testMietGebuehr17()
    {
    	int tage = 17;
    	assertEquals(_videoSpiel.berechneMietgebuehr(tage), new Geldbetrag(1200));
    }
}
