```roomsql
/*cau 1*/
SELECT m.title ,m.description ,d.full_name AS director ,JSON_ARRAYAGG(w.full_name) AS writer,m.`length` ,m.rating 
FROM movie m 
INNER JOIN director d ON m.id_director =d.id 
INNER JOIN movie_writers mw ON mw.id_movie =m.id 
INNER JOIN writers w ON w.id =mw.id_writer 
INNER JOIN title_type tt ON tt.id =m.id_title_type 
WHERE tt.name ='Movie'
GROUP BY m.id 

/*cau 2*/
SELECT m2.name ,COUNT(m.id)
FROM movie m 
INNER JOIN movie_manufacturer mm ON m.id =mm.id_movie 
RIGHT JOIN manufacturer m2 ON m2.id =mm.id_manufacturer 
GROUP BY m2.id

/*cau 3*/
SELECT * 
FROM movie m 
INNER JOIN title_type tt ON m.id_title_type  =tt.id
WHERE tt.name ='TV Series'
AND m.current_episode=m.episode  

/*cau 4*/
SELECT m.title ,t.link,mt.status 
FROM movie m 
LEFT JOIN movie_trailer mt ON m.id =mt.id_movie 
LEFT join trailer t ON t.id =mt.id_trailer 
WHERE mt.status ='active'

/*cau 5*/
SELECT m.title ,m.description ,m.poster ,m.`length` ,m.imdb  
FROM movie m 
INNER JOIN title_type tt ON tt.id =m.id_title_type 
WHERE tt.name ='Movie'
ORDER BY m.imdb DESC

/*cau 6*/
SELECT m.id,m.title ,m.description ,m.poster ,m.`length`,JSON_ARRAYAGG(g.name) AS genres,m.episode,m.current_episode  
FROM movie m 
INNER JOIN movie_genres mg ON mg.id_movie =m.id 
INNER JOIN genres g ON g.id =mg.id_genres 
INNER JOIN title_type tt ON tt.id =m.id_title_type 
WHERE tt.name ='TV Mini Series'
GROUP BY m.id 
ORDER BY m.release_date DESC

/*cau 7*/
SELECT m.imdb ,m.title ,m.description ,d.full_name as director,JSON_ARRAYAGG(w.full_name) AS writer,m.poster ,m.`length` ,JSON_ARRAYAGG(g.name) AS genres
,JSON_ARRAYAGG(a.full_name) AS actor
FROM movie m 
INNER JOIN director d ON d.id =m.id_director 
INNER JOIN movie_writers mw ON mw.id_movie =m.id 
INNER JOIN writers w ON w.id =mw.id_writer 
INNER JOIN movie_genres mg ON mg.id_movie =m.id 
INNER JOIN genres g ON g.id =mg.id_genres
INNER JOIN movie_actor ma ON ma.id_movie =m.id 
INNER JOIN actor a ON ma.id_actor =a.id 
INNER JOIN title_type tt ON tt.id =m.id_title_type 
WHERE tt.name ='Movie'
GROUP BY m.id
ORDER BY m.imdb DESC
LIMIT 10

```