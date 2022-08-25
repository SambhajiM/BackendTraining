package in.codegram.doctorpatient.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codegram.doctorpatient.dao.DoctorDAO;
import in.codegram.doctorpatient.exception.DoctorNotFoundException;
import in.codegram.doctorpatient.modal.Doctor;
import in.codegram.doctorpatient.util.DBUtil;

public class DoctorDAOImpl extends DBUtil implements DoctorDAO {

	@Override
	public void save(Doctor doctor) {
		String sql = "insert into doctors (doctorName, speciality) values(?,?)";
		PreparedStatement pstmt = preparedStatement(sql);	
		try {
			pstmt.setString(1, doctor.getDoctorName());
			pstmt.setString(2, doctor.getSpeciality());
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
	public void update(Integer id, String speciality) {
		String sql = "update doctors set speciality=? where id=?";
		PreparedStatement pstmt = preparedStatement(sql);	
		try {
			pstmt.setString(1, speciality);
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
	public List<Doctor> list() {
		String sql = "select * from doctors";
		PreparedStatement pstmt = preparedStatement(sql);
		Doctor doctor;
		List<Doctor> doctors = new ArrayList<>();
		try {
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				doctor=new Doctor();
				doctor.setId(rs.getInt("id"));
				doctor.setDoctorName(rs.getString("doctorName"));
				doctor.setSpeciality(rs.getString("speciality"));
				doctors.add(doctor);
			}

		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
		finally{
			closePreparedStatment();
			closeConnection();
		}
		return doctors;
	}

	@Override
	public void delete(Integer id) throws DoctorNotFoundException {
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
