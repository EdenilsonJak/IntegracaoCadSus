package com.semsa;

import java.util.Date;
import java.util.List;

import com.semsa.estrutura.ConsultaIdenticaObjeto;

import br.gov.saude.componente.cns.enuns.TipoConsultaEnum;
import br.gov.saude.componente.cns.exception.WsCadSusCNSException;
import br.gov.saude.componente.cns.model.RespostaWsCadSus;
import br.gov.saude.componente.cns.servicos.WsClientCadSus;

public class ServicoConsultaObjeto implements ConsultaIdenticaObjeto{

	WsClientCadSus Ws = WsClientCadSus.iniciarConsulta();

	@Override
	public List<RespostaWsCadSus> identicaParametroNomeMaeCpfPaciente(String nomeMae, String cpf)
			throws WsCadSusCNSException {
		// TODO Auto-generated method stub
		List<RespostaWsCadSus> lista = Ws
				.ambienteHomologacao()
				.setUsuarioAutenticacao("CADSUS.CNS.PDQ.PUBLICO")
				.setSenhaAutenticacao("kUXNmiiii#RDdlOELdoe00966")
				.setNumeroCNES("6963447")
				.setUsuarioCNES("LEONARDO")
				.escolherTipoConsulta(TipoConsultaEnum.IDENTICA)
				.setCpf(cpf)
				.setNomeMae(nomeMae)
				.executarConsultaRetornandoVO();
		
		return lista;
	}


	@Override
	public List<RespostaWsCadSus> identicaParametroCPFPaciente(String cpf) throws WsCadSusCNSException {
		// TODO Auto-generated method stub
		
		List<RespostaWsCadSus> lista = Ws
				.ambienteHomologacao()
				.setUsuarioAutenticacao("CADSUS.CNS.PDQ.PUBLICO")
				.setSenhaAutenticacao("kUXNmiiii#RDdlOELdoe00966")
				.setNumeroCNES("6963447")
				.setUsuarioCNES("LEONARDO")
				.escolherTipoConsulta(TipoConsultaEnum.IDENTICA)
				.setCpf(cpf)
				.executarConsultaRetornandoVO();
		return lista;
	}


	@Override
	public List<RespostaWsCadSus> aproximada(String nomeMae, String cpf, Date dataNascimento)
			throws WsCadSusCNSException {
		// TODO Auto-generated method stub
		
		List<RespostaWsCadSus> lista = Ws
				.ambienteHomologacao()
				.setUsuarioAutenticacao("CADSUS.CNS.PDQ.PUBLICO")
				.setSenhaAutenticacao("kUXNmiiii#RDdlOELdoe00966")
				.setNumeroCNES("6963447")
				.setUsuarioCNES("LEONARDO")
				.escolherTipoConsulta(TipoConsultaEnum.APROXIMADA)
				.setNomeMae(nomeMae)
				.setCpf(cpf)
				.setDataNascimento(dataNascimento)
				.executarConsultaRetornandoVO();
		return lista;
	}


	@Override
	public List<RespostaWsCadSus> fonetica(String nomeCompleto) throws WsCadSusCNSException {
		// TODO Auto-generated method stub
		
		List<RespostaWsCadSus> lista = Ws
				.ambienteHomologacao()
				.setUsuarioAutenticacao("CADSUS.CNS.PDQ.PUBLICO")
				.setSenhaAutenticacao("kUXNmiiii#RDdlOELdoe00966")
				.setNumeroCNES("6963447")
				.setUsuarioCNES("LEONARDO")
				.escolherTipoConsulta(TipoConsultaEnum.FONETICA)
				.setNomeCompleto(nomeCompleto)
				.executarConsultaRetornandoVO();
		return lista;
		
	}

	

}
