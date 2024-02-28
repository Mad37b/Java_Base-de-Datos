package com.iesVda.oracleDBA;

import java.util.ArrayList;
import java.util.List;

public interface DaoInterface<T> {

	T get_name(T t);
	T get_id(T t );
	List<T>getAll();
	T save(T t);
	T update(T t, String[]params);
	void delete(T t);
	T get(T t);

}