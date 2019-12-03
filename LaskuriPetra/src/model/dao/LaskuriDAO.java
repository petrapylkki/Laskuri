package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projekti.model.Lasku;

public class LaskuriDAO extends DataAccessObject {
	public ArrayList<Lasku> findAll() {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		ArrayList<Lasku> laskut = new ArrayList<Lasku>();
		Lasku lasku = null;
		
		try {
			conn = getConnection();
			String sqlSelect = "select id, nimi, saaja, tilinro, viitenro, viesti, erapvm from lasku;";
			stmt =  conn.prepareStatement(sqlSelect);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				lasku = readLasku(rs);
				laskut.add(lasku);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
			} finally {
				close(rs, stmt, conn);
			}
		return laskut;
	}
	
	private Lasku readLasku(ResultSet rs) {
		try {
			int id = rs.getInt("id");
			String nimi = rs.getString("nimi");
			String saaja = rs.getString("saaja");
			String tilinro = rs.getString("tilinro");
			String viitenro = rs.getString("viitenro");
			String viesti = rs.getString("viesti");
			String erapvm = rs.getString("erapvm");
			
			return new Lasku(id, nimi, saaja, tilinro, viitenro, viesti, erapvm);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void addLasku(Lasku lasku) {
		Connection conn = null;
		PreparedStatement stmtInsert = null;
		
		try {
			conn = getConnection();
			String sqlInsert = "insert into lasku(id, nimi, saaja, tilinro, viitenro, viesti, erapvm) values (?, ?, ?, ?, ?, ?, ?)";
			
			stmtInsert = conn.prepareStatement(sqlInsert);
			stmtInsert.setInt(1, lasku.getId());
			stmtInsert.setString(2, lasku.getNimi());
			stmtInsert.setString(3, lasku.getSaaja());
			stmtInsert.setString(4, lasku.getTilinro());
			stmtInsert.setString(5, lasku.getViitenro());
			stmtInsert.setString(6, lasku.getViesti());
			stmtInsert.setString(7, lasku.getErapvm());
			stmtInsert.executeUpdate();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtInsert, conn);
		}
		
	}
}
