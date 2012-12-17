CREATE DATABASE bingo;
USE bingo;
CREATE TABLE Bingo( idBingo INT NOT NULL AUTO_INCREMENT, descBingo VARCHAR(30), PRIMARY KEY (idBingo) ); 
CREATE TABLE Carton( idCarton INT NOT NULL AUTO_INCREMENT, descCarton VARCHAR(30), fk_idBingo INT NOT NULL, PRIMARY KEY (idCarton) );
CREATE TABLE Balotas( idBalotas INT NOT NULL AUTO_INCREMENT, letra VARCHAR(1) NOT NULL, numero INT(2) NOT NULL, fk_idCarton INT NOT NULL, PRIMARY KEY (idBalotas) );
CREATE TABLE BalotasCorrectas( idBalotaCorrec INT NOT NULL AUTO_INCREMENT, letra VARCHAR(1) NOT NULL, numero INT(2) NOT NULL, fk_idBingo INT NOT NULL, PRIMARY KEY (idBalotaCorrec) );

ALTER TABLE Carton
ADD CONSTRAINT fk_Bingo_Carton_1 
FOREIGN KEY (fk_idBingo) 
REFERENCES Bingo(idBingo); 

ALTER TABLE BalotasCorrectas 
ADD CONSTRAINT fk_Bingo_BalotaCorrect_1 
FOREIGN KEY (fk_idBingo) 
REFERENCES Bingo(idBingo); 

ALTER TABLE Balotas 
ADD CONSTRAINT fk_carton_balotas_1 
FOREIGN KEY (fk_idCarton) 
REFERENCES Carton(idCarton);