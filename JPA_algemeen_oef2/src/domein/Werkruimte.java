package domein;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Werkruimte implements Serializable{

	@Id
	private String lokaalcode;
	private String naam;
	private int aantalStoelen;
	private int aantalComputers;

	protected Werkruimte() {
		
	}
	public Werkruimte(String lokaalcode, String naam, int aantalStoelen, int aantalComputers) {
		setLokaalcode(lokaalcode);
		setNaam(naam);
		setAantalStoelen(aantalStoelen);
		setAantalComputers(aantalComputers);
	}

	public String getLokaalcode() {
		return this.lokaalcode;
	}

	private void setLokaalcode(String lokaalcode) {
		this.lokaalcode = lokaalcode;
	}

	public String getNaam() {
		return this.naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAantalStoelen() {
		return this.aantalStoelen;
	}

	public void setAantalStoelen(int aantalStoelen) {
		this.aantalStoelen = aantalStoelen;
	}

	public int getAantalComputers() {
		return this.aantalComputers;
	}

	public void setAantalComputers(int aantalComputers) {
		this.aantalComputers = aantalComputers;
	}

	@Override
	public String toString() {
		return String.format("%s %s %d %d", lokaalcode, naam, aantalStoelen, aantalComputers);
	}

}