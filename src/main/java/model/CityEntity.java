package model;

import model.enumeration.cityLocation;

import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
@Table(name="TOWN")
public class CityEntity extends CommonInfoEntity {
  @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq_town")
  @SequenceGenerator(name="seq_town",sequenceName = "seq_town", allocationSize = 1)
  private Integer id;

  @Column(name="TOWN_NAME", nullable = false)
  private String name;

  @Column(name="TOWN_TYPE", nullable = false)
  private String type;
@Enumerated(EnumType.STRING)
  @Column(name="LOCATION")
  private cityLocation location;

  @Column(name="AREA")
  private double area;

  @Column(name="COUNTRY_ID")
  private int countryId;

  @Transient
  private Data dataCreation;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public cityLocation getLocation() {
    return location;
  }

  public void setLocation(cityLocation location) {
    this.location = location;
  }

  @Override
  public double getArea() {
    return area;
  }

  @Override
  public void setArea(double area) {
    this.area = area;
  }

  public int getCountryId() {
    return countryId;
  }

  public void setCountryId(int countryId) {
    this.countryId = countryId;
  }

  public Data getDataCreation() {
    return dataCreation;
  }

  public void setDataCreation(Data dataCreation) {
    this.dataCreation = dataCreation;
  }

  @Override
  public String toString() {
    return "CityEntity{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", type='" + type + '\'' +
            ", location=" + location +
            ", area=" + area +
            ", countryId=" + countryId +
            ", dataCreation=" + dataCreation +
            '}';
  }
}
