package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutils.CustomRowProcessorFactory;
import dao.TuyenDuongDao;
import dto.TuyenDuongDto;
public class TuyenDuongDao {
		private Connection connection;

		public TuyenDuongDao(Connection connection) {
			super();
			this.connection = connection;
		}
		
		
		public List<TuyenDuongDto> selectAll(){
			try{
				QueryRunner qr = new QueryRunner();
				ResultSetHandler<List<TuyenDuongDto>> rsh =
						new BeanListHandler<TuyenDuongDto>(TuyenDuongDto.class, CustomRowProcessorFactory.getInstance());
				return qr.query(connection, "SELECT * FROM TUYEN_DUONG  ORDER BY ID_TUYEN_DUONG", rsh);
			}
			catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		public int deleteTuyenDuong(String idTuyenDuong) {
			 QueryRunner qr = new QueryRunner();
		        Object[] param = new Object[] {idTuyenDuong
		        
		        };
		        try {
		            int deleteCount = qr.update(connection,
		                    "DELETE FROM TUYEN_DUONG WHERE ID_TUYEN_DUONG=?", param);
		            return deleteCount;
		        } catch (SQLException e) {
		            throw new RuntimeException(e);
		        }
	
}
		public TuyenDuongDto selectById(String idTuyenDuong) {
			
	        QueryRunner qr = new QueryRunner();
	        ResultSetHandler<TuyenDuongDto> rsh = new BeanHandler<TuyenDuongDto>(TuyenDuongDto.class,
	                CustomRowProcessorFactory.getInstance());
	        Object[] param = new Object[] { idTuyenDuong };
	        try {
	            TuyenDuongDto result = qr.query(connection,
	                    "SELECT" + " *" + " FROM" + " TUYEN_DUONG" + " WHERE" + " ID_TUYEN_DUONG = ?", rsh, param);
	            return result;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
}
		
		
		public int updateTuyenDuong(TuyenDuongDto dto) {
			Time test = Time.valueOf("22:00:00");
			System.out.println(test);
	        QueryRunner qr = new QueryRunner();
	       Object[] param = new Object[] {
	               dto.getIdDiemDi(),//int
	               dto.getIdDiemDen(),//str
	               dto.getGiaCuoc(),//str
	               dto.getIdBus(), //int
	               Date.valueOf(dto.getNgayBatDauHoatDong()),//date
	               Date.valueOf(dto.getNgayKetThucHoatDong()),
	               Time.valueOf(dto.getThoiGianXuatPhat()),
	               Time.valueOf(dto.getThoiGianDen()),//str
	               dto.getIdTuyenDuong() //int
	       };
	       try {
	           int result = qr.update(connection,
	                   "UPDATE TUYEN_DUONG SET "
	                   + "ID_DIEM_DI= ?, " //int
	                   + "ID_DIEM_DEN = ?, " //int
	                   + "GIA_CUOC = ?, " //str
	                   + "ID_BUS = ?, "//str
	                   + "NGAY_BAT_DAU_HOAT_DONG = ?, "//int
	                   + "NGAY_KET_THUC_HOAT_DONG = ?, "//int
	                   + "THOI_GIAN_KHOI_HANH= ?, "//int
	                   + "THOI_GIAN_DU_KIEN_DEN = ? "//int
	                   + "WHERE ID_TUYEN_DUONG = ? ",param); //str
	           return result;
	       } catch (SQLException e) {
	           throw new RuntimeException(e);
	       }    
	    }
	
			public int insert(TuyenDuongDto dto) {
		/*
		 * Date date = new Date(0); SimpleDateFormat formatter = new
		 * SimpleDateFormat("yyyy/MM/dd"); String strDate= formatter.format(date);
		 */
				
				  String ngayBatDauHoatDong1=dto.getNgayBatDauHoatDong();
				  Date   ngayBatDauHoatDong=Date.valueOf(ngayBatDauHoatDong1);
				  
				  String ngayKetThucHoatDong1=dto.getNgayKetThucHoatDong();
				  Date   ngayKetThucHoatDong=Date.valueOf(ngayKetThucHoatDong1);
				  
				  String thoiGianXuatPhat1=dto.getThoiGianXuatPhat();
				  Time thoiGianXuatPhat=Time.valueOf(thoiGianXuatPhat1);
				  
				 String thoiGianDen1=dto.getThoiGianDen();
				 Time thoiGianDen=Time.valueOf(thoiGianDen1);
				  
			       QueryRunner qr = new QueryRunner();
			       Object[] param = new Object[] {dto.getIdDiemDi(), dto.getIdDiemDen(),dto.getGiaCuoc(),dto.getIdBus(), ngayBatDauHoatDong,ngayKetThucHoatDong,thoiGianXuatPhat,thoiGianDen};
			       try {
			           int insertCount = qr.update(connection,
			                   "INSERT INTO TUYEN_DUONG (ID_DIEM_DI,ID_DIEM_DEN,GIA_CUOC,ID_BUS,NGAY_BAT_DAU_HOAT_DONG,NGAY_KET_THUC_HOAT_DONG,THOI_GIAN_KHOI_HANH,THOI_GIAN_DU_KIEN_DEN) VALUES(?,?,?,?,?,?,?,?)", param);
			           return insertCount;
			       } catch (SQLException e) {
			           throw new RuntimeException(e);
			       }
			   }


			


			public List<TuyenDuongDto> danhSachTuyenTheoIdBus(String idBus) {
				try{
					QueryRunner qr = new QueryRunner();
					 Object[] param = new Object[] {idBus};
					ResultSetHandler<List<TuyenDuongDto>> rsh =
							new BeanListHandler<TuyenDuongDto>(TuyenDuongDto.class, CustomRowProcessorFactory.getInstance());
					return qr.query(connection, "SELECT * FROM TUYEN_DUONG  WHERE ID_BUS = ?", rsh,param);
				}
				catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
	}
			


