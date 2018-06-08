CREATE TABLE unit (
  id     INTEGER PRIMARY KEY,
  name   VARCHAR(30),
  description  VARCHAR(50),
  category   VARCHAR(30),
  type   VARCHAR(30)
);

CREATE TABLE unit_rate (
  id     INTEGER PRIMARY KEY,
  conversion_rate   FLOAT,
  metric_unit_id  INTEGER,
  imperial_unit_id   INTEGER
);
