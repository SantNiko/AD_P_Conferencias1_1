package hmapasinversa;
// Generated 01-mar-2017 18:25:25 by Hibernate Tools 4.3.1



/**
 * ParticipantesConferenciasId generated by hbm2java
 */
public class ParticipantesConferenciasId  implements java.io.Serializable {


     private int conferencia;
     private String participante;

    public ParticipantesConferenciasId() {
    }

    public ParticipantesConferenciasId(int conferencia, String participante) {
       this.conferencia = conferencia;
       this.participante = participante;
    }
   
    public int getConferencia() {
        return this.conferencia;
    }
    
    public void setConferencia(int conferencia) {
        this.conferencia = conferencia;
    }
    public String getParticipante() {
        return this.participante;
    }
    
    public void setParticipante(String participante) {
        this.participante = participante;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ParticipantesConferenciasId) ) return false;
		 ParticipantesConferenciasId castOther = ( ParticipantesConferenciasId ) other; 
         
		 return (this.getConferencia()==castOther.getConferencia())
 && ( (this.getParticipante()==castOther.getParticipante()) || ( this.getParticipante()!=null && castOther.getParticipante()!=null && this.getParticipante().equals(castOther.getParticipante()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getConferencia();
         result = 37 * result + ( getParticipante() == null ? 0 : this.getParticipante().hashCode() );
         return result;
   }   


}


