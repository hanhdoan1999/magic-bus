package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutils.CustomRowProcessorFactory;
import dto.BenDoDto;



public class BenDoDao {
    
    private Connection connection;

    public BenDoDao(Connection connection) {
        super();
        this.connection = connection;
    }

    public List<BenDoDto> selectAll() {
        try{
            QueryRunner qr = new QueryRunner();
            ResultSetHandler<List<BenDoDto>> rsh =
            
            		new BeanListHandler<BenDoDto>(BenDoDto.class, CustomRowProcessorFactory.getInstance());
            return qr.query(connection, "SELECT * FROM BEN_DO", rsh);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }

	public BenDoDto selectById(String idBen) {
		QueryRunner qr = new QueryRunner();
        ResultSetHandler<BenDoDto> rsh = new BeanHandler<BenDoDto>(BenDoDto.class,
                CustomRowProcessorFactory.getInstance());
        Object[] param = new Object[] { idBen };
        try {
        	BenDoDto result = qr.query(connection,
                    "SELECT" + " *" + " FROM" + " BEN_DO" + " WHERE" + " ID_BEN = ?", rsh, param);
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }	
	}

	public int insert(BenDoDto dto) {
		QueryRunner qr = new QueryRunner();
	       Object[] param = new Object[] {dto.getTinhThanh()};
	       try {
	           int insertCount = qr.update(connection,
	                   "INSERT INTO BEN_DO(TINH_THANH) VALUES(?)", param);
	           return insertCount;
	       } catch (SQLException e) {
	           throw new RuntimeException(e);
	       }
		
	}


	public BenDoDto selectByIdBenDo(String idDiemDi) {
        QueryRunner qr = new QueryRunner();
       ResultSetHandler<BenDoDto> rsh = new BeanHandler<BenDoDto>(BenDoDto.class,
               CustomRowProcessorFactory.getInstance());
       Object[] param = new Object[] { idDiemDi };
       try {
           BenDoDto result = qr.query(connection,
                   "SELECT * FROM BEN_DO WHERE id_ben= ?", rsh, param);
           return result;
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }    
        
        
	}

	public int deleteBenDo(BenDoDto dto) {
		QueryRunner qr = new QueryRunner();
        Object[] param = new Object[] {dto.getIdBen()
        
        };
        try {
            int deleteCount = qr.update(connection,
                    "DELETE FROM BEN_DO WHERE ID_BEN=?", param);
            return deleteCount;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
		
	}

	public int capNhatBenDo(BenDoDto dto) {
		QueryRunner qr = new QueryRunner();
        Object[] param = new Object[] {
        		
        		dto.getTinhThanh(),
        		dto.getIdBen() //int
        		
        };
        try {
        	int result = qr.update(connection,
                    "UPDATE BEN_DO SET "          
                    + "TINH_THANH = ? "
                    + " WHERE ID_BEN = ? ",param); 
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }	
		
	}
}


