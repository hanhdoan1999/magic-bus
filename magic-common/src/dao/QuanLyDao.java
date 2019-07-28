package dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import dbutils.CustomRowProcessorFactory;
import dto.QuanLyDto;

public class QuanLyDao {

	private Connection connection;

    public QuanLyDao(Connection connection) {
        super();
        this.connection = connection;
    }

	public QuanLyDto searchAdminLogin(String idQuanLy, String matKhau) {
		
		QueryRunner qr = new QueryRunner();
        ResultSetHandler<QuanLyDto> rsh = new BeanHandler<QuanLyDto>(QuanLyDto.class,
                CustomRowProcessorFactory.getInstance());
        Object[] param = new Object[] { idQuanLy,matKhau };
        try {
        	QuanLyDto result = qr.query(connection,
                    "SELECT" + " *" + " FROM" + " QUAN_LY_VAN_HANH" + " WHERE" + " ID_QUAN_LY = ?"+" AND"+" MAT_KHAU = ?", rsh, param);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
	}
 
}
