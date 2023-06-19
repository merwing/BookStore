drop
database if exists `bookstore`;

Create database `bookstore`;

use
`bookstore`;

CREATE TABLE `books`
(
    `id`                  int(11) NOT NULL,
    `title`               text COLLATE utf8_polish_ci NOT NULL,
    `name`                text COLLATE utf8_polish_ci NOT NULL,
    `surname`             text COLLATE utf8_polish_ci NOT NULL,
    `date_of_publication` date COLLATE utf8_polish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

INSERT INTO `books` (`id`, `title`, `name`, `surname`, `date_of_publication`)
VALUES (1, 'ksiazka1', 'Alicja', 'Alicjowska', '12.02.2021'),
       (2, 'Harry Potter', 'james', 'bond', '01.01.2000'),
       (3, 'lalka', 'bolek', 'prusiak', '02.02.2020'),
       (4, 'tytual12', 'krzysiek', 'krzyskowy', '01.01.2000'),
       (5, 'ksiazka15', 'olaf', 'olafinski', '15.01.2000'),
       (7, 'przykladowy', 'imieiimei', 'nazwisko12312313', '01.01.2000'),
       (8, 'nastepny', 'kolejny', 'nazwiskoprzyklad', '01.01.2000'),
       (9, '103623', '103623', '103623', '01.01.2000'),
       (10, 'k103623', 'k103623', 'k103623', '01.01.2000'),
       (11, 'asdsad', 'asdsa', 'asdsa', '01.01.2000'),
       (12, 'ASDSADSADAS', 'ADSASDSA', 'ASDSAD', '01.01.2000');

ALTER TABLE `books`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `books`
    MODIFY `id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;
COMMIT;
