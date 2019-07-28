package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutils.CustomRowProcessorFactory;
import dto.SampleDto;

public class SampleDao {
	private Connection connection;

	public SampleDao(Connection connection) {
		super();
		this.connection = connection;
	}
	public List<SampleDto> selectAll(){
		try{
			QueryRunner qr = new QueryRunner();
			ResultSetHandler<List<SampleDto>> rsh =
					new BeanListHandler<SampleDto>(SampleDto.class, CustomRowProcessorFactory.getInstance());
			return qr.query(connection, "SELECT * FROM SAMPLE ORDER BY SAMPLE_ID", rsh);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
