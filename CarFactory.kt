class CarFactory : AbstractVehicleFactory{
    override fun getVehicleInstance(vehicleType: String): Vehicle? {
        when (vehicleType)
        {
            "honda"-> return Honda()
            "toyota" -> return Toyota()
            "bmw" -> return BMW()
        }
        return null
    }
}