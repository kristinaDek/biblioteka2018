package biblioteka;

import java.util.LinkedList;

import javax.management.RuntimeErrorException;

import biblioteka.interfejs.Bibliotekainterfejs;

public class Biblioteka implements Bibliotekainterfejs{
	
	private LinkedList <Knjiga> knjige = new LinkedList<Knjiga>();
	
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		if(k == null || knjige.contains(k))
			throw new RuntimeException("Knjiga je null ili vec postoji.");
		knjige.add(k);
		
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		if(k == null || !knjige.contains(k))
			throw new RuntimeException("Knjiga je null ili ne postoji.");
		knjige.remove(k);
		
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, String isbn, String izdavac) {
		
		if(naslov == null)
			throw new RuntimeException("Morate uneti naslov");
		
		LinkedList<Knjiga> novaLista = new LinkedList<Knjiga>();
		
		for(int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov)) {
				novaLista.add(knjige.get(i));
			}
		}
		return novaLista;
	}

}
