CREATE TABLE IF NOT EXISTS pet (
  id BIGSERIAL PRIMARY KEY,
  species VARCHAR(50),
  pet_name VARCHAR(50),
  color VARCHAR(50),
  admit_date DATE,
  discharge_date DATE,
  owner_phone_number VARCHAR(12),
  owner_name VARCHAR(50)
);

