# 🍕 Projeto Papitto´s Pizzas - Sistema de Pedidos

Bem-vindo ao Papitto´s Pizzas , sistema de pizzaria feito em Java! Aqui você pode simular o funcionamento de uma pizzaria, com menus para funcionários e clientes, cadastro de clientes e gerenciamento de pedidos. Tudo pelo terminal, de um jeito simples e direto!

## Como rodar o programa

_Para pegar sempre a versão atualizada do projeto, clone o repositório do Github, caso baixe via ZIP, pode acontecer de que baixe uma versão desatualizada ou quebrada!"_

0. Antes de começar, **Vamos clonar o repositório do projeto:**

- No terminal, digite:

```
git clone https://github.com/WilianWill/Pizzaria.git

```

- Entre na pasta do projeto e digite:

  ```
  cd Pizzaria

  ```

1. **Compile todos os arquivos Java:**
   - No terminal, navegue até a pasta `src` e rode:
     ```
     javac *.java
     ```
2. **Execute o programa principal:**
   - Ainda na pasta `src`, rode:
     ```
     java App
     ```

## O que você pode fazer?

### Menu Inicial

Assim que rodar, você verá:

- Login como Funcionário 👨‍🍳
- Login como Cliente 👤
- Login como Entregador 🛵
- Sair

Escolha digitando o número da opção!

---

### 👨‍🍳 Funcionário

Ao logar como funcionário, você pode:

- **Listar pedidos:** Veja todos os pedidos feitos, com status, valor e cliente.
- **Listar clientes:** veja todos os clientes cadastrados.
- **Atualizar status de pedido:** Mude o status de um pedido (ex: de "Pendente" para "Em preparo").
- **Cadastrar cliente:** Adicione novos clientes ao sistema (nome, email, telefone).
- **Voltar:** Retorna ao menu inicial.

---

### 👤 Cliente

Ao logar como cliente, você pode:

- **Fazer novo pedido:** Informe seu ID de cliente e o valor do pedido para registrar um novo pedido.
- **Listar Pedidos:** veja todos os pedidos cadastrados, logado como cliente.
- **Voltar:** Retorna ao menu inicial.

---

### 🛵 Entregador

Ao logar como Entregador, você pode:

- **Listar pedidos** Veja todos os pedidos dos clientes.
- **Voltar** Volte para o menu principal de Login do programa!

## Dicas de uso

- **Cadastre clientes antes de fazer pedidos!**
- O ID do cliente é gerado automaticamente ao cadastrar.
- O ID do pedido também é gerado automaticamente.
- O sistema é todo em memória (ao fechar, os dados somem).

## Sobre oódigo

- O menu principal e as funcionalidades estão em `App.java`.
- As classes `Cliente`, `Pedido`, etc., são apenas modelos de dados.
- Tudo é feito via terminal/console.

---

---

## Equipe de Desenvolvedores 👥 🧑‍🤝‍🧑.:

**Feito pela Equipe:**

_Wilian Gonçalves Lima_,
_Andre Lacerda_,
_Gabriela Moreira de Oliveira_,
_Lilian Gomes Ferreira de Paula_

Divirta-se testando e adaptando o sistema! 🍕
