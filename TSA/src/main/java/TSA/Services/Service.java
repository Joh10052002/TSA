package TSA.Services;

import java.util.List;

import TSA.entites.Identificavel;

public interface Service <E extends Identificavel> {
	
	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long id);

	List<E> getAll();

}
