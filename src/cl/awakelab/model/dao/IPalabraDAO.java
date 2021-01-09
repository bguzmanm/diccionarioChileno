package cl.awakelab.model.dao;

import java.util.List;

import cl.awakelab.model.Palabra;

public interface IPalabraDAO {
	
	public void createPalabra(Palabra p);
	public List<Palabra> readAll();
	public Palabra readOne(int id);
	public void updatePalabra(Palabra p);
	public void deletePalabra(Palabra p);
	public void deletePalabra(int id);
	
	public List<Palabra> searchPalabra(String busqueda);
	
}
