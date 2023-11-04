package ifrn.pi.bibli.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeLiv;
	private String nomeAlu;
	private String datIni;
	private String dataDev;
	private String matricula;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeLiv() {
		return nomeLiv;
	}

	public void setNomeLiv(String nomeLiv) {
		this.nomeLiv = nomeLiv;
	}

	public String getNomeAlu() {
		return nomeAlu;
	}

	public void setNomeAlu(String nomeAlu) {
		this.nomeAlu = nomeAlu;
	}

	public String getDatIni() {
		return datIni;
	}

	public void setDatIni(String datIni) {
		this.datIni = datIni;
	}

	public String getDataDev() {
		return dataDev;
	}

	public void setDataDev(String dataDev) {
		this.dataDev = dataDev;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Emprestimo [id=" + id + ", nomeLiv=" + nomeLiv + ", nomeAlu=" + nomeAlu + ", datIni=" + datIni
				+ ", dataDev=" + dataDev + ", matricula=" + matricula + "]";
	}
	
	
}
