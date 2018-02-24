package com.semsa.estrutura;

import java.util.Date;
import java.util.List;

import br.gov.saude.componente.cns.exception.WsCadSusCNSException;
import br.gov.saude.componente.cns.model.RespostaWsCadSus;

public interface ConsultaIdenticaObjeto {

	public List<RespostaWsCadSus> identicaParametroNomeMaeCpfPaciente(String nomeMae, String cpf) throws WsCadSusCNSException;
	
	public List<RespostaWsCadSus> identicaParametroCPFPaciente(String cpf) throws WsCadSusCNSException;
	
	public List<RespostaWsCadSus> aproximada(String nomeMae, String cpf, Date dataNascimento) throws WsCadSusCNSException;
	
	public List<RespostaWsCadSus> fonetica(String nomeCompleto) throws WsCadSusCNSException;
	
}
