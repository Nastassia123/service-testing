package CertificateRepository;

import Entities.Tag;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TagMapper {



    public List<Tag> readTagsToList(ResultSet rs) throws SQLException {
        List<Tag> certificateList = new ArrayList<>();
        while (rs.next()) {
            long id = rs.getLong("id_tag");
            String name = rs.getString("name");
            certificateList.add(new Tag(id, name) {
            });
        }
        return certificateList;
    }
}