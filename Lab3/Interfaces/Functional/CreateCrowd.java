package Lab3.Interfaces.Functional;

import Lab3.Entity.abstracts.Entity;

@FunctionalInterface
public interface CreateCrowd {
    Entity[] getAndCreateCrowd();
}
