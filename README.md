# Название проекта

Описание предметной области, по которой должна быть построена объектная модель:

```text
MainCharacters:
	Карлосон
	Малыш
	Карлосон
	faceless
	faceless
Things:
	Семечко
	горшок
	земля

Карлосон joins the server
Малыш joins the server
Карлосон joins the server
faceless joins the server
faceless joins the server

Карлосон и Малыш успели тем временем ткнуть Семечко в горшок, и теперь они засыпали его землей
Карлосон неподумал, поэтому Малыш не знал, что ответить
Спорить c ним было трудно, особенно когда он бывал в настроении поспорить
К счастью, настроение у Карлосонa менялось каждые 10 минут
Теперь Карлосон издал звук, похожий на кудахтанье



Карлосон и Малыш успели тем временем ткнуть Семечко в горшок, и теперь они засыпали его землей
Карлосон и Малыш успели тем временем ткнуть семечко в горшок, и теперь они засыпали его землей
Карлосон и Малыш успели тем временем ткнуть Семечко в горшок, и теперь они засыпали его землей
 └──   Нельзя просто так взять и положить так много вещей в вещь, поэтому следующая строка лишь сюрреализм



Карлосон и Малыш успели тем временем ткнуть Семечко в Негоршок, и теперь они засыпали его землей
└──  Нельзя закапывать что то не в горшок :)



Теперь Малыш издал звук, похожий на кудахтанье
└──  Малыш не захочет кудахтать
Теперь горшок издал звук, похожий на кудахтанье
└──  горшок не захочет кудахтать
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
│   ├── Actions.java
│   └── interactiveAction.java
├── Atmoshere
│   ├── Scene.java
│   └── Sound.java
├── Entity
│ ├── Cringe
│ │ ├── Dirty.java
│ │ ├── Karloson.java
│ │ ├── Malush.java
│ │ ├── Pot.java
│ │ ├── Seed.java
│ │ └── property
│ │     ├── Akkusative.java
│ │     ├── Gender.java
│ │     ├── Instrumental.java
│ │     └── Name.java
│ ├── Human.java
│ ├── Thing.java
│ ├── abstracts
│ │ └── Entity.java
│ ├── interfaces
│ │ ├── Fullness.java
│ │ ├── HumanFactory.java
│ │ └── MainCharacters.java
│ └── property
│     ├── Personality.java
│     └── SwitchableMood.java
├── Lab3.jar
├── Lab7.jar
├── META-INF
│   └── MANIFEST.mf
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

## Запуск
```bash
bash script.sh
```

## v2 правки

- Добавил возможность создания массовки *Ссылки на методы* (HumanFactory humanFactory = Human::new;)  (Main.java (17,23); Entity.interface.HumanFactory)
- Облечил читаемость Main.class, создав дефолтные классы Seed,Pot,Dirty,Karloson,Malush (Main.java (15-21);Entity.Cringe)
- Добавил *Enum* для большей дефолтности дефолтных классов Seed,Pot,Dirty,Karloson,Malush (Entity.Cringe; Entity.Cringe.property)
- Добавил реализацию *Функциональных интерфейсов* (Actions.interativeAction;Actions.java(51);Atmospere.Scene(93))


