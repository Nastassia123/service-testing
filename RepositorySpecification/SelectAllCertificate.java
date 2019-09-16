package RepositorySpecification;

public class SelectAllCertificate extends CertficateSpecification {

    private String queueToSelectCertificate = "select * from certificate where id_certificate = 1";

    @Override
    public String returnQueueOfEntity() {

        return queueToSelectCertificate;
    }
}

