package livroteca.models.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livro")
public class Livro {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String titulo;
	private String autor;
	private String genero;
	@Column(name="anoDePublicacao", nullable = false)
	private Integer anoDeLancamento;
	
	public Livro() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public void setAnoDeLancamento(Integer anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	
	
}
