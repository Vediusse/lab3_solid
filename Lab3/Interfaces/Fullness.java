package Lab3.Interfaces;

import Lab3.Entity.abstracts.Entity;

public interface Fullness {
    void interactWith(Entity objects);

    int getFreeAmount();

    boolean isFreePlace();

    Entity[] getObjects();
}


//~ Formatted by Jindent --- http://www.jindent.com
