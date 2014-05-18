
public class KonsolenVideospiel extends AbstractVideospiel {

	public KonsolenVideospiel(String titel, String kommentar, String system) {
		super(titel, kommentar, system);
	}

	public Geldbetrag getPreisNachTagen(int tage)
    {
    	return new Geldbetrag(_basispreis + 700 * ((int)tage/3));
    }
}
