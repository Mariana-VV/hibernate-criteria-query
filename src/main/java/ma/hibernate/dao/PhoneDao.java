package ma.hibernate.dao;

import java.util.List;
import java.util.Map;
import ma.hibernate.model.Phone;

public interface PhoneDao {
    Phone create(Phone phone);

    Phone get(Long id);

    // Use CriteriaQuery for this method
    List<Phone> findAll(Map<String, String[]> params);
}
