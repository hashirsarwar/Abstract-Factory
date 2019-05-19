interface AbstractVehicleFactory {
    fun getVehicleInstance(vehicleType: String) : Vehicle?
}