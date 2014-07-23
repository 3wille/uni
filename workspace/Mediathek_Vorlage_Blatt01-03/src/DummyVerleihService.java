import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Diese Klasse implementiert das Interface VerleihService. Es handelt sich
 * lediglich um eine Dummy-Implementation, um die GUI zu testen.
 * 
 * @author GUI-Team
 * @version SoSe 2014
 */
class DummyVerleihService extends AbstractObservableService implements
		VerleihService {
	// Generator für Zufallszahlen und zufällige boolsche Werte
	private static final Random RANDOM = new Random();

	private static final CD MEDIUM = new CD("Titel", "Kommentar", "Interpret",
			70);
	private static final Kundennummer KUNDENNUMMER = new Kundennummer(123456);
	private static final Kunde ENTLEIHER = new Kunde(KUNDENNUMMER, "Vorname",
			"Nachname");
	private static final Verleihkarte VERLEIHKARTE = new Verleihkarte(
			ENTLEIHER, MEDIUM, Datum.heute());

	public DummyVerleihService(KundenstammService kundenstamm,
			MedienbestandService medienbestand,
			List<Verleihkarte> initialBestand) {
	}

	/**
	 * Beispiel: Gibt immer dasselbe Kundenobjekt als Entleiher zurück, ohne das
	 * als Eingabeparameter übergebene Medium zu beachten.
	 */
	@Override
	public Kunde getEntleiherFuer(Medium medium) {
		return ENTLEIHER;
	}

	/**
	 * Gibt immer eine neu erzeugte Ergebnisliste mit dem selben Medium als Inhalt zurück.
	 */
	@Override
	public List<Medium> getAusgelieheneMedienFuer(Kunde kunde) {
		List<Medium> ergebnisListe = new ArrayList<Medium>();
		ergebnisListe.add(MEDIUM);
		return ergebnisListe;
	}
	
	/**
	 * Existiert noch nicht im Interface
	 * ignoriert das übergebene Medium und gibt immer diesselbe verleihkarte zurück
	 */
	public Verleihkarte getVerleihkarteFuer(Medium medium) {
		return VERLEIHKARTE;
	}
	
	/** 
	 * gibt eine neu erstellte Ergebnisliiste zurück mit immer demselben Inhalt (= Verleihkarte)
	 */
	@Override
	public List<Verleihkarte> getVerleihkarten() {
		List<Verleihkarte> ergebnisListe = new ArrayList<Verleihkarte>();
		ergebnisListe.add(VERLEIHKARTE);
		return ergebnisListe;
	}
	
	/**
	 * Gibt einen zufälligen Wahrheitswert zurück
	 */
	@Override
	public boolean istVerliehen(Medium medium) {
		return RANDOM.nextBoolean();
	}
	
	/**
	 * Tut nichts
	 */	
	@Override
	public void nimmZurueck(List<Medium> medien, Datum rueckgabeDatum) {
	}
	
	/**
	 * gibt einen zufälligen Wahrheitswert zurück
	 */
	@Override
	public boolean sindAlleNichtVerliehen(List<Medium> medien) {
		return RANDOM.nextBoolean();
	}
	
	/**
	 * gibt einen zufälligen Wahrheitswert zurück
	 */
	@Override
	public boolean sindAlleVerliehen(List<Medium> medien) {
		return RANDOM.nextBoolean();
	}
	
	/**
	 * tut nichts
	 */
	@Override
	public void verleiheAn(Kunde kunde, List<Medium> medien, Datum ausleihDatum) {
	}
	
	/**
	 * prüft ob der eingegenebe kunde dem festgelegten entleiher entspricht
	 */
	@Override
	public boolean kundeImBestand(Kunde kunde) {
		return ENTLEIHER.equals(kunde);
	}
	
	/**
	 * prüft ob der eingegenebe medium dem festgelegten medium entspricht
	 */
	@Override
	public boolean mediumImBestand(Medium medium) {
		return MEDIUM.equals(medium);
	}

	/**
	 * tu alles richtig, wenn mediumImBestand() richtig wär
	 */
	@Override
	public boolean medienImBestand(List<Medium> medien) {
		boolean result = true;
		for (Medium medium : medien) {
			if (!mediumImBestand(medium)) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	/**
	 * erzeugt immer eine neue Liste und gibt diese mit demselben Objekt zurück
	 */
	@Override
	public List<Verleihkarte> getVerleihkartenFuer(Kunde kunde) {
		List<Verleihkarte> result = new ArrayList<Verleihkarte>();
		result.add(VERLEIHKARTE);
		return result;
	}
	
	/**
	 * gibt immer false zurück
	 */
	@Override
	public boolean istVerleihenMoeglich(Kunde kunde, List<Medium> medien) {
		return false;
	}
}
