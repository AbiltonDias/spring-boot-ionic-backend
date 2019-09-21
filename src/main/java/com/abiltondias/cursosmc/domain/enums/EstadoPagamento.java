package com.abiltondias.cursosmc.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1,"Pagamentos Pendentes"),
	QUITADO(2,"Pagamento Quitado"),
	CANCELADO(3,"Cancelado");
	
	private Integer cod;
	private String descricao;
	
	private EstadoPagamento(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public Integer getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento onEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.getCod()))
				return x;
		}
		throw new IllegalArgumentException("Esse id está incorreto"+ cod +", verifique outro codigo");
	}

	
	
	
	


	
	
	
	
	

}
