# 01-java-rmi

# Ordem dos Comandos:

---

## Compilação:

```bash
javac servico/*.java
```

```bash
javac servidor/*.java
```

```bash
javac cliente/*.java
```

---

## No Servidor:

```bash
rmiregistry 1099 &
```

```bash
java servidor/Servidor &
```

---

## No Cliente:

```bash
java cliente/Cliente 
```

---
