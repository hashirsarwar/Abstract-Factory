class PlaneFactory : AbstractVehicleFactory
{
    override fun getVehicleInstance(vehicleType: String): Vehicle? {
        when (vehicleType)
        {
            "f16" -> return F16()
            "jf" -> return JFThunder()
        }
        return null
    }
}