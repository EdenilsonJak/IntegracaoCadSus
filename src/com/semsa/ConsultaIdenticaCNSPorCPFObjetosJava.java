package com.semsa;

import java.util.List;

import com.semsa.model.UsuarioSus;

import br.gov.saude.componente.cns.exception.WsCadSusCNSException;
import br.gov.saude.componente.cns.model.RespostaWsCadSus;

public class ConsultaIdenticaCNSPorCPFObjetosJava {

	public static void main(String[] args) throws WsCadSusCNSException {
		// TODO Auto-generated method stub

		
		//Classe Serviço para acesso ao Web Service do Ministerio da Saúde CadSus
		ServicoConsultaObjeto servicoConsultaObjeto = new ServicoConsultaObjeto();

		//Consulta ao servço do tipo identica passando paramentro cpf do usuario sus
		consultaPorCPFWsObjeto(servicoConsultaObjeto.identicaParametroCPFPaciente("66105234368"));
		
		
		
	}
	
	
	private static void consultaPorCPFWsObjeto(List<RespostaWsCadSus> lista){
		
		for(RespostaWsCadSus respostaWs : lista){
			//Instancia do model usuario Sus
			UsuarioSus usuarioSus = new UsuarioSus();
			
			usuarioSus.setNome(respostaWs.getNomeCompleto());
			usuarioSus.setCns(respostaWs.getNumeroCNS());
			usuarioSus.setNomeMae(respostaWs.getNomeMae());
			usuarioSus.setDataNascimento(respostaWs.getDataNascimento());
			System.out.println(usuarioSus);
			/*
			 * na Classe Controller salvaria no banco de dados utilizando algum framework 
			 * de persistencia de dados
			 */
			
		}
		
		
	}
	
}
