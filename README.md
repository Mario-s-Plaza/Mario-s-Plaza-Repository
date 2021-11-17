## Unidade Curricular: GESTÃO E QUALIDADE DE SOFTWARE

# Organização Mario's Plaza

### Integrantes da organização

- Matheus Henrique
- David Jacobis 
- Rafael Martins 
- Natan Gonçalves 
- Leonardo Henrique
- Amanda Batista
- Gustavo Cristhian

## Link para o protótipo

* https://www.figma.com/file/ZHSsG9jytYPbt6ltWcv7qK/Mario's-Plaza?node-id=0%3A1


## Instalação

* Nessa aplicação estamos utilizando o MySQL

Crie uma base de dados com o nome "usuario" e uma tabela com o nome "t_usuario". Dentro dessa tabela crie 3 campos "nome", "email" e "senha".

##### Código para a criação da tabela: 
```
CREATE TABLE `t_usuario` (
  `idt_usuario` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`idt_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tabela de usuários';
```

* É necessário informar a senha do seu banco de dados, e o seu usuario se necessário, no código do arquivo "Conector.java"

No construdor desse arquivo coloque sua senha no campo "password" e seu usuário, caso ele não for "root", no campo "username".

##### Parte do código do arquivo Conector.java:
```
public Conector() {
        serverName = "localhost:3306";
        database = "usuario";
        url = "jdbc:mysql://" + serverName + "/" + database;
        username = "root";
        password = "Sua senha"; // Coloque a senha do seu banco de dados
    }
```
