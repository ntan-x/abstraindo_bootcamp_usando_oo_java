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
	                ", Data de t�rmino=" + getDataFinal() + '\'' +
	                ", Data de t�rmino=" + getDataFinal() + '\'' +
	                ", Dev inscrito=" + getNomeDev() + '\'' +
	               // ", cargaHoraria=" + cargaHoraria +
	                '}';
	    }
	}


