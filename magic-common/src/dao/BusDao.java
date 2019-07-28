package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutils.CustomRowProcessorFactory;
import dto.BusDto;
import dto.HoiVienDto;
import dto.SampleDto;

public class BusDao {
	private Connection connection;

	public BusDao(Connection connection) {
		super();
		this.connection = connection;
	}

	
	public List<BusDto> selectAll() {
		try{
			QueryRunner qr = new QueryRunner();
			ResultSetHandler<List<BusDto>> rsh =
					new BeanListHandler<BusDto>(BusDto.class, CustomRowProcessorFactory.getInstance());
			return qr.query(connection, "SELECT * FROM BUS ORDER BY ID_BUS", rsh);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
			
		
		}
	}


	public BusDto selectById(String idBus) {
		
	        QueryRunner qr = new QueryRunner();
	        ResultSetHandler<BusDto> rsh = new BeanHandler<BusDto>(BusDto.class,
	                CustomRowProcessorFactory.getInstance());
	        Object[] param = new Object[] { idBus };
	        try {
	            BusDto result = qr.query(connection,
	                    "SELECT" + " *" + " FROM" + " BUS" + " WHERE" + " ID_BUS = ?", rsh, param);
	            return result;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
		
		
	}


	public int insert(BusDto dto) {
		
	        QueryRunner qr = new QueryRunner();
	        Object[] param = new Object[] {  dto.getSoHang(), dto.getSoGheMoiHang(), dto.getKiHieuDiaPhuong(),dto.getBienSoDangKi()
	        ,dto.getSoThuTuDangKi()	
	        
	        };
	        try {
	            int insertCount = qr.update(connection,
	                    "INSERT INTO BUS( SO_HANG, SO_GHE_MOI_HANG, KI_HIEU_DIA_PHUONG, BIEN_SO_DANG_KI, SO_THU_TU_DANG_KI) VALUES(?,?,?,?,?)", param);
	            return insertCount;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }

	public int deleteBus(BusDto dto) {
		 QueryRunner qr = new QueryRunner();
	        Object[] param = new Object[] {dto.getIdBus()
	        
	        };
	        try {
	            int deleteCount = qr.update(connection,
	                    "DELETE FROM BUS WHERE ID_BUS=?", param);
	            return deleteCount;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
		
	}

	public int capNhatBus(BusDto dto) {
		QueryRunner qr = new QueryRunner();
        Object[] param = new Object[] {
        		dto.getSoHang() , //int
        		dto.getSoGheMoiHang(),//int
        		dto.getKiHieuDiaPhuong(),//str
        		dto.getBienSoDangKi(),//str
        		dto.getSoThuTuDangKi(), //int
        		dto.getIdBus() //str
        };
        try {
        	int result = qr.update(connection,
                    "UPDATE BUS SET "
                    + "SO_HANG = ?," //int
                    + "SO_GHE_MOI_HANG = ?," //int
                    + "KI_HIEU_DIA_PHUONG = ?," //str
                    + "BIEN_SO_DANG_KI = ?,"//str
                    + "SO_THU_TU_DANG_KI = ? "//int
                    + " WHERE ID_BUS = ? ",param); //str
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }	
	}		
}


