package com.ilegra.jovenstalentos.coreengineering.a16;

import java.math.BigDecimal;

public interface Transacao {

    void execute();

    BigDecimal getValor();

    String getIdConta();

    TipoTransacao getTipoTransacao();
}
