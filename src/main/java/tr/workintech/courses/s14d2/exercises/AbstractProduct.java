package tr.workintech.courses.s14d2.exercises;

public abstract class AbstractProduct implements Product {

    private final String id;
    private String name;
    private String producer;

    protected AbstractProduct(String id) {

        this.id = id;
    }

    protected AbstractProduct(String id, String name, String producer) {

        this.id = id;
        this.name = name;
        this.producer = producer;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null) return;

        this.name = name;
    }

    @Override
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {

        if (producer == null) return;

        this.producer = producer;
    }
}
