package in.codegram.doctorpatient.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codegram.doctorpatient.dao.PatientDAO;
import in.codegram.doctorpatient.exception.PatientNotFoundException;
import in.codegram.doctorpatient.modal.Patient;
import in.codegram.doctorpatient.util.DBUtil;

public class PatientDAOImpl extends DBUtil implements PatientDAO {

	@Override
	public void save(Patient patient) {
		String sql = "insert into doctors (patientName, problem) values(?,?)";
		PreparedStatement pstmt = preparedStatement(sql);	
		try {
			pstmt.setString(1, patient.getPatientName());
			pstmt.setString(2, patient.getProblem());
			pstmt.execute();
		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
		finally{
			closePreparedStatment();
			closeConnection();
		}

	}

	@Override
	public void update(Integer id, String problem) {
		String sql = "update patients set problem=? where id=?";
		PreparedStatement pstmt = preparedStatement(sql);	
		try {
			pstmt.setString(1, problem);
			pstmt.setInt(2, id);
			pstmt.execute();
		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
		finally{
			closePreparedStatment();
			closeConnection();
		}

	}

	@Override
	public List<Patient> list() {
		String sql = "select * from patients";
		PreparedStatement pstmt = preparedStatement(sql);
		Patient patient;
		List<Patient> patients = new ArrayList<>();
		try {
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				patient=new Patient();
				patient.setId(rs.getInt("id"));
				patient.setPatientName(rs.getString("patientName"));
				patient.setProblem(rs.getString("problem"));
				patients.add(patient);
			}

		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
		finally{
			closePreparedStatment();
			closeConnection();
		}
		return patients;
	}

	@Override
	public void delete(Integer id) throws PatientNotFoundException {
		String sql="delete from doctors where id=?";
		PreparedStatement pstmt = preparedStatement(sql);
		try {
			pstmt.setInt(1, id);
			pstmt.execute();
		} catch (SQLException ex) {
			System.out.println("Problem : "+ex.getMessage());
		}
		finally{
			closePreparedStatment();
			closeConnection();
		}
	}
}
