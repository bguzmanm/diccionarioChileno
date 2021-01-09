package cl.awakelab.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.model.Palabra;

public class PalabraDAOImpl implements IPalabraDAO {

	@Override
	public void createPalabra(Palabra p) {

		try {

			String sql = "insert into palabras (pal_id, pal_nombre, pal_referencia, pal_significado) values ("
					+ p.getId() + ", '" + p.getNombre() + "', '" + p.getReferencia() + "', '" + p.getSignificado()
					+ "')";

			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();

			s.execute(sql);

		} catch (SQLException e) {
			System.out.println("ERROR: método createPalabra");
			e.printStackTrace();
		}

	}

	@Override
	public List<Palabra> readAll() {
		List<Palabra> lista = new ArrayList<Palabra>();

		try {
			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();
			String sql = "select pal_id, pal_nombre, pal_referencia, pal_significado from palabras";

			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				lista.add(new Palabra(rs.getInt("pal_id"), rs.getString("pal_nombre"), rs.getString("pal_significado"),
						rs.getString("pal_referencia")));
			}

		} catch (SQLException e) {
			System.out.println("ERROR: método readAll()");
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public Palabra readOne(int id) {
		Palabra p = null;

		try {
			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();
			String sql = "select pal_id, pal_nombre, pal_referencia, pal_significado from palabras where pal_id =" + id;

			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				p = new Palabra(rs.getInt("pal_id"), rs.getString("pal_nombre"), rs.getString("pal_significado"),
						rs.getString("pal_referencia"));
			}

		} catch (SQLException e) {
			System.out.println("ERROR: método readAll()");
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public void updatePalabra(Palabra p) {
		try {

			String sql = "update palabras set pal_nombre = '" + p.getNombre() + "', pal_referencia = '" + p.getReferencia() + 
					"', pal_significado = '"  + p.getSignificado() + "' where pal_id = " + p.getId();

			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();

			s.execute(sql);

		} catch (SQLException e) {
			System.out.println("ERROR: método createPalabra");
			e.printStackTrace();
		}

	}

	@Override
	public void deletePalabra(Palabra p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Palabra> searchPalabra(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePalabra(int id) {
		try {

			String sql = "delete palabras where pal_id = " + id;

			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();

			s.execute(sql);

		} catch (SQLException e) {
			System.out.println("ERROR: método deletePalabra(int)");
			e.printStackTrace();
		}
	}

}
