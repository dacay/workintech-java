package tr.workintech.courses.s14d2.exercises;

import tr.workintech.courses.s14d2.exercises.AbstractProduct;

public class HotProduct extends AbstractProduct {

    protected HotProduct(String id) {
        super(id);
    }

    protected HotProduct(String id, String name, String producer) {
        super(id, name, producer);
    }
}
