package com.bala.CRUD.controller;

import com.bala.CRUD.model.CloudVendor;
import com.bala.CRUD.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String VendorID){
        return   cloudVendorService.getCloudVendor(VendorID);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        return   cloudVendorService.getAllCloudVendors();
    }
    @PostMapping
    public String createCloudDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated Successfully";
    }
    @DeleteMapping("{VendorId}")
    public String updateCloudDetails(@PathVariable("vendorId") String VendorID){
        cloudVendorService.deleteCloudVendor(VendorID);
        return "Cloud Vendor deleted Successfully";
    }

}
