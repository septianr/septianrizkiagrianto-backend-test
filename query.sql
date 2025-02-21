SELECT m.id as id, m.name as name, p.status as pendidikan_terakhir, m.time_create as time_create, p.time_create as time_update FROM `pendidikan` as p
INNER JOIN murid as m on m.id = p.id_murid
GROUP by m.name
order by p.time_create DESC LIMIT 1