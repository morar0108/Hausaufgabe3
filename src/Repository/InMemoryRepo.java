package Repository;

import java.util.*;

public abstract class InMemoryRepo <R> implements ICrudRepo<R> {

    protected List<R> repoList = new ArrayList<>();

    public InMemoryRepo(){
    }

    /**
     * Hinzufugen
     * @param obj = neuen Objekt
     */
    @Override
    public void create(R obj) {
        this.repoList.add(obj);
    }

    /**
     *
     * @return Liste mit allen Objekten
     */
    @Override
    public List<R> getAll() {
        return this.repoList;
    }

    /**
     * Loschen
     * @param obj = neuen Objekt
     */
    @Override
    public void delete(R obj) {
        this.repoList.remove(obj);
    }
}
