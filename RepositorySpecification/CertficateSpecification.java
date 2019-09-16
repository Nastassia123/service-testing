package RepositorySpecification;

public class CertficateSpecification extends Specification {
    private String queueToSelectCertificate = "select * from certificate";

    @Override
    public String returnQueueOfEntity() {

        return queueToSelectCertificate;
    }
}
