package RepositoryInterfaces;

import Entities.Certificate;
import RepositorySpecification.CertficateSpecification;
import RepositorySpecification.SelectAllCertificate;
import RepositorySpecification.Specification;
import RepositorySpecification.TagSpecification;

import java.sql.SQLException;
import java.util.List;

public interface CertificateRepository extends BaseRepository<Certificate> {

    int add(Certificate certificate) throws SQLException, ClassNotFoundException;

    int update(Certificate certificate) throws SQLException;

    int remove(Certificate certificate) throws SQLException;

    List<Certificate> getObjects(CertficateSpecification certficateSpecification) throws SQLException;
}
