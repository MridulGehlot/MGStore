package com.mg.store.dl.pojo;
import java.math.*;
import jakarta.persistence.*;
@Entity(name="product")
public class Product
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="code")
private Long code;
private String name;
private BigDecimal price;
@Column(name="is_available")
private Boolean isAvailable;
public Product()
{}
public Product(String name,BigDecimal price,Boolean isAvailable)
{
this.name=name;
this.price=price;
this.isAvailable=isAvailable;
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
public void setPrice(BigDecimal price)
{
this.price=price;
}
public BigDecimal getPrice()
{
return this.price;
}
public void setIsAvailable(Boolean isAvailable)
{
this.isAvailable=isAvailable;
}
public Boolean getIsAvailable()
{
return this.isAvailable;
}
}