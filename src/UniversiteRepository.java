
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository {
	private Connection Connect;
	private Ijournal Journal
	private Statement stmt;
	public UniversiteRepository(){
			try{
			this.Connect = DBConnection.getConn();
			this.stmt = this.Connect.createStatement();
		} catch (SQLException){
			e.printStackTrace();
		}
		this.Journal = Journal;
	}
	
	Universite GetById(int universityId) throws SQLException {
		AfficherDate.setnomClass("University Repository"
		Journal.outPut_Msg("LogBD : d�but recherche de id universit� dans la base de donn�e");
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
		Journal.outPut_Msg("LogBD : universit� r�cup�r�e");
		connect.close();
		return u;		
	}	
	
}
