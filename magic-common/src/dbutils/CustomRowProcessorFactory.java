package dbutils;

import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.RowProcessor;

public class CustomRowProcessorFactory {
	private static RowProcessor INSTANCE;
	static{
		INSTANCE =  new BasicRowProcessor(new CustomBeanProcessor());
	}

	public static RowProcessor getInstance(){
		return INSTANCE;
	}
}
