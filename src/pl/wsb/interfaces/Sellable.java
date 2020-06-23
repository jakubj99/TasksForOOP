package pl.wsb.interfaces;

import pl.wsb.human.Human;

public interface Sellable {
    void sell() throws Exception;
    boolean sell(Human buyer, Human seller) throws Exception;
}
