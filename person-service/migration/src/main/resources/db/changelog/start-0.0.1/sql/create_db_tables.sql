CREATE TABLE contact (
id BIGINT PRIMARY KEY  generated always as identity ,
phone_number VARCHAR(32),
email VARCHAR(128) ,
profile_link TEXT
);
CREATE TABLE medical_card (
id BIGINT PRIMARY KEY  generated always as identity,
client_status CHAR,
med_status CHAR,
registry_dt DATE,
comment TEXT
);

CREATE TABLE address (
id BIGINT PRIMARY KEY  generated always as identity,
contact_id BIGINT REFERENCES contact (id),
country_id BIGINT,
city VARCHAR(255),
index INTEGER,
street VARCHAR(255),
building VARCHAR(32),
flat VARCHAR(32)
);

CREATE TABLE person_data (
id BIGINT PRIMARY KEY  generated always as identity,
last_name VARCHAR(255),
first_name VARCHAR(255),
birth_dt DATE,
age SMALLINT,
sex CHAR,
email VARCHAR(255),
password VARCHAR(255),
contact_id BIGINT REFERENCES contact (id),
medical_card_id BIGINT REFERENCES medical_card (id),
parent_id BIGINT REFERENCES person_data (id)
);

CREATE TABLE illness (
id BIGINT PRIMARY KEY  generated always as identity,
medical_card_id BIGINT REFERENCES medical_card (id),
type_id BIGINT,
heaviness CHAR,
appearance_dttm TIMESTAMP,
recovery_dt DATE
);

CREATE TABLE role (
id BIGINT PRIMARY KEY generated always as identity,
name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS role_person
(
    person_data_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    PRIMARY KEY (person_data_id, role_id),
    FOREIGN KEY (person_data_id) REFERENCES person_data(id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES role(id) ON DELETE CASCADE
);
