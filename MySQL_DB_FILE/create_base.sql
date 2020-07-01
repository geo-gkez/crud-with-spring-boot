create database school;
use school;
CREATE TABLE trainer
(
 trainerid  int NOT NULL AUTO_INCREMENT ,
 name      varchar(50) NOT NULL ,
 surname   varchar(50) NOT NULL,
 age       int   NOT NULL,

PRIMARY KEY (trainerid)

);

