# Conta bancária abstrata

Este projeto se explica a partir de dois tipos de contas bancárias, a conta corrente e conta poupança, cada uma com suas próprias caracteristicas diferentes, onde inicialmente o usuário vai ser perguntado qual o valor que ele deseja depositar, após isso, é exibido o saldo disponível, depois disso é perguntado ao usuário qual valor ele deseja sacar de sua conta, posteriormente será mostrado o saldo disponível atualizado na sua conta. Tanto o valor do depósito, quanto do saque já estão taxadaos, para a conta poupança as taxas são:  taxa de 1% no depósito, e outra de 0,5% do saque, já para conta corrente, as taxas são de: 7% no depósito, e outra de 0,8% do saque. Ao final da consulta, é perguntado ao usuário se ele deseja realizar mais uma consulta, cada 5 consultas, vai ser cobrado uma taxa adicional de 0,10 centavos para conta poupança, e vai descontar R$0,50 na conta corrente, onde será exibido o saldo disponível após 5 consultas feitas.

## 🚀 Começando
Crie a classe abstrata ContaBancaria que possui os métodos abstratos, saque, depósito e consulta.

A partir dela derivam as classes concretas ContaCorrente e ContaPoupança.

A ContaPoupança não permite saques maiores que o saldo. Já a ContaCorrente possui um limite após o saldo se esgotar.

As duas contas possuem diferentes taxas para saque, depósito e consulta.
### 📋 Pré-requisitos

De que coisas você precisa para instalar o software e como instalá-lo?

```
Dar exemplos
```

### 🔧 Instalação

Entrada de dados de depósito e saque em uma conta bancária, uma conta corrente e conta poupança, ambas serão exibidas seus valores de saldo com as taxa definidas, e descontos aplicados por a cada 5 consultas realizadas

## 🛠️ Construído com

Ferramentas utilizadas e bibliotecas

* IDE Eclipse
VS Code

## 📌 Versão

* **Versão 1.0**

## ✒️ Autores

* **João Henrique Santos da Silva** - *Trabalho Inicial* - CONTA ABSTRATA
