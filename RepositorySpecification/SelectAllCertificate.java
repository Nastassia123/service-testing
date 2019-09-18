package RepositorySpecification;

public class SelectAllCertificate extends CertificateSpecification {

    private static final String QUEUE_TO_SELECT_CERTIFICATE = "select id_certificate, name, date_of_creation, date_of_modification, price from certificate";

    @Override
    public String returnQueueOfEntity() {

        return QUEUE_TO_SELECT_CERTIFICATE;
    }
}

