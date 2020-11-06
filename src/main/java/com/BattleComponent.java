package com;

import dagger.Component;

@Component
interface BattleComponent {
    War getWar();
}