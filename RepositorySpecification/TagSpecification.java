package RepositorySpecification;

public class TagSpecification extends Specification{
    private String queueToSelectTag = "select * from tag";

    @Override
    public String returnQueueOfEntity() {

        return queueToSelectTag;
    }
}