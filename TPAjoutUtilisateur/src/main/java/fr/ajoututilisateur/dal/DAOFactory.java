package fr.ajoututilisateur.dal;

public abstract class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO() {
		
		return new UtilisateurDaoJdbcImpl();
	}

}
