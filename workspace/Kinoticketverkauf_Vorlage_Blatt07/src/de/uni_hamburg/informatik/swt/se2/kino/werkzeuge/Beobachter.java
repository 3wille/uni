package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

public interface Beobachter {

    /**
     * aktualisiert die UI bei Änderungen
     * @param Beobachtbar b ein beobachtbares Sub-Werkzeug
     * @require b!=null
     */
	public void beachteAenderung(Beobachtbar b);

	
}
