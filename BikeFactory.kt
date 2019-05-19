class BikeFactory : AbstractVehicleFactory
{
    override fun getVehicleInstance(vehicleType: String): Vehicle? {
        when(vehicleType)
        {
            "pcg" -> return PCG600()
            "sanchez" -> return Sanchez()
            "yamaha" -> return Yamaha()
        }
        return null
    }
}