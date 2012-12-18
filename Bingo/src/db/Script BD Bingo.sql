CREATE DATABASE bingo;
USE bingo;
CREATE TABLE Bingo( idBingo INT NOT NULL AUTO_INCREMENT, descBingo VARCHAR(30), PRIMARY KEY (idBingo)); 
CREATE TABLE Carton( idCarton INT NOT NULL AUTO_INCREMENT, descCarton VARCHAR(30), fk_idBingo INT NOT NULL, fk_idUsuario INT NOT NULL, PRIMARY KEY (idCarton));
CREATE TABLE Balotas( idBalotas INT NOT NULL AUTO_INCREMENT, letra VARCHAR(1) NOT NULL, numero INT NOT NULL, fk_idCarton INT NOT NULL, PRIMARY KEY (idBalotas));
CREATE TABLE BalotasCorrectas( idBalotaCorrec INT NOT NULL AUTO_INCREMENT, letra VARCHAR(1) NOT NULL, numero INT NOT NULL, fk_idBingo INT NOT NULL, PRIMARY KEY (idBalotaCorrec));
CREATE TABLE personabingo (idUsuario INT NOT NULL AUTO_INCREMENT, nombreUsuario VARCHAR(30), fk_idTipoPersona INT NOT NULL, PRIMARY KEY (idUsuario));
CREATE TABLE tipoPersona (idTipoPersona INT NOT NULL AUTO_INCREMENT, descripTipoPersona VARCHAR(20), PRIMARY KEY (idTipoPersona));
CREATE TABLE partidasGanadas( idPartidGanadas INT NOT NULL AUTO_INCREMENT,descPartida VARCHAR (20), fk_idUsuario INT NOT NULL, PRIMARY KEY (idPartidGanadas));
 
ALTER TABLE Carton
ADD CONSTRAINT fk_Bingo_Carton_1 
FOREIGN KEY (fk_idBingo) 
REFERENCES Bingo(idBingo); 

ALTER TABLE Carton 
ADD CONSTRAINT fk_Usuario_Bingo_1 
FOREIGN KEY (fk_idUsuario) 
REFERENCES usuariobingo(idUsuario);

ALTER TABLE BalotasCorrectas 
ADD CONSTRAINT fk_Bingo_BalotaCorrect_1 
FOREIGN KEY (fk_idBingo) 
REFERENCES Bingo(idBingo); 

ALTER TABLE Balotas 
ADD CONSTRAINT fk_carton_balotas_1 
FOREIGN KEY (fk_idCarton) 
REFERENCES Carton(idCarton);

ALTER TABLE personabingo
  ADD CONSTRAINT fk_TipoPersona_PersonaBingo1
  FOREIGN KEY (idTipoPersona_fk)
  REFERENCES tipoPersona(idTipoPersona);
  
ALTER TABLE partidasGanadas
ADD CONSTRAINT fk_Persona_partidasGanadas_1 
FOREIGN KEY (fk_idUsuario) 
REFERENCES personabingo(idUsuario);
  
INSERT INTO tipopersona (descripTipoPersona) VALUES ('servidor'); 
INSERT INTO tipopersona (descripTipoPersona) VALUES ('cliente'); 