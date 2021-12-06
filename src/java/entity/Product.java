package entity;
// Generated Nov 25, 2021 9:46:25 PM by Hibernate Tools 4.3.1




/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {
  

     private Integer id;
     private String name;
     private String image;
     private double price;
     private String description;
     private Integer cateId;
     private String cateDetailName;
     private Integer cateDetailId;
     private Integer sellId;

    public Product() {
    }

    public Product(String name, String image, double price, String description, Integer cateId, String cateDetailName, Integer cateDetailId, Integer sellId) {
       this.name = name;
       this.image = image;
       this.price = price;
       this.description = description;
       this.cateId = cateId;
       this.cateDetailName = cateDetailName;
       this.cateDetailId = cateDetailId;
       this.sellId = sellId;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getCateId() {
        return this.cateId;
    }
    
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }
    public String getCateDetailName() {
        return this.cateDetailName;
    }
    
    public void setCateDetailName(String cateDetailName) {
        this.cateDetailName = cateDetailName;
    }
    public Integer getCateDetailId() {
        return this.cateDetailId;
    }
    
    public void setCateDetailId(Integer cateDetailId) {
        this.cateDetailId = cateDetailId;
    }
    public Integer getSellId() {
        return this.sellId;
    }
    
    public void setSellId(Integer sellId) {
        this.sellId = sellId;
    }




}


