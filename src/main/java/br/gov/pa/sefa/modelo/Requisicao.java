package br.gov.pa.sefa.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TAB_REQUISICAO", schema="MONITORAMENTO_SERVICE")
@SequenceGenerator(name="REQUISICAO_SEQUENCE_GENERATOR", sequenceName="SEQ_TAB_REQUISICAO", allocationSize=1)
public class Requisicao implements Serializable{

	private static final long serialVersionUID = -7700060984818848442L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="REQUISICAO_SEQUENCE_GENERATOR")
	@Column(name="tar_id")
	private Long id;
	
	@Column(name="tar_data", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	@Column(name="tar_tempo_execucao", nullable=false)
	private long tempoExecucao;
	
	@Column(name="tar_ip_origem", nullable=false, length = 15)
	private String ipOrigem;
	
	@Column(name="tar_tipo", nullable=false, length = 6)
	private String tipo;
	
	@OneToOne(mappedBy="requisicao", cascade = CascadeType.PERSIST)
	private Parametro parametro;
	
	public Requisicao(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data){
		this.data = data;
	}

	public long getTempoExecucao() {
		return tempoExecucao;
	}

	public void setTempoExecucao(long tempoExecucao) {
		this.tempoExecucao = tempoExecucao;
	}

	public String getIpOrigem() {
		return ipOrigem;
	}

	public void setIpOrigem(String ipOrigem) {
		this.ipOrigem = ipOrigem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}
}

	/*public Erro getException() {
		return exception;
	}
	public void setException(Erro exception) {
		this.exception = exception;
	}*/
	