package de.uni_hamburg.informatik.swt.se2.mediathek.materialien;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
/**
 * Eine VormerkKarte für Kunden nach dem LIFO Prinzip 
 * @author freddy
 *
 */
public class VormerkKarte 
{
	Queue <Kunde> _vormerker;
//	Medium _medium;
	
	/**
	 * Erstellt eine neue VormerKarte mit 3 Kunden
	 */
	public VormerkKarte()
	{
		_vormerker = new ArrayBlockingQueue <Kunde>(3);
	}
	
	/**
	 * Fügt einen neuen Kunden der VormerkKarte hinzu
	 * @param kunde hinzugefügter Kunde
	 */
	public void add(Kunde kunde)
	{
		_vormerker.offer(kunde);
	}
	
	/**
	 * Überprüft, ob der gegebene Kunde das Medium dieser Karte vormerken darf
	 * @param kunde überprüfter Kunde
	 * @return true, falls vorgemerkt werden darf
	 */
	public boolean darfKundeVormerken(Kunde kunde)
	{
		if(!_vormerker.contains(kunde) && _vormerker.size() < 3)
			return true;
		else
			return false;
	}
	
	// UMBENANNT von getVormerkerPosition
	/**
	 * Überprüft, ob der angegebene Kunde der erste Vormerker ist
	 * @param kunde überprüfter Kunde	
	 * @return true, falls kunde erster auf der Karte ist
	 */
	public boolean istErsterVormerker(Kunde kunde)
	{
		return _vormerker.element().equals(kunde);
	}
	
	/**
	 * Löscht den ersten Vormerker auf der Karte
	 */
	public void loescheErstenVormerker()
	{
		_vormerker.poll();
	}
	
	// NEU
	/**
	 * Überprüft, ob der angegebene Kunde Enthalten ist
	 * @param kunde
	 * @return
	 */
	public boolean istEnthalten(Kunde kunde)
	{
		return _vormerker.contains(kunde);
	}
}
