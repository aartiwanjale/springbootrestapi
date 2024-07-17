package com.restapi.springbootrestapi.service.impl;

import com.restapi.springbootrestapi.exception.CloudVendorNotFoundException;
import com.restapi.springbootrestapi.model.CloudVendor;
import com.restapi.springbootrestapi.repository.CloudVendorRepo;
import com.restapi.springbootrestapi.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepo cloudVendorRepo;

    public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
        this.cloudVendorRepo = cloudVendorRepo;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepo.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        if(cloudVendorRepo.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Request Cloud Vendor Does not exist");
        return cloudVendorRepo.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepo.findAll();
    }
}
