package ui_javastore.model.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SingularAttribute<Users, Date> lastLogin;
	public static volatile SingularAttribute<Users, String> password;
	public static volatile SingularAttribute<Users, Integer> id;
	public static volatile SingularAttribute<Users, String> username;

}

