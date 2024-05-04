# Домашнее задание к занятию «Collections Framework. CRUD и тестирование систем, управляющих набором объектов»

## Решения
### Задание 1
 * <a href="https://github.com/Nephedov/16.Java/blob/main/src/test/java/ru/nerology/javaqa/GameTest.java">GameTest.java</a> - класс с автотестами.

Ветка <a href="https://github.com/Nephedov/16.Java/tree/main">main</a> репозитория с проектом.
### Задание 2
 * <a href="https://github.com/Nephedov/16.Java/blob/fast/src/test/java/ru/nerology/javaqa/GameTest.java">GameTest.java</a> - класс с автотестами.

Ветка <a href="https://github.com/Nephedov/16.Java/tree/fast">fast</a> репозитория с проектом.
## Что было сделано
### Задание 1
* Создан Maven проект и настроен <a href="https://github.com/Nephedov/16.Java/blob/main/pom.xml">pom.xml</a> с зависимостями и плагинами:
  * JunitJupier.
  * Surefire.
  * Jacoco в режиме генерации отчетов и обрушения сборки по покрытию 100% по бранчам методов.
  * Настроен <a href="https://github.com/Nephedov/16.Java/blob/main/.github/workflows/maven.yml">maven.yml</a> для Github CI.
* Реализован дата-класс <a href="https://github.com/Nephedov/16.Java/blob/main/src/main/java/ru/nerology/javaqa/Player.java">Player.java</a> - описывающий объект "игрока".
* Реализован класс <a href="https://github.com/Nephedov/16.Java/blob/main/src/main/java/ru/nerology/javaqa/Game.java">Game.java</a> -
  описывающий логику взаимодействия объектов Player, и хранением объектов в виде списка.
* Создан класс исключения <a href="https://github.com/Nephedov/16.Java/blob/main/src/main/java/ru/nerology/javaqa/NotRegisteredException.java">NotRegisteredException.java</a>,
  отнаследованный от RuntimeException - используемый в методе round() класса
  <a href="https://github.com/Nephedov/16.Java/blob/main/src/main/java/ru/nerology/javaqa/Game.java">Game.java</a>.
* Реализован класс с автотестами <a href="https://github.com/Nephedov/16.Java/blob/main/src/test/java/ru/nerology/javaqa/GameTest.java">GameTest.java</a> проверяющий работу класса
  <a href="https://github.com/Nephedov/16.Java/blob/main/src/main/java/ru/nerology/javaqa/Game.java">Game.java</a>.
### Задание 2
* Создана ветка <a href="https://github.com/Nephedov/16.Java/tree/fast">fast</a> из ветки <a href="https://github.com/Nephedov/16.Java/tree/main">main</a> в которой:
  * В классе <a href="https://github.com/Nephedov/16.Java/blob/fast/src/main/java/ru/nerology/javaqa/Game.java">Game.java</a> заменена коллекция списка на мапу (HashMap).

# Задание 1. Турнир (обязательное к выполнению)
Ваша задача — разработать класс, управляющий турниром игроков. Каждый игрок описывается дата-классом `Player` с полями `id`, `name`, `strength` (сила).

Сам же турнир описывается классом `Game` с методами:
* `register (Player player)` — метод регистрации игрока, если игрок не зарегистрирован, то он не сможет играть в турнире. Вам нужно хранить всех зарегистрированных игроков в поле класса `Game` в виде списка.
* `round (String playerName1, String playerName2)` — метод соревнования между двумя игроками. Если хотя бы один из игроков не зарегистрирован, должно выкинуться исключение `NotRegisteredException` — сами создайте его класс. Обратите внимание, что игроки передаются методу через имя — полную информацию об игроке нужно будет найти в коллекции зарегистрированных игроков (см. аналог в виде `findById` из прошлых домашних заданий). Выигрывает тот игрок, у которого больше `strength` (сила), если сила одинаковая, то будет ничья. Метод должен возвращать одно число — `0` в случае ничьи, `1` в случае победы первого игрока и `2` в случае победы второго игрока.

Напишите на класс `Game` тесты, покрыв по бранчам на 100%.

# Задание 2*. Турнир: ускорение (необязательная задача)

Отведите ветку `fast` в репозитории прошлой задачи и выполняйте эту задачу в ней.
Доработайте прошлую задачу, заменив коллекцию списка игроков на мапу (`HashMap`) для быстрого поиска информации об игроке по его имени.
Создайте Pull Request этой ветки к основной, но не применяйте его.
Убедитесь, что все тесты проходят, CI работает на вашей ветке.
