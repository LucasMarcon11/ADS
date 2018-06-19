CREATE TABLE Cliente (

	idCliente 		SERIAL NOT NULL,

	login			TEXT NOT NULL,
	senha			TEXT NOT NULL,
	cpf			TEXT,
	email	 		TEXT NOT NULL,
	telefone	 	TEXT,
	nascimento		DATE,
	
	cep			TEXT,
	endereco	 	TEXT,
	numeroEndereco		TEXT,
	complemento		TEXT,
	cidade	 		TEXT,
	bairro			TEXT,
	pontoReferencia		TEXT,
	estado	 		TEXT,
	
	administrador		BOOLEAN DEFAULT FALSE,

CONSTRAINT un_Cliente_cpf UNIQUE (cpf),
CONSTRAINT un_Cliente_email UNIQUE (email),
CONSTRAINT pk_Cliente_idCliente PRIMARY KEY (idCliente));

insert into cliente values (default, 'Lucas', '123', '123234567889','lucas@teste.com', '55999999999', '2000-02-02','Rua xxx', 'São Chico', 'RS')

select * from Cliente



CREATE TABLE Categoria (

	idCategoria 		SERIAL NOT NULL,
	nome	 		TEXT NOT NULL,
	
CONSTRAINT pk_Categoria_idCategoria PRIMARY KEY(idCategoria));

insert into categoria values (default, 'acústicos')

select * from categoria



CREATE TABLE Produto (

	idProduto 		SERIAL NOT NULL,
	idCategoria 		INT NOT NULL,
	nome	 		TEXT NOT NULL,
	modelo			TEXT,
	marca			TEXT,
	descricao	 	TEXT,
	preco	 		NUMERIC(8, 2) NOT NULL,
	estoque 		INT NOT NULL,

CONSTRAINT pk_Produto_idProduto PRIMARY KEY (idProduto),
CONSTRAINT fk_Produto_Categoria_idCategoria FOREIGN KEY (idCategoria) REFERENCES Categoria);

insert into produto values (default, 'violão','jejejeje', 300.00, 100, 1);

select * from produto



CREATE TABLE ItemVenda (

	idItemVenda 		SERIAL NOT NULL,
	idCliente 		INT NOT NULL,
	dataVenda 		DATE NOT NULL,
	valorProduto 		NUMERIC(8, 2) NOT NULL,
	
CONSTRAINT pk_ItemVenda_idItemVenda PRIMARY KEY (idItemVenda),
CONSTRAINT fk_ItemVenda_Cliente_idCliente FOREIGN KEY (idCliente) REFERENCES Cliente);

insert into venda values (default, 1, current_date, (SELECT precoProduto FROM Produto WHERE idProduto = 1))

select * from ItemVenda



CREATE TABLE Venda (

	idItemVenda 		INT NOT NULL,
	idProduto 		INT NOT NULL,
	quantidade 		INT NOT NULL,
	
CONSTRAINT pk_Venda_idItemVenda_idProduto PRIMARY KEY (idVenda, idProduto),
CONSTRAINT fk_Venda_ItemVenda_idItemVenda FOREIGN KEY (idItemVenda) REFERENCES ItemVenda,
CONSTRAINT fk_Venda_Produto_idProduto FOREIGN KEY (idProduto) REFERENCES Produto);

insert into Venda values (1, 
