package com.bala.CRUD.service.impl;

import com.bala.CRUD.model.CloudVendor;
import com.bala.CRUD.repository.CloudVendorRepo;
import com.bala.CRUD.service.CloudVendorService;
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
        return "created Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Update success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepo.deleteById(cloudVendorId);
        return "Delete Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return  cloudVendorRepo.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepo.findAll();
    }
}
