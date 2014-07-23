package materialien.medien;

import fachwerte.Geldbetrag;

public class PCVideospiel extends AbstractVideospiel {

	public PCVideospiel(String titel, String kommentar, String system) {
		super(titel, kommentar, system);
		
		// TODO Auto-generated constructor stub
	}

	public Geldbetrag getPreisNachTagen(int tage)
    {

		if(tage<=7)
		{
			return new Geldbetrag(0);
		}
		else
		{
			if((tage-7)%5 == 0)
				return new Geldbetrag(((int)(tage-7)/5) * 500);
			else
				return new Geldbetrag(((int)(tage-7)/5)+1 * 500);
		}
    }
}
