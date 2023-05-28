package dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import static utils.HibernateUtils.*;

import pojos.Course;
import pojos.Student;

public class StudentImpl implements IStudentDao {
	//studentRegistration
	public String studentRegistration(Student s) throws RuntimeException {

		String msg = "Enter Valid data.......!";

		Student s1 = null;

		// create session from sessionFactory
		Session session = getFactory().getCurrentSession();

		// create transaction from session
		org.hibernate.Transaction tx = session.beginTransaction();

		try {

			Serializable id = session.save(s);
			System.out.println(id);

			msg = "successfully added" + id;

			tx.commit();

		} catch (RuntimeException e) {

			tx.rollback();
			throw e;
		}
		return msg;

	}

	@Override
	public Student loginStudent(String email, String password) {

		Student s2 = null;

		// create session from sessionFactory
		Session session = getFactory().getCurrentSession();

		String jpql = "select s from Student s where s.email=:em and s.password=:pass";
		// create transaction from session
		org.hibernate.Transaction tx = session.beginTransaction();

		try {
			s2 = session.createQuery(jpql, Student.class).setParameter("em", email).setParameter("pass", password)
					.getSingleResult();

			tx.commit();
		} catch (RuntimeException e) {
			tx.rollback();

			throw e;

		}

		return s2;
	}
   
	@Override
	public List<Student> getStudentFromCourse(Course course1) throws RuntimeException {

		
		List<Student> listStd=null;
		String jpql="select s from Student s where s.choosenCourse=:c";
		
		// create session from sessionFactory
		Session session = getFactory().getCurrentSession();

		// create transaction from session
		org.hibernate.Transaction tx = session.beginTransaction();

		try {
			
			listStd=session.createQuery(jpql,Student.class).setParameter("c", course1).getResultList();
		
			tx.commit();
		}catch(RuntimeException e) {
		
		tx.rollback();
		
		throw e;
		}
		return listStd;
	}

	@Override
	public String giveScholerShip(int id) throws RuntimeException {
		String msg="Enter valid id";
		Student s=null;
		// create session from sessionFactory
		Session session = getFactory().getCurrentSession();

		String jpql = "select s from Student s where s.email=:em and s.password=:pass";
		// create transaction from session
		org.hibernate.Transaction tx = session.beginTransaction();

		
		try {
			s=session.get(Student.class, id);
			
			if(s!=null) {
				
				s.setFees(s.getFees()-10000);
				
				msg="Susseccfully given scholership";
						
						tx.commit();
				
			}
		}catch(RuntimeException e) {
			tx.rollback();
			
			throw e;
		}
		
		
		return msg;
	}
}
