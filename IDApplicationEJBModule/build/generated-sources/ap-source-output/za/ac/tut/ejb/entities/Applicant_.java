package za.ac.tut.ejb.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.ejb.entities.Address;
import za.ac.tut.ejb.entities.Guardian;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2025-05-12T16:17:07")
@StaticMetamodel(Applicant.class)
public class Applicant_ { 

    public static volatile SingularAttribute<Applicant, Address> address;
    public static volatile SingularAttribute<Applicant, Character> gender;
    public static volatile SingularAttribute<Applicant, String> surname;
    public static volatile SingularAttribute<Applicant, Date> dob;
    public static volatile SingularAttribute<Applicant, String> name;
    public static volatile SingularAttribute<Applicant, Long> id;
    public static volatile ListAttribute<Applicant, Guardian> guardian;
    public static volatile SingularAttribute<Applicant, Date> applicationDate;

}