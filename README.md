📒 Agenda de Contactos – Projeto Java

Este projeto consiste numa **aplicação Java** que representa uma **Agenda de Contactos**, 
com suporte para **entidades singulares** (pessoas físicas) e **entidades coletivas** (organizações/empresas). 
O sistema foi desenvolvido com foco em orientação a objetos, utilizando a classe `Vector` para armazenar os dados, 
e a interface **`Operacoes`** para padronizar as funcionalidades principais da agenda.

📌 Funcionalidades

A agenda permite:

- Adicionar contactos (singulares ou coletivos);
- Remover contactos;
- Pesquisar contactos por número de telemóvel;
- Pesquisar contactos por nome;
- Consultar a idade atual dos contactos singulares;
- Unir dois contactos (associar um ao outro e remover um deles da lista principal).

---

## 🧾 Estrutura dos Contactos

### ➤ Entidades Singulares

Cada contacto do tipo singular possui:
- Nome completo
- Endereço
- Número do documento de identificação
- Data de nascimento (`Date`)
- Número de telemóvel
- Lista de contactos associados (`Vector`)

### ➤ Entidades Coletivas

Cada contacto do tipo coletivo possui:
- Nome
- Endereço
- Ano de constituição
- Área de atuação
- Número de telemóvel pessoal
- Número de telemóvel comercial
- Lista de contactos associados (`Vector`)

---

## 🔧 Interface `Operacoes`

A interface define os seguintes métodos:

```java
void adicionar(Contacto c, Vector v);
void remover(Contacto c, Vector v);
Vector pesquisar(Vector v, int nrTelemovel);
void pesquisar(Vector v, String nome);
String getIdadesContactosSingulares(Vector v);
void unirContactos(Vector v, Contacto c1, Contacto c2);
