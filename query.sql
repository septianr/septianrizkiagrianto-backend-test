SELECT murid.id as id_murid, murid.name as name, p.status as pendidikan_terakhir, murid.time_create as create_time, p.time_create as time_update
FROM pendidikan p
         JOIN (
    SELECT id_murid, MAX(time_create) AS last_create
    FROM pendidikan
    GROUP BY id_murid
) last_pendidikan
ON p.id_murid = last_pendidikan.id_murid
AND p.time_create = last_pendidikan.last_create
INNER join murid on p.id_murid = murid.id;