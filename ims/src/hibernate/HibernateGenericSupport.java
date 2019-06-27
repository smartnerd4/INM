package hibernate;

import java.sql.SQLException;

public interface HibernateGenericSupport {
	add(Object dto) throws SQLException;
	update(Object dto) throws SQLException;
	delete(Object dto) throws SQLException;

}
