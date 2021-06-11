
CREATE TABLE Directeur(
	id INT(11) AUTO_INCREMENT PRIMARY KEY,
	nom VARCHAR(50),
	prenom VARCHAR(50)
);

CREATE TABLE Salarie(
	id INT(11) AUTO_INCREMENT PRIMARY KEY,
	nom VARCHAR(50),
	prenom VARCHAR(50)
	salaire INT(11),
	experience Int(11)
	FOREIGN KEY (hotel_id) REFERENCES Hotel(id)
);

