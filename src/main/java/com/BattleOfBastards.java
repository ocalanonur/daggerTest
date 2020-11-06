package com;

public class BattleOfBastards {
    public static void main(String[] args) {
        BattleComponent battleComponent = DaggerBattleComponent.builder().build();
        War war = battleComponent.getWar();

        war.prepare();
        war.report();
    }
}
