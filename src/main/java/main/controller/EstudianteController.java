package main.controller;
// @author armando

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import main.HibernateUtil;
import main.Usuario;

public class EstudianteController {

    private final EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction transaction = null;

    public void updateEstudiante(int id, String pass) {
        transaction = entityManager.getTransaction();
        transaction.begin();

        Usuario usuario = entityManager.find(Usuario.class, id);
        if (usuario != null) {

            usuario.setPassword(pass);
            entityManager.merge(usuario);
            transaction.commit();
        }

    }
}
