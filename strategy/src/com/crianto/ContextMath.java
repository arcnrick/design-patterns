package com.crianto;

import com.crianto.strategy.StrategyMath;

public class ContextMath {

    private StrategyMath strategy;

    public ContextMath(StrategyMath strategyMath) {
        this.strategy = strategyMath;
    }

    public int calcular(int numero1, int numero2) {

        return strategy.operacao(numero1, numero2);
    }
}
