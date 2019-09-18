package RepositorySpecification;

public class SelectAllTags extends TagSpecification {

    private static final String QUEUE_TO_SELECT_TAG = "select id_tag, name from tag";

    @Override
    public String returnQueueOfEntity() {
        return QUEUE_TO_SELECT_TAG;
    }
}