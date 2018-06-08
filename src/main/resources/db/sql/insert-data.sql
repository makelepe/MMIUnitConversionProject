------------- length units
--metric
INSERT INTO unit VALUES (1, 'Millimetre/s', 'Millimetre/s [mm]','length','metric');
INSERT INTO unit VALUES (2, 'Centimetre/s', 'Centimetre/s [cm]','length','metric');
INSERT INTO unit VALUES (3, 'Metre/s', 'Metre/s [m]','length','metric');
INSERT INTO unit VALUES (4, 'Kilometre/s', 'Kilometre/s [km]','length','metric');
-- imperial
INSERT INTO unit VALUES (5, 'Inch/s', 'Inch/s [in]','length','imperial');
INSERT INTO unit VALUES (6, 'Feet', 'Feet [ft]','length','imperial');
INSERT INTO unit VALUES (7, 'Yard/s', 'Yard/s [yd]','length','imperial');
INSERT INTO unit VALUES (8, 'Mile/s', 'Mile/s [ml]','length','imperial');

------------- mass units
--metric
INSERT INTO unit VALUES (9, 'Milligram/s', 'Milligram/s [mg]','mass','metric');
INSERT INTO unit VALUES (10, 'Gram/s', 'Gram/s [g]','mass','metric');
INSERT INTO unit VALUES (11, 'Kilogram/s', 'Kilogram/s [kg]','mass','metric');
INSERT INTO unit VALUES (12, 'Tonne/s', 'Tonne/s [t]','mass','metric');
-- imperial
INSERT INTO unit VALUES (13, 'Ounce/s', 'Ounce/s [oz]','mass','imperial');
INSERT INTO unit VALUES (14, 'Pound/s', 'Pound/s [lb]','mass','imperial');
INSERT INTO unit VALUES (15, 'Stone/s', 'Stone/s [s]','mass','imperial');

------------- area units
--metric
INSERT INTO unit VALUES (16, 'Square Millimetre/s', 'Millimetre/s [mm2]','area','metric');
INSERT INTO unit VALUES (17, 'Square Centimetre/s', 'Centimetre/s [cm2]','area','metric');
INSERT INTO unit VALUES (18, 'Square Metre/s', 'Metre/s [m2]','area','metric');
INSERT INTO unit VALUES (19, 'Square Kilometre/s', 'Kilometre/s [km2]','area','metric');
INSERT INTO unit VALUES (20, 'Hactare/s', 'Hactare/s [ha]','area','metric');
-- imperial
INSERT INTO unit VALUES (21, 'Square Inch/s', 'Inch/s [in2]','area','imperial');
INSERT INTO unit VALUES (22, 'Square Feet', 'Feet [sq ft]','area','imperial');
INSERT INTO unit VALUES (23, 'Square Yard/s', 'Yard/s [yd2]','area','imperial');
INSERT INTO unit VALUES (24, 'Square Mile/s', 'Mile/s [ml2]','area','imperial');
INSERT INTO unit VALUES (25, 'Acre/s', 'Acre/s [a]','area','imperial');



------------------- rates
-- length
INSERT INTO unit_rate VALUES (1, 0.0393700787, 1, 5);
INSERT INTO unit_rate VALUES (2, 0.0032808399, 1, 6);
INSERT INTO unit_rate VALUES (3, 0.0010936133, 1, 7);
INSERT INTO unit_rate VALUES (4, 0.00001, 1, 8);
INSERT INTO unit_rate VALUES (5, 0.393700787, 2, 5);
INSERT INTO unit_rate VALUES (6, 0.032808399, 2, 6);
INSERT INTO unit_rate VALUES (7, 0.010936133, 2, 7);
INSERT INTO unit_rate VALUES (8, 0.00001, 2, 8);
INSERT INTO unit_rate VALUES (9, 39.3700787, 3, 5);
INSERT INTO unit_rate VALUES (10, 3.2808399, 3, 6);
INSERT INTO unit_rate VALUES (11, 1.0936133, 3, 7);
INSERT INTO unit_rate VALUES (12, 0.000621371192, 3, 8);
INSERT INTO unit_rate VALUES (13, 39370.0787, 4, 5);
INSERT INTO unit_rate VALUES (14, 3280.8399, 4, 6);
INSERT INTO unit_rate VALUES (15, 1093.6133, 4, 7);
INSERT INTO unit_rate VALUES (16, 0.621371192, 4, 8);
-- mass
INSERT INTO unit_rate VALUES (17, 0.00003527, 9, 13);
INSERT INTO unit_rate VALUES (18, 0.00001, 9, 14);
INSERT INTO unit_rate VALUES (19, 0.00001, 9, 15);
INSERT INTO unit_rate VALUES (20, 0.0352733686, 10, 13);
INSERT INTO unit_rate VALUES (21, 0.00220462262, 10, 14);
INSERT INTO unit_rate VALUES (22, 0.000157473044, 10, 15);
INSERT INTO unit_rate VALUES (23, 35.2733686, 11, 13);
INSERT INTO unit_rate VALUES (24, 2.20462262, 11, 14);
INSERT INTO unit_rate VALUES (25, 0.157473044, 11, 15);
INSERT INTO unit_rate VALUES (26, 35273.3686, 12, 13);
INSERT INTO unit_rate VALUES (27, 2204.62262, 12, 14);
INSERT INTO unit_rate VALUES (28, 157.473044, 12, 15);
-- area
INSERT INTO unit_rate VALUES (29, 0.0015500031, 16, 21);
INSERT INTO unit_rate VALUES (30, 0.00001076, 16, 22);
INSERT INTO unit_rate VALUES (31, 0.00001, 16, 23);
INSERT INTO unit_rate VALUES (32, 0.00001, 16, 24);
INSERT INTO unit_rate VALUES (33, 0.00001, 16, 25);
INSERT INTO unit_rate VALUES (34, 0.15500031, 17, 21);
INSERT INTO unit_rate VALUES (35, 0.00107639104, 17, 22);
INSERT INTO unit_rate VALUES (36, 0.000119599005, 17, 23);
INSERT INTO unit_rate VALUES (37, 0.00001, 17, 24);
INSERT INTO unit_rate VALUES (38, 0.00001, 17, 25);
INSERT INTO unit_rate VALUES (39, 1550.0031, 18, 21);
INSERT INTO unit_rate VALUES (40, 10.7639104,18, 22);
INSERT INTO unit_rate VALUES (41, 1.19599005, 18, 23);
INSERT INTO unit_rate VALUES (42, 0.00001, 18, 24);
INSERT INTO unit_rate VALUES (43, 0.00001, 18, 25);
INSERT INTO unit_rate VALUES (44, 1550003100, 19, 21);
INSERT INTO unit_rate VALUES (45, 10763910.4, 19, 22);
INSERT INTO unit_rate VALUES (46, 1195990.05, 19, 23);
INSERT INTO unit_rate VALUES (47, 0.386102175, 19, 24);
INSERT INTO unit_rate VALUES (48, 247.105382, 19, 25);
INSERT INTO unit_rate VALUES (49, 15500031, 20, 21);
INSERT INTO unit_rate VALUES (50, 107639.104, 20, 22);
INSERT INTO unit_rate VALUES (51, 11959.9005, 20, 23);
INSERT INTO unit_rate VALUES (52, 0.00386102175, 20, 24);
INSERT INTO unit_rate VALUES (53, 2.47105382, 20, 25);
