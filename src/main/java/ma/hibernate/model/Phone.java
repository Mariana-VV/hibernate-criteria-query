package ma.hibernate.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phones")
public class Phone implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String maker;
    private String color;
    private String os;
    private String countryManufactured;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCountryManufactured() {
        return countryManufactured;
    }

    public void setCountryManufactured(String countryManufactured) {
        this.countryManufactured = countryManufactured;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't make clone of " + this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return Objects.equals(id, phone.id)
                && Objects.equals(model, phone.model)
                && Objects.equals(maker, phone.maker)
                && Objects.equals(color, phone.color)
                && Objects.equals(os, phone.os)
                && Objects.equals(countryManufactured, phone.countryManufactured);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, maker, color, os, countryManufactured);
    }

    @Override
    public String toString() {
        return "Phone{"
            + "id=" + id
            + ", model='" + model + '\''
            + ", maker='" + maker + '\''
            + ", color='" + color + '\''
            + ", os='" + os + '\''
            + ", countryManufactured='" + countryManufactured + '\''
            + '}';
    }
}
