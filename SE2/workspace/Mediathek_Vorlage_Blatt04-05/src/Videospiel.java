/**
 * {@link Videospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team
 * @version SoSe 2012
 */
abstract class AbstractVideospiel extends AbstractMedium implements Medium
{
    /**
     * Das System, auf dem das Spiel lauffähig ist
     */
    private String _system;
    
    /**
     * basispreis = 200
     */
    protected int _basispreis;

//    /**
//     * Ein Kommentar zum Medium
//     */
//    private String _kommentar;
//
//    /**
//     * Der Titel des Mediums
//     */
//    private String _titel;

    /**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel Der Titel des Spiels
     * @param kommentar Ein Kommentar zum Spiel
     * @param system Die Bezeichnung des System
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public AbstractVideospiel(String titel, String kommentar, String system)
    {
       	super(titel, kommentar);
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
        _basispreis = 200;
    }
    
//    @Override
//	public Geldbetrag berechneMietgebuehr(int tage)
//    {
//    	return new Geldbetrag(200);
//    }

    public abstract Geldbetrag getPreisNachTagen(int tage);
    
    
    public Geldbetrag berechneMietgebuehr(int tage)
    {
    	return new Geldbetrag( getPreisNachTagen(tage).getEuroAnteil()*100 + getPreisNachTagen(tage).getCentAnteil() + _basispreis);
    }
    
    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**extends AbstractMedium
     * Gibt das System zurück, auf dem das Spiel lauffähig ist.
     * 
     * @return Das System, auf dem das Spiel ausgeführt werden kann.
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }

    @Override
    public String toString()
    {
        return getFormatiertenString();
    }
/*
    @Override
    public String getKommentar()
    {
        return _kommentar;
    }
*/
    /**
     * Ändert den Kommentar
     * 
     * @param kommentar Ein Kommentar zum Medium
     * 
     * @require kommentar != null
     * @ensure getKommentar() == kommentar
     */
    /*
    @Override
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }

    /**
     * Ändert den Titel
     * 
     * @param titel Der Titel des Mediums
     * 
     * @require titel != null
     * @ensure getTitel() == titel
     */
    /*
    @Override
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }
*/
    
    public String getFormatiertenString()
    {
        return  "Medium: Videospiel" + ":\n" + "" + super.getFormatiertenString() + _kommentar + "\n" + "    "
                + "System: " + _system + "\n";
    }
}
