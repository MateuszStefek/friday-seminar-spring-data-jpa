package matste.springdatajpapresentation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Warehouse {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private boolean virtual;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

    @Override
    public String toString() {
        return "Warehouse[" + id + ", code=" + code + "]";
    }
}
