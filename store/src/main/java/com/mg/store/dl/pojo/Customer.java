package com.mg.store.dl.pojo;
import jakarta.persistence.*;
@Entity(name="customer")
public class Customer
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="code")
private Long code;
private String name;
@Column(name="email_id")
private String email;
private String password;
@Column(name="password_key")
private String passwordKey;
@Column(name="date_of_registration")
private java.sql.Date dateOfRegistration;
public Customer()
{}
public Customer(String name,String email,String password,String passwordKey,java.sql.Date dateOfRegistration)
{
this.name=name;
this.email=email;
this.password=password;
this.passwordKey=passwordKey;
this.dateOfRegistration=dateOfRegistration;
}
public void setCode(Long code)
{
this.code=code;
}
public Long getCode()
{
return this.code;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return this.name;
}
public void setEmail(String email)
{
this.email=email;
}
public String getEmail()
{
return this.email;
}
public void setPassword(String password)
{
this.password=password;
}
public String getPassword()
{
return this.password;
}
public void setPasswordKey(String passwordKey)
{
this.passwordKey=passwordKey;
}
public String getPasswordKey()
{
return this.passwordKey;
}
public void setDateOfRegistration(java.sql.Date dateOfRegistration)
{
this.dateOfRegistration=dateOfRegistration;
}
public java.sql.Date getDateOfRegistration()
{
return this.dateOfRegistration;
}
}