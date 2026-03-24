# 🛒 Módulo de Avaliação - E-commerce

## 👥 Integrantes do Grupo

* Nome: Kauã Rodrigues de Souza
* Nome: Felipe Santos Marceli 
* Nome: Matheus Plati

---

Este projeto representa o módulo de **avaliação de clientes** de um sistema de e-commerce, desenvolvido em Java com integração ao banco de dados Oracle.

---

## 📌 Funcionalidades

* Cadastro de avaliações de clientes
* Geração automática de ID do cliente (UUID)
* Geração de nome aleatório para simulação
* Inserção de dados no banco de dados
* Validação de notas (valores entre 1 e 5)
* Interface simples com JOptionPane

---

## 🧱 Estrutura do Projeto

```
br.com.ecommerce
│
├── model
│   ├── Avaliacao.java
│   └── Cliente.java
│
├── dao
│   ├── AvaliacaoDAO.java
│   └── ConnectionFactory.java
│
└── Main.java
```

---

## 🗄️ Banco de Dados

### Tabela

* ID CLIENTE
* NOTA LOJA
* NOTA PRODUTO

---

## ⚙️ Tecnologias Utilizadas

* Java
* Oracle Database
* Swing (JOptionPane)

---

## ▶️ Como Executar

1. Configurar a conexão com o banco no `ConnectionFactory`
2. Criar as tabelas no banco de dados
3. Executar a classe `Main`
4. Inserir as notas solicitadas
5. Os dados serão salvos no banco

---

## 📊 Exemplo de Uso

* O sistema gera automaticamente um cliente
* O usuário informa a nota da loja e do produto
* A avaliação é salva no banco de dados

---

## 📌 Observação

Este módulo faz parte de um sistema maior de e-commerce, que inclui outros módulos como:

* Pessoas
* Produtos
* Transporte
* Pagamento
* Estoque
* SAC
* Promoções/Cupons
* Carrinho de Compras

---
