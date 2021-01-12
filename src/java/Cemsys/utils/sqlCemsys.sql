/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Erivelton
 * Created: 11/01/2021
 */
/**criação tabela Cidade**/
create table Cidade (
	idCidade int identity (1,1),
	nomeCidade varchar(50),
	estado varchar(20),
    constraint pk_Cidade primary key (idCidade)
	)


