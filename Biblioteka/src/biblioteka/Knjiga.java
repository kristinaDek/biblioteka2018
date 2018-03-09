
package biblioteka;

import java.util.Arrays;

public class Knjiga {
	private String naslov;
	private String isbn;
	private String izdavac;
	private int izdanje;
	private Autor[] autori;
	
	
	
	public Autor[] getAutori() {
		return autori;
	}
	public void setAutori(Autor[] autori) {
		this.autori = autori;
	}
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	@Override
	public String toString() {
		return "Knjiga [izdavac=" + izdavac + ", autori=" + Arrays.toString(autori) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(autori);
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + izdanje;
		result = prime * result + ((izdavac == null) ? 0 : izdavac.hashCode());
		result = prime * result + ((naslov == null) ? 0 : naslov.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (!Arrays.equals(autori, other.autori))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (izdanje != other.izdanje)
			return false;
		if (izdavac == null) {
			if (other.izdavac != null)
				return false;
		} else if (!izdavac.equals(other.izdavac))
			return false;
		if (naslov == null) {
			if (other.naslov != null)
				return false;
		} else if (!naslov.equals(other.naslov))
			return false;
		return true;
	}
	
	
}
