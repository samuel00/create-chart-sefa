package sml.create.charts.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="Parametro")
@Table(name="TAB_REQUISICAO_PARAMETRO", schema="MONITORAMENTO_SERVICE")
@SequenceGenerator(name="PARAMETRO_SEQUENCE_GENERATOR", sequenceName="SEQ_TAB_REQUISICAO_PARAMETRO", allocationSize=1)
public class Parametro implements Serializable{
	
	private static final long serialVersionUID = -221708863259338535L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARAMETRO_SEQUENCE_GENERATOR")
	@Column(name="tap_id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="tap_requisicao_id")
	private Requisicao requisicao;
	
	@Column(name= "tap_header", nullable=false, updatable = false)
	@Lob
	private String header;
	
	@Column(name= "tap_entrada", nullable=false, updatable = false)
	@Lob
	private String entrada;
	
	@Column(name= "tap_saida", nullable=true, updatable = false)
	@Lob
	private String saida;
	
	@Column(name= "tap_metodo_invocado", nullable=false, updatable = false)
	private String metodoInvocado;
	
	@Column(name= "tap_classe_invocada", nullable=false, updatable = false)
	private String classeInvocada;
	
	public Parametro(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada){
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public String getMetodoInvocado() {
		return metodoInvocado;
	}

	public void setMetodoInvocado(String metodoInvocado) {
		this.metodoInvocado = metodoInvocado;
	}

	public String getClasseInvocada() {
		return classeInvocada;
	}

	public void setClasseInvocada(String classeInvocada) {
		this.classeInvocada = classeInvocada;
	}

	
	

}