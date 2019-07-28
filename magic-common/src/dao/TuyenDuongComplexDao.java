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
import dto.HoiVienDto;
import dto.TuyenDuongComplexDto;

public class TuyenDuongComplexDao {
	private Connection connection;

	public TuyenDuongComplexDao(Connection connection) {
		super();
		this.connection = connection;
	}

	 private static final String SELECT_ALL_SQL = "" + "SELECT" + " T.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
	            + " ,B.ID_BEN AS ID_DIEM_DI" 
			    + " ,B.TINH_THANH AS DIEM_XUAT_PHAT"
	            + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
	            + " ,B1.ID_BEN AS ID_DIEM_DEN"
	            + " ,B1.TINH_THANH AS DIEM_DEN"
	            + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
	            + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
	            + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
	            + " ,T.GIA_CUOC AS GIA_CUOC"
	            + " ,T.ID_BUS AS ID_BUS"
	            + " FROM TUYEN_DUONG AS T" 
	            + " INNER JOIN BEN_DO AS B"
	            + " ON B.ID_BEN = T.ID_DIEM_DI"
	            + " INNER JOIN BEN_DO AS B1"
	            + " ON B1.ID_BEN= T.ID_DIEM_DEN";

 	
	          
	public List<TuyenDuongComplexDto> selectAll() {
		 QueryRunner qr = new QueryRunner();
	        ResultSetHandler<List<TuyenDuongComplexDto>> rsh = new BeanListHandler<TuyenDuongComplexDto>(TuyenDuongComplexDto.class,


                    CustomRowProcessorFactory.getInstance());
            try {
                List<TuyenDuongComplexDto> result = qr.query(connection, SELECT_ALL_SQL, rsh);
                return result;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
	

	}      
    
	 
	 
	public TuyenDuongComplexDto selectById(String idTuyenDuong) {
		
			QueryRunner qr = new QueryRunner();
	        ResultSetHandler<TuyenDuongComplexDto> rsh = new BeanHandler<TuyenDuongComplexDto>(TuyenDuongComplexDto.class,
	                CustomRowProcessorFactory.getInstance());
	        Object[] param = new Object[] { idTuyenDuong };
	        try {
	        	TuyenDuongComplexDto result = qr.query(connection,
	        			 "" + "SELECT" + " T.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
	        			            + " ,B.ID_BEN AS ID_DIEM_DI" 
	        					    + " ,B.TINH_THANH AS DIEM_XUAT_PHAT"
	        			            + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
	        			            + " ,B1.ID_BEN AS ID_DIEM_DEN"
	        			            + " ,B1.TINH_THANH AS DIEM_DEN"
	        			            + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
	        			            + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
	        			            + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
	        			            + " ,T.GIA_CUOC AS GIA_CUOC"
	        			            + " ,T.ID_BUS AS ID_BUS"
	        			            + " FROM TUYEN_DUONG AS T" 
	        			            + " INNER JOIN BEN_DO AS B"
	        			            + " ON B.ID_BEN = T.ID_DIEM_DI"
	        			            + " INNER JOIN BEN_DO AS B1"
	        			            + " ON B1.ID_BEN= T.ID_DIEM_DEN"
	        			            + " WHERE"
	        			            + " ID_TUYEN_DUONG = "+" ?", rsh, param);
	            return result;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }	
	   
	}



	public List<TuyenDuongComplexDto> locTuyenDuong(Date date) {
		 QueryRunner qr = new QueryRunner();
	        ResultSetHandler<List<TuyenDuongComplexDto>> rsh = new BeanListHandler<TuyenDuongComplexDto>(TuyenDuongComplexDto.class,


                 CustomRowProcessorFactory.getInstance());
        Object[] param = new Object[] { date };
        try {
        	 List<TuyenDuongComplexDto> result = qr.query(connection,
        			 "" + "SELECT" + " T.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
        			            + " ,B.ID_BEN AS ID_DIEM_DI" 
        					    + " ,B.TINH_THANH AS DIEM_XUAT_PHAT"
        			            + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
        			            + " ,B1.ID_BEN AS ID_DIEM_DEN"
        			            + " ,B1.TINH_THANH AS DIEM_DEN"
        			            + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
        			            + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
        			            + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
        			            + " ,T.GIA_CUOC AS GIA_CUOC"
        			            + " ,T.ID_BUS AS ID_BUS"
        			            + " FROM TUYEN_DUONG AS T" 
        			            + " INNER JOIN BEN_DO AS B"
        			            + " ON B.ID_BEN = T.ID_DIEM_DI"
        			            + " INNER JOIN BEN_DO AS B1"
        			            + " ON B1.ID_BEN= T.ID_DIEM_DEN"
        			            + " WHERE"
        			            + " ? BETWEEN NGAY_BAT_DAU_HOAT_DONG AND NGAY_KET_THUC_HOAT_DONG", rsh, param);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }	

	}



	public List<TuyenDuongComplexDto> danhSachTuyenTheoIdBus(String idBus) {
		QueryRunner qr = new QueryRunner();
        ResultSetHandler<List<TuyenDuongComplexDto>> rsh = new BeanListHandler<TuyenDuongComplexDto>(TuyenDuongComplexDto.class,


             CustomRowProcessorFactory.getInstance());
    Object[] param = new Object[] { idBus };
    try {
    	 List<TuyenDuongComplexDto> result = qr.query(connection,
    			 "" + "SELECT" + " T.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
    			            + " ,B.ID_BEN AS ID_DIEM_DI" 
    					    + " ,B.TINH_THANH AS DIEM_XUAT_PHAT"
    			            + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
    			            + " ,B1.ID_BEN AS ID_DIEM_DEN"
    			            + " ,B1.TINH_THANH AS DIEM_DEN"
    			            + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
    			            + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
    			            + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
    			            + " ,T.GIA_CUOC AS GIA_CUOC"
    			            + " ,T.ID_BUS AS ID_BUS"
    			            + " FROM TUYEN_DUONG AS T" 
    			            + " INNER JOIN BEN_DO AS B"
    			            + " ON B.ID_BEN = T.ID_DIEM_DI"
    			            + " INNER JOIN BEN_DO AS B1"
    			            + " ON B1.ID_BEN= T.ID_DIEM_DEN"
    			            + " WHERE"
    			            + " ID_BUS = ?", rsh, param);
        return result;
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }	
	}



	public List<TuyenDuongComplexDto> danhSachTuyenTheoIdBen(String idBen) {
		
		QueryRunner qr = new QueryRunner();
        ResultSetHandler<List<TuyenDuongComplexDto>> rsh = new BeanListHandler<TuyenDuongComplexDto>(TuyenDuongComplexDto.class,


             CustomRowProcessorFactory.getInstance());
    Object[] param = new Object[] { idBen , idBen };
    try {
    	 List<TuyenDuongComplexDto> result = qr.query(connection,
    			 "" + "SELECT" + " T.ID_TUYEN_DUONG AS ID_TUYEN_DUONG"
    			            + " ,B.ID_BEN AS ID_DIEM_DI" 
    					    + " ,B.TINH_THANH AS DIEM_XUAT_PHAT"
    			            + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
    			            + " ,B1.ID_BEN AS ID_DIEM_DEN"
    			            + " ,B1.TINH_THANH AS DIEM_DEN"
    			            + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
    			            + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
    			            + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
    			            + " ,T.GIA_CUOC AS GIA_CUOC"
    			            + " ,T.ID_BUS AS ID_BUS"
    			            + " FROM TUYEN_DUONG AS T" 
    			            + " INNER JOIN BEN_DO AS B"
    			            + " ON B.ID_BEN = T.ID_DIEM_DI"
    			            + " INNER JOIN BEN_DO AS B1"
    			            + " ON B1.ID_BEN= T.ID_DIEM_DEN"
    			            + " WHERE"
    			            + " B.ID_BEN = ? OR B1.ID_BEN = ?", rsh, param);
        return result;
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }	
	}
}
