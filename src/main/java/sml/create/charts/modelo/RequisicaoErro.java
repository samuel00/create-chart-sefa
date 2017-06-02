package sml.create.charts.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TAB_REQUISICAO_ERRO", schema="MONITORAMENTO_SERVICE")
@SequenceGenerator(name="ERRO_SEQUENCE_GENERATOR", sequenceName="SEQ_TAB_REQUISICAO_ERRO", allocationSize=1)
public class RequisicaoErro implements Serializable{
	
	private static final long serialVersionUID = -4609689208810205727L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ERRO_SEQUENCE_GENERATOR")
	@Column(name="tae_id")
	private long id;
	
	@OneToOne
	@JoinColumn(name="tae_requisicao_id", unique=true, nullable=false, updatable=false)
	private Requisicao requisicao;
	
	@Column(name= "tae_motivo_ocorrencia", nullable=true, updatable = false)
	private String motivo;
	
	@Column(name= "tae_classe_ocorrencia", nullable=true, updatable = false)
	private String classe;
	
	@Column(name= "tae_metodo_ocorrencia", nullable=true, updatable = false)
	private String metodo;

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

}
