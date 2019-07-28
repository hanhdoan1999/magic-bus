package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutils.CustomRowProcessorFactory;
import dto.HoiVienDto;
import dto.QuanLyDto;


public class HoiVienDao {
	private Connection connection;

	public HoiVienDao(Connection connection) {
		super();
		this.connection = connection;
	}

	public List<HoiVienDto> selectAll() {
		try{
			QueryRunner qr = new QueryRunner();
			ResultSetHandler<List<HoiVienDto>> rsh =
					new BeanListHandler<HoiVienDto>(HoiVienDto.class, CustomRowProcessorFactory.getInstance());
			return qr.query(connection, "SELECT * FROM HOI_VIEN ", rsh);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	public HoiVienDto selectById(String id) {
		QueryRunner qr = new QueryRunner();
        ResultSetHandler<HoiVienDto> rsh = new BeanHandler<HoiVienDto>(HoiVienDto.class,
                CustomRowProcessorFactory.getInstance());
        Object[] param = new Object[] { id };
        try {
        	HoiVienDto result = qr.query(connection,
                    "SELECT" + " *" + " FROM" + " HOI_VIEN" + " WHERE" + " ID_HOI_VIEN = ?", rsh, param);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }	
    }

	
		public int insert(HoiVienDto dto) {
		       QueryRunner qr = new QueryRunner();
		       Object[] param = new Object[] {dto.getIdHoiVien(),dto.getHoTen(), dto.getMatKhau(),dto.getSoDienThoai(), dto.getEmail()};
		       try {
		           int insertCount = qr.update(connection,
		                   "INSERT INTO HOI_VIEN(ID_HOI_VIEN,HO_TEN, MAT_KHAU,SO_DIEN_THOAI,EMAIL) VALUES(?,?,?,?,?)", param);
		           return insertCount;
		       } catch (SQLException e) {
		           throw new RuntimeException(e);
		       }
		   }

		public HoiVienDto searchUserLogin(String idHoiVien, String matKhau) {

			QueryRunner qr = new QueryRunner();
	        ResultSetHandler<HoiVienDto> rsh = new BeanHandler<HoiVienDto>(HoiVienDto.class,
	                CustomRowProcessorFactory.getInstance());
	        Object[] param = new Object[] { idHoiVien,matKhau };
	        try {
	        	HoiVienDto result = qr.query(connection,
	                    "SELECT" + " *" + " FROM" + " HOI_VIEN" + " WHERE" + " ID_HOI_VIEN = ?"+" AND"+" MAT_KHAU = ?", rsh, param);
	            return result;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	        
		}
		
					
}	

	


