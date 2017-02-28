package hmapasinversa;
// Generated 28-feb-2017 16:09:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Participantes generated by hbm2java
 */
public class Participantes  implements java.io.Serializable {


     private String dni;
     private Personas personas;
     private String email;
     private Set participantesConferenciases = new HashSet(0);
     private Set sesioneses = new HashSet(0);

    public Participantes() {
    }

	
    public Participantes(Personas personas, String email) {
        this.personas = personas;
        this.email = email;
    }
    public Participantes(Personas personas, String email, Set participantesConferenciases, Set sesioneses) {
       this.personas = personas;
       this.email = email;
       this.participantesConferenciases = participantesConferenciases;
       this.sesioneses = sesioneses;
    }
   
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Personas getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getParticipantesConferenciases() {
        return this.participantesConferenciases;
    }
    
    public void setParticipantesConferenciases(Set participantesConferenciases) {
        this.participantesConferenciases = participantesConferenciases;
    }
    public Set getSesioneses() {
        return this.sesioneses;
    }
    
    public void setSesioneses(Set sesioneses) {
        this.sesioneses = sesioneses;
    }




}


