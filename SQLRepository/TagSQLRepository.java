package SQLRepository;

import CertificateRepository.TagMapper;
import Entities.Tag;
import RepositoryInterfaces.TagRepository;
import RepositorySpecification.Specification;
import RepositorySpecification.TagSpecification;
import sqlconnection.SQLConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TagSQLRepository implements TagRepository{

        private static final String QUERY_FOR_INSERT_REQUEST = "INSERT INTO tag VALUES(?, ?)";
        private static final String QUERY_FOR_UPDATE_REQUEST = "UPDATE tag set name = ? WHERE name = ?";
        private static final String QUERY_FOR_REMOVE_REQUEST  = "DELETE from tag WHERE name= ?";

    @Override
    public int add(Tag tag) throws SQLException {

        int risultato = 0;
        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(QUERY_FOR_INSERT_REQUEST, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, "key value");
        statement.setLong(2, tag.getId());
        statement.setString(3, tag.getName());
        int i = statement.executeUpdate();
        ResultSet d = statement.getGeneratedKeys();
        return risultato;
    }

    @Override
    public int update(Tag tag) throws SQLException {

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(QUERY_FOR_UPDATE_REQUEST);
        statement.setString(1, "Nastassia");
        statement.setString(2, tag.getName());
        int i = statement.executeUpdate();
        return i;
    }

    @Override
    public int remove(Tag tag) throws SQLException {

        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(QUERY_FOR_REMOVE_REQUEST);
        statement.setString(1, tag.getName());
        int i = statement.executeUpdate();
        return i;
    }

    @Override
    public List<Tag> getObjects(Specification specification) throws SQLException {
        return null;
    }


    @Override
    public List<Tag> getObjects(TagSpecification tagSpecification) throws SQLException {
        List<Tag> tagsList = new ArrayList<>();
        PreparedStatement statement = new SQLConnect().SQLConnection().prepareStatement(tagSpecification.returnQueueOfEntity());
        ResultSet rs = statement.executeQuery();
        return  (new TagMapper().readTagsToList(rs));
    }
}