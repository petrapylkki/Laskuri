package projekti.model;

public class Lasku {
	private int id;
	private String nimi;
	private String saaja;
	private String tilinro;
	private String viitenro;
	private String viesti;
	private String erapvm;
	
	public Lasku() {
		this.id = 0;
		this.nimi = null;
		this.saaja = null;
		this.tilinro = null;
		this.viitenro = null;
		this.viesti = null;
		this.erapvm = null;
	}

	public Lasku(int id, String nimi, String saaja, String tilinro, String viitenro, String viesti, String erapvm) {
		super();
		this.id = id;
		this.nimi = nimi;
		this.saaja = saaja;
		this.tilinro = tilinro;
		this.viitenro = viitenro;
		this.viesti = viesti;
		this.erapvm = erapvm;
	}

	public Lasku(String nimi, String saaja, String tilinro, String viitenro, String viesti, String erapvm) {
		super();
		this.nimi = nimi;
		this.saaja = saaja;
		this.tilinro = tilinro;
		this.viitenro = viitenro;
		this.viesti = viesti;
		this.erapvm = erapvm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getSaaja() {
		return saaja;
	}

	public void setSaaja(String saaja) {
		this.saaja = saaja;
	}

	public String getTilinro() {
		return tilinro;
	}

	public void setTilinro(String tilinro) {
		this.tilinro = tilinro;
	}

	public String getViitenro() {
		return viitenro;
	}

	public void setViitenro(String viitenro) {
		this.viitenro = viitenro;
	}

	public String getViesti() {
		return viesti;
	}

	public void setViesti(String viesti) {
		this.viesti = viesti;
	}

	public String getErapvm() {
		return erapvm;
	}

	public void setErapvm(String erapvm) {
		this.erapvm = erapvm;
	}

	@Override
	public String toString() {
		return "Lasku [id=" + id + ", nimi=" + nimi + ", saaja=" + saaja + ", tilinro=" + tilinro + ", viitenro="
				+ viitenro + ", viesti=" + viesti + ", erapvm=" + erapvm + "]";
	}
}
