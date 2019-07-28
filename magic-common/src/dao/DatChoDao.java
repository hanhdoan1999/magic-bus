package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutils.CustomRowProcessorFactory;
import dto.BusDto;
import dto.DatChoDto;

public class DatChoDao {
	private Connection connection;

	public DatChoDao(Connection connection) {
		super();
		this.connection = connection;
	}

	
	public DatChoDto selectById(String idDatCho) {
		
	        QueryRunner qr = new QueryRunner();
	        ResultSetHandler<DatChoDto> rsh = new BeanHandler<DatChoDto>(DatChoDto.class,
	                CustomRowProcessorFactory.getInstance());
	        Object[] param = new Object[] { idDatCho };
	        try {
	        	DatChoDto result = qr.query(connection,
	                    "SELECT" + " *" + " FROM" + " DAT_CHO" + " WHERE" + " ID_DAT_CHO = ?", rsh, param);
	            return result;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
		
		
	}


	public int insertDatCho(DatChoDto dto,String idGhe) {
		String [] ngayThang1=dto.getNgayThang().split("/");
		String ngay=ngayThang1[0];
		String thang =ngayThang1[1];
		String nam=ngayThang1[2];
		String ngayThang2=nam+"-"+thang+"-"+ngay;
		Date ngayThang=Date.valueOf(ngayThang2);
		
	        QueryRunner qr = new QueryRunner();
	        Object[] param = new Object[] {dto.getIdHoiVien(),dto.getIdTuyenDuong(),idGhe,dto.getIdBus(),ngayThang
	        
	        };
	        try {
	            int insertCount = qr.update(connection,
	                    "INSERT INTO DAT_CHO(ID_HOI_VIEN, ID_TUYEN_DUONG, ID_GHE, ID_BUS, NGAY_THANG) VALUES(?,?,?,?,?)", param);
	            return insertCount;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }
	
	public List<DatChoDto> selectAll() {
		try{
			QueryRunner qr = new QueryRunner();
			ResultSetHandler<List<DatChoDto>> rsh =
					new BeanListHandler<DatChoDto>(DatChoDto.class, CustomRowProcessorFactory.getInstance());
			return qr.query(connection, "SELECT * FROM DAT_CHO", rsh);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
			
		
		}
	}


	public List<DatChoDto> selectChoDaDat(String ngayThang, String idTuyenDuong, String idBus) {
		String [] ngayThang1=ngayThang.split("/");
		String ngay=ngayThang1[0];
		String thang =ngayThang1[1];
		String nam=ngayThang1[2];
		String ngayThang2=nam+"-"+thang+"-"+ngay;
		Date ngayThang3=Date.valueOf(ngayThang2);
		
		
		    QueryRunner qr = new QueryRunner();
	        Object[] param = new Object[] { ngayThang3,idTuyenDuong,idBus
	        
	        };
		try{			
			ResultSetHandler<List<DatChoDto>> rsh =
					new BeanListHandler<DatChoDto>(DatChoDto.class, CustomRowProcessorFactory.getInstance());
			return qr.query(connection, "SELECT"
					+ " D.ID_HOI_VIEN AS ID_HOI_VIEN"
					+ " ,D.ID_GHE AS ID_GHE"
					+ " ,H.HO_TEN AS HO_TEN"
					+ " ,D.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
					+ " ,D.ID_BUS AS ID_BUS"
					+ " FROM DAT_CHO AS D"
					+ " INNER JOIN HOI_VIEN AS H"
					+ " ON D.ID_HOI_VIEN = H.ID_HOI_VIEN"
					+ " WHERE NGAY_THANG = ? AND ID_TUYEN_DUONG = ? AND ID_BUS = ?", rsh,param);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
			
		
		}
		
	}


	public List<DatChoDto> danhSachChoDaDatTheoIdTuyen(String idTuyenDuong) {
		try{
			QueryRunner qr = new QueryRunner();
			Object[] param = new Object[] { idTuyenDuong
			        
	        };
			ResultSetHandler<List<DatChoDto>> rsh =
					new BeanListHandler<DatChoDto>(DatChoDto.class, CustomRowProcessorFactory.getInstance());
			return qr.query(connection, "SELECT * FROM DAT_CHO WHERE ID_TUYEN_DUONG = ?", rsh ,param);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
			
		
		}
		
	}

}
