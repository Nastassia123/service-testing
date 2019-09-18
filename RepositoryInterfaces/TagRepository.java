package RepositoryInterfaces;

import Entities.Tag;
import RepositorySpecification.Specification;
import RepositorySpecification.TagSpecification;

import java.sql.SQLException;
import java.util.List;

public interface TagRepository extends BaseRepository<Tag> {

    int add(Tag tag) throws SQLException;

    int update(Tag tag) throws SQLException;

    int remove(Tag tag) throws SQLException;

    List<Tag> getObjects(TagSpecification tagSpecification) throws SQLException;
}