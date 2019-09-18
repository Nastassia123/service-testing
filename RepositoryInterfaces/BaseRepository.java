package RepositoryInterfaces;

import RepositorySpecification.Specification;

import java.sql.SQLException;
import java.util.List;

public interface BaseRepository<T> {

    int add(T t) throws SQLException, ClassNotFoundException;

    int update(T t) throws SQLException;

    int remove(T t) throws SQLException;

    List<T> getObjects(Specification specification) throws SQLException;
}