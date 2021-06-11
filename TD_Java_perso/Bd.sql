
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
	directeur_id INT(11),
	FOREIGN KEY (directeur_id) REFERENCES Directeur(directeur_id)
);

CREATE Table Hotel(
	id INT(11) AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50),
    adresse VARCHAR(50),
    telephone VARCHAR(10),
    directeur_id INT(11),
    FOREIGN KEY (directeur_id) REFERENCES Directeur(id)
);
ALTER TABLE Directeur ADD hotel_id INT(11);
ALTER TABLE Directeur ADD FOREIGN KEY (hotel_id) REFERENCES Hotel(id);

