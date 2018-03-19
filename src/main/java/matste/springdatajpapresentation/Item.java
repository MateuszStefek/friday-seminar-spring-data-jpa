package matste.springdatajpapresentation;

import javax.persistence.*;

@Entity
@NamedQuery(name="Item.findByABC", query = "select i from Item i where i.code = ?1 and i.warehouse.virtual = false")
public class Item {
    @Id @GeneratedValue
    private Long id;
    private String code;
    private Integer stockLevel;
    private String description;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

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

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item[" + id + ", code=" + code + ", warehouse=" + warehouse.getCode()
                + " stock=" + stockLevel
                + "]";
    }
}
