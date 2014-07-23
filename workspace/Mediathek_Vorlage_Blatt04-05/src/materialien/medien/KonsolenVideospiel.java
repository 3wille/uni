package materialien.medien;

import fachwerte.Geldbetrag;

public class KonsolenVideospiel extends AbstractVideospiel {

	public KonsolenVideospiel(String titel, String kommentar, String system) {
		super(titel, kommentar, system);
	}

	public Geldbetrag getPreisNachTagen(int tage)
    {
    	return new Geldbetrag(700 * ((int)tage/3));
    }
}
