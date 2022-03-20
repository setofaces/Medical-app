--3
SELECT * FROM medical_card mc
INNER JOIN person_data pd
    ON mc.id = pd.medical_card_id;

--4
DELETE FROM medical_card x
        USING medical_card y
WHERE x.id < y.id
    AND x.client_status = y.client_status
    AND x.med_status = y.med_status
    AND x.registry_dt = y.registry_dt
    AND x.comment = y.comment;

--5
SELECT * FROM medical_card
ORDER BY id ASC
LIMIT (SELECT COUNT(*) FROM medical_card)/2;

--6
SELECT * FROM person_data pd
INNER JOIN person_data par ON pd.parent_id = par.id
INNER JOIN medical_card mc on pd.medical_card_id = mc.id
WHERE mc.med_status IS NULL;

--7
CREATE VIEW v AS
    SELECT * FROM medical_card mc
LEFT JOIN illness i on mc.id = i.medical_card_id;

--8
CREATE PROCEDURE select_data(table_name VARCHAR(32))
language plpgsql
as $$
    begin
    SELECT * FROM table_name;
end;$$;

--select_data(medical_card)....

--9
CREATE PROCEDURE update_mc_comment(id BIGINT, new_value TEXT)
language plpgsql
as $$
    begin
        UPDATE medical_card mc SET comment = new_value
        WHERE mc.id = id;
end;$$;

--10
CREATE TRIGGER on_insert AFTER INSERT ON medical_card
    EXECUTE  PROCEDURE update_mc_comment(1, 'buba')
