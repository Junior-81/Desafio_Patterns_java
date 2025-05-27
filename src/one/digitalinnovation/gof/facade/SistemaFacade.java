package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.singleton.ConfigSingleton;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;

public class SistemaFacade {
    public void executar() {
        // Singleton
        ConfigSingleton.getInstancia().exibirMensagem();

        // Strategy
        Robo robo = new Robo();
        robo.setComportamento(new ComportamentoNormal());
        robo.mover();
        robo.setComportamento(new ComportamentoAgressivo());
        robo.mover();
        robo.setComportamento(new ComportamentoDefensivo());
        robo.mover();
    }
}
