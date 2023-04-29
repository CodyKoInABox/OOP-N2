# Java exercise for school

Instructions  
O objetivo é que você pratique os conceitos de herança, polimorfismo, getters/setters e construtores que são essenciais para o desenvolvimento de aplicações Java. Caso queira usar herança e diminuir código potencialmente duplicado fique a vontade.

Crie as classes e implemente os seguintes atributos e métodos:

### Classe Aluno
A classe Aluno deve ter os seguintes atributos:

| Atributo  | Tipo   |
|-----------|--------|
| Matrícula | String |
| Nome      | String |
| Endereço  | String |
| Telefone  | String |
| Email     | String |

E os seguintes métodos:

- Construtor
- Getters e setters para cada atributo

### Classe Professor
A classe Professor deve ter os seguintes atributos:

| Atributo  | Tipo   |
|-----------|--------|
| Titulação | String |
| Nome      | String |
| Endereço  | String |
| Telefone  | String |
| Email     | String |

E os seguintes métodos:

- Construtor
- Getters e setters para cada atributo

### Classe Disciplina
A classe Disciplina deve ter os seguintes atributos:

| Atributo              | Tipo              |
|-----------------------|-------------------|
| Código                | String            |
| Carga Horária         | int               |
| Ementa                | String            |
| Professor             | Professor         |
| Lista de Matriculados | List<Matriculado> |

E os seguintes métodos:

- Construtor
- Método para adicionar matriculado na disciplina
- Getters e setters para cada atributo

### Classe Curso
A classe Curso deve ter os seguintes atributos:

| Atributo             | Tipo             |
|----------------------|------------------|
| Nome                 | String           |
| Duração              | int              |
| Lista de Disciplinas | List<Disciplina> |

E os seguintes métodos:

- Construtor
- Método para adicionar disciplina ao curso
- Método para matricular aluno em disciplina do curso
- Getters e setters para cada atributo

### Classe Matriculado
A classe Matriculado deve ter os seguintes atributos:

| Atributo   | Tipo       |
|------------|------------|
| Aluno      | Aluno      |
| Disciplina | Disciplina |
| Ano        | int        |
| Semestre   | int        |

E os seguintes métodos:

- Construtor
- Getters e setters para cada atributo
