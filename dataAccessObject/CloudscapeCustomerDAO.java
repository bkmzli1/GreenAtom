package ru.bkmz.etapTwo.DB.jdbs.dataAccessObject;

import javax.sql.RowSet;
import java.util.Collection;

public class CloudscapeCustomerDAO implements
        CustomerDAO {

    public CloudscapeCustomerDAO() {
        // инициализация
    }

    // Следующие методы по необходимости могут использовать
    // CloudscapeDAOFactory.createConnection()
    // для получения соединения

    public int insertCustomer() {
        // Реализовать здесь операцию добавления клиента.
        // Возвратить номер созданного клиента
        // или -1 при ошибке
    }

    public boolean deleteCustomer() {
        // Реализовать здесь операцию удаления клиента.
        // Возвратить true при успешном выполнении, false при ошибке
    }

    public Customer findCustomer() {
        // Реализовать здесь операцию поиска клиента, используя
        // предоставленные значения аргументов в качестве критерия поиска.
        // Возвратить объект Transfer Object при успешном поиске,
        // null или ошибку, если клиент не найден.
    }

    public boolean updateCustomer() {
        // Реализовать здесь операцию обновления записи,
        // используя данные из customerData Transfer Object
        // Возвратить true при успешном выполнении, false при ошибке
    }

    public RowSet selectCustomersRS() {
        // Реализовать здесь операцию выбора клиентов,
        // используя предоставленный критерий.
        // Возвратить RowSet.
    }

    public Collection selectCustomersTO() {
        // Реализовать здесь операцию выбора клиентов,
        // используя предоставленный критерий.
        // В качестве альтернативы, реализовать возврат
        // коллекции объектов Transfer Object.
    }
}
