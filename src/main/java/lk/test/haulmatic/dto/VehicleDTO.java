package lk.test.haulmatic.dto;

public class VehicleDTO {
    private int vehicalId;
    private String vehicleName;

    public VehicleDTO() {
    }

    public VehicleDTO(int vehicalId, String vehicleName) {
        this.vehicalId = vehicalId;
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
}
