package com.ilegra.jovenstalentos.coreengineering.a14;

public abstract class BebidaQuente {

     abstract void aquecerAgua();

     abstract void executarInfusão();

     public void prepararBebida() {
         aquecerAgua();
         executarInfusão();
     }
 }
