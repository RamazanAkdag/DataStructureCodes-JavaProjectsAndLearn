package Framework;

import java.util.List;

public interface IEntityRepository<T> {
    public List<T> getAll();

    public T getById(int id);

    public void delete(int id);

    public void update(T t);
}
