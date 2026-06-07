# 📋 Listas Java

Exercicios de fixacao sobre ArrayList e List em Java.
Parte da trilha de estudos de **POO com Java**.

---

## 🧠 O que estou praticando

```
ArrayList / List
├── Declaracao e instanciacao
├── add, remove, get, size
├── for-each em listas
├── stream + filter + findFirst
├── removeIf com lambda
└── Encapsulamento em entidades com List
```

---

## 📋 Exercicios

| # | Problema | Conceito principal | Status |
|---|---|---|---|
| 01 | trabalhadores | stream, filter, findFirst, aumentarSalario | ✅ |

---

## 🗂️ Estrutura

```
Listas/
├── Exercicio_List_empregados/
│    └── src/
│         ├── Main.java
│         └── entidades/
│              └── Trabalhador.java
└── README.md
```

---

## 💡 Conceitos chave

**Declaracao**
```java
List<Trabalhador> lista = new ArrayList<>();
```

**Adicionar objetos**
```java
lista.add(new Trabalhador(id, nome, salario));
```

**Buscar por atributo**
```java
Trabalhador t = lista.stream()
    .filter(x -> x.getId().equals(idAlvo))
    .findFirst()
    .orElse(null);
```

**Verificar se encontrou**
```java
if (t != null) {
    t.aumentarSalario(percentual);
} else {
    System.out.println("Id nao encontrado!");
}
```

**Exibir todos**
```java
for (Trabalhador trab : lista) {
    System.out.println(trab);
}
```

**Metodos principais**
```
size()          → tamanho da lista
get(i)          → busca por posicao
add(obj)        → adiciona no final
add(i, obj)     → adiciona na posicao
remove(obj)     → remove por valor
remove(int)     → remove por indice
removeIf()      → remove por condicao
indexOf(obj)    → posicao do elemento
```

---

## 👨‍💻 Autor

Feito por **Joneidson Victor** como parte da trilha de estudos Java — Listas e ArrayList.
