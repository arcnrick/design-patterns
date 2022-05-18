package com.crianto;

import com.crianto.ContextMath;
import com.crianto.strategy.Somar;
import com.crianto.strategy.Subtrair;

public class MainStrategy {

    public static void main(String[] args) {

        ContextMath math = new ContextMath(new Somar());
        System.out.println(math.calcular(12, 8));

        math = new ContextMath(new Subtrair());
        System.out.println(math.calcular(12, 8));

        /*
         * No exemplo passado acima, ambas as classes Somar e Subtrair, implementam a StrategyMath, porém cada uma delas
         * faz o cálculo a sua maneira, sem que uma saiba do cálculo que é feito na outra, tampouco a interface que as
         * implementa, sabe do cálculo... daí utilizamos a Context simplesmente para preparar as variáveis / valores que
         * seriam passados para um possível cálculo... quanto a qual delas chamar, vai da necessidade do programa.
         */
    }
}