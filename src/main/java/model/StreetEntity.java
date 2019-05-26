package model;

import javax.persistence.*;

@Entity
@Table(name="STREET")
public class StreetEntity {
   @Id
   @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_street")
   @SequenceGenerator(name="seq_street",sequenceName = "seq_street", allocationSize = 1)
   private Integer id;

   @Column(name="TOWN_ID", nullable=false)
    private int townId;

    @Column(name="STREET_NAME", nullable=false)
    private String streetName;

    @Column(name="DESCRIPTION")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTownId() {
        return townId;
    }

    public void setTownId(int townId) {
        this.townId = townId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "StreetEntity{" +
                "id=" + id +
                ", townId='" + townId + '\'' +
                ", streetName='" + streetName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
