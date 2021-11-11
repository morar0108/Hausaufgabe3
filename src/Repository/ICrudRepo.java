package Repository;

import java.util.List;

public interface ICrudRepo <R> {

    void create(R obj);
    List<R> getAll();
    void update(R obj);
    void delete(R obj);
}

