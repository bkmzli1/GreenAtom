package ru.bkmz.etapTwo.DB.dataAccessObject.jdbc;

public interface DAO {
    public boolean createSchema(final String schema);
    public boolean dropSchema(final String schema);
}
