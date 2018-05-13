package xyz.quinntian.ssh.repository;

import org.omg.CORBA.DomainManager;

import xyz.quinntian.ssh.entity.Person;


public interface PersonRepository extends DomainRepository<Person,Long> {

}
