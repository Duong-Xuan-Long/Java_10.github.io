
```roomsql
SELECT b.*,c.name as category
FROM book b INNER JOIN book_category bc ON b.id=bc.id_book
INNER JOIN category c ON c.id =bc.id_category
WHERE c.name IN('comedy','drama')

SELECT b.id,b.title ,a.full_name AS author_name ,c.name AS category
FROM book b
INNER JOIN book_author ba ON b.id =ba.id_book
INNER JOIN author a ON ba.id_author =a.id
INNER JOIN book_category bc ON b.id=bc.id_book
INNER JOIN category c ON c.id =bc.id_category
WHERE (b.year_of_publication BETWEEN 1800 AND 1900)

SELECT p.name AS publisher,COUNT(b.id_publisher) AS thenumberofbooks
FROM book b RIGHT JOIN publisher p ON p.id =b.id_publisher
GROUP BY p.id 

```
