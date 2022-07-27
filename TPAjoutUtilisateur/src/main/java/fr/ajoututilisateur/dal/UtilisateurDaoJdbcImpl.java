package fr.ajoututilisateur.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.ajoututilisateur.bo.Utilisateur;

public class UtilisateurDaoJdbcImpl implements UtilisateurDAO{
	
	private static final String insertSQL = "insert INTO UTILISATEURS (nom,prenom,email) VALUES (?,?,?)";
	
	public void insert(Utilisateur utilisateur) {
		
		
		
		try { Connection con = PersistenceProvider.getConnection();
		System.out.println("Connection OK");
			
		PreparedStatement pstmt = con.prepareStatement(insertSQL, PreparedStatement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, utilisateur.getNom());
		pstmt.setString(2, utilisateur.getPrenom());
		pstmt.setString(3, utilisateur.getEmail());
		pstmt.executeUpdate();
		
		ResultSet rs = pstmt.getGeneratedKeys();
		if(rs.next())
		{
			utilisateur.setIdentifiant(rs.getInt(1));
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
