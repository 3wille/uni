package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import java.util.HashSet;
import java.util.Set;
/**
 * Ein Beobachtbares Objekt
 * @author 3wille
 *
 */
public abstract class Beobachtbar {

	private Set<Beobachter> _beobachter;
	
	/**
	 * Erstellt ein beobachtbares Objekt mit einer leeren Beobachter Menge
	 */
	public Beobachtbar() 
	{
		_beobachter = new HashSet<Beobachter>();
	}

	/**
	 * Fügt einen neuen Beobachter hinzu
	 * @param b ein Beobachter
	 * @require b!=null
	 */
	public void setzeBeobachter(Beobachter b)
	{
		assert b!=null: "Darf nicht null sein";
		_beobachter.add(b);
	}
	
	/**
	 * meldet die Änderung an alle Beobachter dieses Objektes
	 */
	public void meldeAenderung()
	{
		for(Beobachter b: _beobachter)
		{
			b.beachteAenderung(this);
		}
	}
}
