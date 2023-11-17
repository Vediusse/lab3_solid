# Название проекта

Описание предметной области, по которой должна быть построена объектная модель:

```text
Карлосон и Малыш успели тем временем ткнуть Малыш в горшок, и теперь они засыпали его землей
Карлосон неподумал, поэтому Карлосон знал, что  ответить
Спорить c его было трудно, особенно когда  бывал в настроении поспорить
К счастью, настроение у Карлосон менялось каждые 10 минут
Теперь Карлосон издал звук, похожий на кудахтанье
```

Программа должна удовлетворять следующим требованиям:

Доработанная модель должна соответствовать принципам SOLID.
Программа должна содержать как минимум два интерфейса и один абстрактный класс (номенклатура должна быть согласована с преподавателем).
В разработанных классах должны быть переопределены методы equals(), toString() и hashCode().
Программа должна содержать как минимум один перечисляемый тип (enum).

## Установка и запуск

```
git clone git@github.com:Vediusse/lab3_solid.git
```

```
cd Lab3
bash script.sh
```


## Структура проекта
```text
├── Actions
│ └── Actions.java
├── Atmoshere
│ ├── Scene.java
│ └── Sound.java
├── Entity
│ ├── MainCharacter.java
│ ├── Thing.java
│ ├── abstracts
│ │ └── Entity.java
│ ├── interfaces
│ │   └── MainCharacters.java
│ └── property
│     ├── Personality.java
│     └── SwitchableMood.java
├── Lab3.jar
├── Lab7.jar
├── META-INF
│ └── MANIFEST.mf
├── Main.java
└── script.sh
```

### Actions
- Actions.java: Файл содержит класс Actions, который описывает действия, происходящие в сцене.

### Atmosphere
- Scene.java: Файл содержит класс Scene, который представляет собой сцену, где происходят основные действия.
- Sound.java: Файл содержит класс Sound, который представляет звук, издаваемый персонажами.

### Entity
- MainCharacter.java: Файл содержит класс MainCharacter, который представляет главных персонажей. Он наследуется от абстрактного класса Entity и реализует интерфейс isMainCharacters.
- Thing.java: Файл содержит класс Thing, который представляет предметы в сцене. Он наследуется от абстрактного класса Entity и реализует интерфейс isMainCharacters.
- abstracts/Entity.java: Файл содержит абстрактный класс Entity, от которого наследуются классы MainCharacter и Thing.
- interfaces/MainCharacters.java: Файл содержит интерфейс MainCharacters, который определяет методы, связанные с главными персонажами.
- property/Personality.java: Файл содержит перечисление Personality, которое определяет характеристики персонажей.
- property/SwitchableMood.java: Файл содержит перечисление SwitchableMood, которое определяет настроение персонажей.

### Main.java
Файл содержит главный класс Main, который является точкой входа в программу. Он создает экземпляры классов MainCharacter, Thing, Sound и Scene, и вызывает различные методы для взаимодействия в сцене.

## Пример использования 

```java
public class Main {
    public static void main(String[] args) {
        MainCharacter person = new MainCharacter("Человек", "male", "Человек", "Человека", "Человеком", true, false);
        Thing         stuff  = new Thing("штука", "male", "штука", "штуки", "штукой");
        Scene         scene  = Scene.getInstance(1, new MainCharacter[] { person }, new Thing[] { stuff });

        scene.interactionThing(new Entity[] { scene.getOrCreateMain("Человек"), scene.getOrCreateMain("Strange?") },
                               scene.getOrCreateThing("штука"),
                               scene.getOrCreateThing("Strange_thing?"),
                               "подозревать",
                               false,
                               "стеснял",
                               false,
                               scene.getOrCreateThing("штука"));
    }
}
```

```text
Вывод:

MainCharacters:
	Человек
Things:
	штука

Человек joins the server

Человек и Strange? успели тем временем подозревать штука в Strange_thing?, и теперь они стесняли его штукой

```

