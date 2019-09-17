package RepositorySpecification;

public class SelectAllCertificate extends CertificateSpecification {

    private String queueToSelectCertificate = "select * from certificate";

    @Override
    public String returnQueueOfEntity() {

        return queueToSelectCertificate;
    }
}

