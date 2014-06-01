import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team
 * @version SoSe 2014
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        
//        for (Medium m: medien) {
//        	if (m instanceof DVD){
//        		selectedMedienTextArea.setText("Medium: " + ((DVD)m).getMedienBezeichnung() + "\nTitel: " + ((DVD)m).getTitel() + "\nRegisseur: " + ((DVD)m).getRegisseur() + "\nKommentar:" + ((DVD)m).getKommentar() + "\nLaufzeit: " + ((DVD)m).getLaufzeit());
//           	}
//        	
//        	else if (m instanceof CD){
//        		selectedMedienTextArea.setText("Medium: " + ((CD)m).getMedienBezeichnung() + "\nTitel: " + ((CD)m).getTitel() + "\nInterpret: " + ((CD)m).getInterpret() + "\nKommentar: " + ((CD)m).getKommentar()+ "\nSpiellaenge: " + ((CD)m).getSpiellaenge());
//            }
//        	
//        	else if (m instanceof Videospiel){
//        		selectedMedienTextArea.setText("Medium: " + ((Videospiel)m).getMedienBezeichnung() + "\nTitel: " + ((Videospiel)m).getTitel() + "\nKommentar:" + ((Videospiel)m).getKommentar() + "\nSystem: " + ((Videospiel)m).getSystem());
//			}
//        }
        selectedMedienTextArea.setText("");
        for (Medium m: medien){
        	selectedMedienTextArea.append(m.getFormatiertenString()+"\n \n");
        }
              
    }

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public JPanel getUIPanel()
    {
        return _ui.getUIPanel();
    }
}
