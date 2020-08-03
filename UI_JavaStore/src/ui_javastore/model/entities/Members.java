package ui_javastore.model.entities;
// Generated 23-abr-2020 12:38:40 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;

/**
 * Members generated by hbm2java
 */
public class Members  implements java.io.Serializable {


     private int id;
     private Sexs sexs;
     private Users usersByModifiedBy;
     private Users usersByCreatedBy;
     private Users usersByUserId;
     private Serializable firtName;
     private Serializable moddleName;
     private Serializable lastName;
     private Date birthcode;
     private Serializable ced;
     private Date createdDate;
     private Date modifiedDate;

    public Members() {
    }

	
    public Members(int id, Sexs sexs, Users usersByModifiedBy, Users usersByCreatedBy, Users usersByUserId, Serializable firtName, Serializable moddleName, Serializable lastName, Date birthcode, Serializable ced, Date modifiedDate) {
        this.id = id;
        this.sexs = sexs;
        this.usersByModifiedBy = usersByModifiedBy;
        this.usersByCreatedBy = usersByCreatedBy;
        this.usersByUserId = usersByUserId;
        this.firtName = firtName;
        this.moddleName = moddleName;
        this.lastName = lastName;
        this.birthcode = birthcode;
        this.ced = ced;
        this.modifiedDate = modifiedDate;
    }
    public Members(int id, Sexs sexs, Users usersByModifiedBy, Users usersByCreatedBy, Users usersByUserId, Serializable firtName, Serializable moddleName, Serializable lastName, Date birthcode, Serializable ced, Date createdDate, Date modifiedDate) {
       this.id = id;
       this.sexs = sexs;
       this.usersByModifiedBy = usersByModifiedBy;
       this.usersByCreatedBy = usersByCreatedBy;
       this.usersByUserId = usersByUserId;
       this.firtName = firtName;
       this.moddleName = moddleName;
       this.lastName = lastName;
       this.birthcode = birthcode;
       this.ced = ced;
       this.createdDate = createdDate;
       this.modifiedDate = modifiedDate;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Sexs getSexs() {
        return this.sexs;
    }
    
    public void setSexs(Sexs sexs) {
        this.sexs = sexs;
    }
    public Users getUsersByModifiedBy() {
        return this.usersByModifiedBy;
    }
    
    public void setUsersByModifiedBy(Users usersByModifiedBy) {
        this.usersByModifiedBy = usersByModifiedBy;
    }
    public Users getUsersByCreatedBy() {
        return this.usersByCreatedBy;
    }
    
    public void setUsersByCreatedBy(Users usersByCreatedBy) {
        this.usersByCreatedBy = usersByCreatedBy;
    }
    public Users getUsersByUserId() {
        return this.usersByUserId;
    }
    
    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }
    public Serializable getFirtName() {
        return this.firtName;
    }
    
    public void setFirtName(Serializable firtName) {
        this.firtName = firtName;
    }
    public Serializable getModdleName() {
        return this.moddleName;
    }
    
    public void setModdleName(Serializable moddleName) {
        this.moddleName = moddleName;
    }
    public Serializable getLastName() {
        return this.lastName;
    }
    
    public void setLastName(Serializable lastName) {
        this.lastName = lastName;
    }
    public Date getBirthcode() {
        return this.birthcode;
    }
    
    public void setBirthcode(Date birthcode) {
        this.birthcode = birthcode;
    }
    public Serializable getCed() {
        return this.ced;
    }
    
    public void setCed(Serializable ced) {
        this.ced = ced;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }




}


