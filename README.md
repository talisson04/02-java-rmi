# 01-java-rmi

# Ordem dos Comandos:

---

## Compilação:

```bash
javac Hello.java
```

```bash
javac Server.java
```

```bash
javac Client.java
```

---

## No Servidor:

**OBS**: O `start` coloca os processos em *background*. 1099 é o número da porta (porta padrão em Java RMI).

```bash
rmiregistry 1099 &
start /min rmiregistry 1099 
```

```bash
java Server &
start java Server
```

---

## No Cliente:

```bash
start java Client
```

---
