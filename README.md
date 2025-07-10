# 🍕 Projeto Papitto´s Pizzas - Sistema de Pedidos

Bem-vindo ao Papitto´s Pizzas , sistema de pizzaria feito em Java! Aqui você pode simular o funcionamento de uma pizzaria, com menus para funcionários e clientes, cadastro de clientes e gerenciamento de pedidos. Tudo pelo terminal, de um jeito simples e direto!

## Como rodar o programa

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

- Login como Funcionário
- Login como Cliente
- Sair

Escolha digitando o número da opção!

---

### 👨‍🍳 Funcionário

Ao logar como funcionário, você pode:

- **Listar pedidos:** Veja todos os pedidos feitos, com status, valor e cliente.
- **Atualizar status de pedido:** Mude o status de um pedido (ex: de "Pendente" para "Em preparo").
- **Cadastrar cliente:** Adicione novos clientes ao sistema (nome, email, telefone).
- **Voltar:** Retorna ao menu inicial.

---

### 👤 Cliente

Ao logar como cliente, você pode:

- **Fazer novo pedido:** Informe seu ID de cliente e o valor do pedido para registrar um novo pedido.
- **Voltar:** Retorna ao menu inicial.

---

## Dicas de uso

- **Cadastre clientes como funcionário antes de fazer pedidos!**
- O ID do cliente é gerado automaticamente ao cadastrar.
- O ID do pedido também é gerado automaticamente.
- O sistema é todo em memória (ao fechar, os dados somem).

## Sobre o código

- O menu principal e as funcionalidades estão em `App.java`.
- As classes `Cliente`, `Pedido`, etc., são apenas modelos de dados.
- Tudo é feito via terminal/console.

---

---

## Equipe de Desenvolvedores 👥 🧑‍🤝‍🧑.:

**Feito pela Equipe:**

_Wilian Gonçalves Lima_,
_Andre Lacerda_,
_Gabriela Moreira de Oliveira _,
_Lilian Paula_

Divirta-se testando e adaptando o sistema! 🍕
