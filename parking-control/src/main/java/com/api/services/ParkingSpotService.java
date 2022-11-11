package com.api.services;

import com.api.models.ParkingSpotModel;
import com.api.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

        final ParkingSpotRepository parkingSpotRepository;

        public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
            this.parkingSpotRepository = parkingSpotRepository;
        }

        @Transactional
        public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
            return parkingSpotRepository.save(parkingSpotModel);
        }
}
