package com.api.services;

import com.api.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

        final ParkingSpotRepository parkingSpotRepository;

        public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
            this.parkingSpotRepository = parkingSpotRepository;
        }
}
