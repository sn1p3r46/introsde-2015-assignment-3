CREATE TABLE Person (
	idPerson	INTEGER PRIMARY KEY AUTOINCREMENT,
	firstname	TEXT DEFAULT 'NULL',
	lastname	TEXT DEFAULT 'NULL',
	birthdate	DATETIME DEFAULT 'NULL'
);


CREATE TABLE MeasureDefinition (
	idMeasureDefinition	INTEGER PRIMARY KEY AUTOINCREMENT,
	measureName	TEXT DEFAULT 'NULL',
	measureType	TEXT DEFAULT 'NULL'
);


CREATE TABLE HealthMeasureHistory(
	idMeasureHistory		INTEGER PRIMARY KEY AUTOINCREMENT,
	idPerson				INTEGER DEFAULT 'NULL',
	idMeasureDefinition		INTEGER DEFAULT 'NULL',
	value					TEXT,
	timestamp				DATETIME DEFAULT 'NULL',

	FOREIGN KEY( idPerson ) REFERENCES Person ( idPerson ) ON DELETE NO ACTION ON UPDATE NO ACTION,
	FOREIGN KEY( idMeasureDefinition ) REFERENCES MeasureDefinition ( idMeasureDefinition ) ON DELETE NO ACTION ON UPDATE NO ACTION
);



INSERT INTO person (idPerson, firstname, lastname, birthdate) VALUES ( 1 ,"Andrea","galloni","725670000000");
INSERT INTO person (idPerson, firstname, lastname, birthdate) VALUES ( 2 ,"Edoardo","galloni","520732800000");
INSERT INTO person (idPerson, firstname, lastname, birthdate) VALUES ( 3 ,"Guido","galloni", "-488332800000");
INSERT INTO person (firstname, lastname, birthdate) 		  VALUES ("Giacomo","Mene","771379200000");


INSERT INTO MeasureDefinition (idMeasureDefinition, measureName, measureType) VALUES ( 1 ,"height","integer");
INSERT INTO MeasureDefinition (idMeasureDefinition, measureName, measureType) VALUES ( 2 ,"weight","double");
INSERT INTO MeasureDefinition (idMeasureDefinition, measureName, measureType) VALUES ( 3 ,"bmi","double");


INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (1,1,"55", "802915200000");
INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (1,1,"110","834537600000");
INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (1,1,"140","866073600000");


INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (1,2,"20","789782400000");
INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (1,2,"35","826502400000");
INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (1,2,"67","857952000000");

INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (2,1,"220","881884800000");
INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (2,1,"330","913420800000");
INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (2,1,"770","944956800000");

INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (2,2,"22","881884800000");
INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (2,2,"33","913420800000");
INSERT INTO HealthMeasureHistory (idPerson, idMeasureDefinition, value, timestamp ) VALUES (2,2,"77","866073600000");


CREATE VIEW LifeStatus AS SELECT idMeasureHistory, idPerson, idMeasureDefinition, measureName, value, MAX(timestamp) AS timestamp FROM HealthMeasureHistory NATURAL JOIN MeasureDefinition GROUP BY idPerson, idMeasureDefinition;



SELECT * FROM person;

SELECT * FROM MeasureDefinition;

SELECT * FROM HealthMeasureHistory;


SELECT firstname, person.idPerson, idMeasureDefinition, MeasureDefinition.measureName, HealthMeasureHistory.timestamp FROM person NATURAL JOIN (HealthMeasureHistory NATURAL JOIN MeasureDefinition);

SELECT * FROM LifeStatus;

.quit

