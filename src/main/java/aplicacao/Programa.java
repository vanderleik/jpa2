package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {
        //Dados persistidos no banco de dados
//        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@dasilva.com.br");
//        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@torres.com.br");
//        Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@maria.com.br");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();

        //Recuperando dados no banco de dados
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);

        //Removendo a pessoa com id == 2 do banco de dados
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
