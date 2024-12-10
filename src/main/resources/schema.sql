-- Create Table for Pincode
CREATE TABLE pincode (
    id SERIAL PRIMARY KEY,
    pincode VARCHAR(10) NOT NULL UNIQUE,
    latitude DOUBLE PRECISION NOT NULL,
    longitude DOUBLE PRECISION NOT NULL
);

-- Create Table for Weather Data
CREATE TABLE weather_data (
    id SERIAL PRIMARY KEY,
    pincode_id INT NOT NULL REFERENCES pincode(id) ON DELETE CASCADE,
    for_date DATE NOT NULL,
    weather_info JSONB NOT NULL,
    UNIQUE (pincode_id, for_date)
);
