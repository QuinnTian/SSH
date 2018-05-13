package xyz.quinntian.ssh.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import xyz.quinntian.ssh.entity.Person;
import xyz.quinntian.ssh.repository.PersonRepository;

import java.util.List;

/**
 * Created by XRog
 * On 2/2/2017.2:30 PM
 */
@Repository
public  class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public Person load(Long id) {
        return (Person)getCurrentSession().load(Person.class,id);
    }

    public Person get(Long id) {
        return (Person)getCurrentSession().get(Person.class,id);
    }

    public List<Person> findAll() {
        return null;
    }

    public void persist(Person entity) {
        getCurrentSession().persist(entity);
    }

    public Long save(Person entity) {
        return (Long)getCurrentSession().save(entity);
    }

    public void saveOrUpdate(Person entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {
        Person person = load(id);
        getCurrentSession().delete(person);
    }

    public void flush() {
        getCurrentSession().flush();
    }
    }