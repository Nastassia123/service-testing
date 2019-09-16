package RepositorySpecification;

public class SelectAllTags extends TagSpecification {

    private String queueToSelectTag = "select * from tag where";

    @Override
    public String returnQueueOfEntity() {
        return queueToSelectTag;
    }
}
