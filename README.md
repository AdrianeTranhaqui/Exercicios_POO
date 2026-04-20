# 📚 Exercícios de Programação Orientada a Objetos (POO) em Java

Este repositório reúne uma sequência de exercícios práticos em **Java**, com foco na evolução do aprendizado em **Programação Orientada a Objetos (POO)** — partindo de lógica básica até conceitos mais avançados como herança, interfaces e tratamento de exceções.

---

## 📂 Estrutura do Projeto

### 🔹 Exercício 01 - Simulador de Caixa Eletrônico

**Tema:** Lógica e Estruturas de Controle

**Descrição:**
Implementação de um sistema de caixa eletrônico utilizando apenas lógica no `main`, com menu interativo baseado em `do-while` e `switch-case`.

**Menu:**

* 1 - Ver saldo
* 2 - Depositar
* 3 - Sacar
* 0 - Sair

**Regras de Negócio:**

* Limite máximo de **3 saques diários**
* Ao tentar o 4º saque → exibir: *"Limite de saques diários atingido"*
* Valor máximo por saque: **R$ 1.000,00**

---

### 🔹 Exercício 02 - Conta Bancária

**Tema:** Classes e Objetos

**Descrição:**
Refatoração do exercício anterior utilizando POO.

**Classe criada:**
`ContaBancaria`

**Atributos:**

* `numero`
* `titular`
* `saldo`

**Métodos:**

* `depositar()`
* `sacar()`

**Regras de Negócio:**

* Todas as regras do exercício anterior continuam válidas
* Ao criar uma conta, o cliente recebe automaticamente:

  * 💰 **Bônus de boas-vindas de R$ 50,00**
* A conta deve ser instanciada no `main`

---

### 🔹 Exercício 03 - Sistema de E-commerce

**Tema:** Relacionamentos e Encapsulamento

**Descrição:**
Modelagem de um sistema simples de pedidos com relacionamento entre classes.

**Estrutura:**

* `Cliente`
* `Pedido`
* `ItemPedido`

Um `Pedido` pertence a um `Cliente` e contém uma lista de `ItemPedido`.

**Regras de Negócio:**

* Método `fecharPedido()` deve:

  * Calcular o valor total dos itens
  * Aplicar frete:

    * 🟢 **Grátis** se total > R$ 250,00
    * 🔴 **R$ 25,00** caso contrário
  * Imprimir um **recibo detalhado**

---

### 🔹 Exercício 04 - Sistema de Veículos

**Tema:** Herança, Interfaces e Exceções

**Descrição:**
Sistema completo envolvendo conceitos avançados de POO.

---

#### 🔸 Interfaces

* `Fretavel`

  * `alugarVeiculo(pesoCarga, dias)`
* `Tributavel`

  * `calcularIpva()`

---

#### 🔸 Classe Abstrata

`Veiculo` (abstract sealed)

**Atributos:**

* `placa`
* `marca`
* `valorLocacaoDiaria`
* `anoFabricacao`
* `precoFipe`

Implementa:

* `Fretavel`
* `Tributavel`

---

#### 🔸 Classes Filhas

* `Caminhao`

  * `capacidadeCargaToneladas`
* `CarroPasseio`

---

#### 🔸 Regras de Negócio

**📦 Locação:**

* Método `alugarVeiculo(pesoCarga, dias)`
* Se o peso da carga for maior que a capacidade do caminhão:

  * Aplicar **acréscimo de 10%** no valor total

---

**🏛️ IPVA:**

* Veículos com mais de **20 anos**:

  * Isentos (retornam `0.0`)
* Caso contrário:

  * 🚗 CarroPasseio → **4% do valor FIPE**
  * 🚚 Caminhão → **1.5% do valor FIPE**

---

**⚠️ Tratamento de Exceções:**

* Deve haver validação nos construtores
* Parâmetros inválidos devem lançar exceções
* Exceções devem ser tratadas no `main`

---

## 🚀 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)

---

## 🎯 Objetivo do Projeto

Consolidar o aprendizado em Java através de uma progressão prática:

* Lógica básica →
* Orientação a Objetos →
* Modelagem de sistemas →
* Herança, interfaces e exceções

---

## 📌 Observações

Projeto com fins educacionais, ideal para reforçar conceitos fundamentais e intermediários de desenvolvimento em Java.

---
