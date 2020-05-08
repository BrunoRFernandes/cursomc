package br.com.brunofernandes.cursomc.domain.enums;

public enum EstadoDoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private Integer cod;
	private String descricao;
	
	private EstadoDoPagamento(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public Integer getCod() {
		return cod;
	}
	
	public String descricao() {
		return descricao;
	}
	
	public static EstadoDoPagamento tipoEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (EstadoDoPagamento x : EstadoDoPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Valor inválido" + cod);
	}
}
