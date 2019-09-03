package org.ven.mockitilearning.model.api;

public interface IBusinessInterface {
    int  doBusinessStuff(Pojo pojo, int index) throws Exception;
    default void doStuff() throws Exception {
        doBusinessStuff(null, 100);
    }
}
