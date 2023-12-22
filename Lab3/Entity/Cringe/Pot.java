package Lab3.Entity.Cringe;

import Lab3.Entity.Thing;
import Lab3.Entity.abstracts.Entity;

import java.util.ArrayList;
import java.util.List;

public class Pot extends Thing {
    public int fullability = 3;
    protected List<Entity> entityList = new ArrayList<>();

    public Pot() {
        super("горшок", "neutral", "горшок", "горшок", "горшок");
    }

    @Override
    public void interactWith(Entity objects) {
        if (this.isFreePlace()) {
            this.entityList.add(objects);
        } else {
            System.out.println(
                    " └──   Нельзя просто так взять и положить так много вещей в вещь, поэтому следующая строка лишь сюрреализм");
        }
    }

    @Override
    public int getFreeAmount() {
        return this.fullability - this.entityList.size();
    }

    @Override
    public boolean isFreePlace() {
        return this.getFreeAmount() > 0;
    }

    @Override
    public Entity[] getObjects() {
        Entity[] entities = new Entity[entityList.size()];
        int i = 0;

        for (Entity obj : entityList) {
            entities[i] = obj;
            i++;
        }

        return entities;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
