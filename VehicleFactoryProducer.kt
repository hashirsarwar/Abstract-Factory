class VehicleFactoryProducer {

    companion object {
        fun getVehicleFactory(vehicleFactory: String) : AbstractVehicleFactory?
        {
            when(vehicleFactory)
            {
                "car" -> return CarFactory()
                "bike" -> return BikeFactory()
                "plane" -> return PlaneFactory()
            }
            return null
        }
    }
}