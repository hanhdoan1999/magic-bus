package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutils.CustomRowProcessorFactory;
import dto.TimKiemTuyenDuongDto;
import dto.TuyenDuongComplexDto;

public class TimKiemTuyenDuongDao {
	private Connection connection;

	public TimKiemTuyenDuongDao(Connection connection) {
		super();
		this.connection = connection;
	}


	 private static final String SELECT_ALL_SQL = "" + "SELECT"
			 	+ " T.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
			 	+ " ,B.ID_BEN AS ID_DIEM_DI"
	            + " ,B.TINH_THANH AS DIEM_XUAT_PHAT" 
	            + " ,B1.ID_BEN AS ID_DIEM_DEN"
	            + " ,B1.TINH_THANH AS DIEM_DEN"
	            + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
	            + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
	            + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
	            + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
	            + " ,T.GIA_CUOC AS GIA_CUOC ,T.ID_BUS AS ID_BUS"
	            + " ,B3.SO_GHE_MOI_HANG AS SO_GHE_MOI_HANG"
	            + " ,T.GIA_CUOC AS GIA_CUOC"
	            + " ,B3.SO_HANG AS SO_HANG"
	            + " FROM TUYEN_DUONG AS T" 
	            + " INNER JOIN BEN_DO AS B"
	            + " ON B.ID_BEN = T.ID_DIEM_DI"
	            + " INNER JOIN BEN_DO AS B1"
	            + " ON B1.ID_BEN= T.ID_DIEM_DEN"
	            + " INNER JOIN BUS AS B3"
	            + " ON B3.ID_BUS= T.ID_BUS"
	            + " WHERE"+" B.TINH_THANH like"+" ?"+" AND"+" B1.TINH_THANH like"+" ?"
	            +" AND"
	            +" ( ? BETWEEN NGAY_BAT_DAU_HOAT_DONG AND NGAY_KET_THUC_HOAT_DONG)";
	 
	// convert(datetime, '?', 101
	          
	public List<TimKiemTuyenDuongDto> timKiemTuyenDuong(String diemDi,String diemDen,Date date) {
		QueryRunner qr = new QueryRunner();
		ResultSetHandler<List<TimKiemTuyenDuongDto>> rsh =
		new BeanListHandler<TimKiemTuyenDuongDto>(TimKiemTuyenDuongDto.class,	CustomRowProcessorFactory.getInstance());
		Object[] param = new Object[] { diemDi, diemDen, date };
		try {
			List<TimKiemTuyenDuongDto> result = qr.query(connection, SELECT_ALL_SQL, rsh, param);
			return result;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
		
	}


