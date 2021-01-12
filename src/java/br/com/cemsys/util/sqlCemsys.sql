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

/**criação tabela Setor**/
create table Setor (
	idSetor int identity (1,1),
	descricaoSetor varchar(20),
    constraint pk_Setor primary key (idSetor)
	)

/**criação tabela Quadra**/
create table Quadra (
	idQuadra int identity (1,1),
	descricaoQuadra varchar(20),
    constraint pk_Quadra primary key (idQuadra)
	)

/**criação tabela Lote**/
create table Lote (
	idLote int identity (1,1),
	descricaoLote varchar(20),
    constraint pk_Lote primary key (idLote)
	)




