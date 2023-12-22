package Lab3.Interfaces.Functional;

import Lab3.Entity.Human;

@FunctionalInterface
public interface CreatePerson {
    Human getAndCreatePerson(String name);
}
