package main.controller;
// @author armando

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.RollbackException;
import jakarta.persistence.TypedQuery;
import main.Coordinador;
import main.Docente;
import main.Estudiante;
import main.HibernateUtil;
import main.SessionManager;
import main.Usuario;
import main.Usuario.TipoUsuario;
import main.ViewLogin;
import main.ViewTrabajos;

public class UsuarioController {

    private final EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction transaction = null;
    
    
    
    
    private ViewLogin viewLogin;
    public void setViewLogin(ViewLogin viewLogin) {
        this.viewLogin = viewLogin;
    }
    public Usuario iniciarSesion(String dni, String password) {
        TypedQuery<Usuario> query = entityManager.createQuery("SELECT u FROM Usuario u WHERE u.dni = :dni", Usuario.class);
        query.setParameter("dni", dni);
        Usuario usuario = null;
        try {
            usuario = query.getSingleResult();
            if (usuario != null && usuario.getPassword().equals(password)) {
                // Configurar el usuario actual en SessionManager
                SessionManager.getInstance().setIdUserActual(usuario.getId());
                ViewTrabajos v = new ViewTrabajos();
                v.setVisible(true);
                v.setLocationRelativeTo(viewLogin);
            } else {
                usuario = null; // Invalidar usuario si la contraseña no coincide
                System.out.println("Clave incorrecta");
            }
        } catch (NoResultException e) {
            System.out.println("usuario no encontrado");
        }
        return usuario;
    }

    public void crearUsuario(String nombre, String apellido, String dni, String email, String contraseña, String pertenece, TipoUsuario tipo) {
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            Usuario usuario = new Usuario();
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);
            usuario.setDni(dni);
            usuario.setEmail(email);
            usuario.setPassword(contraseña);

            switch (tipo) {
                case ESTUDIANTE -> {
                    usuario.setTipo(tipo);
                    Estudiante estudiante = new Estudiante();
                    estudiante.setCarrera(pertenece);
                }
                case DOCENTE -> {
                    usuario.setTipo(tipo);
                    Docente docente = new Docente();
                    docente.setFaculta(pertenece);
                }
                case COORDINADOR -> {
                    usuario.setTipo(tipo);
                    Coordinador coordinador = new Coordinador();
                    coordinador.setPrograma(pertenece);
                }
                default ->
                    throw new AssertionError();
            }

            entityManager.persist(usuario);
            transaction.commit();
        } catch (RollbackException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public void crearDocente(String nombre, String apellido, String dni, String email, String contraseña, String faculta) {
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            Docente docente = new Docente();
            docente.setNombre(nombre);
            docente.setApellido(apellido);
            docente.setDni(dni);
            docente.setEmail(email);
            docente.setPassword(contraseña);
            docente.setFaculta(faculta);

            entityManager.persist(docente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public void crearCoordinador(String nombre, String apellido, String dni, String email, String contraseña, String programa) {
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            Coordinador coordinador = new Coordinador();
            coordinador.setNombre(nombre);
            coordinador.setApellido(apellido);
            coordinador.setDni(dni);
            coordinador.setEmail(email);
            coordinador.setPassword(contraseña);
            coordinador.setPrograma(programa);

            entityManager.persist(coordinador);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

}
