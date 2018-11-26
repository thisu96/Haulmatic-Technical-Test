package lk.test.haulmatic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicalId;
    private String vehicleName;

    public Vehicle() {
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicalId() {
        return vehicalId;
    }

    public void setVehicalId(int vehicalId) {
        this.vehicalId = vehicalId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicalId=" + vehicalId +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
