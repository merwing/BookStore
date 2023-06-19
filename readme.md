Prosta Aplikacja napisana w języku Java, frameworku Spring, z elementami html oraz css.

Aplikacja działa na zasadzie odzwierciedlenia obiektu z bazy danych na obiekt Java (ORM).
https://pl.wikipedia.org/wiki/Mapowanie_obiektowo-relacyjne
Wykorzystywany jest interface JpaRepository, który na podstawie Book(Encja, tabela) dostarcza gotowe zapytania do bazy danych m.in. CRUD
przykładowe użyte w projekcie:

findAll() => select * from books // pobranie wszyskich danych z tabeli

getById(id) => select * from books where id = 1 // pobranie konkretnej ksiażki z tabeli na podstawie id = 1

save(book) => INSERT INTO `books` (`id`, `title`, `name`, `surname`, `date_of_publication`)
VALUES (10, 'title', 'name', 'surname, '12.02.2021') // dodanie rekordu do tabeli

deleteById(id) => DELETE FROM table_name WHERE id = 1 //usunięcie rekordu z tabeli gdzie id książki = 1 

W projekcie użyty został RestController, mamy do czynienia z rest api. W kontrolerze są 4 metody:

1. pobranie wszyskich książek i wyświetlenie ich na FE,

2. pobranie jednej książki po id,

3. zapisanie nowej książki,

4. usunięcie jednek książki po id

Metody od 2-4 jesteśmy w stanie wykonać z postmana poprzez strzał na konkretny endpoint z konktetną metodą http.
Metoda 1 zwraca nam typ String, który przechowuje w sobie ciąg znaków, które tworzą nam html.

