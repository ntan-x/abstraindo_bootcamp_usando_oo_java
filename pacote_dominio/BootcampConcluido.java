package pacote_dominio;




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
	                ", Data de inicio=" + getDataInicial() + '\'' +
	                ", Data de t�rmino=" + getDataFinal() + '\'' +
	                ", Dev inscrito=" + getNomeDev() + '\'' +
	               // ", cargaHoraria=" + cargaHoraria +
	                '}';
	    }
	}


