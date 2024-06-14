package main;
// @author armando

public class SessionManager {
   
    private static SessionManager instancia;
    private Long idUserActual;

    private SessionManager() {}

    public static synchronized SessionManager getInstance() {
        if (instancia == null) {
            instancia = new SessionManager();
        }
        return instancia;
    }

    public Long getCurrentUserId() {
        return idUserActual;
    }

    public void setIdUserActual(Long currentUserId) {
        this.idUserActual = currentUserId;
    }
}
