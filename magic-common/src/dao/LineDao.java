package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import dbutils.CustomRowProcessorFactory;
import dto.LineBusComplexDto;


public class LineDao {
    private Connection connection;

    public LineDao(Connection connection) {
        super();
        this.connection = connection;
    }


    
     private static final String SEARCH_LINE = "" + "SELECT"
                 + " T.ID_TUYEN_DUONG AS id_Line"
                 + " ,B.ID_BEN AS ID_DIEM_DI"
                + " ,B.TINH_THANH AS DIEM_DI"
                + " ,B1.ID_BEN AS ID_DIEM_DEN"
                + " ,B1.TINH_THANH AS DIEM_DEN"
                + " ,T.THOI_GIAN_KHOI_HANH AS THOI_GIAN_KHOI_HANH"
                + " ,T.THOI_GIAN_DU_KIEN_DEN AS THOI_GIAN_DU_KIEN_DEN"
                + " ,T.NGAY_BAT_DAU_HOAT_DONG AS NGAY_BAT_DAU_HOAT_DONG"
                + " ,T.NGAY_KET_THUC_HOAT_DONG AS NGAY_KET_THUC_HOAT_DONG"
                + " ,T.GIA_CUOC AS GIA_CUOC ,T.ID_BUS AS ID_BUS"
                + " ,B3.SO_GHE_MOI_HANG AS SO_GHE_MOI_HANG"
                + " ,T.GIA_CUOC AS PRICE"
                + " ,B3.SO_HANG AS HANG_GHE"
                + " ,COALESCE((B3.SO_HANG * B3.SO_GHE_MOI_HANG) - BSE.QUALITY,B3.SO_HANG * B3.SO_GHE_MOI_HANG) AS SO_GHE_TRONG"
                + " FROM TUYEN_DUONG AS T"
                + " INNER JOIN BEN_DO AS B"
                + " ON B.ID_BEN = T.ID_DIEM_DI"
                + " INNER JOIN BEN_DO AS B1"
                + " ON B1.ID_BEN= T.ID_DIEM_DEN"
                + " INNER JOIN BUS AS B3"
                + " ON B3.ID_BUS= T.ID_BUS"
                + " LEFT OUTER JOIN ("
                + " SELECT COUNT (*) AS QUALITY,ID_TUYEN_DUONG,NGAY_THANG FROM DAT_CHO WHERE NGAY_THANG=? GROUP BY ID_TUYEN_DUONG,NGAY_THANG"
                + " ) AS BSE ON BSE.ID_TUYEN_DUONG=T.ID_TUYEN_DUONG"
                + " WHERE"+" B.TINH_THANH like"+" ?"+" AND"+" B1.TINH_THANH like"+" ?"
                +" AND"
                +" ( ? BETWEEN NGAY_BAT_DAU_HOAT_DONG AND NGAY_KET_THUC_HOAT_DONG)";

    public List<LineBusComplexDto> searchLine(String diemDi,String diemDen,Date date) {
            Object[] param = new Object[] {date,diemDi, diemDen ,date};
        QueryRunner qr = new QueryRunner();
        ResultSetHandler<List<LineBusComplexDto>> rsh =

                new BeanListHandler<LineBusComplexDto>(LineBusComplexDto.class,

                        CustomRowProcessorFactory.getInstance());

        try {
            return qr.query(connection, SEARCH_LINE, rsh, param);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}