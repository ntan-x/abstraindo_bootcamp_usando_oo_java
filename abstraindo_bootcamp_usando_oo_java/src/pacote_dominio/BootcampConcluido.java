package pacote_dominio;
//IMCOMPLETO
public class BootcampConcluido extends Bootcamp{
	
	private String nomeDev;
	 
	public String getNomeDev() {
	        return nomeDev;
	    }

	    public void setNomeDev(String nomeDev) {
	        this.nomeDev = nomeDev;
	    }
	
	  @Override
	    public String toString() {
	        return "{" +
	                "nome='" + getNome() + '\'' +
	                ", descricao='" + getDescricao() + '\'' +
	                ", Data de término=" + getDataFinal() + '\'' +
	                ", Data de término=" + getDataFinal() + '\'' +
	                ", Dev inscrito=" + getNomeDev() + '\'' +
	               // ", cargaHoraria=" + cargaHoraria +
	                '}';
	    }
	}


