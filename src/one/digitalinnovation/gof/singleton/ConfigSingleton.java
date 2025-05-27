package one.digitalinnovation.gof.singleton;

public class ConfigSingleton {
    private static ConfigSingleton instancia;

    private ConfigSingleton() {
        // Construtor privado
    }

    public static ConfigSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConfigSingleton();
        }
        return instancia;
    }

    public void exibirMensagem() {
        System.out.println("Singleton funcionando!");
    }
}
