package RepositorySpecification;

public class CertificateSpecification extends Specification {


        private String queueToSelectSpecification = "select * from tag";

        @Override
        public String returnQueueOfEntity() {

            return queueToSelectSpecification;
        }
    }

