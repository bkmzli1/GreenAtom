package ru.bkmz.etapTwo.DB.jdbs.dataAccessObject;

public abstract class DAOFactory {

    // Список типов DAO, поддерживаемых генератором
    public static final int CLOUDSCAPE = 1;
    public static final int ORACLE = 2;
    public static final int SYBASE = 3;


    // Здесь будет метод для каждого DAO, который может быть
    // создан. Реализовывать эти методы
    // должны конкретные генераторы.
    public abstract CustomerDAO getCustomerDAO();
    public abstract AccountDAO getAccountDAO();
    public abstract OrderDAO getOrderDAO();


    public static DAOFactory getDAOFactory(
            int whichFactory) {

        switch (whichFactory) {
            case CLOUDSCAPE:
                return new CloudscapeDAOFactory();
            case ORACLE    :
                return new OracleDAOFactory();
            case SYBASE    :
                return new SybaseDAOFactory();

            default           :
                return null;
        }
    }
}