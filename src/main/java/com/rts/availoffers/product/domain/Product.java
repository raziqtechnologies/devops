package com.rts.availoffers.product.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Min(value = 11)
    @Column(name = "id_product", nullable = false, unique = true)
    private Integer idProduct;

    @Column(name = "thirdpartyid")
    private String thirdpartyid;

    @Column(name = "universalcode")
    private String universalcode;

    @Column(name = "price")
    private Double price;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "noofstock")
    private Integer noofstock;

    @Column(name = "dimensions")
    private String dimensions;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Product id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdProduct() {
        return this.idProduct;
    }

    public Product idProduct(Integer idProduct) {
        this.setIdProduct(idProduct);
        return this;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getThirdpartyid() {
        return this.thirdpartyid;
    }

    public Product thirdpartyid(String thirdpartyid) {
        this.setThirdpartyid(thirdpartyid);
        return this;
    }

    public void setThirdpartyid(String thirdpartyid) {
        this.thirdpartyid = thirdpartyid;
    }

    public String getUniversalcode() {
        return this.universalcode;
    }

    public Product universalcode(String universalcode) {
        this.setUniversalcode(universalcode);
        return this;
    }

    public void setUniversalcode(String universalcode) {
        this.universalcode = universalcode;
    }

    public Double getPrice() {
        return this.price;
    }

    public Product price(Double price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return this.weight;
    }

    public Product weight(Double weight) {
        this.setWeight(weight);
        return this;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getNoofstock() {
        return this.noofstock;
    }

    public Product noofstock(Integer noofstock) {
        this.setNoofstock(noofstock);
        return this;
    }

    public void setNoofstock(Integer noofstock) {
        this.noofstock = noofstock;
    }

    public String getDimensions() {
        return this.dimensions;
    }

    public Product dimensions(String dimensions) {
        this.setDimensions(dimensions);
        return this;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        return id != null && id.equals(((Product) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", idProduct=" + getIdProduct() +
            ", thirdpartyid='" + getThirdpartyid() + "'" +
            ", universalcode='" + getUniversalcode() + "'" +
            ", price=" + getPrice() +
            ", weight=" + getWeight() +
            ", noofstock=" + getNoofstock() +
            ", dimensions='" + getDimensions() + "'" +
            "}";
    }
}
