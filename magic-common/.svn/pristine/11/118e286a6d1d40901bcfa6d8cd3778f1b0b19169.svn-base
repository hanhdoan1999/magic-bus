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
import dto.BenDoDto;
import dto.DanhSachDatChoDto;
import dto.SampleDto;
import dto.TimKiemTuyenDuongDto;
import dto.TuyenDuongDto;

public class DanhSachDatChoDao {
	private Connection connection;

	public DanhSachDatChoDao(Connection connection) {
		super();
		this.connection = connection;
	}

	 private static final String danhsachdatcho = "" + "SELECT"
			 	+ " B3.ID_DAT_CHO AS ID_DAT_CHO"
			 	+ " ,T.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
			 	+ " ,B.ID_BEN AS ID_DIEM_DI"
	            + " ,B.TINH_THANH AS xuatPhat" 
	            + " ,B1.ID_BEN AS ID_DIEM_DEN"
	            + " ,B1.TINH_THANH AS DIEM_DEN"
	            + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
	            + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
	            + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
	            + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
	            + " ,T.GIA_CUOC AS GIA_CUOC ,T.ID_BUS AS ID_BUS"
	            + " ,B3.NGAY_THANG AS NGAY_THANG"
	            + " ,T.GIA_CUOC AS Cuoc"
	            + " ,B3.ID_GHE AS SO_GHE"
	            + " FROM TUYEN_DUONG AS T" 
	            + " INNER JOIN BEN_DO AS B"
	            + " ON B.ID_BEN = T.ID_DIEM_DI"
	            + " INNER JOIN BEN_DO AS B1"
	            + " ON B1.ID_BEN= T.ID_DIEM_DEN"
	            + " INNER JOIN DAT_CHO AS B3"
	            + " ON B3.ID_TUYEN_DUONG= T.ID_TUYEN_DUONG"
	            + " WHERE ID_HOI_VIEN = ?";
	          
	 public List<DanhSachDatChoDto> danhsachdatcho(String idHoiVien) {
			QueryRunner qr = new QueryRunner();
			ResultSetHandler<List<DanhSachDatChoDto>> rsh =
			new BeanListHandler<DanhSachDatChoDto>(DanhSachDatChoDto.class,	CustomRowProcessorFactory.getInstance());
			Object[] param = new Object[] { idHoiVien };
			try {
				List<DanhSachDatChoDto> result = qr.query(connection, danhsachdatcho, rsh, param);
				return result;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	 
	 
	 private static final String selectByIdDatCho = "" + "SELECT"
			 	+ " B3.ID_DAT_CHO AS ID_DAT_CHO"
			 	+ " ,T.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
			 	+ " ,B.ID_BEN AS ID_DIEM_DI"
	            + " ,B.TINH_THANH AS xuatPhat" 
	            + " ,B1.ID_BEN AS ID_DIEM_DEN"
	            + " ,B1.TINH_THANH AS DIEM_DEN"
	            + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
	            + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
	            + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
	            + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
	            + " ,T.GIA_CUOC AS GIA_CUOC ,T.ID_BUS AS ID_BUS"
	            + " ,B3.NGAY_THANG AS NGAY_THANG"
	            + " ,T.GIA_CUOC AS Cuoc"
	            + " ,B3.ID_GHE AS SO_GHE"
	            + " FROM TUYEN_DUONG AS T" 
	            + " INNER JOIN BEN_DO AS B"
	            + " ON B.ID_BEN = T.ID_DIEM_DI"
	            + " INNER JOIN BEN_DO AS B1"
	            + " ON B1.ID_BEN= T.ID_DIEM_DEN"
	            + " INNER JOIN DAT_CHO AS B3"
	            + " ON B3.ID_TUYEN_DUONG= T.ID_TUYEN_DUONG"
	            + " WHERE ID_DAT_CHO = ?";
	public DanhSachDatChoDto selectById(String idDatCho) {
		 QueryRunner qr = new QueryRunner();
		  ResultSetHandler<DanhSachDatChoDto> rsh = new BeanHandler<DanhSachDatChoDto>(DanhSachDatChoDto.class,
	                CustomRowProcessorFactory.getInstance());
	       Object[] param = new Object[] { idDatCho };
	       try {
	    	   DanhSachDatChoDto result = qr.query(connection,selectByIdDatCho,rsh, param);
	           return result;
	       } catch (SQLException e) {
	           throw new RuntimeException(e);
	       }    
	        
		
	}
	public int deleteDatCho(String idDatCho) {
		QueryRunner qr = new QueryRunner();
        Object[] param = new Object[] {idDatCho
        
        };
        try {
            int deleteCount = qr.update(connection,
                    "DELETE FROM DAT_cho WHERE ID_DAT_CHO=?", param);
            return deleteCount;
        } catch (SQLException e) {
            throw new RuntimeException(e);
            }
	}



	 
	
}