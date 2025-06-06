# Desafio_Patterns_java

## 📋 Descrição do Projeto

Este projeto demonstra a implementação prática de **Padrões de Projeto (Design Patterns)** em Java, desenvolvido como parte do desafio da Digital Innovation One (DIO).

## 🎯 Objetivo

Explorar e implementar conceitos fundamentais de Padrões de Projeto, demonstrando como eles podem ser aplicados para resolver problemas comuns no desenvolvimento de software.

## 🔧 Padrões Implementados

### 1. **Singleton**
- **Localização:** `src/one/digitalinnovation/gof/singleton/ConfigSingleton.java`
- **Descrição:** Garante que apenas uma única instância da classe seja criada durante toda a execução do programa
- **Uso:** Ideal para configurações globais, conexões com banco de dados, logs, etc.

**Características:**
- Construtor privado
- Instância estática única
- Método de acesso global (`getInstancia()`)
- Controle de criação de objetos

## 💡 Exemplo de Uso

```java
// Obtendo a instância única do Singleton
ConfigSingleton config = ConfigSingleton.getInstancia();
config.exibirMensagem();

// Mesmo obtendo novamente, será a mesma instância
ConfigSingleton config2 = ConfigSingleton.getInstancia();
// config == config2 (true)
```

## 🔗 Recursos Úteis

- [Design Patterns - Gang of Four](https://refactoring.guru/design-patterns)
- [Java Design Patterns Examples](https://github.com/iluwatar/java-design-patterns)
- [Padrões de Projeto em Java](https://www.devmedia.com.br/design-patterns-padroes-gof/16781)

## 👨‍💻 Desenvolvedor

Desenvolvido como parte do desafio de Padrões de Projeto da DIO.

## 📝 Licença

Este projeto é desenvolvido para fins educacionais.