package com.restapi.springbootrestapi.repository;

import com.restapi.springbootrestapi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepo extends JpaRepository<CloudVendor,String> {
}
