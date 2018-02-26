package lab.common;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface CrudJdbcDao<T extends Identifiable<T, ID>, ID> extends Supplier<NamedParameterJdbcTemplate> {

    Stream<T> getAll(Class<T> entityClass);

    /** @apiNote Attention! Very slow performance! */
    default Optional<T> get(ID id, Class<T> entityClass) {
        return getAll(entityClass).filter(t -> t.getId().equals(id)).findFirst();
    }

    T save(T entity);
    T update(T entity);
    T delete(T entity);
}
