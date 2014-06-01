package services;

import java.io.FileWriter;
import java.io.IOException;

import materialien.Verleihkarte;

public class VerleihProtokollierer {

	public VerleihProtokollierer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param ereignis gibt an, ob das Objekt ausgeliehen oder zurückgegeben wird
	 * @param verleihkarte 
	 */
	public void protokolliere(String ereignis, Verleihkarte verleihkarte) throws ProtokollierException
	{
		//System.out.println(ereignis+": "+verleihkarte.getFormatiertenString());
		try (FileWriter fw = new FileWriter("./protokoll.txt", true)){
			fw.write(ereignis+": "+verleihkarte);
		} catch (IOException e) {
			throw new ProtokollierException(e.toString());
		}
		
	}

}
