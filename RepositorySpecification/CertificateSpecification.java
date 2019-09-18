package RepositorySpecification;

public class CertificateSpecification extends Specification {


        private static final String QUEUE_TO_SELECT_SPECIFICATION = "select * from certificate";

        @Override
        public String returnQueueOfEntity() {

            return QUEUE_TO_SELECT_SPECIFICATION;
        }
    }

