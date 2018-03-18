package matste.springdatajpapresentation;

import javax.persistence.*;

@Entity
public class Item {
    @Id @GeneratedValue
    private Long id;
    private String code;
    private Integer stockLevel;

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

    @Override
    public String toString() {
        return "Item[" + id + ", code=" + code + ", warehouse=" + warehouse.getCode()
                + " stock=" + stockLevel
                + "]";
    }
}
