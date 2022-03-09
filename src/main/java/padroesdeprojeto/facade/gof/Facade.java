package padroesdeprojeto.facade.gof;

import padroesdeprojeto.subsistema1crm.CrmService;
import padroesdeprojeto.subsistema2cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String uf = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, uf);

    }
}
