-- Insert Sample Pincode Data
INSERT INTO pincode (pincode, latitude, longitude) VALUES
('411014', 18.5204, 73.8567),
('110001', 28.6139, 77.2090);

-- Insert Sample Weather Data
INSERT INTO weather_data (pincode_id, for_date, weather_info) VALUES
(1, '2020-10-15', '{"temperature": "30°C", "humidity": "70%", "description": "Clear sky"}'),
(2, '2020-10-15', '{"temperature": "28°C", "humidity": "80%", "description": "Partly cloudy"}');
