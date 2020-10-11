package ru.bkmz.etapTwo.DB.jdbs.dataAccessObject;

import javax.sql.RowSet;
import java.util.Collection;

public interface CustomerDAO {
    public int insertCustomer(...);
    public boolean deleteCustomer(...);
    public Customer findCustomer(...);
    public boolean updateCustomer(...);
    public RowSet selectCustomersRS(...);
    public Collection selectCustomersTO(...);
}
