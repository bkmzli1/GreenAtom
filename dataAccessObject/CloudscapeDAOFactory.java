package ru.bkmz.etapTwo.DB.jdbs.dataAccessObject;

public class CloudscapeDAOFactory extends DAOFactory {
    public static final String DRIVER=
            "COM.cloudscape.core.RmiJdbcDriver";
    public static final String DBURL=
            "jdbc:cloudscape:rmi://localhost:1099/CoreJ2EEDB";

    // метод для создания соединений к Cloudscape
    public static Connection createConnection() {
        // Использовать DRIVER и DBURL для создания соединения
        // Рекомендовать реализацию/использование пула соединений
    }
    public CustomerDAO getCustomerDAO() {
        // CloudscapeCustomerDAO реализует CustomerDAO
        return new CloudscapeCustomerDAO();
    }
    public AccountDAO getAccountDAO() {
        // CloudscapeAccountDAO реализует AccountDAO
        return new CloudscapeAccountDAO();
    }
    public OrderDAO getOrderDAO() {
        // CloudscapeOrderDAO реализует OrderDAO
        return new CloudscapeOrderDAO();
    }
}